package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvPopularResult

data class TvPopular(
    val page: Int?,
    val results: List<TvPopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)