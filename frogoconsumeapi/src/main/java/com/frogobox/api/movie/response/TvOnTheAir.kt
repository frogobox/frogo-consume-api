package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvOnTheAirResult

data class TvOnTheAir(
    val page: Int?,
    val results: List<TvOnTheAirResult>?,
    val total_pages: Int?,
    val total_results: Int?
)