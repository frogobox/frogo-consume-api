package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.SeacrhKeywordResult

data class SearchKeywords(
    val page: Int?,
    val results: List<SeacrhKeywordResult>?,
    val total_pages: Int?,
    val total_results: Int?
)