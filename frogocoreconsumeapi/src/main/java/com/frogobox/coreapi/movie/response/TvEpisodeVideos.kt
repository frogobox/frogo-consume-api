package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeVideoResult

data class TvEpisodeVideos(
    val id: Int?,
    val results: List<TvEpisodeVideoResult>?
)