package com.frogobox.coreapi.pixabay

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.pixabay.model.PixabayImage
import com.frogobox.coreapi.pixabay.model.PixabayVideo
import com.frogobox.coreapi.pixabay.response.Response
import io.reactivex.rxjava3.schedulers.Schedulers
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

class CPixabayApi(usingScheduler: Boolean, apiKey: String) : IPixabayApi {

    private var pixabayApi = if (usingScheduler) {
        PixabayApi(Schedulers.single(), apiKey)
    } else {
        PixabayApi(null, apiKey)
    }

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        pixabayApi.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun searchImage(
        q: String,
        lang: String?,
        id: String?,
        imageType: String?,
        orientation: String?,
        category: String?,
        minWidth: Int?,
        minHeight: Int?,
        colors: String?,
        editorsChoice: Boolean?,
        safeSearch: Boolean?,
        order: String?,
        page: Int?,
        perPage: Int?,
        callback: ConsumeApiResponse<Response<PixabayImage>>
    ) {
        pixabayApi.searchImage(
            q,
            lang,
            id,
            imageType,
            orientation,
            category,
            minWidth,
            minHeight,
            colors,
            editorsChoice,
            safeSearch,
            order,
            page,
            perPage,
            callback
        )
    }

    override fun searchVideo(
        q: String,
        lang: String?,
        id: String?,
        videoType: String?,
        category: String?,
        minWidth: Int?,
        minHeight: Int?,
        editorsChoice: Boolean?,
        safeSearch: Boolean?,
        order: String?,
        page: Int?,
        perPage: Int?,
        callback: ConsumeApiResponse<Response<PixabayVideo>>
    ) {
        pixabayApi.searchVideo(
            q,
            lang,
            id,
            videoType,
            category,
            minWidth,
            minHeight,
            editorsChoice,
            safeSearch,
            order,
            page,
            perPage,
            callback
        )
    }
}