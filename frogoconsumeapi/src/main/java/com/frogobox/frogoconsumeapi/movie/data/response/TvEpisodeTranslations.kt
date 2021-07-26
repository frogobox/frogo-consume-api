package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeTranslation

data class TvEpisodeTranslations(
    val id: Int?,
    val translations: List<TvEpisodeTranslation>?
)