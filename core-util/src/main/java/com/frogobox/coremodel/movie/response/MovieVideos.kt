package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieVideo

data class MovieVideos(
    val id: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieVideo>? = null
)