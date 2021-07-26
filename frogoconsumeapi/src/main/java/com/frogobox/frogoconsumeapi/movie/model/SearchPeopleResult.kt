package com.frogobox.frogoconsumeapi.movie.model

import com.frogobox.frogoconsumeapi.movie.model.SearchPeopleKnownFor

data class SearchPeopleResult(
    val adult: Boolean?,
    val id: Int?,
    val known_for: List<com.frogobox.frogoconsumeapi.movie.model.SearchPeopleKnownFor>?,
    val name: String?,
    val popularity: Double?,
    val profile_path: String?
)