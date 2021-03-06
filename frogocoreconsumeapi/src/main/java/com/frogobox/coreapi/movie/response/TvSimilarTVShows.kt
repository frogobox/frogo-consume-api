package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvSimilarTVShowsResult

data class TvSimilarTVShows(
    val page: Int?,
    val results: List<TvSimilarTVShowsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)