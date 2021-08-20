package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.PeopleCombinedCreditCast
import com.frogobox.api.movie.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<PeopleCombinedCreditCast>?,
    val crew: List<PeopleCombinedCreditCrew>?,
    val id: Int?
)