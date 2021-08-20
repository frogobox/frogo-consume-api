package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvPopularResult

data class TvPopular(
    val page: Int?,
    val results: List<TvPopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)