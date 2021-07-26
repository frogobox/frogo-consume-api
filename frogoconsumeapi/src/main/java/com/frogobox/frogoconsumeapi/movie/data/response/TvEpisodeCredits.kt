package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeAccountStateCast
import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeCreditCrew
import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<TvEpisodeAccountStateCast>?,
    val crew: List<TvEpisodeCreditCrew>?,
    val guest_stars: List<TvEpisodeCreditGuestStar>?,
    val id: Int?
)