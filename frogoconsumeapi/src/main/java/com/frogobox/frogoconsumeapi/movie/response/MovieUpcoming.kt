package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.MovieUpcomingDates
import com.frogobox.frogoconsumeapi.movie.model.MovieUpcomingResult

data class MovieUpcoming(
    val dates: MovieUpcomingDates?,
    val page: Int?,
    val results: List<MovieUpcomingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)