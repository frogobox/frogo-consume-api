package com.frogobox.frogoconsumeapi.movie.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-movie-tmdb-api
 * Copyright (C) 05/04/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.data.model
 *
 */
data class MovieTitle(

    @SerializedName("iso_3166_1")
    var iso_3166_1: String? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("type")
    var type: String? = null

)