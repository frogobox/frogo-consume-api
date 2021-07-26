package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.PeopleCombinedCreditCast
import com.frogobox.frogoconsumeapi.movie.data.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<PeopleCombinedCreditCast>?,
    val crew: List<PeopleCombinedCreditCrew>?,
    val id: Int?
)