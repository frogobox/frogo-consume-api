package com.frogobox.api.meal

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.doApiRequest
import com.frogobox.coreapi.meal.MealApiService
import com.frogobox.coreapi.meal.MealConstant
import com.frogobox.coreapi.meal.MealDataSource
import com.frogobox.coreapi.meal.MealUrl
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coresdk.FrogoApiClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

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
        Log.d(TAG, "")
        mealApiService.searchMeal(apiKey, mealName)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun listAllMeal(
        apiKey: String,
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG, "")
        mealApiService.listAllMeal(apiKey, firstLetter)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupFullMeal(
        apiKey: String,
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG, "")
        mealApiService.lookupFullMeal(apiKey, idMeal)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupRandomMeal(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        Log.d(TAG, "")
        mealApiService.lookupRandomMeal(apiKey)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun listMealCategories(
        apiKey: String,
        callback: ConsumeApiResponse<CategoryResponse>
    ) {
        Log.d(TAG, "")
        mealApiService.listMealCategories(apiKey)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun listAllCateories(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Category>>
    ) {
        Log.d(TAG, "")
        mealApiService.listAllCateories(apiKey, MealConstant.VALUE_LIST)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun listAllArea(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Area>>
    ) {
        Log.d(TAG, "")
        mealApiService.listAllArea(apiKey, MealConstant.VALUE_LIST)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun listAllIngredients(
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Ingredient>>
    ) {
        Log.d(TAG, "")
        mealApiService.listAllIngredients(apiKey, MealConstant.VALUE_LIST)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun filterByIngredient(
        apiKey: String,
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG, "")
        mealApiService.filterByIngredient(apiKey, ingredient)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun filterByCategory(
        apiKey: String,
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG, "")
        mealApiService.filterByCategory(apiKey, category)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun filterByArea(
        apiKey: String,
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        Log.d(TAG, "")
        mealApiService.filterByArea(apiKey, area)
            .doApiRequest(AndroidSchedulers.mainThread(), callback)
    }
}