package com.frogobox.appapi.mvvm.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.api.news.model.Article
import com.frogobox.api.news.util.NewsConstant
import com.frogobox.appapi.databinding.ActivityNewsBinding
import com.frogobox.appapi.databinding.ContentArticleHorizontalBinding
import com.frogobox.appapi.databinding.ContentArticleVerticalBinding
import com.frogobox.appapi.databinding.ContentCategoryBinding
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.FrogoActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsActivity : FrogoActivity<ActivityNewsBinding>() {

    private val newsViewModel: NewsViewModel by viewModel()

    override fun setupViewBinding(): ActivityNewsBinding {
        return ActivityNewsBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        newsViewModel.apply {

            getTopHeadline()
            getTopHeadline(NewsConstant.CATEGORY_HEALTH)
            setupCategory()

            eventShowProgress.observe(this@NewsActivity) {
                setupProgressView(binding.progressView, it)
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

    override fun setupOnCreate(savedInstanceState: Bundle?) {
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

    private fun setupRvHeader(data: List<Article>) {

        val callback = object : IFrogoBindingAdapter<Article, ContentArticleHorizontalBinding> {
            override fun onItemClicked(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                baseStartActivity<NewsDetailActivity, Article>(NewsDetailActivity.EXTRA_DATA, data)
            }

            override fun onItemLongClicked(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
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
                baseStartActivity<NewsDetailActivity, Article>(NewsDetailActivity.EXTRA_DATA, data)
            }

            override fun onItemLongClicked(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
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