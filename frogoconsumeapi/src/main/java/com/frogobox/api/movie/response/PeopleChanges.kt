package com.frogobox.api.movie.response

import com.frogobox.api.movie.model.PeopleChange

data class PeopleChanges(
    val changes: List<PeopleChange>?
)