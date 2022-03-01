package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.MovieUpcomingDates
import com.frogobox.coreapi.movie.model.MovieUpcomingResult

data class MovieUpcoming(
    val dates: MovieUpcomingDates?,
    val page: Int?,
    val results: List<MovieUpcomingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)