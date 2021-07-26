package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeGroupsResult

data class TvEpisodeGroups(
    val id: Int?,
    val results: List<TvEpisodeGroupsResult>?
)