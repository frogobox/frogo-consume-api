package com.frogobox.appapi.mvvm.news

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.frogobox.appapi.databinding.ActivityNewsBinding
import com.frogobox.coresdk.source.Resource
import com.frogobox.coreutil.news.NewsConstant
import com.frogobox.coreutil.news.model.Article
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.ext.startActivityExt
import com.frogobox.sdk.ext.toJson
import com.frogobox.sdk.view.FrogoBindActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NewsActivity : FrogoBindActivity<ActivityNewsBinding>() {

    private val newsViewModel: NewsViewModel by viewModels()

    override fun setupViewBinding(): ActivityNewsBinding {
        return ActivityNewsBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        newsViewModel.apply {

            if (listData.value == null) {
                getTopHeadlineFlow()
            }
            if (listDataCategory.value == null) {
                getTopHeadlineFlow(NewsConstant.CATEGORY_HEALTH)
            }
            if (listCategory.value == null) {
                setupCategory()
            }

            listCategory.observe(this@NewsActivity) {
                setupRvCategory(it)
            }

        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    newsViewModel.topHeadlineState.collect { resource ->
                        when (resource) {
                            is Resource.Loading -> {
                                binding.progressView.progressViewHandle(true)
                            }
                            is Resource.Success -> {
                                binding.progressView.progressViewHandle(false)
                                resource.result?.articles?.let { setupRvHeader(it) }
                            }
                            is Resource.Error -> {
                                binding.progressView.progressViewHandle(false)
                                showToast(resource.message ?: "Failed to load data")
                            }
                        }
                    }
                }
                launch {
                    newsViewModel.categoryHeadlineState.collect { resource ->
                        when (resource) {
                            is Resource.Loading -> {
                                binding.progressView.progressViewHandle(true)
                            }
                            is Resource.Success -> {
                                binding.progressView.progressViewHandle(false)
                                resource.result?.articles?.let { setupRvBody(it) }
                            }
                            is Resource.Error -> {
                                binding.progressView.progressViewHandle(false)
                                showToast(resource.message ?: "Failed to load category data")
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupDetailActivity("News API")
    }

    private fun setupRvCategory(data: List<String>) {
        val adapter = NewsCategoryAdapter { category, binding ->
            binding.tvCategory.text = "category $category"
            newsViewModel.getTopHeadlineFlow(category)
        }
        binding.rvCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategory.adapter = adapter
        adapter.submitList(data)
    }

    private fun setupRvHeader(data: List<Article>) {
        val adapter = NewsArticleHorizontalAdapter(
            onItemClick = { article ->
                startActivityExt<NewsDetailActivity> {
                    it.putExtra(NewsDetailActivity.EXTRA_DATA, article.toJson())
                }
            },
            onItemLongClick = { article ->
                article.description?.let { showToast(it) }
            }
        )
        binding.rvNewsGeneral.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvNewsGeneral.adapter = adapter
        adapter.submitList(data)
    }

    private fun setupRvBody(data: List<Article>) {
        val adapter = NewsArticleVerticalAdapter(
            onItemClick = { article ->
                startActivityExt<NewsDetailActivity> {
                    it.putExtra(NewsDetailActivity.EXTRA_DATA, article.toJson())
                }
            },
            onItemLongClick = { article ->
                article.description?.let { showToast(it) }
            }
        )
        binding.rvNewsCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvNewsCategory.adapter = adapter
        adapter.submitList(data)
    }

}