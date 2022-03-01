package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieTopRatedResult

data class MovieTopRated(
    val page: Int? = null,
    val results: List<MovieTopRatedResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)