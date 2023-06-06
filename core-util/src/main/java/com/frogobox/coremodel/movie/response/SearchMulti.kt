package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SearchMultiResult

data class SearchMulti(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SearchMultiResult>?,
    val total_pages: Int?,
    val total_results: Int?
)