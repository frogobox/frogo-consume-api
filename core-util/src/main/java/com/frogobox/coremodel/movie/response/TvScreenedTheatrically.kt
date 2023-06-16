package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvScreenedTheatricallyResult

data class TvScreenedTheatrically(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvScreenedTheatricallyResult>?
)