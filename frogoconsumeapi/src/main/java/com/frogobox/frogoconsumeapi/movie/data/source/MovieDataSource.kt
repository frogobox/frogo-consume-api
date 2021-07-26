package com.frogobox.frogoconsumeapi.movie.data.source

import android.content.Context
import com.frogobox.frogoconsumeapi.movie.base.BaseMovieDataSource
import com.frogobox.frogoconsumeapi.movie.data.model.*
import com.frogobox.frogoconsumeapi.movie.data.response.*

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
 * com.frogobox.frogoconsumeapi.movie.data.source
 *
 */
interface MovieDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // ---------------------------------------------------------------------------------------------

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(
        apiKey: String,
        callback: GetRemoteCallback<Certifications<CertificationMovie>>
    )

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(
        apiKey: String,
        callback: GetRemoteCallback<Certifications<CertificationTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: GetRemoteCallback<Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: GetRemoteCallback<Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: GetRemoteCallback<Changes>
    )

    // ---------------------------------------------------------------------------------------------

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<CollectionsTranslation>
    )

    // ---------------------------------------------------------------------------------------------

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<CompaniesImage>
    )

    // ---------------------------------------------------------------------------------------------

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(apiKey: String, callback: GetRemoteCallback<ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(
        apiKey: String,
        callback: GetRemoteCallback<List<ConfigurationCountry>>
    )

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(apiKey: String, callback: GetRemoteCallback<List<ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(
        apiKey: String,
        callback: GetRemoteCallback<List<ConfigurationLanguage>>
    )

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(apiKey: String, callback: GetRemoteCallback<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(
        apiKey: String,
        callback: GetRemoteCallback<List<ConfigurationTimezone>>
    )

    // ---------------------------------------------------------------------------------------------

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, apiKey: String, callback: GetRemoteCallback<Credits>)

    // DISCOVER
    // Movie Discover
    fun getDiscoverMovie(
        apiKey: String,
        language: String?,
        region: String?,
        sort_by: String?,
        certification_country: String?,
        certification: String?,
        certification_lte: String?,
        certification_gte: String?,
        include_adult: Boolean?,
        include_video: Boolean?,
        page: Int?,
        primary_release_year: Int?,
        primary_release_date_gte: String?,
        primary_release_date_lte: String?,
        release_date_gte: String?,
        release_date_lte: String?,
        with_release_type: Int?,
        year: Int?,
        vote_count_gte: Int?,
        vote_count_lte: Int?,
        vote_average_gte: Double?,
        vote_average_lte: Double?,
        with_cast: String?,
        with_crew: String?,
        with_people: String?,
        with_companies: String?,
        with_genres: String?,
        without_genres: String?,
        with_keywords: String?,
        without_keywords: String?,
        with_runtime_gte: Double?,
        with_runtime_lte: Double?,
        with_original_language: String?,
        callback: GetRemoteCallback<Discover<DiscoverMovie>>

    )

    // ---------------------------------------------------------------------------------------------

    // DISCOVER
    // TV Discover
    fun getDiscoverTv(
        apiKey: String,
        language: String?,
        sort_by: String?,
        air_date_gte: String?,
        air_date_lte: String?,
        first_air_date_gte: String?,
        first_air_date_lte: String?,
        first_air_date_year: Int?,
        page: Int?,
        timezone: String?,
        vote_average_gte: Double?,
        vote_count_gte: Int?,
        with_genres: String?,
        with_networks: String?,
        without_genres: String?,
        with_runtime_gte: Double?,
        with_runtime_lte: Double?,
        include_null_first_air_dates: String?,
        with_original_language: String?,
        without_keywords: String?,
        screened_theatrically: String?,
        with_companies: String?,
        with_keywords: String?,
        callback: GetRemoteCallback<Discover<DiscoverTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: GetRemoteCallback<Find>
    )

    // ---------------------------------------------------------------------------------------------

    // GENRES
    // Get Movie List
    fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<Genres>
    )

    // GENRES
    // Get TV List
    fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<Genres>
    )

    // ---------------------------------------------------------------------------------------------

    // KEYWORDS
    // Get Details
    fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<KeywordsDetail>
    )

    // KEYWORDS
    // Get Movies
    fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: GetRemoteCallback<KeywordsMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: GetRemoteCallback<MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: GetRemoteCallback<MovieAccountState>
    )

    // MOVIES
    // Get Alternative Titles
    fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: GetRemoteCallback<MovieAlternativeTitle>
    )

    // MOVIES
    // Get Changes
    fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: GetRemoteCallback<MovieChanges>
    )

    // MOVIES
    // Get Credits
    fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<MovieCredit>
    )

    // MOVIES
    // Get External Ids
    fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<MovieExternalId>
    )

    // MOVIES
    // Get Images
    fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: GetRemoteCallback<MovieImages>
    )

    // MOVIES
    // Get Keywords
    fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<MovieKeywords>
    )

    // MOVIES
    // Get Release Dates
    fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<MovieReleaseDates>
    )

    // MOVIES
    // Get Videos
    fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<MovieVideos>
    )

    // MOVIES
    // Get Translations
    fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<MovieTranslations>
    )

    // MOVIES
    // Get Recommendations
    fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<MovieRecommendations>
    )

    // MOVIES
    // Get Similar Movies
    fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<MovieSimilarMovies>
    )

    // MOVIES
    // Get Reviews
    fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<MovieReviews>
    )

    // MOVIES
    // Get Lists
    fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<MovieLists>
    )

    // MOVIES
    // Get Latest
    fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<MovieLatest>
    )

    // MOVIES
    // Get Now Playing
    fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: GetRemoteCallback<MovieNowPlayings>
    )

    // MOVIES
    // Get Popular
    fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: GetRemoteCallback<MoviePopulars>
    )

    // MOVIES
    // Get Top Rated
    fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: GetRemoteCallback<MovieTopRated>
    )

    // MOVIES
    // Get Upcoming
    fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: GetRemoteCallback<MovieUpcoming>
    )

    // ---------------------------------------------------------------------------------------------

    // TRENDING
    // Get Trending All
    fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending Movie
    fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Person
    fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending Movie
    fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: GetRemoteCallback<Trending<TrendingTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // REVIEWS
    // Get Details
    fun getReviews(
        review_id: String,
        apiKey: String,
        callback: GetRemoteCallback<Reviews>
    )

    // ---------------------------------------------------------------------------------------------

    // NETWORKS
    // Get Details
    fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<NetworkDetail>
    )

    // NETWORKS
    // Get Alternative Names
    fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<NetworkAlternativeName>
    )

    // NETWORKS
    // Get Images
    fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<NetworkImage>
    )

    // ---------------------------------------------------------------------------------------------

    // SEARCH
    // Search Companies
    fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: GetRemoteCallback<SearchCompanies>
    )

    // SEARCH
    // Search Collections
    fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<SearchCollections>
    )

    // SEARCH
    // Search Keywords
    fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: GetRemoteCallback<SearchKeywords>
    )

    // SEARCH
    // Search Movies
    fun searchMovies(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: GetRemoteCallback<SearchMovies>
    )

    // SEARCH
    // Multi Search
    fun searchMultiSearch(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: GetRemoteCallback<SearchMulti>
    )

    // SEARCH
    // Search People
    fun searchPeople(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: GetRemoteCallback<SearchPeople>
    )

    // SEARCH
    // Search Tv Shows
    fun searchTvShows(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: GetRemoteCallback<SearchMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // TV
    // Get Details
    fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: GetRemoteCallback<TvDetails>
    )

    // TV
    // Get Account States
    fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: GetRemoteCallback<TvAccountStates>
    )

    // TV
    // Get Alternative Titles
    fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvAlternativeTitles>
    )

    // TV
    // Get Changes
    fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: GetRemoteCallback<TvChanges>
    )

    // TV
    // Get Content Ratings
    fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvContentRatings>
    )

    // TV
    // Get Credits
    fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvCredits>
    )

    // TV
    // Get Episode Groups
    fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvEpisodeGroups>
    )

    // TV
    // Get External IDs
    fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvExternalIds>
    )

    // TV
    // Get Images
    fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvImages>
    )

    // TV
    // Get Keyword
    fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvKeywords>
    )

    // TV
    // Get Recommendations
    fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<TvRecommendations>
    )

    // TV
    // Get Reviews
    fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvReviews>
    )

    // TV
    // Get Screened Theatrically
    fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvScreenedTheatrically>
    )

    // TV
    // Get Similar TV Shows
    fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<TvSimilarTVShows>
    )

    // TV
    // Get Translations
    fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvTranslations>
    )

    // TV
    // Get Videos
    fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvVideos>
    )

    // TV
    // Get Latest
    fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvLatest>
    )

    // TV
    // Get TV Airing Today
    fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<TvAiringToday>
    )

    // TV
    // Get TV On The Air
    fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<TvOnTheAir>
    )

    // TV
    // Get Popular
    fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<TvPopular>
    )

    // TV
    // Get Top Rated
    fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<TvTopRated>
    )

    // ---------------------------------------------------------------------------------------------

    // TV SEASONS
    // Get Details
    fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: GetRemoteCallback<TvSeasonsDetails>
    )

    // TV SEASONS
    // Get Changes
    fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: GetRemoteCallback<TvSeasonsChanges>
    )

    // TV SEASONS
    // Get Account States
    fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: GetRemoteCallback<TvSeasonsAccountStates>
    )

    // TV SEASONS
    // Get Credits
    fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvSeasonsCredits>
    )

    // TV SEASONS
    // Get External Ids
    fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvSeasonsExternalIds>
    )

    // TV SEASONS
    // Get Images
    fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvSeasonsImages>
    )

    // TV SEASONS
    // Get Videos
    fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvSeasonsVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE
    // Get Details
    fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: GetRemoteCallback<TvEpisodeDetails>
    )

    // TV EPISODE
    // Get Changes
    fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: GetRemoteCallback<TvEpisodeChanges>
    )

    // TV EPISODE
    // Get Account States
    fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: GetRemoteCallback<TvEpisodeAccountStates>
    )

    // TV EPISODE
    // Get Credits
    fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvEpisodeCredits>
    )

    // TV EPISODE
    // Get External IDs
    fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvEpisodeExternalIds>
    )

    // TV EPISODE
    // Get Images
    fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvEpisodeImages>
    )

    // TV EPISODE
    // Get Translations
    fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: GetRemoteCallback<TvEpisodeTranslation>
    )

    // TV EPISODE
    // Get Videos
    fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvEpisodeVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE GROUPS
    // Get Details
    fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<TvEpisodeGroupsDetails>
    )

    // ---------------------------------------------------------------------------------------------

    // PEOPLE
    // Get Details
    fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleDetails>
    )

    // PEOPLE
    // Get Changes
    fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: GetRemoteCallback<PeopleChanges>
    )

    // PEOPLE
    // Get Movie Credits
    fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleMovieCredits>
    )

    // PEOPLE
    // Get TV Credits
    fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleTvCredits>
    )

    // PEOPLE
    // Get Combined Credits
    fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleCombinedCredits>
    )

    // PEOPLE
    // Get External IDs
    fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleExternalIds>
    )

    // PEOPLE
    // Get Images
    fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: GetRemoteCallback<PeopleImages>
    )

    // PEOPLE
    // Get Tagged Images
    fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<PeopleTaggedImages>
    )

    // PEOPLE
    // Get Translations
    fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleTranslations>
    )

    // PEOPLE
    // Get Latest
    fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: GetRemoteCallback<PeopleLatest>
    )

    // PEOPLE
    // Get Popular
    fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: GetRemoteCallback<PeoplePopular>
    )

    // ---------------------------------------------------------------------------------------------

    // LIST
    // Get Details
    // fun getListDetails()

    // LIST
    // Check Item Status
    // fun getListCheckItemStatus()

    // METHOD POST AND DELETE ----------------------------------------------------------------------

    // MOVIES
    // POST Rate Movie
    // fun postMoviesRateMovies()

    // MOVIES
    // DELETE delete Rating
    // fun deleteMoviesDeleteRating()

    // TV
    // POST Rate TV Shows
    // fun postTvRateTvShows()

    // TV
    // DELETE Rating
    // fun deleteTvDeleteRating()

    // TV EPISODE
    // POST Rate TV Episode
    // fun postTvEpisodeRateTvEpisode()

    // TV EPISODE
    // DELETE Rating
    // fun deleteTvEpisodeDeleteRating()

    // LIST
    // POST Create List
    // fun postListCreateList()

    // LIST
    // POST Add Movie
    // fun postListAddMovie()

    // LIST
    // POST Remove Movie
    // fun postListRemoveMovie()

    // LIST
    // POST Clear List
    // fun postListClearList()

    // LIST
    // DELETE List
    // fun deleteList

    // ---------------------------------------------------------------------------------------------

    // Response Callback
    interface GetRemoteCallback<T> : BaseMovieDataSource.ResponseCallback<T>

}