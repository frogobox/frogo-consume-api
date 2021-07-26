package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeAccountStateRated

data class TvEpisodeAccountStates(
    val id: Int?,
    val rated: TvEpisodeAccountStateRated?
)