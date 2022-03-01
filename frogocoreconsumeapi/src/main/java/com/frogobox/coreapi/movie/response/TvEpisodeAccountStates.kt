package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeAccountStateRated

data class TvEpisodeAccountStates(
    val id: Int?,
    val rated: TvEpisodeAccountStateRated?
)