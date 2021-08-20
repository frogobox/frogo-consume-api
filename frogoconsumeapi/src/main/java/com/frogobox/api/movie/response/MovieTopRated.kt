package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieTopRatedResult

data class MovieTopRated(
    val page: Int? = null,
    val results: List<MovieTopRatedResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)