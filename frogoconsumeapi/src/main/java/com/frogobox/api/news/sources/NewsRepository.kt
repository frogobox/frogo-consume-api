package com.frogobox.api.news.sources

import android.content.Context
import android.util.Log
import com.frogobox.api.news.response.ArticleResponse
import com.frogobox.api.news.response.SourceResponse
import com.frogobox.api.news.util.NewsUrl
import com.frogobox.sdk.core.FrogoApiCallback
import com.frogobox.sdk.core.FrogoApiClient
import com.frogobox.api.core.ConsumeApiResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-news-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.news.data.source
 *
 */
object NewsRepository : NewsDataSource {

    private val TAG = NewsRepository::class.java.simpleName
    private var newsApiService = FrogoApiClient.create<NewsApiService>(NewsUrl.BASE_URL)

    override fun usingChuckInterceptor(context: Context) {
        Log.d(TAG, "Using Chuck Interceptor")
        newsApiService = FrogoApiClient.create(NewsUrl.BASE_URL, context)
    }

    override fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: ConsumeApiResponse<ArticleResponse>
    ) {
        Log.d(TAG, "Get Top Headline")
        newsApiService.getTopHeadline(apiKey, q, sources, category, country, pageSize, page)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<ArticleResponse>() {
                override fun onSuccess(data: ArticleResponse) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getEverythings(
        apiKey: String,
        q: String?,
        from: String?,
        to: String?,
        qInTitle: String?,
        sources: String?,
        domains: String?,
        excludeDomains: String?,
        language: String?,
        sortBy: String?,
        pageSize: Int?,
        page: Int?,
        callback: ConsumeApiResponse<ArticleResponse>
    ) {
        Log.d(TAG, "Get Everythings")
        newsApiService.getEverythings(
            apiKey,
            q,
            from,
            to,
            qInTitle,
            sources,
            domains,
            excludeDomains,
            language,
            sortBy,
            pageSize,
            page
        )
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<ArticleResponse>() {
                override fun onSuccess(data: ArticleResponse) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getSources(
        apiKey: String,
        language: String,
        country: String,
        category: String,
        callback: ConsumeApiResponse<SourceResponse>
    ) {
        Log.d(TAG, "Get Sources")
        newsApiService.getSources(apiKey, language, country, category)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiCallback<SourceResponse>() {
                override fun onSuccess(data: SourceResponse) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}