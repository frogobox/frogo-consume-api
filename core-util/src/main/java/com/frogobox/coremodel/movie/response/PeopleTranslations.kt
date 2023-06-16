package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeopleTranslation

data class PeopleTranslations(
    val id: Int?,
    val translations: List<com.frogobox.coremodel.movie.model.PeopleTranslation>?
)