package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvSeasonsAccountStatesResult

data class TvSeasonsAccountStates(
    val id: Int?,
    val results: List<TvSeasonsAccountStatesResult>?
)