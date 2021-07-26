package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.SearchMovieResult

data class SearchMovies(
    val page: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.SearchMovieResult>?,
    val total_pages: Int?,
    val total_results: Int?
)