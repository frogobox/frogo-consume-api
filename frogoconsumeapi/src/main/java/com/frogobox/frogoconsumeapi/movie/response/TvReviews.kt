package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvReviewsResult

data class TvReviews(
    val id: Int?,
    val page: Int?,
    val results: List<TvReviewsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)