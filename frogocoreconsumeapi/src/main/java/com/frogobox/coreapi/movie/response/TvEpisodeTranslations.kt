package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeTranslation

data class TvEpisodeTranslations(
    val id: Int?,
    val translations: List<TvEpisodeTranslation>?
)