package com.frogobox.api.pixabay.source

import android.content.Context
import com.frogobox.api.pixabay.model.PixabayImage
import com.frogobox.api.pixabay.model.PixabayVideo
import com.frogobox.api.pixabay.response.Response
import com.frogobox.sdk.core.FrogoResponseCallback

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
 * com.frogobox.frogoconsumeapi.pixabay.data.source
 *
 */

interface PixabayDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for Image
    fun searchImage(
        apiKey: String,
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
        callback: FrogoResponseCallback<Response<PixabayImage>>
    )

    // Search for Video
    fun searchVideo(
        apiKey: String,
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
        callback: FrogoResponseCallback<Response<PixabayVideo>>
    )

}
