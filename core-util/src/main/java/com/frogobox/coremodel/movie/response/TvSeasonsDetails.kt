package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvSeasonsDetailsEpisode

data class TvSeasonsDetails(
    val _id: String?,
    val air_date: String?,
    val episodes: List<com.frogobox.coremodel.movie.model.TvSeasonsDetailsEpisode>?,
    val id: Int?,
    val name: String?,
    val overview: String?,
    val poster_path: String?,
    val season_number: Int?
)