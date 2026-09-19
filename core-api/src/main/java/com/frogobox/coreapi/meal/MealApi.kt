package com.frogobox.coreapi.meal


import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.Resource
import kotlinx.coroutines.flow.Flow
import okhttp3.Interceptor


/*
 * Created by faisalamir on 07/04/22
 * FrogoConsumeApi
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

class MealApi(
    private val apiKey: String
) : IMealApi {

    private val mealRepository = MealRepository

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): IMealApi {
        mealRepository.usingChuckInterceptor(isDebug, chuckerInterceptor)
        return this
    }

    override fun searchMeal(mealName: String, callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>) {
        mealRepository.searchMeal(apiKey, mealName, callback)
    }

    override fun searchMealFlow(mealName: String): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealRepository.searchMealFlow(apiKey, mealName)
    }

    override fun listAllMeal(
        firstLetter: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealRepository.listAllMeal(apiKey, firstLetter, callback)
    }

    override fun listAllMealFlow(firstLetter: String): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealRepository.listAllMealFlow(apiKey, firstLetter)
    }

    override fun lookupFullMeal(
        idMeal: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    ) {
        mealRepository.lookupFullMeal(apiKey, idMeal, callback)
    }

    override fun lookupFullMealFlow(idMeal: String): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealRepository.lookupFullMealFlow(apiKey, idMeal)
    }

    override fun lookupRandomMeal(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>) {
        mealRepository.lookupRandomMeal(apiKey, callback)
    }

    override fun lookupRandomMealFlow(): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>> {
        return mealRepository.lookupRandomMealFlow(apiKey)
    }

    override fun listMealCategories(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.CategoryResponse>) {
        mealRepository.listMealCategories(apiKey, callback)
    }

    override fun listMealCategoriesFlow(): Flow<Resource<com.frogobox.coreutil.meal.response.CategoryResponse?>> {
        return mealRepository.listMealCategoriesFlow(apiKey)
    }

    override fun listAllCateories(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Category>>) {
        mealRepository.listAllCateories(apiKey, callback)
    }

    override fun listAllArea(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Area>>) {
        mealRepository.listAllArea(apiKey, callback)
    }

    override fun listAllIngredients(callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Ingredient>>) {
        mealRepository.listAllIngredients(apiKey, callback)
    }

    override fun filterByIngredient(
        ingredient: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealRepository.filterByIngredient(apiKey, ingredient, callback)
    }

    override fun filterByCategory(
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealRepository.filterByCategory(apiKey, category, callback)
    }

    override fun filterByArea(
        area: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    ) {
        mealRepository.filterByArea(apiKey, area, callback)
    }
}