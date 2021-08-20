package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvScreenedTheatricallyResult

data class TvScreenedTheatrically(
    val id: Int?,
    val results: List<TvScreenedTheatricallyResult>?
)