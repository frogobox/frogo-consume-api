package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvContentRatingsResult

data class TvContentRatings(
    val id: Int?,
    val results: List<com.frogobox.coremodel.movie.model.TvContentRatingsResult>?
)