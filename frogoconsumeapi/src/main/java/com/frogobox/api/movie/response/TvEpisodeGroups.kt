package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeGroupsResult

data class TvEpisodeGroups(
    val id: Int?,
    val results: List<TvEpisodeGroupsResult>?
)