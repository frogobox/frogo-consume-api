package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SearchMultiResult

data class SearchMulti(
    val page: Int?,
    val results: List<SearchMultiResult>?,
    val total_pages: Int?,
    val total_results: Int?
)