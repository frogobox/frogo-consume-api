package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeoplePopularResult

data class PeoplePopular(
    val page: Int?,
    val results: List<PeoplePopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)