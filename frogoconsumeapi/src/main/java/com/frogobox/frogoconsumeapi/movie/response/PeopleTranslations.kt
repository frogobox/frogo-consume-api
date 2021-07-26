package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleTranslation

data class PeopleTranslations(
    val id: Int?,
    val translations: List<com.frogobox.frogoconsumeapi.movie.model.PeopleTranslation>?
)