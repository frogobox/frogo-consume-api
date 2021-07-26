package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.SearchMultiResult

data class SearchMulti(
    val page: Int?,
    val results: List<SearchMultiResult>?,
    val total_pages: Int?,
    val total_results: Int?
)