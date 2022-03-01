package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeChange

data class TvEpisodeChanges(
    val changes: List<TvEpisodeChange>?
)