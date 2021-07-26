package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsAccountStatesResult

data class TvSeasonsAccountStates(
    val id: Int?,
    val results: List<TvSeasonsAccountStatesResult>?
)