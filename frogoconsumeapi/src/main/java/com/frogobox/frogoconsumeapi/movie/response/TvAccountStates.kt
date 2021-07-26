package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvAccountStatesRated

data class TvAccountStates(
    val favorite: Boolean?,
    val id: Int?,
    val rated: TvAccountStatesRated?,
    val watchlist: Boolean?
)