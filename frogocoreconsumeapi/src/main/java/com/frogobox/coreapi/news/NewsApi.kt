package com.frogobox.coreapi.news

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.coreapi.news.response.SourceResponse
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

class NewsApi(
    private val scheduler: Scheduler?,
    private val apiKey: String
) : INewsApi {

    private val newsRepository = NewsRepository

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor): INewsApi {
        newsRepository.usingChuckInterceptor(chuckerInterceptor)
        return this
    }

    override fun getTopHeadline(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoDataResponse<ArticleResponse>
    ) {
        newsRepository.getTopHeadline(
            scheduler,
            apiKey,
            q,
            sources,
            category,
            country,
            pageSize,
            page,
            callback
        )
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
        callback: FrogoDataResponse<ArticleResponse>
    ) {
        newsRepository.getEverythings(
            scheduler,
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
            page,
            callback
        )
    }

    override fun getSources(
        language: String,
        country: String,
        category: String,
        callback: FrogoDataResponse<SourceResponse>
    ) {
        newsRepository.getSources(
            scheduler,
            apiKey,
            language,
            country,
            category,
            callback
        )
    }
}