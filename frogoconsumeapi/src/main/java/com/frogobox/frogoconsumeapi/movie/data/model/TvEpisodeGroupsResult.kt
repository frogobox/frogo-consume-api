package com.frogobox.frogoconsumeapi.movie.data.model

import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeGroupsNetwork

data class TvEpisodeGroupsResult(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val id: String?,
    val name: String?,
    val network: TvEpisodeGroupsNetwork?,
    val type: Int?
)