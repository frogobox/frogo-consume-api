package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvTranslation

data class TvTranslations(
    val id: Int?,
    val translations: List<TvTranslation>?
)