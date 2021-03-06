package com.frogobox.coreapi.sport.model

import com.frogobox.coreapi.sport.SportData.Honor.ID
import com.frogobox.coreapi.sport.SportData.Honor.ID_PLAYER
import com.frogobox.coreapi.sport.SportData.Honor.ID_TEAM
import com.frogobox.coreapi.sport.SportData.Honor.STR_HONOUR
import com.frogobox.coreapi.sport.SportData.Honor.STR_PLAYER
import com.frogobox.coreapi.sport.SportData.Honor.STR_SEASON
import com.frogobox.coreapi.sport.SportData.Honor.STR_SPORT
import com.frogobox.coreapi.sport.SportData.Honor.STR_TEAM
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 08/03/2020.
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
data class Honor(

    @SerializedName(ID)
    var id: String? = null,

    @SerializedName(ID_PLAYER)
    var idPlayer: String? = null,

    @SerializedName(ID_TEAM)
    var idTeam: String? = null,

    @SerializedName(STR_SPORT)
    var strSport: String? = null,

    @SerializedName(STR_PLAYER)
    var strPlayer: String? = null,

    @SerializedName(STR_TEAM)
    var strTeam: String? = null,

    @SerializedName(STR_HONOUR)
    var strHonour: String? = null,

    @SerializedName(STR_SEASON)
    var strSeason: String? = null

)