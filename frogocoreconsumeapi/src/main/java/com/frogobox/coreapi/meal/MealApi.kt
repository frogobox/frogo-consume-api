package com.frogobox.coreapi.meal

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import io.reactivex.rxjava3.core.Scheduler
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

class MealApi(
    private val scheduler: Scheduler?,
    private val apiKey: String
) : IMealApi {

    private val mealRepository = MealRepository

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        mealRepository.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun searchMeal(mealName: String, callback: ConsumeApiResponse<MealResponse<Meal>>) {
        mealRepository.searchMeal(scheduler, apiKey, mealName, callback)
    }

    override fun listAllMeal(
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealRepository.listAllMeal(scheduler, apiKey, firstLetter, callback)
    }

    override fun lookupFullMeal(
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealRepository.lookupFullMeal(scheduler, apiKey, idMeal, callback)
    }

    override fun lookupRandomMeal(callback: ConsumeApiResponse<MealResponse<Meal>>) {
        mealRepository.lookupRandomMeal(scheduler, apiKey, callback)
    }

    override fun listMealCategories(callback: ConsumeApiResponse<CategoryResponse>) {
        mealRepository.listMealCategories(scheduler, apiKey, callback)
    }

    override fun listAllCateories(callback: ConsumeApiResponse<MealResponse<Category>>) {
        mealRepository.listAllCateories(scheduler, apiKey, callback)
    }

    override fun listAllArea(callback: ConsumeApiResponse<MealResponse<Area>>) {
        mealRepository.listAllArea(scheduler, apiKey, callback)
    }

    override fun listAllIngredients(callback: ConsumeApiResponse<MealResponse<Ingredient>>) {
        mealRepository.listAllIngredients(scheduler, apiKey, callback)
    }

    override fun filterByIngredient(
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealRepository.filterByIngredient(scheduler, apiKey, ingredient, callback)
    }

    override fun filterByCategory(
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealRepository.filterByCategory(scheduler, apiKey, category, callback)
    }

    override fun filterByArea(
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealRepository.filterByArea(scheduler, apiKey, area, callback)
    }
}