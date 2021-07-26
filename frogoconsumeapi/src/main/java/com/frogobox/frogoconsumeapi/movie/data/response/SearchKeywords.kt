package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.SeacrhKeywordResult

data class SearchKeywords(
    val page: Int?,
    val results: List<SeacrhKeywordResult>?,
    val total_pages: Int?,
    val total_results: Int?
)