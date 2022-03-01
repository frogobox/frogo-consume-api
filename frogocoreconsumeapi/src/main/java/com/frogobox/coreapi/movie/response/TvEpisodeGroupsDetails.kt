package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeGroupsDetailGroup
import com.frogobox.coreapi.movie.model.TvEpisodeGroupsDetailNetwork

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