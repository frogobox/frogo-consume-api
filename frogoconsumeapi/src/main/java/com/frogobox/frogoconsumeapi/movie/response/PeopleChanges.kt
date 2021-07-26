package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.PeopleChange

data class PeopleChanges(
    val changes: List<PeopleChange>?
)