package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.SearchCompanyResult

data class SearchCompanies(
    val page: Int?,
    val results: List<SearchCompanyResult>?,
    val total_pages: Int?,
    val total_results: Int?
)