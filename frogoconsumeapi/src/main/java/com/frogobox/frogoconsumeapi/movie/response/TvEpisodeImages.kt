package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvEpisodeImageStill

data class TvEpisodeImages(
    val id: Int?,
    val stills: List<TvEpisodeImageStill>?
)