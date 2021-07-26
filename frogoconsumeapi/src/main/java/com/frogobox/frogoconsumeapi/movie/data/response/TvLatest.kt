package com.frogobox.frogoconsumeapi.movie.data.response

import com.frogobox.frogoconsumeapi.movie.data.model.*

data class TvLatest(
    val backdrop_path: String?,
    val created_by: List<Any>?,
    val episode_run_time: List<Int>?,
    val first_air_date: String?,
    val genres: List<TvLatestGenre>?,
    val homepage: String?,
    val id: Int?,
    val in_production: Boolean?,
    val languages: List<String>?,
    val last_air_date: String?,
    val last_episode_to_air: TvLatestLastEpisodeToAir?,
    val name: String?,
    val networks: List<TvLatestNetwork>?,
    val next_episode_to_air: TvLatestNextEpisodeToAir?,
    val number_of_episodes: Int?,
    val number_of_seasons: Int?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val production_companies: List<Any>?,
    val seasons: List<TvLatestSeason>?,
    val status: String?,
    val type: String?,
    val vote_average: Int?,
    val vote_count: Int?
)