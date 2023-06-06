package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvSeasonsAccountStatesResult

data class TvSeasonsAccountStates(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvSeasonsAccountStatesResult>?
)