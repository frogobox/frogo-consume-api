package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvImagesBackdrop
import com.frogobox.frogoconsumeapi.movie.model.TvImagesPoster

data class TvImages(
    val backdrops: List<com.frogobox.frogoconsumeapi.movie.model.TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<com.frogobox.frogoconsumeapi.movie.model.TvImagesPoster>?
)