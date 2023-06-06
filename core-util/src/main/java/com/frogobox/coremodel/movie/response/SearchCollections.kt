package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SearchCollectionResult

data class SearchCollections(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SearchCollectionResult>?,
    val total_pages: Int?,
    val total_results: Int?
)