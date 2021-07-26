package com.frogobox.frogoconsumeapi.movie.model

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsNetwork

data class TvEpisodeGroupsResult(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val id: String?,
    val name: String?,
    val network: com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsNetwork?,
    val type: Int?
)