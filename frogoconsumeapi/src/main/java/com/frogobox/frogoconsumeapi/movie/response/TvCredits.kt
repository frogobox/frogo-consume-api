package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvCreditsCast
import com.frogobox.frogoconsumeapi.movie.model.TvCreditsCrew

data class TvCredits(
    val cast: List<TvCreditsCast>?,
    val crew: List<TvCreditsCrew>?,
    val id: Int?
)