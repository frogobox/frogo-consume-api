package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeGroupsDetailGroup
import com.frogobox.api.movie.model.TvEpisodeGroupsDetailNetwork

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