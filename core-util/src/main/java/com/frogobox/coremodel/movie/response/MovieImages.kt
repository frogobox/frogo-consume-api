package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieBackdrop
import com.frogobox.coremodel.movie.model.MoviePoster

data class MovieImages(
    val backdrops: List<com.frogobox.coremodel.movie.model.MovieBackdrop>? = null,
    val id: Int? = null,
    val posters: List<com.frogobox.coremodel.movie.model.MoviePoster>? = null
)