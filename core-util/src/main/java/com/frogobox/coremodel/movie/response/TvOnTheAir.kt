package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvOnTheAirResult

data class TvOnTheAir(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvOnTheAirResult>?,
    val total_pages: Int?,
    val total_results: Int?
)