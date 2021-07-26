package com.frogobox.frogoconsumeapi.movie.model

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsDetailEpisode

data class TvEpisodeGroupsDetailGroup(
    val episodes: List<TvEpisodeGroupsDetailEpisode>?,
    val id: String?,
    val locked: Boolean?,
    val name: String?,
    val order: Int?
)