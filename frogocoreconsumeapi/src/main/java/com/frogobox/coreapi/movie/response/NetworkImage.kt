package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.NetworkLogo
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-movie-tmdb-api
 * Copyright (C) 29/03/2020.
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
data class NetworkImage(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("results")
    var results: List<NetworkLogo>? = null
)