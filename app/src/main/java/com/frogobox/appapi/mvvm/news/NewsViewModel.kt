package com.frogobox.appapi.mvvm.news

import android.app.Application
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.api.news.model.Article
import com.frogobox.api.news.response.ArticleResponse
import com.frogobox.api.news.util.NewsUrl
import com.frogobox.api.core.ConsumeApiLiveEvent
import com.frogobox.api.core.ConsumeApiResponse
import com.frogobox.api.news.util.NewsConstant.CATEGORY_BUSINESS
import com.frogobox.api.news.util.NewsConstant.CATEGORY_ENTERTAIMENT
import com.frogobox.api.news.util.NewsConstant.CATEGORY_GENERAL
import com.frogobox.api.news.util.NewsConstant.CATEGORY_HEALTH
import com.frogobox.api.news.util.NewsConstant.CATEGORY_SCIENCE
import com.frogobox.api.news.util.NewsConstant.CATEGORY_SPORTS
import com.frogobox.api.news.util.NewsConstant.CATEGORY_TECHNOLOGY
import com.frogobox.api.news.util.NewsConstant.COUNTRY_ID
import com.frogobox.sdk.FrogoViewModel

/*
 * Created by faisalamir on 28/07/21
 * Consumable
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
class NewsViewModel(private val context: Application) : FrogoViewModel(context) {

    val listDataCategory = ConsumeApiLiveEvent<List<Article>>()
    val listData = ConsumeApiLiveEvent<List<Article>>()
    val listCategory = ConsumeApiLiveEvent<List<String>>()
    private val consumeNewsApi = ConsumeNewsApi(NewsUrl.API_KEY)

    fun setupCategory() {
        val categories = mutableListOf<String>()
        categories.add(CATEGORY_BUSINESS)
        categories.add(CATEGORY_HEALTH)
        categories.add(CATEGORY_ENTERTAIMENT)
        categories.add(CATEGORY_GENERAL)
        categories.add(CATEGORY_SCIENCE)
        categories.add(CATEGORY_SPORTS)
        categories.add(CATEGORY_TECHNOLOGY)
        listCategory.postValue(categories)
    }

    fun getTopHeadline(category: String) {
        consumeNewsApi.usingChuckInterceptor(context)
        consumeNewsApi.getTopHeadline(
            null,
            null,
            category,
            COUNTRY_ID,
            null,
            null,
            object : ConsumeApiResponse<ArticleResponse> {

                override fun onSuccess(data: ArticleResponse) {
                    // Your Ui or data
                    data.articles?.let { listDataCategory.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    // Your failed to do
                    eventFailed.postValue(errorMessage)
                }

                override fun onShowProgress() {
                    // Your Progress Show
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    eventShowProgress.postValue(false)
                }

            })
    }

    fun getTopHeadline() {
        consumeNewsApi.usingChuckInterceptor(context)
        consumeNewsApi.getTopHeadline(
            null,
            null,
            null,
            COUNTRY_ID,
            null,
            null,
            object : ConsumeApiResponse<ArticleResponse> {

                override fun onSuccess(data: ArticleResponse) {
                    // Your Ui or data
                    data.articles?.let { listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    // Your failed to do
                    eventFailed.postValue(errorMessage)
                }

                override fun onShowProgress() {
                    // Your Progress Show
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    eventShowProgress.postValue(false)
                }

            })
    }

}