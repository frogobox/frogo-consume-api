package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvSimilarTVShowsResult

data class TvSimilarTVShows(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvSimilarTVShowsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)