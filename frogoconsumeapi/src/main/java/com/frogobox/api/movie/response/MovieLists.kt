package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieListResult

data class MovieLists(
    val id: Int? = null,
    val page: Int? = null,
    val results: List<MovieListResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)