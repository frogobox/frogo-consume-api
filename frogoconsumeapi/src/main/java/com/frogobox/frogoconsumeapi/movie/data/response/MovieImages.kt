package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieBackdrop
import com.frogobox.frogoconsumeapi.movie.data.model.MoviePoster

data class MovieImages(
    val backdrops: List<MovieBackdrop>? = null,
    val id: Int? = null,
    val posters: List<MoviePoster>? = null
)