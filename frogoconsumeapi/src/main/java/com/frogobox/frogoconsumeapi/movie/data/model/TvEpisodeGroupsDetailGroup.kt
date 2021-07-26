package com.frogobox.frogoconsumeapi.movie.data.model

import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeGroupsDetailEpisode

data class TvEpisodeGroupsDetailGroup(
    val episodes: List<TvEpisodeGroupsDetailEpisode>?,
    val id: String?,
    val locked: Boolean?,
    val name: String?,
    val order: Int?
)