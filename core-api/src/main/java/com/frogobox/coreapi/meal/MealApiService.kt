package com.frogobox.coreapi.meal


import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

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
interface MealApiService {

    // Search meal by name
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_SEARCH_MEAL)
    fun searchMeal(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_NAME) nameMeal: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // Search meal by name (Suspend)
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_SEARCH_MEAL)
    suspend fun searchMealSuspend(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_NAME) nameMeal: String
    ): Response<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // List all meals by first letter
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_SEARCH_MEAL)
    fun listAllMeal(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_FIRST_LETTER) firstLetter: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // List all meals by first letter (Suspend)
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_SEARCH_MEAL)
    suspend fun listAllMealSuspend(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_FIRST_LETTER) firstLetter: String
    ): Response<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // Lookup full meal details by id
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_LOOKUP_MEAL)
    fun lookupFullMeal(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_ID) idMeal: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // Lookup full meal details by id (Suspend)
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_LOOKUP_MEAL)
    suspend fun lookupFullMealSuspend(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_ID) idMeal: String
    ): Response<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // Lookup a single random meal
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_RANDOM_MEAL)
    fun lookupRandomMeal(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // Lookup a single random meal (Suspend)
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_RANDOM_MEAL)
    suspend fun lookupRandomMealSuspend(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String
    ): Response<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Meal>>

    // List all meal categories
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_CATEGORIES)
    fun listMealCategories(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String
    ): Call<com.frogobox.coreutil.meal.response.CategoryResponse>

    // List all meal categories (Suspend)
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_CATEGORIES)
    suspend fun listMealCategoriesSuspend(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String
    ): Response<com.frogobox.coreutil.meal.response.CategoryResponse>

    // List all Categories
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_LIST)
    fun listAllCateories(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_CATEGORY) query: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Category>>

    // List all Area
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_LIST)
    fun listAllArea(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_AREA) query: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Area>>

    // List all Ingredients
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_LIST)
    fun listAllIngredients(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_INGREDIENT) query: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.Ingredient>>

    // Filter by main ingredient
    @GET(com.frogobox.coreutil.meal.MealUrl.URL_FILTER)
    fun filterByIngredient(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_INGREDIENT) ingredient: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>

    // Filter by Category
    fun filterByCategory(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_CATEGORY) category: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>

    // Filter by Area
    fun filterByArea(
        @Path(com.frogobox.coreutil.meal.MealConstant.PATH_API_KEY) apiKey: String,
        @Query(com.frogobox.coreutil.meal.MealConstant.QUERY_AREA) area: String
    ): Call<com.frogobox.coreutil.meal.response.MealResponse<com.frogobox.coreutil.meal.model.MealFilter>>

}