package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvAccountStatesRated

data class TvAccountStates(
    val favorite: Boolean?,
    val id: Int?,
    val rated: TvAccountStatesRated?,
    val watchlist: Boolean?
)