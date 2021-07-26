package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvEpisodeImageStill

data class TvEpisodeImages(
    val id: Int?,
    val stills: List<TvEpisodeImageStill>?
)