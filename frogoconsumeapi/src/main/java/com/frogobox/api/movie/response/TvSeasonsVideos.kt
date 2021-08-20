package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvSeasonsVideosResult

data class TvSeasonsVideos(
    val id: Int?,
    val results: List<TvSeasonsVideosResult>?
)