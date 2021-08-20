package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieTranslation

data class MovieTranslations(
    val id: Int? = null,
    val translations: List<MovieTranslation>? = null
)