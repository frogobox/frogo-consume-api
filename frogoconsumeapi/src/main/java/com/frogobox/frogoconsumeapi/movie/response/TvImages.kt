package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvImagesBackdrop
import com.frogobox.frogoconsumeapi.movie.model.TvImagesPoster

data class TvImages(
    val backdrops: List<TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<TvImagesPoster>?
)