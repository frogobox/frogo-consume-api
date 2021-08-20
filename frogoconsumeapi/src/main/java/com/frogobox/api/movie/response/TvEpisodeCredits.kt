package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeAccountStateCast
import com.frogobox.api.movie.model.TvEpisodeCreditCrew
import com.frogobox.api.movie.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<TvEpisodeAccountStateCast>?,
    val crew: List<TvEpisodeCreditCrew>?,
    val guest_stars: List<TvEpisodeCreditGuestStar>?,
    val id: Int?
)