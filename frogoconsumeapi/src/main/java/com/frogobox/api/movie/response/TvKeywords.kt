package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvKeywordsResult

data class TvKeywords(
    val id: Int?,
    val results: List<TvKeywordsResult>?
)