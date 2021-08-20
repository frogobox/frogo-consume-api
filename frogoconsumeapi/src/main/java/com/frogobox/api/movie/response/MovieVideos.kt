package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieVideo

data class MovieVideos(
    val id: Int? = null,
    val results: List<MovieVideo>? = null
)