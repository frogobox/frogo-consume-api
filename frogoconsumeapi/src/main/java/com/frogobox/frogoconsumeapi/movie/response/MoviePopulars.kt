package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MoviePopularResult

data class MoviePopulars(
    val page: Int? = null,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.MoviePopularResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)