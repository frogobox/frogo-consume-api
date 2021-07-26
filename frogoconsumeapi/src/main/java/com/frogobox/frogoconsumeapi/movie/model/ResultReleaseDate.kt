package com.frogobox.frogoconsumeapi.movie.model

import com.frogobox.frogoconsumeapi.movie.model.ReleaseDate

data class ResultReleaseDate(
    val iso_3166_1: String? = null,
    val release_dates: List<com.frogobox.frogoconsumeapi.movie.model.ReleaseDate>? = null
)