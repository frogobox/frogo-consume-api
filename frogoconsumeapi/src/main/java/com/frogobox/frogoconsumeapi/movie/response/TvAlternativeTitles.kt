package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvAlternativeTitlesResult

data class TvAlternativeTitles(
    val id: Int?,
    val results: List<TvAlternativeTitlesResult>?
)