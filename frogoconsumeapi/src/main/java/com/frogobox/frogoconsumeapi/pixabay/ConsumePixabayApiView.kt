package com.frogobox.frogoconsumeapi.pixabay

import android.content.Context
import com.frogobox.frogoconsumeapi.pixabay.callback.PixabayResultCallback
import com.frogobox.frogoconsumeapi.pixabay.data.model.PixabayImage
import com.frogobox.frogoconsumeapi.pixabay.data.model.PixabayVideo
import com.frogobox.frogoconsumeapi.pixabay.data.response.Response

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

interface ConsumePixabayApiView {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for Image
    fun searchImage(
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
        callback: PixabayResultCallback<Response<PixabayImage>>
    )

    // Search for Video
    fun searchVideo(
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
        callback: PixabayResultCallback<Response<PixabayVideo>>
    )

}
