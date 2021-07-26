package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsCreditsCast
import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<TvSeasonsCreditsCast>?,
    val crew: List<TvSeasonsCreditsCrew>?,
    val id: Int?
)