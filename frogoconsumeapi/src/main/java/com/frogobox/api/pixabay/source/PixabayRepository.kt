package com.frogobox.api.pixabay.source

import android.content.Context
import com.frogobox.api.pixabay.model.PixabayImage
import com.frogobox.api.pixabay.model.PixabayVideo
import com.frogobox.api.pixabay.response.Response
import com.frogobox.api.pixabay.util.PixabayUrl
import com.frogobox.sdk.core.FrogoApiCallback
import com.frogobox.sdk.core.FrogoApiClient
import com.frogobox.sdk.core.FrogoResponseCallback
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

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
object PixabayRepository : PixabayDataSource {

    private var pixabayApiService = FrogoApiClient.create<PixabayApiService>(PixabayUrl.BASE_URL)

    override fun usingChuckInterceptor(context: Context) {
        pixabayApiService = FrogoApiClient.create(PixabayUrl.BASE_URL, context)
    }

    override fun searchImage(
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
    ) {
        pixabayApiService.searchImage(
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
                perPage
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Response<PixabayImage>>() {
                override fun onSuccess(data: Response<PixabayImage>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchVideo(
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
    ) {
        pixabayApiService.searchVideo(
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
                perPage
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Response<PixabayVideo>>() {
                override fun onSuccess(data: Response<PixabayVideo>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}


