package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieKeyword

data class MovieKeywords(
    val id: Int? = null,
    val keywords: List<MovieKeyword>? = null
)