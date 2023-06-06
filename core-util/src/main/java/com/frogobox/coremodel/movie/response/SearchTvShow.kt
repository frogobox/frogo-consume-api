package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.SearchTvShowResult

data class SearchTvShow(
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.SearchTvShowResult>?,
    val total_pages: Int?,
    val total_results: Int?
)