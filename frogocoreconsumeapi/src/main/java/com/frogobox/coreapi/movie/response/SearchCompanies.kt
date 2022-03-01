package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SearchCompanyResult

data class SearchCompanies(
    val page: Int?,
    val results: List<SearchCompanyResult>?,
    val total_pages: Int?,
    val total_results: Int?
)