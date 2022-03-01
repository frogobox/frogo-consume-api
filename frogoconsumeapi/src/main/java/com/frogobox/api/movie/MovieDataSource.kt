package com.frogobox.api.movie

import android.content.Context
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*

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
        callback: ConsumeApiResponse<Certifications<CertificationMovie>>
    )

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(
        apiKey: String,
        callback: ConsumeApiResponse<Certifications<CertificationTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    )

    // ---------------------------------------------------------------------------------------------

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    )

    // ---------------------------------------------------------------------------------------------

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesImage>
    )

    // ---------------------------------------------------------------------------------------------

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(apiKey: String, callback: ConsumeApiResponse<ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationCountry>>
    )

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(apiKey: String, callback: ConsumeApiResponse<List<ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationLanguage>>
    )

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(apiKey: String, callback: ConsumeApiResponse<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationTimezone>>
    )

    // ---------------------------------------------------------------------------------------------

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, apiKey: String, callback: ConsumeApiResponse<Credits>)

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
        callback: ConsumeApiResponse<Discover<DiscoverMovie>>

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
        callback: ConsumeApiResponse<Discover<DiscoverTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: ConsumeApiResponse<Find>
    )

    // ---------------------------------------------------------------------------------------------

    // GENRES
    // Get Movie List
    fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    )

    // GENRES
    // Get TV List
    fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    )

    // ---------------------------------------------------------------------------------------------

    // KEYWORDS
    // Get Details
    fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<KeywordsDetail>
    )

    // KEYWORDS
    // Get Movies
    fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: ConsumeApiResponse<KeywordsMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    )

    // MOVIES
    // Get Alternative Titles
    fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    )

    // MOVIES
    // Get Changes
    fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    )

    // MOVIES
    // Get Credits
    fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieCredit>
    )

    // MOVIES
    // Get External Ids
    fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieExternalId>
    )

    // MOVIES
    // Get Images
    fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    )

    // MOVIES
    // Get Keywords
    fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieKeywords>
    )

    // MOVIES
    // Get Release Dates
    fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieReleaseDates>
    )

    // MOVIES
    // Get Videos
    fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    )

    // MOVIES
    // Get Translations
    fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieTranslations>
    )

    // MOVIES
    // Get Recommendations
    fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    )

    // MOVIES
    // Get Similar Movies
    fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    )

    // MOVIES
    // Get Reviews
    fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    )

    // MOVIES
    // Get Lists
    fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    )

    // MOVIES
    // Get Latest
    fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieLatest>
    )

    // MOVIES
    // Get Now Playing
    fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieNowPlayings>
    )

    // MOVIES
    // Get Popular
    fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MoviePopulars>
    )

    // MOVIES
    // Get Top Rated
    fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieTopRated>
    )

    // MOVIES
    // Get Upcoming
    fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieUpcoming>
    )

    // ---------------------------------------------------------------------------------------------

    // TRENDING
    // Get Trending All
    fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending Movie
    fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Person
    fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending Movie
    fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // REVIEWS
    // Get Details
    fun getReviews(
        review_id: String,
        apiKey: String,
        callback: ConsumeApiResponse<Reviews>
    )

    // ---------------------------------------------------------------------------------------------

    // NETWORKS
    // Get Details
    fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkDetail>
    )

    // NETWORKS
    // Get Alternative Names
    fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkAlternativeName>
    )

    // NETWORKS
    // Get Images
    fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkImage>
    )

    // ---------------------------------------------------------------------------------------------

    // SEARCH
    // Search Companies
    fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    )

    // SEARCH
    // Search Collections
    fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    )

    // SEARCH
    // Search Keywords
    fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
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
        callback: ConsumeApiResponse<SearchMovies>
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
        callback: ConsumeApiResponse<SearchMulti>
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
        callback: ConsumeApiResponse<SearchPeople>
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
        callback: ConsumeApiResponse<SearchMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // TV
    // Get Details
    fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    )

    // TV
    // Get Account States
    fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    )

    // TV
    // Get Alternative Titles
    fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    )

    // TV
    // Get Changes
    fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvChanges>
    )

    // TV
    // Get Content Ratings
    fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    )

    // TV
    // Get Credits
    fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    )

    // TV
    // Get Episode Groups
    fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    )

    // TV
    // Get External IDs
    fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    )

    // TV
    // Get Images
    fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    )

    // TV
    // Get Keyword
    fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvKeywords>
    )

    // TV
    // Get Recommendations
    fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    )

    // TV
    // Get Reviews
    fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvReviews>
    )

    // TV
    // Get Screened Theatrically
    fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    )

    // TV
    // Get Similar TV Shows
    fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    )

    // TV
    // Get Translations
    fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvTranslations>
    )

    // TV
    // Get Videos
    fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    )

    // TV
    // Get Latest
    fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvLatest>
    )

    // TV
    // Get TV Airing Today
    fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    )

    // TV
    // Get TV On The Air
    fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    )

    // TV
    // Get Popular
    fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    )

    // TV
    // Get Top Rated
    fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
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
        callback: ConsumeApiResponse<TvSeasonsDetails>
    )

    // TV SEASONS
    // Get Changes
    fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSeasonsChanges>
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
        callback: ConsumeApiResponse<TvSeasonsAccountStates>
    )

    // TV SEASONS
    // Get Credits
    fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsCredits>
    )

    // TV SEASONS
    // Get External Ids
    fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsExternalIds>
    )

    // TV SEASONS
    // Get Images
    fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsImages>
    )

    // TV SEASONS
    // Get Videos
    fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsVideos>
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
        callback: ConsumeApiResponse<TvEpisodeDetails>
    )

    // TV EPISODE
    // Get Changes
    fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvEpisodeChanges>
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
        callback: ConsumeApiResponse<TvEpisodeAccountStates>
    )

    // TV EPISODE
    // Get Credits
    fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeCredits>
    )

    // TV EPISODE
    // Get External IDs
    fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeExternalIds>
    )

    // TV EPISODE
    // Get Images
    fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeImages>
    )

    // TV EPISODE
    // Get Translations
    fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeTranslation>
    )

    // TV EPISODE
    // Get Videos
    fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE GROUPS
    // Get Details
    fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroupsDetails>
    )

    // ---------------------------------------------------------------------------------------------

    // PEOPLE
    // Get Details
    fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    )

    // PEOPLE
    // Get Changes
    fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    )

    // PEOPLE
    // Get Movie Credits
    fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    )

    // PEOPLE
    // Get TV Credits
    fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    )

    // PEOPLE
    // Get Combined Credits
    fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    )

    // PEOPLE
    // Get External IDs
    fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    )

    // PEOPLE
    // Get Images
    fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<PeopleImages>
    )

    // PEOPLE
    // Get Tagged Images
    fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    )

    // PEOPLE
    // Get Translations
    fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    )

    // PEOPLE
    // Get Latest
    fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleLatest>
    )

    // PEOPLE
    // Get Popular
    fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
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

}