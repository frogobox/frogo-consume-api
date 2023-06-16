package com.frogobox.coreapi.meal


import com.frogobox.coremodel.meal.response.CategoryResponse
import com.frogobox.coremodel.meal.response.MealResponse
import com.frogobox.coremodel.meal.model.Area
import com.frogobox.coremodel.meal.model.Category
import com.frogobox.coremodel.meal.model.Ingredient
import com.frogobox.coremodel.meal.model.Meal
import com.frogobox.coremodel.meal.model.MealFilter
import com.frogobox.coresdk.response.FrogoDataResponse
import io.reactivex.rxjava3.core.Scheduler
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
        scheduler: Scheduler?,
        apiKey: String,
        mealName: String,
        callback: FrogoDataResponse<MealResponse<Meal>>
    )

    // List all meals by first letter
    fun listAllMeal(
        scheduler: Scheduler?,
        apiKey: String,
        firstLetter: String,
        callback: FrogoDataResponse<MealResponse<Meal>>
    )

    // Lookup full meal details by id
    fun lookupFullMeal(
        scheduler: Scheduler?,
        apiKey: String,
        idMeal: String,
        callback: FrogoDataResponse<MealResponse<Meal>>
    )

    // Lookup a single random meal
    fun lookupRandomMeal(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<MealResponse<Meal>>
    )

    // List all meal categories
    fun listMealCategories(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<CategoryResponse>
    )

    // List all Categories
    fun listAllCateories(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<MealResponse<Category>>
    )

    // List all Area
    fun listAllArea(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<MealResponse<Area>>
    )

    // List all Ingredients
    fun listAllIngredients(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<MealResponse<Ingredient>>
    )

    // Filter by main ingredient
    fun filterByIngredient(
        scheduler: Scheduler?,
        apiKey: String,
        ingredient: String,
        callback: FrogoDataResponse<MealResponse<MealFilter>>
    )

    // Filter by Category
    fun filterByCategory(
        scheduler: Scheduler?,
        apiKey: String,
        category: String,
        callback: FrogoDataResponse<MealResponse<MealFilter>>
    )

    // Filter by Area
    fun filterByArea(
        scheduler: Scheduler?,
        apiKey: String,
        area: String,
        callback: FrogoDataResponse<MealResponse<MealFilter>>
    )

}