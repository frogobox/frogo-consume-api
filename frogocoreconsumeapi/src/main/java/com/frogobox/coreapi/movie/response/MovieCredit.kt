package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieCast
import com.frogobox.coreapi.movie.model.MovieCrew
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
data class MovieCredit(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("cast")
    var cast: List<MovieCast>? = null,

    @SerializedName("crew")
    var crew: List<MovieCrew>? = null

)