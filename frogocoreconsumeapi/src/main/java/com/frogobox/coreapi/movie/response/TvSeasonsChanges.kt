package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvSeasonsChange

data class TvSeasonsChanges(
    val changes: List<TvSeasonsChange>?
)