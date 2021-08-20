package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.SearchMovieResult

data class SearchMovies(
    val page: Int?,
    val results: List<SearchMovieResult>?,
    val total_pages: Int?,
    val total_results: Int?
)