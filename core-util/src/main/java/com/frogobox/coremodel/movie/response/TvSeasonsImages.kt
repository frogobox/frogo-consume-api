package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvSeasonsImagesPoster

data class TvSeasonsImages(
    val id: Int?,
    val posters: List<com.frogobox.coremodel.movie.model.TvSeasonsImagesPoster>?
)