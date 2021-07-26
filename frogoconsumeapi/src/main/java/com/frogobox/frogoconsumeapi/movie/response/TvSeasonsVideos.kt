package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsVideosResult

data class TvSeasonsVideos(
    val id: Int?,
    val results: List<TvSeasonsVideosResult>?
)