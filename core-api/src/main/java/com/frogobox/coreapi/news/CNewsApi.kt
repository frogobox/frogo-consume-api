package com.frogobox.coreapi.news

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.Resource
import kotlinx.coroutines.flow.Flow
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

class CNewsApi(apiKey: String) : INewsApi {

    private var newsApi = NewsApi(apiKey)

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): INewsApi {
        return newsApi.usingChuckInterceptor(isDebug, chuckerInterceptor)
    }

    override fun getTopHeadline(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.ArticleResponse>
    ) {
        newsApi.getTopHeadline(q, sources, category, country, pageSize, page, callback)
    }

    override fun getTopHeadlineFlow(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?
    ): Flow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>> {
        return newsApi.getTopHeadlineFlow(q, sources, category, country, pageSize, page)
    }

    override fun getEverythings(
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
    ) {
        newsApi.getEverythings(
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
            page,
            callback
        )
    }

    override fun getEverythingsFlow(
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
    ): Flow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>> {
        return newsApi.getEverythingsFlow(
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
    }

    override fun getSources(
        language: String,
        country: String,
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.SourceResponse>
    ) {
        newsApi.getSources(language, country, category, callback)
    }

    override fun getSourcesFlow(
        language: String,
        country: String,
        category: String
    ): Flow<Resource<com.frogobox.coreutil.news.response.SourceResponse?>> {
        return newsApi.getSourcesFlow(language, country, category)
    }

}