package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.CollectionTranslation
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
data class CollectionsTranslation(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("translations")
    var translations: List<CollectionTranslation>? = null

)
