package com.frogobox.consumable.mvvm.news

import android.app.Application
import com.frogobox.frogoconsumeapi.news.ConsumeNewsApi
import com.frogobox.frogoconsumeapi.news.model.Article
import com.frogobox.frogoconsumeapi.news.response.ArticleResponse
import com.frogobox.frogoconsumeapi.news.util.NewsConstant.CATEGORY_HEALTH
import com.frogobox.frogoconsumeapi.news.util.NewsConstant.COUNTRY_ID
import com.frogobox.frogoconsumeapi.news.util.NewsUrl
import com.frogobox.frogosdk.core.FrogoLiveEvent
import com.frogobox.frogosdk.core.FrogoResponseCallback
import com.frogobox.frogosdk.core.FrogoViewModel

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

    val listData = FrogoLiveEvent<List<Article>>()
    private val consumeNewsApi = ConsumeNewsApi(NewsUrl.API_KEY)

    fun getTopHeadline() {
        consumeNewsApi.usingChuckInterceptor(context)
        consumeNewsApi.getTopHeadline(
            null,
            null,
            CATEGORY_HEALTH,
            COUNTRY_ID,
            null,
            null,
            object : FrogoResponseCallback<ArticleResponse> {

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