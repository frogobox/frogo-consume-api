package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsCreditsCast
import com.frogobox.frogoconsumeapi.movie.model.TvSeasonsCreditsCrew

data class TvSeasonsCredits(
    val cast: List<com.frogobox.frogoconsumeapi.movie.model.TvSeasonsCreditsCast>?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.TvSeasonsCreditsCrew>?,
    val id: Int?
)