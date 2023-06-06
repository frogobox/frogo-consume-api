package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SearchCompanyResult

data class SearchCompanies(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SearchCompanyResult>?,
    val total_pages: Int?,
    val total_results: Int?
)