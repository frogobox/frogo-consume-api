package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieListResult

data class MovieLists(
    val id: Int? = null,
    val page: Int? = null,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.MovieListResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)