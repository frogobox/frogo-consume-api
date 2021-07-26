package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvImagesBackdrop
import com.frogobox.frogoconsumeapi.movie.data.model.TvImagesPoster

data class TvImages(
    val backdrops: List<TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<TvImagesPoster>?
)