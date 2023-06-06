package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieTranslation

data class MovieTranslations(
    val id: Int? = null,
    val translations: List<com.frogobox.coremodel.movie.model.MovieTranslation>? = null
)