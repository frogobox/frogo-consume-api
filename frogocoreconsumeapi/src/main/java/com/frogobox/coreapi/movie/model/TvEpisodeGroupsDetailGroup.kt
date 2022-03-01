package com.frogobox.coreapi.movie.model

data class TvEpisodeGroupsDetailGroup(
    val episodes: List<TvEpisodeGroupsDetailEpisode>?,
    val id: String?,
    val locked: Boolean?,
    val name: String?,
    val order: Int?
)