package com.frogobox.appapi.mvvm.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityNewsBinding
import com.frogobox.api.news.model.Article
import com.frogobox.uikit.databinding.FrogoRvListType6Binding
import com.frogobox.sdk.core.FrogoActivity
import com.frogobox.recycler.core.IFrogoBindingAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsActivity : FrogoActivity<ActivityNewsBinding>() {

    private val newsViewModel: NewsViewModel by viewModel()

    override fun setupViewBinding(): ActivityNewsBinding {
        return ActivityNewsBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        newsViewModel.apply {
            getTopHeadline()

            eventShowProgress.observe(this@NewsActivity, {
                setupEventProgressView(binding.progressView, it)
            })

            eventFailed.observe(this@NewsActivity, {
                showToast(it)
            })

            listData.observe(this@NewsActivity, {
                setupRV(it)
            })

        }
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("News Api")
    }

    private fun setupRV(data: List<Article>) {

        val adapterCallback = object : IFrogoBindingAdapter<Article, FrogoRvListType6Binding> {

            override fun setViewBinding(parent: ViewGroup): FrogoRvListType6Binding {
                return FrogoRvListType6Binding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(binding: FrogoRvListType6Binding, data: Article) {
                binding.apply {
                    frogoRvListType6TvTitle.text = data.title ?: "No Data"
                    frogoRvListType6TvSubtitle.text = data.author ?: "No Data"
                    frogoRvListType6TvDesc.text = data.description
                    Glide.with(root.context).load(data.urlToImage).into(frogoRvListType6IvPoster)
                }
            }

            override fun onItemClicked(data: Article) {}

            override fun onItemLongClicked(data: Article) {}
        }

        binding.frogorecyclerview.injectorBinding<Article, FrogoRvListType6Binding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutLinearVertical(false)
            .build()
    }

}