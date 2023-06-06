package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.TvSeasonsCreditsCast
import com.frogobox.coremodel.movie.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<com.frogobox.coremodel.movie.model.TvSeasonsCreditsCast>?,
    val crew: List<com.frogobox.coremodel.movie.model.TvSeasonsCreditsCrew>?,
    val id: Int?
)