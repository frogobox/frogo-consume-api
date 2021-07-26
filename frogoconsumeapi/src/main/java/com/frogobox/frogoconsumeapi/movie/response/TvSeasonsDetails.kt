package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsDetailsEpisode

data class TvSeasonsDetails(
    val _id: String?,
    val air_date: String?,
    val episodes: List<TvSeasonsDetailsEpisode>?,
    val id: Int?,
    val name: String?,
    val overview: String?,
    val poster_path: String?,
    val season_number: Int?
)