package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvEpisodeImageStill

data class TvEpisodeImages(
    val id: Int?,
    val stills: List<TvEpisodeImageStill>?
)