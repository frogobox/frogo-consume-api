package com.frogobox.coreapi.meal


import com.frogobox.coresdk.response.FrogoDataResponse
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
interface MealDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(isDebug: Boolean, chuckerInterceptor: Interceptor): MealDataSource

    // Search meal by name
    fun searchMeal(
        apiKey: String,
        mealName: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    )

    // Search meal by name (Flow)
    fun searchMealFlow(
        apiKey: String,
        mealName: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>>

    // List all meals by first letter
    fun listAllMeal(
        apiKey: String,
        firstLetter: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    )

    // List all meals by first letter (Flow)
    fun listAllMealFlow(
        apiKey: String,
        firstLetter: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>>

    // Lookup full meal details by id
    fun lookupFullMeal(
        apiKey: String,
        idMeal: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    )

    // Lookup full meal details by id (Flow)
    fun lookupFullMealFlow(
        apiKey: String,
        idMeal: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>>

    // Lookup a single random meal
    fun lookupRandomMeal(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>
    )

    // Lookup a single random meal (Flow)
    fun lookupRandomMealFlow(
        apiKey: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>?>>

    // List all meal categories
    fun listMealCategories(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.CategoryResponse>
    )

    // List all meal categories (Flow)
    fun listMealCategoriesFlow(
        apiKey: String
    ): Flow<Resource<com.frogobox.coreutil.meal.response.CategoryResponse?>>

    // List all Categories
    fun listAllCateories(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Category>>
    )

    // List all Area
    fun listAllArea(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Area>>
    )

    // List all Ingredients
    fun listAllIngredients(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Ingredient>>
    )

    // Filter by main ingredient
    fun filterByIngredient(
        apiKey: String,
        ingredient: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    )

    // Filter by Category
    fun filterByCategory(
        apiKey: String,
        category: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    )

    // Filter by Area
    fun filterByArea(
        apiKey: String,
        area: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>
    )

}