package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeVideoResult

data class TvEpisodeVideos(
    val id: Int?,
    val results: List<TvEpisodeVideoResult>?
)