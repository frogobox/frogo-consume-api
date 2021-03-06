package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieTitle
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
 * com.frogobox.frogoconsumeapi.movie.data.response
 *
 */
data class MovieAlternativeTitle(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("titles")
    var titles: List<MovieTitle>? = null

)