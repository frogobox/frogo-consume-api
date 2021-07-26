package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.SearchCollectionResult

data class SearchCollections(
    val page: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.SearchCollectionResult>?,
    val total_pages: Int?,
    val total_results: Int?
)