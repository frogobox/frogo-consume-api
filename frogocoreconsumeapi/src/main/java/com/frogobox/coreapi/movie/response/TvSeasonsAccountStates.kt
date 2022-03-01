package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvSeasonsAccountStatesResult

data class TvSeasonsAccountStates(
    val id: Int?,
    val results: List<TvSeasonsAccountStatesResult>?
)