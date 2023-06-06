package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeopleImageProfile

data class PeopleImages(
    val id: Int?,
    val profiles: List<com.frogobox.coremodel.movie.model.PeopleImageProfile>?
)