package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.TvSeasonsCreditsCast
import com.frogobox.api.movie.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<TvSeasonsCreditsCast>?,
    val crew: List<TvSeasonsCreditsCrew>?,
    val id: Int?
)