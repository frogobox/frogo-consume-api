package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieTopRatedResult

data class MovieTopRated(
    val page: Int? = null,
    val results: List<MovieTopRatedResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)