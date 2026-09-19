package com.frogobox.coreapi.meal

import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.ext.fetchAsFlow
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.FrogoApiClient
import com.frogobox.coresdk.source.Resource
import kotlinx.coroutines.flow.Flow
import okhttp3.Interceptor

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
    private var mealApiService = FrogoApiClient.create<MealApiService>(com.frogobox.coreutil.meal.MealUrl.BASE_URL)

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): MealDataSource {
        mealApiService = FrogoApiClient.create(com.frogobox.coreutil.meal.MealUrl.BASE_URL, isDebug, chuckInterceptor = chuckerInterceptor)
        return this
    }

    override fun searchMeal(
        apiKey: String,
        mealName: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealApiService.searchMeal(apiKey, mealName).doApiRequest(callback)
    }

    override fun searchMealFlow(
        apiKey: String,
        mealName: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return fetchAsFlow {
            mealApiService.searchMealSuspend(apiKey, mealName)
        }
    }

    override fun listAllMeal(
        apiKey: String,
        firstLetter: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealApiService.listAllMeal(apiKey, firstLetter).doApiRequest(callback)
    }

    override fun listAllMealFlow(
        apiKey: String,
        firstLetter: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return fetchAsFlow {
            mealApiService.listAllMealSuspend(apiKey, firstLetter)
        }
    }

    override fun lookupFullMeal(
        apiKey: String,
        idMeal: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealApiService.lookupFullMeal(apiKey, idMeal).doApiRequest(callback)
    }

    override fun lookupFullMealFlow(
        apiKey: String,
        idMeal: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return fetchAsFlow {
            mealApiService.lookupFullMealSuspend(apiKey, idMeal)
        }
    }

    override fun lookupRandomMeal(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealApiService.lookupRandomMeal(apiKey).doApiRequest(callback)
    }

    override fun lookupRandomMealFlow(
        apiKey: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return fetchAsFlow {
            mealApiService.lookupRandomMealSuspend(apiKey)
        }
    }

    override fun listMealCategories(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.CategoryResponse>
    ) {
        mealApiService.listMealCategories(apiKey).doApiRequest(callback)
    }

    override fun listMealCategoriesFlow(
        apiKey: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.CategoryResponse?>> {
        return fetchAsFlow {
            mealApiService.listMealCategoriesSuspend(apiKey)
        }
    }

    override fun listAllCateories(
apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Category>>
    ) {
        mealApiService.listAllCateories(apiKey, com.frogobox.coreutil.meal.MealConstant.VALUE_LIST)
            .doApiRequest(callback)
    }

    override fun listAllArea(
apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Area>>
    ) {
        mealApiService.listAllArea(apiKey, com.frogobox.coreutil.meal.MealConstant.VALUE_LIST)
            .doApiRequest(callback)
    }

    override fun listAllIngredients(
apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Ingredient>>
    ) {
        mealApiService.listAllIngredients(apiKey, com.frogobox.coreutil.meal.MealConstant.VALUE_LIST)
            .doApiRequest(callback)
    }

    override fun filterByIngredient(
apiKey: String,
        ingredient: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealApiService.filterByIngredient(apiKey, ingredient).doApiRequest(callback)
    }

    override fun filterByCategory(
apiKey: String,
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealApiService.filterByCategory(apiKey, category).doApiRequest(callback)
    }

    override fun filterByArea(
apiKey: String,
        area: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealApiService.filterByArea(apiKey, area).doApiRequest(callback)
    }
}