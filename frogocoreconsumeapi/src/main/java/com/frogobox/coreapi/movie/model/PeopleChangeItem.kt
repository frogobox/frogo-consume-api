package com.frogobox.coreapi.movie.model

data class PeopleChangeItem(
    val action: String?,
    val id: String?,
    val original_value: PeopleChangeOriginalValue?,
    val time: String?
)