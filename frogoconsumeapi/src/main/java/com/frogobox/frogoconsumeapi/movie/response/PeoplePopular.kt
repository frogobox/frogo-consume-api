package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeoplePopularResult

data class PeoplePopular(
    val page: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.PeoplePopularResult>?,
    val total_pages: Int?,
    val total_results: Int?
)