package com.frogobox.frogoconsumeapi.news

import android.content.Context
import com.frogobox.frogoconsumeapi.news.response.ArticleResponse
import com.frogobox.frogoconsumeapi.news.response.SourceResponse
import com.frogobox.frogosdk.core.FrogoResponseCallback

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
 * com.frogobox.frogoconsumeapi.news
 *
 */
interface IConsumeNewsApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Get Top Headline
    fun getTopHeadline(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoResponseCallback<ArticleResponse>
    )

    // Get Everythings
    fun getEverythings(
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
        callback: FrogoResponseCallback<ArticleResponse>
    )

    // Get Sources
    fun getSources(
        language: String,
        country: String,
        category: String,
        callback: FrogoResponseCallback<SourceResponse>
    )

}