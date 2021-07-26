package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeAccountStateCast
import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeCreditCrew
import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<com.frogobox.frogoconsumeapi.movie.model.TvEpisodeAccountStateCast>?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.TvEpisodeCreditCrew>?,
    val guest_stars: List<com.frogobox.frogoconsumeapi.movie.model.TvEpisodeCreditGuestStar>?,
    val id: Int?
)