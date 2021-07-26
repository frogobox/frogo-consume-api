package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeChange

data class TvEpisodeChanges(
    val changes: List<TvEpisodeChange>?
)