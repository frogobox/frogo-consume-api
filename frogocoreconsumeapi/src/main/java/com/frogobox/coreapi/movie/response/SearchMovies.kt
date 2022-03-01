package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SearchMovieResult

data class SearchMovies(
    val page: Int?,
    val results: List<SearchMovieResult>?,
    val total_pages: Int?,
    val total_results: Int?
)