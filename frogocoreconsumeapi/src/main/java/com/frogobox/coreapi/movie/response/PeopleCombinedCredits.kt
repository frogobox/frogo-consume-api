package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleCombinedCreditCast
import com.frogobox.coreapi.movie.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<PeopleCombinedCreditCast>?,
    val crew: List<PeopleCombinedCreditCrew>?,
    val id: Int?
)