package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleImageProfile

data class PeopleImages(
    val id: Int?,
    val profiles: List<PeopleImageProfile>?
)