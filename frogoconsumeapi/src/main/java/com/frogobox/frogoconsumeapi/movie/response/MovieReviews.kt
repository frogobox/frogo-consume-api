package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieReviewResult

data class MovieReviews(
    val id: Int? = null,
    val page: Int? = null,
    val results: List<MovieReviewResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)