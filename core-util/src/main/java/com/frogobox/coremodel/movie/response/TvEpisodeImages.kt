package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvEpisodeImageStill

data class TvEpisodeImages(
    val id: Int?,
    val stills: List<com.frogobox.coremodel.movie.model.TvEpisodeImageStill>?
)