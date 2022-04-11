package com.frogobox.appapi.mvvm.sport

import android.app.Application
import com.frogobox.api.sport.ConsumeTheSportDbApi
import com.frogobox.coreapi.sport.response.Teams
import com.frogobox.coreapi.sport.SportUrl
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.model.Team
import com.frogobox.sdk.util.FrogoMutableLiveData
import com.frogobox.sdk.view.FrogoViewModel

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
class SportViewModel(private val context: Application) : FrogoViewModel(context) {

    val listData = FrogoMutableLiveData<List<Team>>()
    private val consumeTheSportDbApi = ConsumeTheSportDbApi(SportUrl.API_KEY) // Your API Key

    fun searchAllTeam() {
        consumeTheSportDbApi.usingChuckInterceptor(context)
        consumeTheSportDbApi.searchAllTeam("English Premier League",
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