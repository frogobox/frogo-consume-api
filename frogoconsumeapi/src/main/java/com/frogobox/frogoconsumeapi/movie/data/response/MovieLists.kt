package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieListResult

data class MovieLists(
    val id: Int? = null,
    val page: Int? = null,
    val results: List<MovieListResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)