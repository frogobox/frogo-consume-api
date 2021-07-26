package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieTranslation

data class MovieTranslations(
    val id: Int? = null,
    val translations: List<MovieTranslation>? = null
)