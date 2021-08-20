package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvImagesBackdrop
import com.frogobox.api.movie.model.TvImagesPoster

data class TvImages(
    val backdrops: List<TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<TvImagesPoster>?
)