package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.PeopleImageProfile

data class PeopleImages(
    val id: Int?,
    val profiles: List<PeopleImageProfile>?
)