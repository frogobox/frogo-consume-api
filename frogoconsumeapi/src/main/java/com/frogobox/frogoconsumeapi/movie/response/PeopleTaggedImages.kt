package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleTaggedImageResult

data class PeopleTaggedImages(
    val id: Int?,
    val page: Int?,
    val results: List<PeopleTaggedImageResult>?,
    val total_pages: Int?,
    val total_results: Int?
)