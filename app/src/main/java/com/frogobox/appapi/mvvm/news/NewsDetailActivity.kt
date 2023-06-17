package com.frogobox.appapi.mvvm.news

import android.os.Bundle
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityNewsDetailBinding
import com.frogobox.coreutil.news.model.Article
import com.frogobox.sdk.ext.getExtraDataExt
import com.frogobox.sdk.view.FrogoBindActivity

class NewsDetailActivity : FrogoBindActivity<ActivityNewsDetailBinding>() {

    companion object {
        const val EXTRA_DATA = "com.frogobox.newsapp.activity.DetailActivity.extra_data"
    }

    override fun setupViewBinding(): ActivityNewsDetailBinding {
        return ActivityNewsDetailBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {}


    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupDetailActivity("Detail Berita")

        val extraArticle = getExtraDataExt<com.frogobox.coreutil.news.model.Article>(EXTRA_DATA)
        binding.apply {
            tvTitle.text = extraArticle.title
            tvSource.text = extraArticle.source?.name ?: ""
            tvContent.text = extraArticle.description
            Glide.with(this@NewsDetailActivity).load(extraArticle.urlToImage).into(ivUrl)
        }
    }


}
