package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SearchTvShowResult

data class SearchTvShow(
    val page: Int?,
    val results: List<SearchTvShowResult>?,
    val total_pages: Int?,
    val total_results: Int?
)