package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SeacrhKeywordResult

data class SearchKeywords(
    val page: Int?,
    val results: List<SeacrhKeywordResult>?,
    val total_pages: Int?,
    val total_results: Int?
)