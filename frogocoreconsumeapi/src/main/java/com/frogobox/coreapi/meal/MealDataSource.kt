package com.frogobox.coreapi.meal

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
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
    fun usingChuckInterceptor(chuckerInterceptor: Interceptor)

    // Search meal by name
    fun searchMeal(
        scheduler: Scheduler?,
        apiKey: String,
        mealName: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    )

    // List all meals by first letter
    fun listAllMeal(
        scheduler: Scheduler?,
        apiKey: String,
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    )

    // Lookup full meal details by id
    fun lookupFullMeal(
        scheduler: Scheduler?,
        apiKey: String,
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    )

    // Lookup a single random meal
    fun lookupRandomMeal(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    )

    // List all meal categories
    fun listMealCategories(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<CategoryResponse>
    )

    // List all Categories
    fun listAllCateories(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Category>>
    )

    // List all Area
    fun listAllArea(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Area>>
    )

    // List all Ingredients
    fun listAllIngredients(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Ingredient>>
    )

    // Filter by main ingredient
    fun filterByIngredient(
        scheduler: Scheduler?,
        apiKey: String,
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    )

    // Filter by Category
    fun filterByCategory(
        scheduler: Scheduler?,
        apiKey: String,
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    )

    // Filter by Area
    fun filterByArea(
        scheduler: Scheduler?,
        apiKey: String,
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    )

}