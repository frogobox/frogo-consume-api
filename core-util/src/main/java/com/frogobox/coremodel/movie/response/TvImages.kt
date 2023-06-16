package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvImagesBackdrop
import com.frogobox.coremodel.movie.model.TvImagesPoster

data class TvImages(
    val backdrops: List<com.frogobox.coremodel.movie.model.TvImagesBackdrop>?,
    val id: Int?,
    val posters: List<com.frogobox.coremodel.movie.model.TvImagesPoster>?
)