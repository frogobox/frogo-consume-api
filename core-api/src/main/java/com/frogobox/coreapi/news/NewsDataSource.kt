package com.frogobox.coreapi.news

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.Resource
import kotlinx.coroutines.flow.Flow
import okhttp3.Interceptor

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
interface NewsDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(isDebug: Boolean, chuckerInterceptor: Interceptor): NewsDataSource

    // Get Top Headline
    fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.ArticleResponse>
    )

    // Get Top Headline (Flow)
    fun getTopHeadlineFlow(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?
    ): Flow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>>

    // Get Everythings
    fun getEverythings(
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
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.ArticleResponse>
    )

    // Get Everythings (Flow)
    fun getEverythingsFlow(
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
        page: Int?
    ): Flow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>>

    // Get Sources
    fun getSources(
        apiKey: String,
        language: String,
        country: String,
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.SourceResponse>
    )

    // Get Sources (Flow)
    fun getSourcesFlow(
        apiKey: String,
        language: String,
        country: String,
        category: String
    ): Flow<Resource<com.frogobox.coreutil.news.response.SourceResponse?>>

}