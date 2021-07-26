package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvTopRatedResult

data class TvTopRated(
    val page: Int?,
    val results: List<TvTopRatedResult>?,
    val total_pages: Int?,
    val total_results: Int?
)