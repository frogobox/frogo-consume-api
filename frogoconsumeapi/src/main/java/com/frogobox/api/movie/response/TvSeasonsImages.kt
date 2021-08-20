package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvSeasonsImagesPoster

data class TvSeasonsImages(
    val id: Int?,
    val posters: List<TvSeasonsImagesPoster>?
)