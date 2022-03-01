package com.frogobox.coreapi.movie.response

import com.frogobox.coreapi.movie.model.PeopleChange

data class PeopleChanges(
    val changes: List<PeopleChange>?
)