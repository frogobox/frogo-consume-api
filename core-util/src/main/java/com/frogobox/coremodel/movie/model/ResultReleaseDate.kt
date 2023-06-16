package com.frogobox.coremodel.movie.model

data class ResultReleaseDate(
    val iso_3166_1: String? = null,
    val release_dates: List<com.frogobox.coremodel.movie.model.ReleaseDate>? = null
)