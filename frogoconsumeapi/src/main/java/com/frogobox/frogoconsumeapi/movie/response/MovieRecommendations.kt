package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieRecommendationResult

data class MovieRecommendations(
    val page: Int? = null,
    val results: List<MovieRecommendationResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)