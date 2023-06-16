package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvReviewsResult

data class TvReviews(
    val id: Int?,
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvReviewsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)