package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvTranslation

data class TvTranslations(
    val id: Int?,
    val translations: List<TvTranslation>?
)