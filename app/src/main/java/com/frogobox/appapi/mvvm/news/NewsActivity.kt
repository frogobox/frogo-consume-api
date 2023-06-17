package com.frogobox.appapi.mvvm.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityNewsBinding
import com.frogobox.appapi.databinding.ContentArticleHorizontalBinding
import com.frogobox.appapi.databinding.ContentArticleVerticalBinding
import com.frogobox.appapi.databinding.ContentCategoryBinding
import com.frogobox.coreutil.news.NewsConstant
import com.frogobox.coreutil.news.model.Article
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.ext.startActivityExt
import com.frogobox.sdk.view.FrogoBindActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsActivity : FrogoBindActivity<ActivityNewsBinding>() {

    private val newsViewModel: NewsViewModel by viewModel()

    override fun setupViewBinding(): ActivityNewsBinding {
        return ActivityNewsBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        newsViewModel.apply {

            getTopHeadline()
            getTopHeadline(com.frogobox.coreutil.news.NewsConstant.CATEGORY_HEALTH)
            setupCategory()

            eventShowProgressState.observe(this@NewsActivity) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(this@NewsActivity) {
                showToast(it)
            }

            listData.observe(this@NewsActivity) {
                setupRvHeader(it)
            }

            listCategory.observe(this@NewsActivity) {
                setupRvCategory(it)
            }

            listDataCategory.observe(this@NewsActivity) {
                setupRvBody(it)
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
                newsViewModel.getTopHeadline(data)
            }

            override fun onItemLongClicked(
                binding: ContentCategoryBinding,
                data: String,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<String>
            ) {
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

    private fun setupRvHeader(data: List<com.frogobox.coreutil.news.model.Article>) {

        val callback = object : IFrogoBindingAdapter<com.frogobox.coreutil.news.model.Article, ContentArticleHorizontalBinding> {
            override fun onItemClicked(
                binding: ContentArticleHorizontalBinding,
                data: com.frogobox.coreutil.news.model.Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.news.model.Article>
            ) {
                startActivityExt<NewsDetailActivity, com.frogobox.coreutil.news.model.Article>(NewsDetailActivity.EXTRA_DATA, data)
            }

            override fun onItemLongClicked(
                binding: ContentArticleHorizontalBinding,
                data: com.frogobox.coreutil.news.model.Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.news.model.Article>
            ) {
                data.description?.let { showToast(it) }
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
                data: com.frogobox.coreutil.news.model.Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.news.model.Article>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvPublished.text = data.publishedAt
                    tvDescription.text = data.description
                    Glide.with(root.context).load(data.urlToImage).into(ivUrl)
                }
            }
        }

        binding.rvNewsGeneral.injectorBinding<com.frogobox.coreutil.news.model.Article, ContentArticleHorizontalBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearHorizontal(false)
            .build()

    }

    private fun setupRvBody(data: List<com.frogobox.coreutil.news.model.Article>) {

        val callback = object : IFrogoBindingAdapter<com.frogobox.coreutil.news.model.Article, ContentArticleVerticalBinding> {
            override fun onItemClicked(
                binding: ContentArticleVerticalBinding,
                data: com.frogobox.coreutil.news.model.Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.news.model.Article>
            ) {
                startActivityExt<NewsDetailActivity, com.frogobox.coreutil.news.model.Article>(NewsDetailActivity.EXTRA_DATA, data)
            }

            override fun onItemLongClicked(
                binding: ContentArticleVerticalBinding,
                data: com.frogobox.coreutil.news.model.Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.news.model.Article>
            ) {
                data.description?.let { showToast(it) }
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
                data: com.frogobox.coreutil.news.model.Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.news.model.Article>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvPublished.text = data.publishedAt
                    tvDescription.text = data.description
                    Glide.with(root.context).load(data.urlToImage).into(ivUrl)
                }
            }
        }

        binding.rvNewsCategory.injectorBinding<com.frogobox.coreutil.news.model.Article, ContentArticleVerticalBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearVertical(false)
            .build()
    }

}