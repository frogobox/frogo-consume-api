package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieListResult

data class MovieLists(
    val id: Int? = null,
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieListResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)