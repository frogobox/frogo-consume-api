package com.frogobox.frogoconsumeapi.meal.source

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
 * com.frogobox.frogomealsapi.util
 *
 */

object MealConstant {

    object Url {
        const val BASE_URL = "https://www.themealdb.com/"
        const val BASE_PATH = "api/json/v1/"
        const val PATH_API = "{api_key}/"

        const val URL_SEARCH_MEAL = "$BASE_PATH$PATH_API" + "search.php"
        const val URL_LOOKUP_MEAL = "$BASE_PATH$PATH_API" + "lookup.php"
        const val URL_RANDOM_MEAL = "$BASE_PATH$PATH_API" + "random.php"
        const val URL_CATEGORIES = "$BASE_PATH$PATH_API" + "categories.php"
        const val URL_LIST = "$BASE_PATH$PATH_API" + "list.php"
        const val URL_FILTER = "$BASE_PATH$PATH_API" + "filter.php"
    }

    const val QUERY_NAME = "s"
    const val QUERY_FIRST_LETTER = "f"
    const val QUERY_ID = "i"
    const val QUERY_CATEGORY = "c"
    const val QUERY_AREA = "a"
    const val QUERY_INGREDIENT = "i"

    const val PATH_API_KEY = "api_key"

    const val VALUE_LIST = "list"

}