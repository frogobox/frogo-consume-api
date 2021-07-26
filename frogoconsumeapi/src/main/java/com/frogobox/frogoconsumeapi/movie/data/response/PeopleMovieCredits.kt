package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.PeopleMovieCreditCast
import com.frogobox.frogoconsumeapi.movie.data.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<PeopleMovieCreditCast>?,
    val crew: List<PeopleMovieCreditCrew>?,
    val id: Int?
)