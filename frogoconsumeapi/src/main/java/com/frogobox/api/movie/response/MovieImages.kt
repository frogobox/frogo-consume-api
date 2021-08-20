package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieBackdrop
import com.frogobox.api.movie.model.MoviePoster

data class MovieImages(
    val backdrops: List<MovieBackdrop>? = null,
    val id: Int? = null,
    val posters: List<MoviePoster>? = null
)