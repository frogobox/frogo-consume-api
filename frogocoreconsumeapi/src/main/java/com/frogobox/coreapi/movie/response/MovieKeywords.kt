package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieKeyword

data class MovieKeywords(
    val id: Int? = null,
    val keywords: List<MovieKeyword>? = null
)