package com.frogobox.frogoconsumeapi.movie.data.response

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
 * com.frogobox.frogoconsumeapi.movie.data.response
 *
 */
data class Certifications<T>(

    @SerializedName("certifications")
    var certifications: T? = null

)