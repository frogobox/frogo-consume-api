package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.CollectionImage
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
data class CollectionsImage(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("backdrops")
    var backdrops: List<CollectionImage>? = null,

    @SerializedName("posters")
    var posters: List<CollectionImage>? = null

)