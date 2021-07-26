package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.PeopleTvCreditCast
import com.frogobox.frogoconsumeapi.movie.data.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<PeopleTvCreditCast>?,
    val crew: List<PeopleTvCreditCrew>?,
    val id: Int?
)