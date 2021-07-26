package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvCreditsCast
import com.frogobox.frogoconsumeapi.movie.data.model.TvCreditsCrew

data class TvCredits(
    val cast: List<TvCreditsCast>?,
    val crew: List<TvCreditsCrew>?,
    val id: Int?
)