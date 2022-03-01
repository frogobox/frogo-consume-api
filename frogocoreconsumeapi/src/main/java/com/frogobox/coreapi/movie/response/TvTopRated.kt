package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvTopRatedResult

data class TvTopRated(
    val page: Int?,
    val results: List<TvTopRatedResult>?,
    val total_pages: Int?,
    val total_results: Int?
)