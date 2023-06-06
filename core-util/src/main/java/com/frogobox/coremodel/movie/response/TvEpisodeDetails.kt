package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeDetailsCrew
import com.frogobox.coremodel.movie.model.TvEpisodeDetailsGuestStar

data class TvEpisodeDetails(
    val air_date: String?,
    val crew: List<com.frogobox.coremodel.movie.model.TvEpisodeDetailsCrew>?,
    val episode_number: Int?,
    val guest_stars: List<com.frogobox.coremodel.movie.model.TvEpisodeDetailsGuestStar>?,
    val id: Int?,
    val name: String?,
    val overview: String?,
    val production_code: String?,
    val season_number: Int?,
    val still_path: String?,
    val vote_average: Double?,
    val vote_count: Int?
)