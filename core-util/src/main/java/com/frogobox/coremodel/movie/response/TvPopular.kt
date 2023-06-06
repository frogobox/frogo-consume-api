package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvPopularResult

data class TvPopular(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvPopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)