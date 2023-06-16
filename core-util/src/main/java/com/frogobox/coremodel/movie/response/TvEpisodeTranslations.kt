package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeTranslation

data class TvEpisodeTranslations(
    val id: Int?,
    val translations: List<com.frogobox.coremodel.movie.model.TvEpisodeTranslation>?
)