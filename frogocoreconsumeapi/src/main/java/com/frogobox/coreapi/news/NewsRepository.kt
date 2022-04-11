package com.frogobox.coreapi.news

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.coreapi.news.response.SourceResponse
import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.source.FrogoApiClient
import io.reactivex.rxjava3.core.Scheduler
import okhttp3.Interceptor


/*
 * Created by faisalamir on 07/04/22
 * FrogoConsumeApi
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

object NewsRepository : NewsDataSource {

    private val TAG = NewsRepository::class.java.simpleName
    private var newsApiService = FrogoApiClient.create<NewsApiService>(NewsUrl.BASE_URL)

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        newsApiService = FrogoApiClient.createWithInterceptor(NewsUrl.BASE_URL, chuckerInterceptor)
    }

    override fun getTopHeadline(
        scheduler: Scheduler?,
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: ConsumeApiResponse<ArticleResponse>
    ) {
        newsApiService.getTopHeadline(apiKey, q, sources, category, country, pageSize, page)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun getEverythings(
        scheduler: Scheduler?,
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
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getSources(
        scheduler: Scheduler?,
        apiKey: String,
        language: String,
        country: String,
        category: String,
        callback: ConsumeApiResponse<SourceResponse>
    ) {
        newsApiService.getSources(apiKey, language, country, category).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

}