package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieNowPlayingDates
import com.frogobox.coreapi.movie.model.MovieNowPlayingResult

data class MovieNowPlayings(
    val dates: MovieNowPlayingDates? = null,
    val page: Int? = null,
    val results: List<MovieNowPlayingResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)