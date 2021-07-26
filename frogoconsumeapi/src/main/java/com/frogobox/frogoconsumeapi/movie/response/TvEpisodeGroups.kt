package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsResult

data class TvEpisodeGroups(
    val id: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvEpisodeGroupsResult>?
)