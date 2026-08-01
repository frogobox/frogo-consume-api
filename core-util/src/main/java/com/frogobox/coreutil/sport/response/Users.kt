package com.frogobox.coreutil.sport.response

import com.frogobox.coreutil.sport.model.User

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 07/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.data.model
 *
 */
import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("users", alternate = ["loved", "players"])
    var players: List<User>? = null
)