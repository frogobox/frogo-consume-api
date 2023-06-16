package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvRecommendationsResult

data class TvRecommendations(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvRecommendationsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)