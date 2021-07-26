package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.TvSeasonsCreditsCast
import com.frogobox.frogoconsumeapi.movie.data.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<TvSeasonsCreditsCast>?,
    val crew: List<TvSeasonsCreditsCrew>?,
    val id: Int?
)