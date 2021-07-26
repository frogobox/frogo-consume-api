package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvSeasonsVideosResult

data class TvSeasonsVideos(
    val id: Int?,
    val results: List<TvSeasonsVideosResult>?
)