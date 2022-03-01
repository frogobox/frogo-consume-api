package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvAiringTodayResult

data class TvAiringToday(
    val page: Int?,
    val results: List<TvAiringTodayResult>?,
    val total_pages: Int?,
    val total_results: Int?
)