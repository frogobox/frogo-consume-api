package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieTopRatedResult

data class MovieTopRated(
    val page: Int? = null,
    val results: List<MovieTopRatedResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)