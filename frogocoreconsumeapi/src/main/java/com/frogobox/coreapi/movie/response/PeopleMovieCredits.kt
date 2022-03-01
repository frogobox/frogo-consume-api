package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleMovieCreditCast
import com.frogobox.coreapi.movie.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<PeopleMovieCreditCast>?,
    val crew: List<PeopleMovieCreditCrew>?,
    val id: Int?
)