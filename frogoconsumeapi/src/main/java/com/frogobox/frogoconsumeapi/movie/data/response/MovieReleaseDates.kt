package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.ResultReleaseDate

data class MovieReleaseDates(
    val id: Int? = null,
    val results: List<ResultReleaseDate>? = null
)