package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvTranslation

data class TvTranslations(
    val id: Int?,
    val translations: List<TvTranslation>?
)