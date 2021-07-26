package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieBackdrop
import com.frogobox.frogoconsumeapi.movie.model.MoviePoster

data class MovieImages(
    val backdrops: List<com.frogobox.frogoconsumeapi.movie.model.MovieBackdrop>? = null,
    val id: Int? = null,
    val posters: List<com.frogobox.frogoconsumeapi.movie.model.MoviePoster>? = null
)