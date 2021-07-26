package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSimilarTVShowsResult

data class TvSimilarTVShows(
    val page: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvSimilarTVShowsResult>?,
    val total_pages: Int?,
    val total_results: Int?
)