package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeopleTvCreditCast
import com.frogobox.coremodel.movie.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<com.frogobox.coremodel.movie.model.PeopleTvCreditCast>?,
    val crew: List<com.frogobox.coremodel.movie.model.PeopleTvCreditCrew>?,
    val id: Int?
)