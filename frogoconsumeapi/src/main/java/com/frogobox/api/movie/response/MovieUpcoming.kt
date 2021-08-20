package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.MovieUpcomingDates
import com.frogobox.api.movie.model.MovieUpcomingResult

data class MovieUpcoming(
    val dates: MovieUpcomingDates?,
    val page: Int?,
    val results: List<MovieUpcomingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)