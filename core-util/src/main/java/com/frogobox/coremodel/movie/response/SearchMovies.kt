package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SearchMovieResult

data class SearchMovies(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SearchMovieResult>?,
    val total_pages: Int?,
    val total_results: Int?
)