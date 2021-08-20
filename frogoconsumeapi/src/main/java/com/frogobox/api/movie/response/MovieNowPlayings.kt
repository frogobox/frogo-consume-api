package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieNowPlayingDates
import com.frogobox.api.movie.model.MovieNowPlayingResult

data class MovieNowPlayings(
    val dates: MovieNowPlayingDates? = null,
    val page: Int? = null,
    val results: List<MovieNowPlayingResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)