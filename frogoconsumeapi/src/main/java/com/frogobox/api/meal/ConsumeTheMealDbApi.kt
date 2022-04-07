package com.frogobox.api.meal

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.MealApi
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
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

    private var mealApi = MealApi(AndroidSchedulers.mainThread(), apiKey)

    override fun usingChuckInterceptor(context: Context) {
        usingChuckInterceptor(ChuckerInterceptor(context))
    }

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        mealApi.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun searchMeal(mealName: String, callback: ConsumeApiResponse<MealResponse<Meal>>) {
        mealApi.searchMeal(mealName, callback)
    }

    override fun listAllMeal(
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealApi.listAllMeal(firstLetter, callback)
    }

    override fun lookupFullMeal(
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealApi.lookupFullMeal(idMeal, callback)
    }

    override fun lookupRandomMeal(callback: ConsumeApiResponse<MealResponse<Meal>>) {
        mealApi.lookupRandomMeal(callback)
    }

    override fun listMealCategories(callback: ConsumeApiResponse<CategoryResponse>) {
        mealApi.listMealCategories(callback)
    }

    override fun listAllCateories(callback: ConsumeApiResponse<MealResponse<Category>>) {
        mealApi.listAllCateories(callback)
    }

    override fun listAllArea(callback: ConsumeApiResponse<MealResponse<Area>>) {
        mealApi.listAllArea(callback)
    }

    override fun listAllIngredients(callback: ConsumeApiResponse<MealResponse<Ingredient>>) {
        mealApi.listAllIngredients(callback)
    }

    override fun filterByIngredient(
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealApi.filterByIngredient(ingredient, callback)
    }

    override fun filterByCategory(
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealApi.filterByCategory(category, callback)
    }

    override fun filterByArea(
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealApi.filterByArea(area, callback)
    }
}