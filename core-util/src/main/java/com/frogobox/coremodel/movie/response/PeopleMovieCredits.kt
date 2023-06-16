package com.frogobox.coremodel.movie.response

import com.frogobox.coremodel.movie.model.PeopleMovieCreditCast
import com.frogobox.coremodel.movie.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<com.frogobox.coremodel.movie.model.PeopleMovieCreditCast>?,
    val crew: List<com.frogobox.coremodel.movie.model.PeopleMovieCreditCrew>?,
    val id: Int?
)