package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.MovieUpcomingDates
import com.frogobox.frogoconsumeapi.movie.data.model.MovieUpcomingResult

data class MovieUpcoming(
    val dates: MovieUpcomingDates?,
    val page: Int?,
    val results: List<MovieUpcomingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)