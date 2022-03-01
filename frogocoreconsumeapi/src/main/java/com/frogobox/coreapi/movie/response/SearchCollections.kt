package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.SearchCollectionResult

data class SearchCollections(
    val page: Int?,
    val results: List<SearchCollectionResult>?,
    val total_pages: Int?,
    val total_results: Int?
)