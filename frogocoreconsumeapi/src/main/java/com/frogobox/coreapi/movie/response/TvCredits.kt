package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvCreditsCast
import com.frogobox.coreapi.movie.model.TvCreditsCrew

data class TvCredits(
    val cast: List<TvCreditsCast>?,
    val crew: List<TvCreditsCrew>?,
    val id: Int?
)