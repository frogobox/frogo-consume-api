package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieSimilarMovieResult

data class MovieSimilarMovies(
    val page: Int? = null,
    val results: List<MovieSimilarMovieResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)