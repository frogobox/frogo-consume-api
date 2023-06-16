package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeoplePopularResult

data class PeoplePopular(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.PeoplePopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)