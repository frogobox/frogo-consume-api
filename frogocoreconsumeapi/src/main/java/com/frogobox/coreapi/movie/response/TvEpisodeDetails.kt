package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeDetailsCrew
import com.frogobox.coreapi.movie.model.TvEpisodeDetailsGuestStar

data class TvEpisodeDetails(
    val air_date: String?,
    val crew: List<TvEpisodeDetailsCrew>?,
    val episode_number: Int?,
    val guest_stars: List<TvEpisodeDetailsGuestStar>?,
    val id: Int?,
    val name: String?,
    val overview: String?,
    val production_code: String?,
    val season_number: Int?,
    val still_path: String?,
    val vote_average: Double?,
    val vote_count: Int?
)