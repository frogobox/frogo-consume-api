package com.frogobox.coreapi.meal


import com.frogobox.coremodel.meal.response.CategoryResponse
import com.frogobox.coremodel.meal.response.MealResponse
import com.frogobox.coremodel.meal.model.Area
import com.frogobox.coremodel.meal.model.Category
import com.frogobox.coremodel.meal.model.Ingredient
import com.frogobox.coremodel.meal.model.Meal
import com.frogobox.coremodel.meal.model.MealFilter
import com.frogobox.coresdk.response.FrogoDataResponse
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

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): IMealApi {
        return mealApi.usingChuckInterceptor(isDebug, chuckerInterceptor)
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