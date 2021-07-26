package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvPopularResult

data class TvPopular(
    val page: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvPopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)