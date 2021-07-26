package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieVideo

data class MovieVideos(
    val id: Int? = null,
    val results: List<MovieVideo>? = null
)