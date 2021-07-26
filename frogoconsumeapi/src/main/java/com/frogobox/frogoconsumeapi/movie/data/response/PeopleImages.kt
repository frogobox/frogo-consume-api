package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.PeopleImageProfile

data class PeopleImages(
    val id: Int?,
    val profiles: List<PeopleImageProfile>?
)