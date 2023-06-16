package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieTopRatedResult

data class MovieTopRated(
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieTopRatedResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)