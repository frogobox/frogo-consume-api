package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieKeyword

data class MovieKeywords(
    val id: Int? = null,
    val keywords: List<MovieKeyword>? = null
)