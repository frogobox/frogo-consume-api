package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieSimilarMovieResult

data class MovieSimilarMovies(
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieSimilarMovieResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)