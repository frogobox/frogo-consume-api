package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MoviePopularResult

data class MoviePopulars(
    val page: Int? = null,
    val results: List<MoviePopularResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)