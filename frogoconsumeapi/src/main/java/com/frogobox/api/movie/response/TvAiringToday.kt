package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvAiringTodayResult

data class TvAiringToday(
    val page: Int?,
    val results: List<TvAiringTodayResult>?,
    val total_pages: Int?,
    val total_results: Int?
)