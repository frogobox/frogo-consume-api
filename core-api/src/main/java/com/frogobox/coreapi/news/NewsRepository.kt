package com.frogobox.coreapi.news

import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.ext.fetchAsFlow
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.FrogoApiClient
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

object NewsRepository : NewsDataSource {

    private val TAG = NewsRepository::class.java.simpleName
    private var newsApiService = FrogoApiClient.create<NewsApiService>(com.frogobox.coreutil.news.NewsUrl.BASE_URL)

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): NewsDataSource {
        newsApiService = FrogoApiClient.create(com.frogobox.coreutil.news.NewsUrl.BASE_URL, isDebug, chuckInterceptor = chuckerInterceptor)
        return this
    }

    override fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.ArticleResponse>
    ) {
        newsApiService.getTopHeadline(apiKey, q, sources, category, country, pageSize, page)
            .doApiRequest(callback)
    }

    override fun getTopHeadlineFlow(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?
    ): Flow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>> {
        return fetchAsFlow {
            newsApiService.getTopHeadlineSuspend(apiKey, q, sources, category, country, pageSize, page)
        }
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
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.ArticleResponse>
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
        ).doApiRequest(callback)
    }

    override fun getEverythingsFlow(
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
    ): Flow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>> {
        return fetchAsFlow {
            newsApiService.getEverythingsSuspend(
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
        }
    }

    override fun getSources(
        apiKey: String,
        language: String,
        country: String,
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.news.response.SourceResponse>
    ) {
        newsApiService.getSources(apiKey, language, country, category)
            .doApiRequest(callback)
    }

    override fun getSourcesFlow(
        apiKey: String,
        language: String,
        country: String,
        category: String
    ): Flow<Resource<com.frogobox.coreutil.news.response.SourceResponse?>> {
        return fetchAsFlow {
            newsApiService.getSourcesSuspend(apiKey, language, country, category)
        }
    }

}