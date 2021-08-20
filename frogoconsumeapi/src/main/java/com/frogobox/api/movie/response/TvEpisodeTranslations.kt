package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeTranslation

data class TvEpisodeTranslations(
    val id: Int?,
    val translations: List<TvEpisodeTranslation>?
)