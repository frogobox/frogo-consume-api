package com.frogobox.frogoconsumeapi.movie.model

data class TvTranslation(
    val `data`: TvTranslationData?,
    val english_name: String?,
    val iso_3166_1: String?,
    val iso_639_1: String?,
    val name: String?
)