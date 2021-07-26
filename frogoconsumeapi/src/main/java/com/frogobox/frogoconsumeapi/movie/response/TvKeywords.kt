package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvKeywordsResult

data class TvKeywords(
    val id: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvKeywordsResult>?
)