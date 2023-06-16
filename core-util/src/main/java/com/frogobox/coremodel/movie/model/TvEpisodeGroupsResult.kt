package com.frogobox.coremodel.movie.model

data class TvEpisodeGroupsResult(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val id: String?,
    val name: String?,
    val network: com.frogobox.coremodel.movie.model.TvEpisodeGroupsNetwork?,
    val type: Int?
)