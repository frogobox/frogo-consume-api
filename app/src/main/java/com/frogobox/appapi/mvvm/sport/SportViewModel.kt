package com.frogobox.appapi.mvvm.sport

import android.app.Application
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.model.Team
import com.frogobox.coreapi.sport.response.Teams
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
class SportViewModel(
    private val context: Application,
    private val repository: ApiRepository
) : BaseViewModel(context, repository) {

    val listData = FrogoMutableLiveData<List<Team>>()

    fun searchAllTeam() {
        sportApi.searchAllTeam("English Premier League",
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    data.teams?.let { listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // failed result
                    eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // showing your progress view
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // hiding your progress view
                    eventShowProgress.postValue(false)
                }
            })

    }
}