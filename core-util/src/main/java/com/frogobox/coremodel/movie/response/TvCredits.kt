package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvCreditsCast
import com.frogobox.coremodel.movie.model.TvCreditsCrew

data class TvCredits(
    val cast: List<com.frogobox.coremodel.movie.model.TvCreditsCast>?,
    val crew: List<com.frogobox.coremodel.movie.model.TvCreditsCrew>?,
    val id: Int?
)