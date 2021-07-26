package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvAiringTodayResult

data class TvAiringToday(
    val page: Int?,
    val results: List<TvAiringTodayResult>?,
    val total_pages: Int?,
    val total_results: Int?
)