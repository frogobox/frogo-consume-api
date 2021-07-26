package com.frogobox.frogoconsumeapi.movie.model

import com.frogobox.frogoconsumeapi.movie.model.PeoplePopularKnownFor

data class PeoplePopularResult(
    val adult: Boolean?,
    val id: Int?,
    val known_for: List<PeoplePopularKnownFor>?,
    val name: String?,
    val popularity: Double?,
    val profile_path: String?
)