package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvSeasonsImagesPoster

data class TvSeasonsImages(
    val id: Int?,
    val posters: List<TvSeasonsImagesPoster>?
)