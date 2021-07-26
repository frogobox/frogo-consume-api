package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.PeopleTranslation

data class PeopleTranslations(
    val id: Int?,
    val translations: List<PeopleTranslation>?
)