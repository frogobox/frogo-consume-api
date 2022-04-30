package com.frogobox.coreapi.movie

import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*
import com.frogobox.coresdk.response.FrogoDataResponse
import okhttp3.Interceptor


/*
 * Created by faisalamir on 07/04/22
 * FrogoConsumeApi
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

interface IMovieApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(isDebug: Boolean, chuckerInterceptor: Interceptor): IMovieApi

    // ---------------------------------------------------------------------------------------------

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(callback: FrogoDataResponse<Certifications<CertificationMovie>>)

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(callback: FrogoDataResponse<Certifications<CertificationTv>>)

    // ---------------------------------------------------------------------------------------------

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    )

    // ---------------------------------------------------------------------------------------------

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsTranslation>
    )

    // ---------------------------------------------------------------------------------------------

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesImage>
    )

    // ---------------------------------------------------------------------------------------------

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(callback: FrogoDataResponse<ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(callback: FrogoDataResponse<List<ConfigurationCountry>>)

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(callback: FrogoDataResponse<List<ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(callback: FrogoDataResponse<List<ConfigurationLanguage>>)

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(callback: FrogoDataResponse<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(callback: FrogoDataResponse<List<ConfigurationTimezone>>)

    // ---------------------------------------------------------------------------------------------

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, callback: FrogoDataResponse<Credits>)

    // ---------------------------------------------------------------------------------------------

    // DISCOVER
    // Movie Discover
    fun getDiscoverMovie(
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
        callback: FrogoDataResponse<Discover<DiscoverMovie>>
    )

    // DISCOVER
    // TV Discover
    fun getDiscoverTv(
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
        callback: FrogoDataResponse<Discover<DiscoverTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        external_source: String,
        language: String?,
        callback: FrogoDataResponse<Find>
    )

    // ---------------------------------------------------------------------------------------------

    // GENRES
    // Get Movie List
    fun getGenresMovie(
        language: String?,
        callback: FrogoDataResponse<Genres>
    )

    // GENRES
    // Get TV List
    fun getGenresTv(
        language: String?,
        callback: FrogoDataResponse<Genres>
    )

    // ---------------------------------------------------------------------------------------------

    // KEYWORDS
    // Get Details
    fun getKeywordsDetail(
        keyword_id: Int,
        callback: FrogoDataResponse<KeywordsDetail>
    )

    // KEYWORDS
    // Get Movies
    fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: FrogoDataResponse<KeywordsMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: FrogoDataResponse<MovieAccountState>
    )

    // MOVIES
    // Get Alternative Titles
    fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: FrogoDataResponse<MovieAlternativeTitle>
    )

    // MOVIES
    // Get Changes
    fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieChanges>
    )

    // MOVIES
    // Get Credits
    fun getMoviesCredits(
        movie_id: Int,
        callback: FrogoDataResponse<MovieCredit>
    )

    // MOVIES
    // Get External Ids
    fun getMoviesExternalIds(
        movie_id: Int,
        callback: FrogoDataResponse<MovieExternalId>
    )

    // MOVIES
    // Get Images
    fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: FrogoDataResponse<MovieImages>
    )

    // MOVIES
    // Get Keywords
    fun getMoviesKeywords(
        movie_id: Int,
        callback: FrogoDataResponse<MovieKeywords>
    )

    // MOVIES
    // Get Release Dates
    fun getMoviesReleaseDates(
        movie_id: Int,
        callback: FrogoDataResponse<MovieReleaseDates>
    )

    // MOVIES
    // Get Videos
    fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: FrogoDataResponse<MovieVideos>
    )

    // MOVIES
    // Get Translations
    fun getMoviesTranslations(
        movie_id: Int,
        callback: FrogoDataResponse<MovieTranslations>
    )

    // MOVIES
    // Get Recommendations
    fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieRecommendations>
    )

    // MOVIES
    // Get Similar Movies
    fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieSimilarMovies>
    )

    // MOVIES
    // Get Reviews
    fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieReviews>
    )

    // MOVIES
    // Get Lists
    fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieLists>
    )

    // MOVIES
    // Get Latest
    fun getMoviesLatest(
        language: String?,
        callback: FrogoDataResponse<MovieLatest>
    )

    // MOVIES
    // Get Now Playing
    fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieNowPlayings>
    )

    // MOVIES
    // Get Popular
    fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MoviePopulars>
    )

    // MOVIES
    // Get Top Rated
    fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieTopRated>
    )

    // MOVIES
    // Get Upcoming
    fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieUpcoming>
    )

    // ---------------------------------------------------------------------------------------------

    // TRENDING
    // Get Trending All Day
    fun getTrendingAllDay(
        callback: FrogoDataResponse<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending All Week
    fun getTrendingAllWeek(
        callback: FrogoDataResponse<Trending<TrendingAll>>
    )

    // TRENDING
    // Get Trending Movie Day
    fun getTrendingMovieDay(
        callback: FrogoDataResponse<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Movie Week
    fun getTrendingMovieWeek(
        callback: FrogoDataResponse<Trending<TrendingMovie>>
    )

    // TRENDING
    // Get Trending Person Day
    fun getTrendingPersonDay(
        callback: FrogoDataResponse<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending Person Week
    fun getTrendingPersonWeek(
        callback: FrogoDataResponse<Trending<TrendingPerson>>
    )

    // TRENDING
    // Get Trending TV Day
    fun getTrendingTvDay(
        callback: FrogoDataResponse<Trending<TrendingTv>>
    )

    // TRENDING
    // Get Trending TV Week
    fun getTrendingTvWeek(
        callback: FrogoDataResponse<Trending<TrendingTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // REVIEWS
    // Get Details
    fun getReviews(
        review_id: String,
        callback: FrogoDataResponse<Reviews>
    )

    // ---------------------------------------------------------------------------------------------

    // NETWORKS
    // Get Details
    fun getNetworkDetail(
        network_id: Int,
        callback: FrogoDataResponse<NetworkDetail>
    )

    // NETWORKS
    // Get Alternative Names
    fun getNetworkAlternativeName(
        network_id: Int,
        callback: FrogoDataResponse<NetworkAlternativeName>
    )

    // NETWORKS
    // Get Images
    fun getNetworkImage(
        network_id: Int,
        callback: FrogoDataResponse<NetworkImage>
    )

    // ---------------------------------------------------------------------------------------------

    // SEARCH
    // Search Companies
    fun searchCompanies(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchCompanies>
    )

    // SEARCH
    // Search Collections
    fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<SearchCollections>
    )

    // SEARCH
    // Search Keywords
    fun searchKeywords(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchKeywords>
    )

    // SEARCH
    // Search Movies
    fun searchMovies(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: FrogoDataResponse<SearchMovies>
    )

    // SEARCH
    // Multi Search
    fun searchMultiSearch(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<SearchMulti>
    )

    // SEARCH
    // Search People
    fun searchPeople(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<SearchPeople>
    )

    // SEARCH
    // Search Tv Shows
    fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: FrogoDataResponse<SearchMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // TV
    // Get Details
    fun getTvDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvDetails>
    )

    // TV
    // Get Account States
    fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvAccountStates>
    )

    // TV
    // Get Alternative Titles
    fun getTvAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvAlternativeTitles>
    )

    // TV
    // Get Changes
    fun getTvChanges(
        tv_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvChanges>
    )

    // TV
    // Get Content Ratings
    fun getTvContentRatings(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvContentRatings>
    )

    // TV
    // Get Credits
    fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvCredits>
    )

    // TV
    // Get Episode Groups
    fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroups>
    )

    // TV
    // Get External IDs
    fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvExternalIds>
    )

    // TV
    // Get Images
    fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvImages>
    )

    // TV
    // Get Keyword
    fun getTvKeyword(
        tv_id: Int,
        callback: FrogoDataResponse<TvKeywords>
    )

    // TV
    // Get Recommendations
    fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvRecommendations>
    )

    // TV
    // Get Reviews
    fun getTvReviews(
        tv_id: Int,
        callback: FrogoDataResponse<TvReviews>
    )

    // TV
    // Get Screened Theatrically
    fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: FrogoDataResponse<TvScreenedTheatrically>
    )

    // TV
    // Get Similar TV Shows
    fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSimilarTVShows>
    )

    // TV
    // Get Translations
    fun getTvTranslations(
        tv_id: Int,
        callback: FrogoDataResponse<TvTranslations>
    )

    // TV
    // Get Videos
    fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvVideos>
    )

    // TV
    // Get Latest
    fun getTvLatest(
        language: String?,
        callback: FrogoDataResponse<TvLatest>
    )

    // TV
    // Get TV Airing Today
    fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvAiringToday>
    )

    // TV
    // Get TV On The Air
    fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvOnTheAir>
    )

    // TV
    // Get Popular
    fun getTvPopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvPopular>
    )

    // TV
    // Get Top Rated
    fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvTopRated>
    )

    // ---------------------------------------------------------------------------------------------

    // TV SEASONS
    // Get Details
    fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvSeasonsDetails>
    )

    // TV SEASONS
    // Get Changes
    fun getTvSeasonsChanges(
        season_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSeasonsChanges>
    )

    // TV SEASONS
    // Get Account States
    fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvSeasonsAccountStates>
    )

    // TV SEASONS
    // Get Credits
    fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsCredits>
    )

    // TV SEASONS
    // Get External Ids
    fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsExternalIds>
    )

    // TV SEASONS
    // Get Images
    fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsImages>
    )

    // TV SEASONS
    // Get Videos
    fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE
    // Get Details
    fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvEpisodeDetails>
    )

    // TV EPISODE
    // Get Changes
    fun getTvEpisodeChanges(
        episode_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvEpisodeChanges>
    )

    // TV EPISODE
    // Get Account States
    fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvEpisodeAccountStates>
    )

    // TV EPISODE
    // Get Credits
    fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeCredits>
    )

    // TV EPISODE
    // Get External IDs
    fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeExternalIds>
    )

    // TV EPISODE
    // Get Images
    fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeImages>
    )

    // TV EPISODE
    // Get Translations
    fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeTranslation>
    )

    // TV EPISODE
    // Get Videos
    fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE GROUPS
    // Get Details
    fun getTvEpisodeGroupsDetails(
        id: String?,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroupsDetails>
    )

    // ---------------------------------------------------------------------------------------------

    // PEOPLE
    // Get Details
    fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleDetails>
    )

    // PEOPLE
    // Get Changes
    fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: FrogoDataResponse<PeopleChanges>
    )

    // PEOPLE
    // Get Movie Credits
    fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleMovieCredits>
    )

    // PEOPLE
    // Get TV Credits
    fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleTvCredits>
    )

    // PEOPLE
    // Get Combined Credits
    fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleCombinedCredits>
    )

    // PEOPLE
    // Get External IDs
    fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleExternalIds>
    )

    // PEOPLE
    // Get Images
    fun getPeopleImages(
        person_id: Int,
        callback: FrogoDataResponse<PeopleImages>
    )

    // PEOPLE
    // Get Tagged Images
    fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeopleTaggedImages>
    )

    // PEOPLE
    // Get Translations
    fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleTranslations>
    )

    // PEOPLE
    // Get Latest
    fun getPeopleLatest(
        language: String?,
        callback: FrogoDataResponse<PeopleLatest>
    )

    // PEOPLE
    // Get Popular
    fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeoplePopular>
    )


}