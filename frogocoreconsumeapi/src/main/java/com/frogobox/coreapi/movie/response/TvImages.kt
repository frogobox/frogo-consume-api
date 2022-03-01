package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvImagesBackdrop
import com.frogobox.coreapi.movie.model.TvImagesPoster

data class TvImages(
    val backdrops: List<TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<TvImagesPoster>?
)