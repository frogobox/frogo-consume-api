package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeGroupsResult

data class TvEpisodeGroups(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvEpisodeGroupsResult>?
)