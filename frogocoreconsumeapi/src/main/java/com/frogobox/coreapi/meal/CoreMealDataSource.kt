package com.frogobox.coreapi.meal

import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*
import io.reactivex.rxjava3.core.Scheduler

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
interface CoreMealDataSource {

    // Search meal by name
    fun searchMeal(apiKey: String, mealName: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // List all meals by first letter
    fun listAllMeal(apiKey: String, firstLetter: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // Lookup full meal details by id
    fun lookupFullMeal(apiKey: String, idMeal: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // Lookup a single random meal
    fun lookupRandomMeal(apiKey: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Meal>>)

    // List all meal categories
    fun listMealCategories(apiKey: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<CategoryResponse>)

    // List all Categories
    fun listAllCateories(apiKey: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Category>>)

    // List all Area
    fun listAllArea(apiKey: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Area>>)

    // List all Ingredients
    fun listAllIngredients(apiKey: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<Ingredient>>)

    // Filter by main ingredient
    fun filterByIngredient(apiKey: String, ingredient: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<MealFilter>>)

    // Filter by Category
    fun filterByCategory(apiKey: String, category: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<MealFilter>>)

    // Filter by Area
    fun filterByArea(apiKey: String, area: String, rxScheduler: Scheduler, callback: ConsumeApiResponse<MealResponse<MealFilter>>)

}