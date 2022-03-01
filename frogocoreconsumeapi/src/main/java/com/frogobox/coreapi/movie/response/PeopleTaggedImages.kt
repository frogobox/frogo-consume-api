package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleTaggedImageResult

data class PeopleTaggedImages(
    val id: Int?,
    val page: Int?,
    val results: List<PeopleTaggedImageResult>?,
    val total_pages: Int?,
    val total_results: Int?
)