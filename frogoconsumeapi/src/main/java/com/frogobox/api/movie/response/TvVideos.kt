package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvVideosResult

data class TvVideos(
    val id: Int?,
    val results: List<TvVideosResult>?
)