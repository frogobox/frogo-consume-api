package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SearchPeopleResult

data class SearchPeople(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SearchPeopleResult>?,
    val total_pages: Int?,
    val total_results: Int?
)