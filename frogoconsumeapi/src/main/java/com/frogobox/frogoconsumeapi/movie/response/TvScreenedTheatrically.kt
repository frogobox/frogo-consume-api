package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvScreenedTheatricallyResult

data class TvScreenedTheatrically(
    val id: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvScreenedTheatricallyResult>?
)