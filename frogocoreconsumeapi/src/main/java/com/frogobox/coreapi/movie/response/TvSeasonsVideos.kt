package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvSeasonsVideosResult

data class TvSeasonsVideos(
    val id: Int?,
    val results: List<TvSeasonsVideosResult>?
)