package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvContentRatingsResult

data class TvContentRatings(
    val id: Int?,
    val results: List<com.frogobox.frogoconsumeapi.movie.model.TvContentRatingsResult>?
)