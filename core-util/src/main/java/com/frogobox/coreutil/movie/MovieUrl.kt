package com.frogobox.coreutil.movie

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.util
 *
 */
object MovieUrl {

    const val BASE_URL = "https://api.themoviedb.org/"

    const val API_KEY = "5e922c3d4b1b0e96fffcc6b0b395878f"
    const val VERSION_API_3 = "3"
    const val VERSION_API_4 = "4"

    const val BASE_URL_IMAGE_ORIGNAL = "https://image.tmdb.org/t/p/original"
    const val BASE_URL_IMAGE_W500 = "https://image.tmdb.org/t/p/w500"

    // CERTIFICATION
    const val CERTIFICATION_GET_MOVIE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/certification/movie/list"
    const val CERTIFICATION_GET_TV = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/certification/tv/list"

    // CHANGES
    const val CHANGES_GET_MOVIE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/changes"
    const val CHANGES_GET_TV = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/changes"
    const val CHANGES_GET_PERSON = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/changes"

    // COLLECTION
    const val COLLECTION_GET_DETAIL = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/collection/{collection_id}"
    const val COLLECTION_GET_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/collection/{collection_id}/images"
    const val COLLECTION_GET_TRANSLATTIONS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/collection/{collection_id}/translations"

    // COMPANIES
    const val COMPANY_GET_DETAIL = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/company/{company_id}"
    const val COMPANY_GET_ALTERNATIVE_NAME =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/company/{company_id}/alternative_names"
    const val COMPANY_GET_IMAGE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/company/{company_id}/images"

    // CONFIGURATION
    const val CONFIGURATION_GET_API_CONFIGURATION = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/configuration"
    const val CONFIGURATION_GET_COUNTRIES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/configuration/countries"
    const val CONFIGURATION_GET_JOBS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/configuration/jobs"
    const val CONFIGURATION_GET_LANGUAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/configuration/languages"
    const val CONFIGURATION_GET_PRIMARY_TRANSLATIONS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/configuration/primary_translations"
    const val CONFIGURATION_GET_TIMEZONES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/configuration/timezones"

    // CREDITS
    const val CREDITS_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/credit/{credit_id}"

    // DISCOVER
    const val DISCOVER_GET_MOVIE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/discover/movie"
    const val DISCOVER_GET_TV = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/discover/tv"

    // FIND
    const val FIND_GET_ID = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/find/{external_id}"

    // GENRES
    const val GENRES_GET_MOVIES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/genre/movie/list"
    const val GENRES_GET_TV = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/genre/tv/list"

    // GUEST SESSIONS
    const val GUEST_GET_SESSIONS_RATED_MOVIES =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/guest_session/{guest_session_id}/rated/movies"
    const val GUEST_GET_SESSIONS_RATED_TV_SHOWS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/guest_session/{guest_session_id}/rated/tv"
    const val GUEST_GET_SESSIONS_RATED_TV_EPISODE =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/guest_session/{guest_session_id}/rated/tv/episodes"

    // KEYWORDS
    const val KEYWORDS_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/keyword/{keyword_id}"
    const val KEYWORDS_GET_MOVIES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/keyword/{keyword_id}/movies"

    // LISTS
    const val LISTS_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/list/{list_id}"
    const val LISTS_GET_ITEM_STATUS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/list/{list_id}/item_status"

