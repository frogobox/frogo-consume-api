package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeAccountStateCast
import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeCreditCrew
import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<TvEpisodeAccountStateCast>?,
    val crew: List<TvEpisodeCreditCrew>?,
    val guest_stars: List<TvEpisodeCreditGuestStar>?,
    val id: Int?
)