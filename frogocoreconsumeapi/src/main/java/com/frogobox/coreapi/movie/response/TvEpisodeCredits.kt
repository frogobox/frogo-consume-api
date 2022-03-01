package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeAccountStateCast
import com.frogobox.coreapi.movie.model.TvEpisodeCreditCrew
import com.frogobox.coreapi.movie.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<TvEpisodeAccountStateCast>?,
    val crew: List<TvEpisodeCreditCrew>?,
    val guest_stars: List<TvEpisodeCreditGuestStar>?,
    val id: Int?
)