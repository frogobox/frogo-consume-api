package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvTranslation

data class TvTranslations(
    val id: Int?,
    val translations: List<com.frogobox.coremodel.movie.model.TvTranslation>?
)