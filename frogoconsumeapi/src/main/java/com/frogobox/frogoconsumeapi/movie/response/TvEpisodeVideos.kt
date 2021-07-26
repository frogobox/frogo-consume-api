package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeVideoResult

data class TvEpisodeVideos(
    val id: Int?,
    val results: List<TvEpisodeVideoResult>?
)