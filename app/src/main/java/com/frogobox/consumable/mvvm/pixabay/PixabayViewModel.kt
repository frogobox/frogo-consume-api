package com.frogobox.consumable.mvvm.pixabay

import android.app.Application
import com.frogobox.frogoconsumeapi.pixabay.ConsumePixabayApi
import com.frogobox.frogoconsumeapi.pixabay.model.PixabayImage
import com.frogobox.frogoconsumeapi.pixabay.response.Response
import com.frogobox.frogoconsumeapi.pixabay.util.PixabayUrl
import com.frogobox.frogosdk.core.FrogoLiveEvent
import com.frogobox.frogosdk.core.FrogoResponseCallback
import com.frogobox.frogosdk.core.FrogoViewModel

/*
 * Created by faisalamir on 28/07/21
 * Consumable
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
class PixabayViewModel(private val context: Application) : FrogoViewModel(context) {

    val listData = FrogoLiveEvent<List<PixabayImage>>()
    private val consumePixabayApi = ConsumePixabayApi(PixabayUrl.API_KEY) // Your API Key

    fun searchImage(query: String) {
        consumePixabayApi.usingChuckInterceptor(context) // Using Chuck Interceptor
        consumePixabayApi.searchImage(
            query,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            object : FrogoResponseCallback<Response<PixabayImage>> {
                override fun onSuccess(data: Response<PixabayImage>) {
                    // Place your UI / Data
                    data.hits?.let { listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    // failed to do
                    eventFailed.postValue(errorMessage)
                }

                override fun onShowProgress() {
                    // showing your progress view
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // hide your progress view
                    eventShowProgress.postValue(false)
                }
            })
    }

}