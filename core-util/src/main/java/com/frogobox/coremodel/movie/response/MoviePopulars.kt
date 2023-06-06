package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MoviePopularResult

data class MoviePopulars(
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MoviePopularResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)