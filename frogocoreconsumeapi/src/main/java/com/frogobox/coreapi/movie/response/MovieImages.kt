package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieBackdrop
import com.frogobox.coreapi.movie.model.MoviePoster

data class MovieImages(
    val backdrops: List<MovieBackdrop>? = null,
    val id: Int? = null,
    val posters: List<MoviePoster>? = null
)