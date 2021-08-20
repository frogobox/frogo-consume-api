package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeChange

data class TvEpisodeChanges(
    val changes: List<TvEpisodeChange>?
)