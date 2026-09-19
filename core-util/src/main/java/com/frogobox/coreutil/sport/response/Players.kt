package com.frogobox.coreutil.sport.response

import com.frogobox.coreutil.sport.model.Player

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 06/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.data.response
 *
 */
import com.google.gson.annotations.SerializedName

data class Players(
    @SerializedName("player")
    var players: List<Player>? = null
)