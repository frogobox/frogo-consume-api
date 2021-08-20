package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvAlternativeTitlesResult

data class TvAlternativeTitles(
    val id: Int?,
    val results: List<TvAlternativeTitlesResult>?
)