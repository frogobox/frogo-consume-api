package com.frogobox.api.movie.model

data class ResultReleaseDate(
    val iso_3166_1: String? = null,
    val release_dates: List<ReleaseDate>? = null
)