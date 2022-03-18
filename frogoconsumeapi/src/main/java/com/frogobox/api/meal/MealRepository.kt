package com.frogobox.api.meal

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.MealConstant
import com.frogobox.coreapi.meal.MealUrl
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.MealApiService
import com.frogobox.coreapi.meal.MealDataSource
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coresdk.FrogoApiClient
import com.frogobox.coresdk.FrogoApiObserver
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-the-meal-db-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogomealsapi.data.source
 *
 */
object MealRepository : MealDataSource {

    private val TAG = MealRepository::class.java.simpleName
    private var mealApiService = FrogoApiClient.create<MealApiService>(MealUrl.BASE_URL)

    fun usingChuckInterceptor(context: Context) {
        Log.d(TAG, "Using Chuck Interceptor")
        mealApiService = FrogoApiClient.createWithInterceptor(MealUrl.BASE_URL, ChuckerInterceptor(context))
    }

    override fun searchMeal(
        apiKey: String,
        mealName: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .searchMeal(apiKey, mealName)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })

    }

    override fun listAllMeal(
        apiKey: String,
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllMeal(apiKey, firstLetter)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }


            })
    }

    override fun lookupFullMeal(
        apiKey: String,
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .lookupFullMeal(apiKey, idMeal)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupRandomMeal(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .lookupRandomMeal(apiKey)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listMealCategories(
        apiKey: String,
        callback: ConsumeApiResponse<CategoryResponse>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listMealCategories(apiKey)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<CategoryResponse>() {
                override fun onSuccess(data: CategoryResponse) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listAllCateories(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Category>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllCateories(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Category>>() {
                override fun onSuccess(data: MealResponse<Category>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listAllArea(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Area>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllArea(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Area>>() {
                override fun onSuccess(data: MealResponse<Area>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                
            })
    }

    override fun listAllIngredients(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Ingredient>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .listAllIngredients(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<Ingredient>>() {
                override fun onSuccess(data: MealResponse<Ingredient>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByIngredient(
        apiKey: String,
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .filterByIngredient(apiKey, ingredient)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByCategory(
        apiKey: String,
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .filterByCategory(apiKey, category)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByArea(
        apiKey: String,
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG,"")
        mealApiService
            .filterByArea(apiKey, area)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : FrogoApiObserver<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}