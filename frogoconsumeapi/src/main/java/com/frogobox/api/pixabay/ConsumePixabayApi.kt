package com.frogobox.api.pixabay

import android.content.Context
import com.frogobox.api.pixabay.model.PixabayImage
import com.frogobox.api.pixabay.model.PixabayVideo
import com.frogobox.api.pixabay.response.Response
import com.frogobox.api.pixabay.source.PixabayRepository
import com.frogobox.api.core.ConsumeApiResponse

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * PixabayAPI
 * Copyright (C) 14/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.pixabay
 *
 */
class ConsumePixabayApi(private val apiKey: String) : IConsumePixabayApi {

    private val pixabayRepository = PixabayRepository

    override fun usingChuckInterceptor(context: Context) {
        pixabayRepository.usingChuckInterceptor(context)
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
        pixabayRepository.searchImage(
            apiKey,
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
            callback)
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
        pixabayRepository.searchVideo(
            apiKey,
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
            callback)
    }
}