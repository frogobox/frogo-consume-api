package com.frogobox.coreapi.meal

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import io.reactivex.rxjava3.schedulers.Schedulers
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

class CTheMealDbApi(usingScheduler: Boolean, apiKey: String) : IMealApi {

    private var mealApi = if (usingScheduler) {
        MealApi(Schedulers.single(), apiKey)
    } else {
        MealApi(null, apiKey)
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