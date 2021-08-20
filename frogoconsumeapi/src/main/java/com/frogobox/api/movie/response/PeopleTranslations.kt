package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.PeopleTranslation

data class PeopleTranslations(
    val id: Int?,
    val translations: List<PeopleTranslation>?
)