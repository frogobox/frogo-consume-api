package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.SearchPeopleResult

data class SearchPeople(
    val page: Int?,
    val results: List<SearchPeopleResult>?,
    val total_pages: Int?,
    val total_results: Int?
)