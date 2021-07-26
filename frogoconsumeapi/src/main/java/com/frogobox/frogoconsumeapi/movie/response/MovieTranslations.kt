package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieTranslation

data class MovieTranslations(
    val id: Int? = null,
    val translations: List<com.frogobox.frogoconsumeapi.movie.model.MovieTranslation>? = null
)