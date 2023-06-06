package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvAlternativeTitlesResult

data class TvAlternativeTitles(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvAlternativeTitlesResult>?
)