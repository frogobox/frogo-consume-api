package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleTvCreditCast
import com.frogobox.coreapi.movie.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<PeopleTvCreditCast>?,
    val crew: List<PeopleTvCreditCrew>?,
    val id: Int?
)