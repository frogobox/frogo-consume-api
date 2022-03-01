package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvContentRatingsResult

data class TvContentRatings(
    val id: Int?,
    val results: List<TvContentRatingsResult>?
)