package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieNowPlayingDates
import com.frogobox.frogoconsumeapi.movie.model.MovieNowPlayingResult

data class MovieNowPlayings(
    val dates: MovieNowPlayingDates? = null,
    val page: Int? = null,
    val results: List<MovieNowPlayingResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)