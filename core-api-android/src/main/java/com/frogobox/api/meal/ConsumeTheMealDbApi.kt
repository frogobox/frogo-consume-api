package com.frogobox.api.meal

import android.content.Context
import com.frogobox.coreapi.meal.IMealApi
import com.frogobox.coreapi.meal.MealApi
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.Resource
import com.frogobox.sdk.ext.usingChuck
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
 * com.frogobox.frogomealsapi
 *
 */
class ConsumeTheMealDbApi(apiKey: String) : IConsumeTheMealDbApi {

    private var mealApi = MealApi(apiKey)

    override fun usingChuckInterceptor(isDebug: Boolean, context: Context): IMealApi {
        return usingChuckInterceptor(isDebug, context.usingChuck())
    }

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): IMealApi {
        return mealApi.usingChuckInterceptor(isDebug, chuckerInterceptor)
    }

    override fun searchMeal(mealName: String, callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>) {
        mealApi.searchMeal(mealName, callback)
    }

    override fun searchMealFlow(mealName: String): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealApi.searchMealFlow(mealName)
    }

    override fun listAllMeal(
        firstLetter: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealApi.listAllMeal(firstLetter, callback)
    }

    override fun listAllMealFlow(firstLetter: String): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealApi.listAllMealFlow(firstLetter)
    }

    override fun lookupFullMeal(
        idMeal: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealApi.lookupFullMeal(idMeal, callback)
    }

    override fun lookupFullMealFlow(idMeal: String): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealApi.lookupFullMealFlow(idMeal)
    }

    override fun lookupRandomMeal(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>) {
        mealApi.lookupRandomMeal(callback)
    }

    override fun lookupRandomMealFlow(): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealApi.lookupRandomMealFlow()
    }

    override fun listMealCategories(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.CategoryResponse>) {
        mealApi.listMealCategories(callback)
    }

    override fun listMealCategoriesFlow(): Flow<Resource<com.frogobox.coreutil.meal.response.CategoryResponse?>> {
        return mealApi.listMealCategoriesFlow()
    }

    override fun listAllCateories(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Category>>) {
        mealApi.listAllCateories(callback)
    }

    override fun listAllArea(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Area>>) {
        mealApi.listAllArea(callback)
    }

    override fun listAllIngredients(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Ingredient>>) {
        mealApi.listAllIngredients(callback)
    }

    override fun filterByIngredient(
        ingredient: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealApi.filterByIngredient(ingredient, callback)
    }

    override fun filterByCategory(
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealApi.filterByCategory(category, callback)
    }

    override fun filterByArea(
        area: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealApi.filterByArea(area, callback)
    }
}