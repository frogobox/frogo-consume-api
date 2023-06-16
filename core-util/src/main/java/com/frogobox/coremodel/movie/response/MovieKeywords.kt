package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieKeyword

data class MovieKeywords(
    val id: Int? = null,
    val keywords: List<com.frogobox.coremodel.movie.model.MovieKeyword>? = null
)