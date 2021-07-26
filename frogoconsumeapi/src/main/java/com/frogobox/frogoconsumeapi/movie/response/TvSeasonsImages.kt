package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsImagesPoster

data class TvSeasonsImages(
    val id: Int?,
    val posters: List<com.frogobox.frogoconsumeapi.movie.model.TvSeasonsImagesPoster>?
)