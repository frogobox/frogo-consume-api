package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvSeasonsImagesPoster

data class TvSeasonsImages(
    val id: Int?,
    val posters: List<TvSeasonsImagesPoster>?
)