package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeopleCombinedCreditCast
import com.frogobox.coremodel.movie.model.PeopleCombinedCreditCrew

data class PeopleCombinedCredits(
    val cast: List<com.frogobox.coremodel.movie.model.PeopleCombinedCreditCast>?,
    val crew: List<com.frogobox.coremodel.movie.model.PeopleCombinedCreditCrew>?,
    val id: Int?
)