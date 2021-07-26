package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleImageProfile

data class PeopleImages(
    val id: Int?,
    val profiles: List<PeopleImageProfile>?
)