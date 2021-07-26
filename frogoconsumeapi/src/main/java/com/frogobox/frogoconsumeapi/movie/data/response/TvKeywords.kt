package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvKeywordsResult

data class TvKeywords(
    val id: Int?,
    val results: List<TvKeywordsResult>?
)