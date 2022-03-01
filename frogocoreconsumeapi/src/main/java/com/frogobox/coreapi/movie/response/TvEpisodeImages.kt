package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvEpisodeImageStill

data class TvEpisodeImages(
    val id: Int?,
    val stills: List<TvEpisodeImageStill>?
)