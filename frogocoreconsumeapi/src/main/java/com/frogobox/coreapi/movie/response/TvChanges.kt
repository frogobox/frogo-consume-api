package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvChange

data class TvChanges(
    val changes: List<TvChange>?
)