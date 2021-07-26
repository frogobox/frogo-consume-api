package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.SearchPeopleResult

data class SearchPeople(
    val page: Int?,
    val results: List<SearchPeopleResult>?,
    val total_pages: Int?,
    val total_results: Int?
)