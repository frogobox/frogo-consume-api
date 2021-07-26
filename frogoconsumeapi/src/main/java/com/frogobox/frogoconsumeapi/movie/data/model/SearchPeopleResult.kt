package com.frogobox.frogoconsumeapi.movie.data.model

import com.frogobox.frogoconsumeapi.movie.data.model.SearchPeopleKnownFor

data class SearchPeopleResult(
    val adult: Boolean?,
    val id: Int?,
    val known_for: List<SearchPeopleKnownFor>?,
    val name: String?,
    val popularity: Double?,
    val profile_path: String?
)