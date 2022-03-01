package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvTranslation

data class TvTranslations(
    val id: Int?,
    val translations: List<TvTranslation>?
)