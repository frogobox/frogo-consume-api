package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvCreditsCast
import com.frogobox.frogoconsumeapi.movie.model.TvCreditsCrew

data class TvCredits(
    val cast: List<com.frogobox.frogoconsumeapi.movie.model.TvCreditsCast>?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.TvCreditsCrew>?,
    val id: Int?
)