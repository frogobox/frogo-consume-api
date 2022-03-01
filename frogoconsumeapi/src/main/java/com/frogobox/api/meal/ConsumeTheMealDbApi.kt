package com.frogobox.api.meal

import android.content.Context
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*

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
class ConsumeTheMealDbApi(private val apiKey: String) : IConsumeTheMealDbApi {

    private val repository = MealRepository

    override fun usingChuckInterceptor(context: Context) {
        repository.usingChuckInterceptor(context)
    }

    override fun searchMeal(mealName: String, callback: ConsumeApiResponse<MealResponse<Meal>>) {
        repository.searchMeal(apiKey, mealName, callback)
    }

    override fun listAllMeal(
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        repository.listAllMeal(apiKey, firstLetter, callback)
    }

    override fun lookupFullMeal(
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        repository.lookupFullMeal(apiKey, idMeal, callback)
    }

    override fun lookupRandomMeal(callback: ConsumeApiResponse<MealResponse<Meal>>) {
        repository.lookupRandomMeal(apiKey, callback)
    }

    override fun listMealCategories(callback: ConsumeApiResponse<CategoryResponse>) {
        repository.listMealCategories(apiKey, callback)
    }

    override fun listAllCateories(callback: ConsumeApiResponse<MealResponse<Category>>) {
        repository.listAllCateories(apiKey, callback)
    }

    override fun listAllArea(callback: ConsumeApiResponse<MealResponse<Area>>) {
        repository.listAllArea(apiKey, callback)
    }

    override fun listAllIngredients(callback: ConsumeApiResponse<MealResponse<Ingredient>>) {
        repository.listAllIngredients(apiKey, callback)
    }

    override fun filterByIngredient(
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        repository.filterByIngredient(apiKey, ingredient, callback)
    }

    override fun filterByCategory(
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        repository.filterByCategory(apiKey, category, callback)
    }

    override fun filterByArea(
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        repository.filterByArea(apiKey, area, callback)
    }
}