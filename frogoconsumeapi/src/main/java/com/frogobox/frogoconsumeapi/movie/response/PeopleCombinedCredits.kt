package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleCombinedCreditCast
import com.frogobox.frogoconsumeapi.movie.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<com.frogobox.frogoconsumeapi.movie.model.PeopleCombinedCreditCast>?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.PeopleCombinedCreditCrew>?,
    val id: Int?
)