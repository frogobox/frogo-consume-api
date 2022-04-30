package com.frogobox.api.meal

import android.content.Context
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coreapi.meal.MealApi
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.sdk.ext.usingChuck
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
        usingChuckInterceptor(context.usingChuck())
    }

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        mealApi.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun searchMeal(mealName: String, callback: FrogoDataResponse<MealResponse<Meal>>) {
        mealApi.searchMeal(mealName, callback)
    }

    override fun listAllMeal(
        firstLetter: String,
        callback: FrogoDataResponse<MealResponse<Meal>>
    ) {
        mealApi.listAllMeal(firstLetter, callback)
    }

    override fun lookupFullMeal(
        idMeal: String,
        callback: FrogoDataResponse<MealResponse<Meal>>
    ) {
        mealApi.lookupFullMeal(idMeal, callback)
    }

    override fun lookupRandomMeal(callback: FrogoDataResponse<MealResponse<Meal>>) {
        mealApi.lookupRandomMeal(callback)
    }

    override fun listMealCategories(callback: FrogoDataResponse<CategoryResponse>) {
        mealApi.listMealCategories(callback)
    }

    override fun listAllCateories(callback: FrogoDataResponse<MealResponse<Category>>) {
        mealApi.listAllCateories(callback)
    }

    override fun listAllArea(callback: FrogoDataResponse<MealResponse<Area>>) {
        mealApi.listAllArea(callback)
    }

    override fun listAllIngredients(callback: FrogoDataResponse<MealResponse<Ingredient>>) {
        mealApi.listAllIngredients(callback)
    }

    override fun filterByIngredient(
        ingredient: String,
        callback: FrogoDataResponse<MealResponse<MealFilter>>
    ) {
        mealApi.filterByIngredient(ingredient, callback)
    }

    override fun filterByCategory(
        category: String,
        callback: FrogoDataResponse<MealResponse<MealFilter>>
    ) {
        mealApi.filterByCategory(category, callback)
    }

    override fun filterByArea(
        area: String,
        callback: FrogoDataResponse<MealResponse<MealFilter>>
    ) {
        mealApi.filterByArea(area, callback)
    }
}