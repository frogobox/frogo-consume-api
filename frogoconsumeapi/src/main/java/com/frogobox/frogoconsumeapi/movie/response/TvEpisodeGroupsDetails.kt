package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsDetailGroup
import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsDetailNetwork

data class TvEpisodeGroupsDetails(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val groups: List<TvEpisodeGroupsDetailGroup>?,
    val id: String?,
    val name: String?,
    val network: TvEpisodeGroupsDetailNetwork?,
    val type: Int?
)