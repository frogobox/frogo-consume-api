package com.frogobox.appapi.mvvm.news

import android.app.Application
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_BUSINESS
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_ENTERTAIMENT
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_GENERAL
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_HEALTH
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_SCIENCE
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_SPORTS
import com.frogobox.coreapi.news.NewsConstant.CATEGORY_TECHNOLOGY
import com.frogobox.coreapi.news.NewsConstant.COUNTRY_ID
import com.frogobox.coreapi.news.model.Article
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.sdk.util.FrogoMutableLiveData

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
class NewsViewModel(
    private val context: Application,
    private val repository: ApiRepository
) : BaseViewModel(context, repository) {

    val listDataCategory = FrogoMutableLiveData<List<Article>>()
    val listData = FrogoMutableLiveData<List<Article>>()
    val listCategory = FrogoMutableLiveData<List<String>>()

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
        newsApi.getTopHeadline(
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

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // Your failed to do
                    eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // Your Progress Show
                    showLogDebug("onShowProgress --------------------------------------------------->")
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    showLogDebug("onHideProgress --------------------------------------------------->")
                    eventShowProgress.postValue(false)
                }
            })
    }

    fun getTopHeadline() {
        newsApi.getTopHeadline(
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

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // Your failed to do
                    eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // Your Progress Show
                    showLogDebug("onShowProgress --------------------------------------------------->")
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    showLogDebug("onHideProgress --------------------------------------------------->")
                    eventShowProgress.postValue(false)
                }

            })
    }

}