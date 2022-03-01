package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvReviewsResult

data class TvReviews(
    val id: Int?,
    val page: Int?,
    val results: List<TvReviewsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)