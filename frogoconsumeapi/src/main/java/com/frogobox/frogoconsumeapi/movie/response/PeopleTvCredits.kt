package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleTvCreditCast
import com.frogobox.frogoconsumeapi.movie.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<PeopleTvCreditCast>?,
    val crew: List<PeopleTvCreditCrew>?,
    val id: Int?
)