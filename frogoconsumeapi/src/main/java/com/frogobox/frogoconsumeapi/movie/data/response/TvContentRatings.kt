package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvContentRatingsResult

data class TvContentRatings(
    val id: Int?,
    val results: List<TvContentRatingsResult>?
)