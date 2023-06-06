package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieReviewResult

data class MovieReviews(
    val id: Int? = null,
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieReviewResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)