package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvSeasonsVideosResult

data class TvSeasonsVideos(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvSeasonsVideosResult>?
)