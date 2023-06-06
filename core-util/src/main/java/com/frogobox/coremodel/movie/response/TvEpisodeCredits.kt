package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeAccountStateCast
import com.frogobox.coremodel.movie.model.TvEpisodeCreditCrew
import com.frogobox.coremodel.movie.model.TvEpisodeCreditGuestStar

data class TvEpisodeCredits(
    val cast: List<com.frogobox.coremodel.movie.model.TvEpisodeAccountStateCast>?,
    val crew: List<com.frogobox.coremodel.movie.model.TvEpisodeCreditCrew>?,
    val guest_stars: List<com.frogobox.coremodel.movie.model.TvEpisodeCreditGuestStar>?,
    val id: Int?
)