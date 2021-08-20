package com.frogobox.api.movie.model

data class PeoplePopularResult(
    val adult: Boolean?,
    val id: Int?,
    val known_for: List<PeoplePopularKnownFor>?,
    val name: String?,
    val popularity: Double?,
    val profile_path: String?
)