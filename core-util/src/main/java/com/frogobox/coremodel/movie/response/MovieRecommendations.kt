package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieRecommendationResult

data class MovieRecommendations(
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieRecommendationResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)