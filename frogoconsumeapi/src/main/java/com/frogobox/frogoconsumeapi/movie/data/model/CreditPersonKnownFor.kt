package com.frogobox.frogoconsumeapi.movie.data.model

import com.google.gson.annotations.SerializedName

data class CreditPersonKnownFor(

    @SerializedName("poster_path")
    var poster_path: String? = null,

    @SerializedName("popularity")
    var popularity: Double? = null,

    @SerializedName("vote_count")
    var vote_count: Int? = null,

    @SerializedName("video")
    var video: Boolean? = null,

    @SerializedName("media_type")
    var media_type: String? = null,

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("adult")
    var adult: Boolean? = null,

    @SerializedName("backdrop_path")
    var backdrop_path: String? = null,

    @SerializedName("original_language")
    var original_language: String? = null,

    @SerializedName("original_title")
    var original_title: String? = null,

    @SerializedName("genre_ids")
    var genre_ids: List<Int>? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("vote_average")
    var vote_average: String? = null,

    @SerializedName("overview")
    var overview: String? = null,

    @SerializedName("release_date")
    var release_date: String? = null

)
