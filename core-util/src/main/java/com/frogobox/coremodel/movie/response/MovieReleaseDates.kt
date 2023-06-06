package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.ResultReleaseDate

data class MovieReleaseDates(
    val id: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.ResultReleaseDate>? = null
)