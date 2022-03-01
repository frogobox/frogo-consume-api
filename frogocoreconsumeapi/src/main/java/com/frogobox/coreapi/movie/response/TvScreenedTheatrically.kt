package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvScreenedTheatricallyResult

data class TvScreenedTheatrically(
    val id: Int?,
    val results: List<TvScreenedTheatricallyResult>?
)