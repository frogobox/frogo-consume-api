package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MoviePopularResult

data class MoviePopulars(
    val page: Int? = null,
    val results: List<MoviePopularResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)