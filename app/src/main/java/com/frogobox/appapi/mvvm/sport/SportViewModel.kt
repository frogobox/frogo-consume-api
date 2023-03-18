package com.frogobox.appapi.mvvm.sport

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.appapi.util.isDebug
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.model.Team
import com.frogobox.coreapi.sport.response.Teams

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
class SportViewModel(
    private val repository: ApiRepository,
) : BaseViewModel() {

    private var _listData = MutableLiveData<List<Team>>()
    var listData: LiveData<List<Team>> = _listData

    fun searchAllTeam(context: Context) {
        val sportApi = repository.consumeTheSportDbApi().usingChuckInterceptor(isDebug, context)
        sportApi.searchAllTeam("English Premier League",
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    data.teams?.let { _listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // failed result
                    _eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // showing your progress view
                    _eventShowProgressState.postValue(true)
                }

                override fun onHideProgress() {
                    // hiding your progress view
                    _eventShowProgressState.postValue(false)
                }
            })

    }
}