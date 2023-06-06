package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SeacrhKeywordResult

data class SearchKeywords(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SeacrhKeywordResult>?,
    val total_pages: Int?,
    val total_results: Int?
)