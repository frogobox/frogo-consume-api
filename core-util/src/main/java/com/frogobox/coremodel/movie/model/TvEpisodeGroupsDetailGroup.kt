package com.frogobox.coremodel.movie.model

data class TvEpisodeGroupsDetailGroup(
    val episodes: List<com.frogobox.coremodel.movie.model.TvEpisodeGroupsDetailEpisode>?,
    val id: String?,
    val locked: Boolean?,
    val name: String?,
    val order: Int?
)