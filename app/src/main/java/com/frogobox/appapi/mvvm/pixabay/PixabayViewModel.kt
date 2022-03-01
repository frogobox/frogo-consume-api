package com.frogobox.appapi.mvvm.pixabay

import android.app.Application
import com.frogobox.api.pixabay.ConsumePixabayApi
import com.frogobox.coreapi.pixabay.model.PixabayImage
import com.frogobox.coreapi.pixabay.response.Response
import com.frogobox.coreapi.pixabay.PixabayUrl
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.sdk.FrogoMutableLiveData
import com.frogobox.sdk.FrogoViewModel

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

    val listData = FrogoMutableLiveData<List<PixabayImage>>()
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
            object : ConsumeApiResponse<Response<PixabayImage>> {
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