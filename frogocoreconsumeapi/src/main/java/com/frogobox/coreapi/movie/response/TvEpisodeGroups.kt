package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeGroupsResult

data class TvEpisodeGroups(
    val id: Int?,
    val results: List<TvEpisodeGroupsResult>?
)