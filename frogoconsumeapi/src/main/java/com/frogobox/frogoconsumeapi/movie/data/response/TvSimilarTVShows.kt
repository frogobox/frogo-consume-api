package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvSimilarTVShowsResult

data class TvSimilarTVShows(
    val page: Int?,
    val results: List<TvSimilarTVShowsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)