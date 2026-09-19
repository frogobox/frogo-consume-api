package com.frogobox.appapi.mvvm.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityNewsBinding
import com.frogobox.appapi.databinding.ContentArticleHorizontalBinding
import com.frogobox.appapi.databinding.ContentArticleVerticalBinding
import com.frogobox.appapi.databinding.ContentCategoryBinding
import com.frogobox.coresdk.source.Resource
import com.frogobox.coreutil.news.NewsConstant
import com.frogobox.coreutil.news.model.Article
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.setImageExt
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

        val callback = object : IFrogoBindingAdapter<String, ContentCategoryBinding> {
            override fun onItemClicked(
                binding: ContentCategoryBinding,
                data: String,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<String>
            ) {
                binding.tvCategory.text = "category $data"
                newsViewModel.getTopHeadlineFlow(data)
            }

            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
            override fun setViewBinding(parent: ViewGroup): ContentCategoryBinding {
                return ContentCategoryBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentCategoryBinding,
                data: String,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<String>
            ) {
                binding.tvCategory.text = data
            }
        }

        binding.rvCategory.injectorBinding<String, ContentCategoryBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearHorizontal(false)
            .build()
    }

    private fun setupRvHeader(data: List<Article>) {

        val callback = object : IFrogoBindingAdapter<Article, ContentArticleHorizontalBinding> {
            override fun onItemClicked(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                startActivityExt<NewsDetailActivity> {
                    it.putExtra(NewsDetailActivity.EXTRA_DATA, data.toJson())
                }
            }

            override fun onItemLongClicked(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                data.description?.let { showToast(it) }
            }

            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }

            override fun setViewBinding(parent: ViewGroup): ContentArticleHorizontalBinding {
                return ContentArticleHorizontalBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvPublished.text = data.publishedAt
                    tvDescription.text = data.description
                    ivUrl.setImageExt(data.urlToImage)
                }
            }
        }

        binding.rvNewsGeneral.injectorBinding<Article, ContentArticleHorizontalBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearHorizontal(false)
            .build()

    }

    private fun setupRvBody(data: List<Article>) {

        val callback = object : IFrogoBindingAdapter<Article, ContentArticleVerticalBinding> {
            override fun onItemClicked(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                startActivityExt<NewsDetailActivity> {
                    it.putExtra(NewsDetailActivity.EXTRA_DATA, data.toJson())
                }
            }

            override fun onItemLongClicked(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                data.description?.let { showToast(it) }
            }

            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }

            override fun setViewBinding(parent: ViewGroup): ContentArticleVerticalBinding {
                return ContentArticleVerticalBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvPublished.text = data.publishedAt
                    tvDescription.text = data.description
                    Glide.with(root.context).load(data.urlToImage).into(ivUrl)
                }
            }
        }

        binding.rvNewsCategory.injectorBinding<Article, ContentArticleVerticalBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearVertical(false)
            .build()
    }

}