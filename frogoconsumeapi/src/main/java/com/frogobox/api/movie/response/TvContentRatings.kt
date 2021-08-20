package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvContentRatingsResult

data class TvContentRatings(
    val id: Int?,
    val results: List<TvContentRatingsResult>?
)