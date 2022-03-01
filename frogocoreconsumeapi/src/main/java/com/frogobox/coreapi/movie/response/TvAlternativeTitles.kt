package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvAlternativeTitlesResult

data class TvAlternativeTitles(
    val id: Int?,
    val results: List<TvAlternativeTitlesResult>?
)