package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvVideosResult

data class TvVideos(
    val id: Int?,
    val results: List<TvVideosResult>?
)