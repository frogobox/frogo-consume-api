package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.PeopleMovieCreditCast
import com.frogobox.api.movie.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<PeopleMovieCreditCast>?,
    val crew: List<PeopleMovieCreditCrew>?,
    val id: Int?
)