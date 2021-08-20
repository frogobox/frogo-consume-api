package com.frogobox.appapi.mvvm.sport

import android.app.Application
import com.frogobox.api.sport.ConsumeTheSportDbApi
import com.frogobox.api.sport.model.Team
import com.frogobox.api.sport.response.Teams
import com.frogobox.api.sport.util.SportUrl
import com.frogobox.sdk.core.FrogoLiveEvent
import com.frogobox.sdk.core.FrogoResponseCallback
import com.frogobox.sdk.core.FrogoViewModel

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

    val listData = FrogoLiveEvent<List<Team>>()
    private val consumeTheSportDbApi = ConsumeTheSportDbApi(SportUrl.API_KEY) // Your API Key

    fun searchAllTeam() {
        consumeTheSportDbApi.usingChuckInterceptor(context)
        consumeTheSportDbApi.searchAllTeam("English Premier League",
            object : FrogoResponseCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    data.teams?.let { listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    // failed result
                    eventFailed.postValue(errorMessage)
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