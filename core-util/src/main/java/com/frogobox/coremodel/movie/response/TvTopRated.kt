package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvTopRatedResult

data class TvTopRated(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvTopRatedResult>?,
    val total_pages: Int?,
    val total_results: Int?
)