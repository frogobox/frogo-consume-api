package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieUpcomingDates
import com.frogobox.coremodel.movie.model.MovieUpcomingResult

data class MovieUpcoming(
    val dates: com.frogobox.coremodel.movie.model.MovieUpcomingDates?,
    val page: Int?,
    val results: List<com.frogobox.coremodel.movie.model.MovieUpcomingResult>?,
    val total_pages: Int?,
    val total_results: Int?
)