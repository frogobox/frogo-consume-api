package com.frogobox.appapi.mvvm.meal

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.appapi.util.isDebug
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coresdk.source.Resource
import com.frogobox.coreutil.meal.model.Meal
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
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
@HiltViewModel
class MealViewModel @Inject constructor(
    private val repository: ApiRepository
) : BaseViewModel() {

    val _listData = MutableLiveData<List<Meal>>()
    val listData: LiveData<List<Meal>> = _listData

    private val _mealsState = MutableStateFlow<Resource<com.frogobox.coreutil.meal.response.MealResponse<Meal>?>>(Resource.Loading())
    val mealsState: StateFlow<Resource<com.frogobox.coreutil.meal.response.MealResponse<Meal>?>> = _mealsState.asStateFlow()

    fun getListMealsFlow(context: Context, firstLetter: String) {
        val mealApi = repository.consumeTheMealDbApi().usingChuckInterceptor(isDebug, context)
        viewModelScope.launch {
            mealApi.listAllMealFlow(firstLetter).collect { resource ->
                _mealsState.value = resource
                when (resource) {
                    is Resource.Loading -> {
                        _eventShowProgressState.postValue(true)
                    }
                    is Resource.Success -> {
                        _eventShowProgressState.postValue(false)
                        resource.result?.meals?.let { _listData.postValue(it) }
                    }
                    is Resource.Error -> {
                        _eventShowProgressState.postValue(false)
                        _eventFailed.postValue(resource.message ?: "Unknown Error")
                    }
                }
            }
        }
    }

    fun getListMeals(context: Context, firstLetter: String) {
        val mealApi = repository.consumeTheMealDbApi().usingChuckInterceptor(isDebug, context)
        mealApi.listAllMeal(
            firstLetter,
            object : ConsumeApiResponse<com.frogobox.coreutil.meal.response.MealResponse<Meal>> {
                override fun onSuccess(data: com.frogobox.coreutil.meal.response.MealResponse<Meal>) {
                    // on Success Request
                    data.meals?.let { _listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // on Failed
                    _eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {
                    // on Finish
                    _eventFinishState.postValue(true)
                }

                override fun onShowProgress() {
                    // Show Your Progress View
                    _eventShowProgressState.postValue(true)
                }

                override fun onHideProgress() {
                    // Hide Your Progress View
                    _eventShowProgressState.postValue(false)
                }
            })
    }


}