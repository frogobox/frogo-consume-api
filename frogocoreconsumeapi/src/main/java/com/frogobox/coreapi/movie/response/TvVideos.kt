package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvVideosResult

data class TvVideos(
    val id: Int?,
    val results: List<TvVideosResult>?
)