package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvRecommendationsResult

data class TvRecommendations(
    val page: Int?,
    val results: List<TvRecommendationsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)