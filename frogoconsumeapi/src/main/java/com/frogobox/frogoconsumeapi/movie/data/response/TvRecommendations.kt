package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvRecommendationsResult

data class TvRecommendations(
    val page: Int?,
    val results: List<TvRecommendationsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)