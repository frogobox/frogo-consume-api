package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.TvSeasonsCreditsCast
import com.frogobox.coreapi.movie.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<TvSeasonsCreditsCast>?,
    val crew: List<TvSeasonsCreditsCrew>?,
    val id: Int?
)