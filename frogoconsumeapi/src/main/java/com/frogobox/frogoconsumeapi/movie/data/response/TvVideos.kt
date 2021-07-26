package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvVideosResult

data class TvVideos(
    val id: Int?,
    val results: List<TvVideosResult>?
)