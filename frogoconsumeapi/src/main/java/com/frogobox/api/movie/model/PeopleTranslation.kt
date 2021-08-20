package com.frogobox.api.movie.model

data class PeopleTranslation(
    val `data`: PeopleTranslationData?,
    val english_name: String?,
    val iso_3166_1: String?,
    val iso_639_1: String?,
    val name: String?
)