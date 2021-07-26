package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeDetailsCrew
import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeDetailsGuestStar

data class TvEpisodeDetails(
    val air_date: String?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.TvEpisodeDetailsCrew>?,
    val episode_number: Int?,
    val guest_stars: List<com.frogobox.frogoconsumeapi.movie.model.TvEpisodeDetailsGuestStar>?,
    val id: Int?,
    val name: String?,
    val overview: String?,
    val production_code: String?,
    val season_number: Int?,
    val still_path: String?,
    val vote_average: Double?,
    val vote_count: Int?
)