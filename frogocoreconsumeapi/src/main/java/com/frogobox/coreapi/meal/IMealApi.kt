package com.frogobox.coreapi.meal

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
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

interface IMealApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(chuckerInterceptor: Interceptor)

    // Search meal by name
    fun searchMeal(mealName: String, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // List all meals by first letter
    fun listAllMeal(firstLetter: String, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // Lookup full meal details by id
    fun lookupFullMeal(idMeal: String, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // Lookup a single random meal
    fun lookupRandomMeal(callback: ConsumeApiResponse<MealResponse<Meal>>)

    // List all meal categories
    fun listMealCategories(callback: ConsumeApiResponse<CategoryResponse>)

    // List all Categories
    fun listAllCateories(callback: ConsumeApiResponse<MealResponse<Category>>)

    // List all Area
    fun listAllArea(callback: ConsumeApiResponse<MealResponse<Area>>)

    // List all Ingredients
    fun listAllIngredients(callback: ConsumeApiResponse<MealResponse<Ingredient>>)

    // Filter by main ingredient
    fun filterByIngredient(
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    )

    // Filter by Category
    fun filterByCategory(category: String, callback: ConsumeApiResponse<MealResponse<MealFilter>>)

    // Filter by Area
    fun filterByArea(area: String, callback: ConsumeApiResponse<MealResponse<MealFilter>>)

}