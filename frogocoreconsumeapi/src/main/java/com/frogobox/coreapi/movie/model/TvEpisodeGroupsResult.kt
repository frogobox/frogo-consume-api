package com.frogobox.coreapi.movie.model

data class TvEpisodeGroupsResult(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val id: String?,
    val name: String?,
    val network: TvEpisodeGroupsNetwork?,
    val type: Int?
)