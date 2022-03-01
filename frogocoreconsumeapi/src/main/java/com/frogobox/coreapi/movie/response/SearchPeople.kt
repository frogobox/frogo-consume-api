package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SearchPeopleResult

data class SearchPeople(
    val page: Int?,
    val results: List<SearchPeopleResult>?,
    val total_pages: Int?,
    val total_results: Int?
)