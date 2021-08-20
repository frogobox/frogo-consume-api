package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieKeyword

data class MovieKeywords(
    val id: Int? = null,
    val keywords: List<MovieKeyword>? = null
)