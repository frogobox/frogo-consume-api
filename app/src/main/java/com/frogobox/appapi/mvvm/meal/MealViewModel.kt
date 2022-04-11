package com.frogobox.appapi.mvvm.meal

import android.app.Application
import com.frogobox.api.meal.ConsumeTheMealDbApi
import com.frogobox.coreapi.meal.model.Meal
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coreapi.meal.MealUrl
import com.frogobox.coreapi.ConsumeApiResponse
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
class MealViewModel(private val context: Application) : FrogoViewModel(context) {

    val listData = FrogoMutableLiveData<List<Meal>>()
    private val consumeTheMealDbApi = ConsumeTheMealDbApi(MealUrl.API_KEY)

    fun getListMeals(firstLetter: String) {
        consumeTheMealDbApi.usingChuckInterceptor(context)
        consumeTheMealDbApi.listAllMeal(
            firstLetter,
            object : ConsumeApiResponse<MealResponse<Meal>> {
                override fun onSuccess(data: MealResponse<Meal>) {
                    // on Success Request
                    data.meals?.let { listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // on Failed
                    eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // Show Your Progress View
                    eventShowProgress.postValue(true)
                }

                override fun onHideProgress() {
                    // Hide Your Progress View
                    eventShowProgress.postValue(false)
                }
            })
    }


}