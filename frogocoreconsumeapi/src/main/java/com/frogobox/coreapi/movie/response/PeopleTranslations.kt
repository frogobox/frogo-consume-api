package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleTranslation

data class PeopleTranslations(
    val id: Int?,
    val translations: List<PeopleTranslation>?
)