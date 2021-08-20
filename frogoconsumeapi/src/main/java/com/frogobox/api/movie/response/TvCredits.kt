package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvCreditsCast
import com.frogobox.api.movie.model.TvCreditsCrew

data class TvCredits(
    val cast: List<TvCreditsCast>?,
    val crew: List<TvCreditsCrew>?,
    val id: Int?
)