package com.frogobox.frogoconsumeapi.pixabay.data.source

import android.content.Context
import com.frogobox.frogoconsumeapi.pixabay.data.model.PixabayImage
import com.frogobox.frogoconsumeapi.pixabay.data.model.PixabayVideo
import com.frogobox.frogoconsumeapi.pixabay.data.response.Response
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
object PixabayRemoteDataSource : PixabayDataSource {

    private val pixabayApiService = PixabayApiService

    override fun usingChuckInterceptor(context: Context) {
        pixabayApiService.usingChuckInterceptor(context)
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
        callback: PixabayDataSource.GetRemoteCallback<Response<PixabayImage>>
    ) {
        pixabayApiService.getApiService
            .searchImage(
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
            .subscribe(object : PixabayApiCallback<Response<PixabayImage>>() {
                override fun onSuccess(model: Response<PixabayImage>) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
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
        callback: PixabayDataSource.GetRemoteCallback<Response<PixabayVideo>>
    ) {
        pixabayApiService.getApiService
            .searchVideo(
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
            .subscribe(object : PixabayApiCallback<Response<PixabayVideo>>() {
                override fun onSuccess(model: Response<PixabayVideo>) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }
}


