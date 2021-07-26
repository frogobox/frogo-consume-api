package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvScreenedTheatricallyResult

data class TvScreenedTheatrically(
    val id: Int?,
    val results: List<TvScreenedTheatricallyResult>?
)