package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.ResultReleaseDate

data class MovieReleaseDates(
    val id: Int? = null,
    val results: List<ResultReleaseDate>? = null
)