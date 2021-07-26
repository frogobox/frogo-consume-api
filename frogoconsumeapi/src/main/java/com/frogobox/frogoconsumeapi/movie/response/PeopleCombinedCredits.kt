package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleCombinedCreditCast
import com.frogobox.frogoconsumeapi.movie.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<PeopleCombinedCreditCast>?,
    val crew: List<PeopleCombinedCreditCrew>?,
    val id: Int?
)