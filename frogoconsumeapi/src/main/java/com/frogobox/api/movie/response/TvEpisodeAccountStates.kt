package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeAccountStateRated

data class TvEpisodeAccountStates(
    val id: Int?,
    val rated: TvEpisodeAccountStateRated?
)