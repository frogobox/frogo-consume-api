package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleTvCreditCast
import com.frogobox.frogoconsumeapi.movie.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<com.frogobox.frogoconsumeapi.movie.model.PeopleTvCreditCast>?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.PeopleTvCreditCrew>?,
    val id: Int?
)