package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvKeywordsResult

data class TvKeywords(
    val id: Int?,
    val results: List<TvKeywordsResult>?
)