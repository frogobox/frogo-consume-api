package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.ResultReleaseDate

data class MovieReleaseDates(
    val id: Int? = null,
    val results: List<ResultReleaseDate>? = null
)