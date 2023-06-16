package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvVideosResult

data class TvVideos(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvVideosResult>?
)