package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.SearchMovieResult

data class SearchMovies(
    val page: Int?,
    val results: List<SearchMovieResult>?,
    val total_pages: Int?,
    val total_results: Int?
)