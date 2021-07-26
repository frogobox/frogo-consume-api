package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.data.model.*
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-movie-tmdb-api
 * Copyright (C) 28/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.data.response
 *
 */
data class Find(

    @SerializedName("movie_results")
    var movie_results: List<com.frogobox.frogoconsumeapi.movie.model.FindMovie>? = null,

    @SerializedName("person_results")
    var person_results: List<com.frogobox.frogoconsumeapi.movie.model.FindPerson>? = null,

    @SerializedName("tv_results")
    var tv_results: List<com.frogobox.frogoconsumeapi.movie.model.FindTv>? = null,

    @SerializedName("tv_episode_results")
    var tv_episode_results: List<com.frogobox.frogoconsumeapi.movie.model.FindTvEpisode>? = null,

    @SerializedName("tv_season_results")
    var tv_season_results: List<com.frogobox.frogoconsumeapi.movie.model.FindTvSeason>? = null

)