package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.SearchCollectionResult

data class SearchCollections(
    val page: Int?,
    val results: List<SearchCollectionResult>?,
    val total_pages: Int?,
    val total_results: Int?
)