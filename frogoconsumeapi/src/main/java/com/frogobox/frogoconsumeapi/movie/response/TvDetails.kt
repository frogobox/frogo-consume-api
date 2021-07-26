package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvDetailsCreatedBy
import com.frogobox.frogoconsumeapi.movie.model.TvDetailsGenre
import com.frogobox.frogoconsumeapi.movie.model.TvDetailsLastEpisodeToAir
import com.frogobox.frogoconsumeapi.movie.model.TvDetailsNetwork
import com.frogobox.frogoconsumeapi.movie.model.TvDetailsProductionCompany
import com.frogobox.frogoconsumeapi.movie.model.TvDetailsSeason

data class TvDetails(
    val backdrop_path: String?,
    val created_by: List<com.frogobox.frogoconsumeapi.movie.model.TvDetailsCreatedBy>?,
    val episode_run_time: List<Int>?,
    val first_air_date: String?,
    val genres: List<com.frogobox.frogoconsumeapi.movie.model.TvDetailsGenre>?,
    val homepage: String?,
    val id: Int?,
    val in_production: Boolean?,
    val languages: List<String>?,
    val last_air_date: String?,
    val last_episode_to_air: com.frogobox.frogoconsumeapi.movie.model.TvDetailsLastEpisodeToAir?,
    val name: String?,
    val networks: List<com.frogobox.frogoconsumeapi.movie.model.TvDetailsNetwork>?,
    val next_episode_to_air: Any?,
    val number_of_episodes: Int?,
    val number_of_seasons: Int?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val production_companies: List<com.frogobox.frogoconsumeapi.movie.model.TvDetailsProductionCompany>?,
    val seasons: List<com.frogobox.frogoconsumeapi.movie.model.TvDetailsSeason>?,
    val status: String?,
    val type: String?,
    val vote_average: Double?,
    val vote_count: Int?
)