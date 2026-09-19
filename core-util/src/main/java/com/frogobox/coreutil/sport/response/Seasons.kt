package com.frogobox.coreutil.sport.response

import com.frogobox.coreutil.sport.model.Season

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 26/01/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.model.response
 *
 */

import com.google.gson.annotations.SerializedName

data class Seasons(
    @SerializedName("seasons")
    var seasons: List<Season>? = null
)