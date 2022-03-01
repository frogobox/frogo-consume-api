package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieVideo

data class MovieVideos(
    val id: Int? = null,
    val results: List<MovieVideo>? = null
)