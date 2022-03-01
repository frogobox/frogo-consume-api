package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvAccountStatesRated

data class TvAccountStates(
    val favorite: Boolean?,
    val id: Int?,
    val rated: TvAccountStatesRated?,
    val watchlist: Boolean?
)