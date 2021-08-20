package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieSimilarMovieResult

data class MovieSimilarMovies(
    val page: Int? = null,
    val results: List<MovieSimilarMovieResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)