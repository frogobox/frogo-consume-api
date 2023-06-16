package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeopleTaggedImageResult

data class PeopleTaggedImages(
    val id: Int?,
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.PeopleTaggedImageResult>?,
    val total_pages: Int?,
    val total_results: Int?
)