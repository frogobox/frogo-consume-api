package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleMovieCreditCast
import com.frogobox.frogoconsumeapi.movie.model.PeopleMovieCreditCrew

data class PeopleMovieCredits(
    val cast: List<com.frogobox.frogoconsumeapi.movie.model.PeopleMovieCreditCast>?,
    val crew: List<com.frogobox.frogoconsumeapi.movie.model.PeopleMovieCreditCrew>?,
    val id: Int?
)