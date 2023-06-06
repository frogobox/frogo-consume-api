package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvAccountStatesRated

data class TvAccountStates(
    val favorite: Boolean?,
    val id: Int?,
    val rated: com.frogobox.coremodel.movie.model.TvAccountStatesRated?,
    val watchlist: Boolean?
)