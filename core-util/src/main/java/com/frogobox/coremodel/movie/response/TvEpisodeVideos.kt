package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeVideoResult

data class TvEpisodeVideos(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvEpisodeVideoResult>?
)