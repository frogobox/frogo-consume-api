package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvKeywordsResult

data class TvKeywords(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvKeywordsResult>?
)