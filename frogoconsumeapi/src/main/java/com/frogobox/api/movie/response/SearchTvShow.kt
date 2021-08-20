package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.SearchTvShowResult

data class SearchTvShow(
    val page: Int?,
    val results: List<SearchTvShowResult>?,
    val total_pages: Int?,
    val total_results: Int?
)