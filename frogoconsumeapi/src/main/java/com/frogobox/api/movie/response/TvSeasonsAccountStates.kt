package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvSeasonsAccountStatesResult

data class TvSeasonsAccountStates(
    val id: Int?,
    val results: List<TvSeasonsAccountStatesResult>?
)