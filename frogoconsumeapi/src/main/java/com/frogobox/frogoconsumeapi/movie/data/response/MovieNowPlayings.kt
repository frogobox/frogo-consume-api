package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieNowPlayingDates
import com.frogobox.frogoconsumeapi.movie.data.model.MovieNowPlayingResult

data class MovieNowPlayings(
    val dates: MovieNowPlayingDates? = null,
    val page: Int? = null,
    val results: List<MovieNowPlayingResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)