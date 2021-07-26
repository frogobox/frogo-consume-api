package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.SearchCompanyResult

data class SearchCompanies(
    val page: Int?,
    val results: List<SearchCompanyResult>?,
    val total_pages: Int?,
    val total_results: Int?
)