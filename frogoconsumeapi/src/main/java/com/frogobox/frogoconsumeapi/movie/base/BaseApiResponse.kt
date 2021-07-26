package com.frogobox.frogoconsumeapi.movie.base

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 13/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.base
 *
 */
data class BaseApiResponse<T>(
    @SerializedName("page")
    var page: Int? = null,

    @SerializedName("total_results")
    var total_results: Int? = null,

    @SerializedName("total_pages")
    var total_pages: Int? = null,

    @SerializedName("results")
    var results: T? = null
)