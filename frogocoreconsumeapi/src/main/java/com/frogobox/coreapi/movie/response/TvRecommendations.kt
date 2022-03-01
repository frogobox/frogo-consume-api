package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvRecommendationsResult

data class TvRecommendations(
    val page: Int?,
    val results: List<TvRecommendationsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)