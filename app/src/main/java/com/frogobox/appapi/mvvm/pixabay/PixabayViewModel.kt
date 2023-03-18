package com.frogobox.appapi.mvvm.pixabay

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.appapi.util.isDebug
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.pixabay.model.PixabayImage
import com.frogobox.coreapi.pixabay.response.Response

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
    private val repository: ApiRepository
) : BaseViewModel() {

    private var _listData = MutableLiveData<List<PixabayImage>>()
    var listData : LiveData<List<PixabayImage>> = _listData

    fun searchImage(context: Context, query: String) {
        // Using Chuck Interceptor
        val pixabayApi = repository.consumePixabayApi().usingChuckInterceptor(isDebug, context)
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
                    data.hits?.let { _listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // failed to do
                    _eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {}

                override fun onShowProgress() {
                    // showing your progress view
                    _eventShowProgressState.postValue(true)
                }

                override fun onHideProgress() {
                    // hide your progress view
                    _eventShowProgressState.postValue(false)
                }
            })
    }

}