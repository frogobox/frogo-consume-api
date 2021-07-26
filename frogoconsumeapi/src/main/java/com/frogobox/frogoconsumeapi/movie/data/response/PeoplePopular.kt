package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.PeoplePopularResult

data class PeoplePopular(
    val page: Int?,
    val results: List<PeoplePopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)