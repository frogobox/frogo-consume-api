package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.ResultReleaseDate

data class MovieReleaseDates(
    val id: Int? = null,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.ResultReleaseDate>? = null
)