package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvTopRatedResult

data class TvTopRated(
    val page: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvTopRatedResult>?,
    val total_pages: Int?,
    val total_results: Int?
)