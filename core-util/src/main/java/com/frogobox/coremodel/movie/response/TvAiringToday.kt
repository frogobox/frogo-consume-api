package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvAiringTodayResult

data class TvAiringToday(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvAiringTodayResult>?,
    val total_pages: Int?,
    val total_results: Int?
)