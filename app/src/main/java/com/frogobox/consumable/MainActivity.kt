package com.frogobox.consumable

import android.os.Bundle
import com.frogobox.consumable.databinding.ActivityMainBinding
import com.frogobox.frogoconsumeapi.meal.ConsumeTheMealDbApi
import com.frogobox.frogoconsumeapi.meal.model.Area
import com.frogobox.frogoconsumeapi.meal.model.MealResponse
import com.frogobox.frogoconsumeapi.meal.source.MealConstant
import com.frogobox.frogoconsumeapi.news.ConsumeNewsApi
import com.frogobox.frogoconsumeapi.news.model.ArticleResponse
import com.frogobox.frogoconsumeapi.news.sources.NewsConstant
import com.frogobox.frogosdk.core.FrogoActivity
import com.frogobox.frogosdk.core.FrogoResponseCallback

class MainActivity : FrogoActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        val meals = ConsumeTheMealDbApi("1")
        meals.usingChuckInterceptor(this)
        meals.listAllArea(object : FrogoResponseCallback<MealResponse<Area>> {
            override fun onEmptyData(check: Boolean) {

            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
            }

            override fun onHideProgress() {

            }

            override fun onShowProgress() {
            }

            override fun onSuccess(data: MealResponse<Area>) {
                binding.tv.text = data.meals?.size.toString()
            }
        })

        val news = ConsumeNewsApi(NewsConstant.Url.NEWS_API_KEY)
        news.usingChuckInterceptor(this)
        news.getTopHeadline(
            "Covid",
        null,
        null,
        NewsConstant.COUNTRY_ID,
        null,
        null,
            object : FrogoResponseCallback<ArticleResponse> {
                override fun onEmptyData(check: Boolean) {
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                }

                override fun onHideProgress() {
                }

                override fun onShowProgress() {
                }

                override fun onSuccess(data: ArticleResponse) {
                }
            }
        )

    }



}