    // MOVIES
    const val MOVIES_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}"
    const val MOVIES_GET_ACCOUNT_STATES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/account_states"
    const val MOVIES_GET_ALTERNATIVE_TITLE =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/alternative_titles"
    const val MOVIES_GET_CHANGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/changes"
    const val MOVIES_GET_CREDITS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/credits"
    const val MOVIES_GET_EXTERNAL_IDS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/external_ids"
    const val MOVIES_GET_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/images"
    const val MOVIES_GET_KEYWORDS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/keywords"
    const val MOVIES_GET_RELEASE_DATE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/release_dates"
    const val MOVIES_GET_VIDEOS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/videos"
    const val MOVIES_GET_TRANSLATIONS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/translations"
    const val MOVIES_GET_RECOMENDATIONS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/recommendations"
    const val MOVIES_GET_SIMILAR_MOVIES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/similar"
    const val MOVIES_GET_REVIEWS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/reviews"
    const val MOVIES_GET_LIST = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/lists"
    const val MOVIES_POST_RATE_MOVIE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/rating"
    const val MOVIES_DELETE_RATING = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/{movie_id}/rating"
    const val MOVIES_GET_LATEST = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/latest"
    const val MOVIES_GET_NOW_PLAYING = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/now_playing"
    const val MOVIES_GET_POPULAR = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/popular"
    const val MOVIES_GET_TOP_RATED = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/top_rated"
    const val MOVIES_GET_UPCOMING = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/movie/upcoming"

    // NETWORKS
    const val NETWORKS_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/network/{network_id}"
    const val NETWORKS_GET_ALTERNATIVE_NAMES =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/network/{network_id}/alternative_names"
    const val NETWORKS_GET_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/network/{network_id}/images"

    // TRENDING
    const val TRENDING_GET_TREND = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/trending/{media_type}/{time_window}"

    // PEOPLE
    const val PEOPLE_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}"
    const val PEOPLE_GET_CHANGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/changes"
    const val PEOPLE_GET_MOVIE_CREDITS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/movie_credits"
    const val PEOPLE_GET_TV_CREDITS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/tv_credits"
    const val PEOPLE_GET_COMBINED_CREDITS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/combined_credits"
    const val PEOPLE_GET_EXTERNAL_IDS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/external_ids"
    const val PEOPLE_GET_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/images"
    const val PEOPLE_GET_TAGGED_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/tagged_images"
    const val PEOPLE_GET_TRANSLATIONS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/{person_id}/translations"
    const val PEOPLE_GET_LATEST = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/latest"
    const val PEOPLE_GET_POPULAR = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/person/popular"

    // REVIEWS
    const val REVIEWS_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/review/{review_id}"

    // SEARCH
    const val SEARCH_GET_COMPANIES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/company"
    const val SEARCH_GET_COLLECTIONS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/collection"
    const val SEARCH_GET_KEYWORDS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/keyword"
    const val SEARCH_GET_MOVIES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/movie"
    const val SEARCH_GET_MULTI_SEARCH = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/multi"
    const val SEARCH_GET_SEARCH_PEOPLE = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/person"
    const val SEARCH_GET_TV_SHOWS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/search/tv"

    // TV
    const val TV_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}"
    const val TV_GET_ACCOUNT_STATES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/account_states"
    const val TV_GET_ALTERNATIVE_TITLES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/alternative_titles"
    const val TV_GET_CHANGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/changes"
    const val TV_GET_CONTENT_RATINGS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/content_ratings"
    const val TV_GET_CREDITS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/credits"
    const val TV_GET_EPISODE_GROUPS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/episode_groups"
    const val TV_GET_EXTERNAL_IDS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/external_ids"
    const val TV_GET_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/images"
    const val TV_GET_KEYWORDS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/keywords"
    const val TV_GET_RECOMMENDATIONS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/recommendations"
    const val TV_GET_REVIEWS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/reviews"
    const val TV_GET_SCREENED_THEATRICALLY = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/screened_theatrically"
    const val TV_GET_SIMILIAR_TV_SHOWS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/similar"
    const val TV_GET_TRANSLATIONS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/translations"
    const val TV_GET_VIDEOS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/videos"
    const val TV_POST_RATE_TV_SHOW = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/rating"
    const val TV_DELETE_RATING = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/rating"
    const val TV_GET_LATEST = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/latest"
    const val TV_GET_TV_AIRING_TODAY = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/airing_today"
    const val TV_GET_TV_ON_THE_AIR = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/on_the_air"
    const val TV_GET_POPULAR = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/popular"
    const val TV_GET_TOP_RATED = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/top_rated"

    // TV SEASONS
    const val TV_SEASONS_GET_DETAILS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}"
    const val TV_SEASONS_GET_CHANGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/season/{season_id}/changes"
    const val TV_SEASONS_GET_ACCOUNT_STATES =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/account_states"
    const val TV_SEASONS_GET_CREDITS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/credits"
    const val TV_SEASONS_GET_EXTERNAL_IDS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/external_ids"
    const val TV_SEASONS_GET_IMAGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/images"
    const val TV_SEASONS_GET_VIDEOS = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/videos"

    // TV EPISODES
    const val TV_EPISODES_GET_DETAILS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}"
    const val TV_EPISODES_GET_CHANGES = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/episode/{episode_id}/changes"
    const val TV_EPISODES_GET_ACCOUNT_STATES =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states"
    const val TV_EPISODES_GET_CREDITS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits"
    const val TV_EPISODES_GET_EXTERNAL_IDS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids"
    const val TV_EPISODES_GET_IMAGES =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images"
    const val TV_EPISODES_GET_TRANSLATIONS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations"
    const val TV_EPISODES_POST_RATE_TV_EPISODE =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating"
    const val TV_EPISODES_DELETE_RATING =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating"
    const val TV_EPISODES_GET_VIDEOS =
        "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos"

    // TV EPISODES GROUPS
    const val TV_EPISODES_GET_GROUPS_DETAIL = "${com.frogobox.coreutil.movie.MovieUrl.VERSION_API_3}/tv/episode_group/{id}"

}