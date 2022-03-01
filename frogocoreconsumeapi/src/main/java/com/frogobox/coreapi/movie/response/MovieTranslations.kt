package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieTranslation

data class MovieTranslations(
    val id: Int? = null,
    val translations: List<MovieTranslation>? = null
)