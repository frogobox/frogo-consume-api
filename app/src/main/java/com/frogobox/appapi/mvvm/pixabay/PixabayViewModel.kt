package com.frogobox.appapi.mvvm.pixabay

import android.app.Application
import com.frogobox.api.pixabay.ConsumePixabayApi
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.pixabay.model.PixabayImage
import com.frogobox.coreapi.pixabay.response.Response
import com.frogobox.sdk.util.FrogoMutableLiveData

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
class PixabayViewModel(
    private val context: Application,
    private val repository: ApiRepository
) : BaseViewModel(context, repository) {

    val listData = FrogoMutableLiveData<List<PixabayImage>>()

    fun searchImage(query: String) {
        // Using Chuck Interceptor
        pixabayApi.searchImage(
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

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // failed to do
                    eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

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