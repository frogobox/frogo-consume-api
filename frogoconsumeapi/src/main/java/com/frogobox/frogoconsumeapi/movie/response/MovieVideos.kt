package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieVideo

data class MovieVideos(
    val id: Int? = null,
    val results: List<MovieVideo>? = null
)