package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.PeopleTvCreditCast
import com.frogobox.api.movie.model.PeopleTvCreditCrew

data class PeopleTvCredits(
    val cast: List<PeopleTvCreditCast>?,
    val crew: List<PeopleTvCreditCrew>?,
    val id: Int?
)