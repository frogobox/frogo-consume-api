package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.MovieNowPlayingDates
import com.frogobox.coremodel.movie.model.MovieNowPlayingResult

data class MovieNowPlayings(
    val dates: com.frogobox.coremodel.movie.model.MovieNowPlayingDates? = null,
    val page: Int? = null,
    val results: List<com.frogobox.coremodel.movie.model.MovieNowPlayingResult>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)