package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleMovieCreditCast
import com.frogobox.frogoconsumeapi.movie.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<PeopleMovieCreditCast>?,
    val crew: List<PeopleMovieCreditCrew>?,
    val id: Int?
)