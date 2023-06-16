package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeGroupsDetailGroup
import com.frogobox.coremodel.movie.model.TvEpisodeGroupsDetailNetwork

data class TvEpisodeGroupsDetails(
    val description: String?,
    val episode_count: Int?,
    val group_count: Int?,
    val groups: List<com.frogobox.coremodel.movie.model.TvEpisodeGroupsDetailGroup>?,
    val id: String?,
    val name: String?,
    val network: com.frogobox.coremodel.movie.model.TvEpisodeGroupsDetailNetwork?,
    val type: Int?
)