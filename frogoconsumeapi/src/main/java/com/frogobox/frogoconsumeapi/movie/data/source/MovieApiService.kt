package com.frogobox.frogoconsumeapi.movie.data.source

import com.frogobox.frogoconsumeapi.movie.data.model.*
import com.frogobox.frogoconsumeapi.movie.data.response.*
import com.frogobox.frogoconsumeapi.movie.util.MovieConstant
import com.frogobox.frogoconsumeapi.movie.util.MovieUrl
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

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
interface MovieApiService {

    // CERTIFICATIONS
    // Get Movie Certifications
    @GET(MovieUrl.CERTIFICATION_GET_MOVIE)
    fun getMovieCertifications(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Certifications<CertificationMovie>>

    // CERTIFICATIONS
    // Get TV Certifications
    @GET(MovieUrl.CERTIFICATION_GET_TV)
    fun getTvCertifications(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Certifications<CertificationTv>>

    // ---------------------------------------------------------------------------------------------

    // CHANGES
    // Get Movie Change List
    @GET(MovieUrl.CHANGES_GET_MOVIE)
    fun getMovieChangeList(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<Changes>

    // CHANGES
    // Get TV Change List
    @GET(MovieUrl.CHANGES_GET_TV)
    fun getTvChangeList(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<Changes>

    // CHANGES
    // Get Person Change List
    @GET(MovieUrl.CHANGES_GET_PERSON)
    fun getPersonChangeList(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<Changes>

    // ---------------------------------------------------------------------------------------------

    // COLLECTION
    // Get Details
    @GET(MovieUrl.COLLECTION_GET_DETAIL)
    fun getCollectionDetails(
        @Path(MovieConstant.PATH_COLLECTION_ID) collection_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<CollectionsDetail>

    // COLLECTION
    // Get Images
    @GET(MovieUrl.COLLECTION_GET_IMAGES)
    fun getCollectionImages(
        @Path(MovieConstant.PATH_COLLECTION_ID) collection_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<CollectionsImage>

    // COLLECTION
    // Get Translations
    @GET(MovieUrl.COLLECTION_GET_TRANSLATTIONS)
    fun getCollectionTranslations(
        @Path(MovieConstant.PATH_COLLECTION_ID) collection_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<CollectionsTranslation>

    // ---------------------------------------------------------------------------------------------

    // COMPANIES
    // Get Details
    @GET(MovieUrl.COMPANY_GET_DETAIL)
    fun getCompaniesDetails(
        @Path(MovieConstant.PATH_COMPANY_ID) company_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<CompaniesDetail>

    // COMPANIES
    // Get Alternative Names
    @GET(MovieUrl.COMPANY_GET_ALTERNATIVE_NAME)
    fun getCompaniesAlternativeName(
        @Path(MovieConstant.PATH_COMPANY_ID) company_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<CompaniesAlternateName>

    // COMPANIES
    // Get Images
    @GET(MovieUrl.COMPANY_GET_IMAGE)
    fun getCompaniesImage(
        @Path(MovieConstant.PATH_COMPANY_ID) company_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<CompaniesImage>

    // ---------------------------------------------------------------------------------------------

    // CONFIGURATION
    // Get API Configuration
    @GET(MovieUrl.CONFIGURATION_GET_API_CONFIGURATION)
    fun getConfigurationApi(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<ConfigurationApi>

    // CONFIGURATION
    // Get Countries
    @GET(MovieUrl.CONFIGURATION_GET_COUNTRIES)
    fun getConfigurationCountries(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationCountry>>

    // CONFIGURATION
    // Get Jobs
    @GET(MovieUrl.CONFIGURATION_GET_JOBS)
    fun getConfigurationJobs(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationJob>>

    // CONFIGURATION
    // Get Languages
    @GET(MovieUrl.CONFIGURATION_GET_LANGUAGES)
    fun getConfigurationLanguages(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationLanguage>>

    // CONFIGURATION
    // Get Primary Translations
    @GET(MovieUrl.CONFIGURATION_GET_PRIMARY_TRANSLATIONS)
    fun getConfigurationTranslations(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<String>>

    // CONFIGURATION
    // Get Timezones
    @GET(MovieUrl.CONFIGURATION_GET_TIMEZONES)
    fun getConfigurationTimezones(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<List<ConfigurationTimezone>>

    // ---------------------------------------------------------------------------------------------

    // CREDITS
    // Get Details
    @GET(MovieUrl.CREDITS_GET_DETAILS)
    fun getCreditsDetails(
        @Path(MovieConstant.PATH_CREDIT_ID) credit_id: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Credits>

    // ---------------------------------------------------------------------------------------------

    // DISCOVER
    // Movie Discover
    @GET(MovieUrl.DISCOVER_GET_MOVIE)
    fun getDiscoverMovie(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_REGION) region: String?,
        @Query(MovieConstant.QUERY_SORT_BY) sort_by: String?,
        @Query(MovieConstant.QUERY_CERTIFICATION_COUNTRY) certification_country: String?,
        @Query(MovieConstant.QUERY_CERTIFICATION) certification: String?,
        @Query(MovieConstant.QUERY_CERTIFICATION_LTE) certification_lte: String?,
        @Query(MovieConstant.QUERY_CERTIFICATION_GTE) certification_gte: String?,
        @Query(MovieConstant.QUERY_INCLUDE_ADULT) include_adult: Boolean?,
        @Query(MovieConstant.QUERY_INCLUDE_VIDEO) include_video: Boolean?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_PRIMARY_RELEASE_YEAR) primary_release_year: Int?,
        @Query(MovieConstant.QUERY_PRIMARY_RELEASE_GTE) primary_release_date_gte: String?,
        @Query(MovieConstant.QUERY_PRIMARY_RELEASE_LTE) primary_release_date_lte: String?,
        @Query(MovieConstant.QUERY_RELEASE_DATE_GTE) release_date_gte: String?,
        @Query(MovieConstant.QUERY_RELEASE_DATE_LTE) release_date_lte: String?,
        @Query(MovieConstant.QUERY_RELEASE_DATE_TYPE) with_release_type: Int?,
        @Query(MovieConstant.QUERY_YEAR) year: Int?,
        @Query(MovieConstant.QUERY_VOTE_COUNT_GTE) vote_count_gte: Int?,
        @Query(MovieConstant.QUERY_VOTE_COUNT_LTE) vote_count_lte: Int?,
        @Query(MovieConstant.QUERY_VOTE_AVERAGE_GTE) vote_average_gte: Double?,
        @Query(MovieConstant.QUERY_VOTE_COUNT_LTE) vote_average_lte: Double?,
        @Query(MovieConstant.QUERY_WITH_CAST) with_cast: String?,
        @Query(MovieConstant.QUERY_WITH_CREW) with_crew: String?,
        @Query(MovieConstant.QUERY_WITH_PEOPLE) with_people: String?,
        @Query(MovieConstant.QUERY_WITH_COMPANIES) with_companies: String?,
        @Query(MovieConstant.QUERY_WITH_GENRES) with_genres: String?,
        @Query(MovieConstant.QUERY_WITHOUT_GENRES) without_genres: String?,
        @Query(MovieConstant.QUERY_WITH_KEYWORDS) with_keywords: String?,
        @Query(MovieConstant.QUERY_WITHOUT_KEYWORDS) without_keywords: String?,
        @Query(MovieConstant.QUERY_WITH_RUNTIME_GTE) with_runtime_gte: Double?,
        @Query(MovieConstant.QUERY_WITH_RUNTIME_LTE) with_runtime_lte: Double?,
        @Query(MovieConstant.QUERY_WITH_ORIGINAL_LANGUAGE) with_original_language: String?
    ): Observable<Discover<DiscoverMovie>>

    // DISCOVER
    // TV Discover
    @GET(MovieUrl.DISCOVER_GET_TV)
    fun getDiscoverTv(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_SORT_BY) sort_by: String?,
        @Query(MovieConstant.QUERY_AIR_DATE_GTE) air_date_gte: String?,
        @Query(MovieConstant.QUERY_AIR_DATE_LTE) air_date_lte: String?,
        @Query(MovieConstant.QUERY_FIRST_AIR_DATE_GTE) first_air_date_gte: String?,
        @Query(MovieConstant.QUERY_FIRST_AIR_DATE_LTE) first_air_date_lte: String?,
        @Query(MovieConstant.QUERY_FIRST_AIR_DATE_YEAR) first_air_date_year: Int?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_TIMEZONE) timezone: String?,
        @Query(MovieConstant.QUERY_VOTE_AVERAGE_GTE) vote_average_gte: Double?,
        @Query(MovieConstant.QUERY_VOTE_COUNT_GTE) vote_count_gte: Int?,
        @Query(MovieConstant.QUERY_WITH_GENRES) with_genres: String?,
        @Query(MovieConstant.QUERY_WITH_NETWORKS) with_networks: String?,
        @Query(MovieConstant.QUERY_WITHOUT_GENRES) without_genres: String?,
        @Query(MovieConstant.QUERY_WITH_RUNTIME_GTE) with_runtime_gte: Double?,
        @Query(MovieConstant.QUERY_WITH_RUNTIME_LTE) with_runtime_lte: Double?,
        @Query(MovieConstant.QUERY_INCLUDE_NULL_FIRST_AIR_DATES) include_null_first_air_dates: String?,
        @Query(MovieConstant.QUERY_WITH_ORIGINAL_LANGUAGE) with_original_language: String?,
        @Query(MovieConstant.QUERY_WITH_KEYWORDS) without_keywords: String?,
        @Query(MovieConstant.QUERY_SCREENED_THEATRICALLY) screened_theatrically: String?,
        @Query(MovieConstant.QUERY_WITH_COMPANIES) with_companies: String?,
        @Query(MovieConstant.QUERY_WITH_KEYWORDS) with_keywords: String?
    ): Observable<Discover<DiscoverTv>>

    // ---------------------------------------------------------------------------------------------

    // FIND
    // Find by ID
    @GET(MovieUrl.FIND_GET_ID)
    fun getFindById(
        @Path(MovieConstant.PATH_EXTERNAL_ID) external_id: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_EXTERNAL_SOURCE) external_source: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<Find>

    // ---------------------------------------------------------------------------------------------

    // GENRES
    // Get Movie List
    @GET(MovieUrl.GENRES_GET_MOVIES)
    fun getGenresMovie(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<Genres>

    // GENRES
    // Get TV List
    @GET(MovieUrl.GENRES_GET_TV)
    fun getGenresTv(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<Genres>

    // ---------------------------------------------------------------------------------------------

    // KEYWORDS
    // Get Details
    @GET(MovieUrl.KEYWORDS_GET_DETAILS)
    fun getKeywordsDetail(
        @Path(MovieConstant.PATH_KEYWORD_ID) keyword_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<KeywordsDetail>

    // KEYWORDS
    // Get Movies
    @GET(MovieUrl.KEYWORDS_GET_MOVIES)
    fun getKeywordsMovie(
        @Path(MovieConstant.PATH_KEYWORD_ID) keyword_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_INCLUDE_ADULT) include_adult: Boolean?
    ): Observable<KeywordsMovies>

    // ---------------------------------------------------------------------------------------------

    // MOVIES
    // Get Details
    @GET(MovieUrl.MOVIES_GET_DETAILS)
    fun getMoviesDetails(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_APPEND_TO_RESPONSE) append_to_response: String?
    ): Observable<MovieDetail>

    // MOVIES
    // Get Account States
    @GET(MovieUrl.MOVIES_GET_ACCOUNT_STATES)
    fun getMoviesAccountState(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_SESSION_ID) session_id: String,
        @Query(MovieConstant.QUERY_GUEST_SESSION_ID) guest_session_id: String?
    ): Observable<MovieAccountState>

    // MOVIES
    // Get Alternative Titles
    @GET(MovieUrl.MOVIES_GET_ALTERNATIVE_TITLE)
    fun getMoviesAlternativeTitles(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_COUNTRY) country: String?
    ): Observable<MovieAlternativeTitle>

    // MOVIES
    // Get Changes
    @GET(MovieUrl.MOVIES_GET_CHANGES)
    fun getMoviesChanges(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_START_DATE) start_date: String?,
        @Query(MovieConstant.QUERY_END_DATE) end_date: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<MovieChanges>

    // MOVIES
    // Get Credits
    @GET(MovieUrl.MOVIES_GET_CREDITS)
    fun getMoviesCredits(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<MovieCredit>

    // MOVIES
    // Get External Ids
    @GET(MovieUrl.MOVIES_GET_EXTERNAL_IDS)
    fun getMoviesExternalIds(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<MovieExternalId>

    // MOVIES
    // Get Images
    @GET(MovieUrl.MOVIES_GET_IMAGES)
    fun getMoviesImages(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_INCLUDE_IMAGE_LANGUAGE) include_image_language: String?
    ): Observable<MovieImages>

    // MOVIES
    // Get Keywords
    @GET(MovieUrl.MOVIES_GET_KEYWORDS)
    fun getMoviesKeywords(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<MovieKeywords>

    // MOVIES
    // Get Release Dates
    @GET(MovieUrl.MOVIES_GET_RELEASE_DATE)
    fun getMoviesReleaseDates(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<MovieReleaseDates>

    // MOVIES
    // Get Videos
    @GET(MovieUrl.MOVIES_GET_VIDEOS)
    fun getMoviesVideos(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<MovieVideos>

    // MOVIES
    // Get Translations
    @GET(MovieUrl.MOVIES_GET_TRANSLATIONS)
    fun getMoviesTranslations(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<MovieTranslations>

    // MOVIES
    // Get Recommendations
    @GET(MovieUrl.MOVIES_GET_RECOMENDATIONS)
    fun getMoviesRecommendations(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<MovieRecommendations>

    // MOVIES
    // Get Similar Movies
    @GET(MovieUrl.MOVIES_GET_SIMILAR_MOVIES)
    fun getMoviesSimilarMovies(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<MovieSimilarMovies>

    // MOVIES
    // Get Reviews
    @GET(MovieUrl.MOVIES_GET_REVIEWS)
    fun getMoviesReviews(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        page: Int?
    ): Observable<MovieReviews>

    // MOVIES
    // Get Lists
    @GET(MovieUrl.MOVIES_GET_LIST)
    fun getMoviesLists(
        @Path(MovieConstant.PATH_MOVIE_ID) movie_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<MovieLists>

    // MOVIES
    // Get Latest
    @GET(MovieUrl.MOVIES_GET_LATEST)
    fun getMoviesLatest(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<MovieLatest>

    // MOVIES
    // Get Now Playing
    @GET(MovieUrl.MOVIES_GET_NOW_PLAYING)
    fun getMoviesNowPlaying(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_REGION) region: String?
    ): Observable<MovieNowPlayings>

    // MOVIES
    // Get Popular
    @GET(MovieUrl.MOVIES_GET_POPULAR)
    fun getMoviesPopular(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_REGION) region: String?
    ): Observable<MoviePopulars>

    // MOVIES
    // Get Top Rated
    @GET(MovieUrl.MOVIES_GET_TOP_RATED)
    fun getMoviesTopRated(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_REGION) region: String?
    ): Observable<MovieTopRated>

    // MOVIES
    // Get Upcoming
    @GET(MovieUrl.MOVIES_GET_UPCOMING)
    fun getMoviesUpcoming(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_REGION) region: String?
    ): Observable<MovieUpcoming>

    // ---------------------------------------------------------------------------------------------

    // TRENDING
    // Get Trending All
    @GET(MovieUrl.TRENDING_GET_TREND)
    fun getTrendingAll(
        @Path(MovieConstant.PATH_MEDIA_TYPE) media_type: String,
        @Path(MovieConstant.PATH_TIME_WINDOW) time_window: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Trending<TrendingAll>>

    // TRENDING
    // Get Trending Movie
    @GET(MovieUrl.TRENDING_GET_TREND)
    fun getTrendingMovie(
        @Path(MovieConstant.PATH_MEDIA_TYPE) media_type: String,
        @Path(MovieConstant.PATH_TIME_WINDOW) time_window: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Trending<TrendingMovie>>

    // TRENDING
    // Get Trending Person
    @GET(MovieUrl.TRENDING_GET_TREND)
    fun getTrendingPerson(
        @Path(MovieConstant.PATH_MEDIA_TYPE) media_type: String,
        @Path(MovieConstant.PATH_TIME_WINDOW) time_window: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Trending<TrendingPerson>>

    // TRENDING
    // Get Trending Movie
    @GET(MovieUrl.TRENDING_GET_TREND)
    fun getTrendingTv(
        @Path(MovieConstant.PATH_MEDIA_TYPE) media_type: String,
        @Path(MovieConstant.PATH_TIME_WINDOW) time_window: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Trending<TrendingTv>>

    // ---------------------------------------------------------------------------------------------

    // REVIEWS
    // Get Details
    @GET(MovieUrl.REVIEWS_GET_DETAILS)
    fun getReviews(
        @Path(MovieConstant.PATH_REVIEW_ID) review_id: String,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<Reviews>

    // ---------------------------------------------------------------------------------------------

    // NETWORKS
    // Get Details
    @GET(MovieUrl.NETWORKS_GET_DETAILS)
    fun getNetworkDetail(
        @Path(MovieConstant.PATH_NETWORK_ID) network_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<NetworkDetail>

    // NETWORKS
    // Get Alternative Names
    @GET(MovieUrl.NETWORKS_GET_ALTERNATIVE_NAMES)
    fun getNetworkAlternativeName(
        @Path(MovieConstant.PATH_NETWORK_ID) network_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<NetworkAlternativeName>

    // NETWORKS
    // Get Images
    @GET(MovieUrl.NETWORKS_GET_IMAGES)
    fun getNetworkImage(
        @Path(MovieConstant.PATH_NETWORK_ID) network_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<NetworkImage>

    // ---------------------------------------------------------------------------------------------

    // SEARCH
    // Search Companies
    @GET(MovieUrl.SEARCH_GET_COMPANIES)
    fun searchCompanies(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<SearchCompanies>

    // SEARCH
    // Search Collections
    @GET(MovieUrl.SEARCH_GET_COLLECTIONS)
    fun searchCollections(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<SearchCollections>

    // SEARCH
    // Search Keywords
    @GET(MovieUrl.SEARCH_GET_KEYWORDS)
    fun searchKeywords(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<SearchKeywords>

    // SEARCH
    // Search Movies
    @GET(MovieUrl.SEARCH_GET_MOVIES)
    fun searchMovies(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_INCLUDE_ADULT) include_adult: Boolean?,
        @Query(MovieConstant.QUERY_REGION) region: String?,
        @Query(MovieConstant.QUERY_YEAR) year: Int?,
        @Query(MovieConstant.QUERY_PRIMARY_RELEASE_YEAR) primary_release_year: Int?
    ): Observable<SearchMovies>

    // SEARCH
    // Multi Search
    @GET(MovieUrl.SEARCH_GET_MULTI_SEARCH)
    fun searchMultiSearch(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_INCLUDE_ADULT) include_adult: Boolean?,
        @Query(MovieConstant.QUERY_REGION) region: String?
    ): Observable<SearchMulti>

    // SEARCH
    // Search People
    @GET(MovieUrl.SEARCH_GET_SEARCH_PEOPLE)
    fun searchPeople(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_INCLUDE_ADULT) include_adult: Boolean?,
        @Query(MovieConstant.QUERY_REGION) region: String?
    ): Observable<SearchPeople>

    // SEARCH
    // Search Tv Shows
    @GET(MovieUrl.SEARCH_GET_TV_SHOWS)
    fun searchTvShows(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_QUERY) query: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_INCLUDE_ADULT) include_adult: Boolean?,
        @Query(MovieConstant.QUERY_FIRST_AIR_DATE_YEAR) first_air_date_year: Int?
    ): Observable<SearchMovies>

    // ---------------------------------------------------------------------------------------------

    // TV
    // Get Details
    @GET(MovieUrl.TV_GET_DETAILS)
    fun getTvDetails(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_APPEND_TO_RESPONSE) append_to_response: String?
    ): Observable<TvDetails>

    // TV
    // Get Account States
    @GET(MovieUrl.TV_GET_ACCOUNT_STATES)
    fun getTvAccountStates(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_GUEST_SESSION_ID) guest_session_id: String?,
        @Query(MovieConstant.QUERY_SESSION_ID) session_id: String?
    ): Observable<TvAccountStates>

    // TV
    // Get Alternative Titles
    @GET(MovieUrl.TV_GET_ALTERNATIVE_TITLES)
    fun getTvAlternativeTitles(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvAlternativeTitles>

    // TV
    // Get Changes
    @GET(MovieUrl.TV_GET_CHANGES)
    fun getTvChanges(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvChanges>

    // TV
    // Get Content Ratings
    @GET(MovieUrl.TV_GET_CONTENT_RATINGS)
    fun getTvContentRatings(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvContentRatings>

    // TV
    // Get Credits
    @GET(MovieUrl.TV_GET_CREDITS)
    fun getTvCredits(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvCredits>

    // TV
    // Get Episode Groups
    @GET(MovieUrl.TV_GET_EPISODE_GROUPS)
    fun getTvEpisodeGroups(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvEpisodeGroups>

    // TV
    // Get External IDs
    @GET(MovieUrl.TV_GET_EXTERNAL_IDS)
    fun getTvExternalIds(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvExternalIds>

    // TV
    // Get Images
    @GET(MovieUrl.TV_GET_IMAGES)
    fun getTvImages(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvImages>

    // TV
    // Get Keyword
    @GET(MovieUrl.TV_GET_KEYWORDS)
    fun getTvKeyword(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvKeywords>

    // TV
    // Get Recommendations
    @GET(MovieUrl.TV_GET_RECOMMENDATIONS)
    fun getTvRecommendations(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvRecommendations>

    // TV
    // Get Reviews
    @GET(MovieUrl.TV_GET_REVIEWS)
    fun getTvReviews(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvReviews>

    // TV
    // Get Screened Theatrically
    @GET(MovieUrl.TV_GET_SCREENED_THEATRICALLY)
    fun getTvScreenedTheatrically(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvScreenedTheatrically>

    // TV
    // Get Similar TV Shows
    @GET(MovieUrl.TV_GET_SIMILIAR_TV_SHOWS)
    fun getTvSimilarTvShows(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvSimilarTVShows>

    // TV
    // Get Translations
    @GET(MovieUrl.TV_GET_TRANSLATIONS)
    fun getTvTranslations(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvTranslations>

    // TV
    // Get Videos
    @GET(MovieUrl.TV_GET_VIDEOS)
    fun getTvVideos(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvVideos>

    // TV
    // Get Latest
    @GET(MovieUrl.TV_GET_LATEST)
    fun getTvLatest(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvLatest>

    // TV
    // Get TV Airing Today
    @GET(MovieUrl.TV_GET_TV_AIRING_TODAY)
    fun getTvAiringToday(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvAiringToday>

    // TV
    // Get TV On The Air
    @GET(MovieUrl.TV_GET_TV_ON_THE_AIR)
    fun getTvOnTheAir(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvOnTheAir>

    // TV
    // Get Popular
    @GET(MovieUrl.TV_GET_POPULAR)
    fun getTvPopular(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvPopular>

    // TV
    // Get Top Rated
    @GET(MovieUrl.TV_GET_TOP_RATED)
    fun getTvTopRated(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvTopRated>

    // ---------------------------------------------------------------------------------------------

    // TV SEASONS
    // Get Details
    @GET(MovieUrl.TV_SEASONS_GET_DETAILS)
    fun getTvSeasonsDetails(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_APPEND_TO_RESPONSE) append_to_response: String?
    ): Observable<TvSeasonsDetails>

    // TV SEASONS
    // Get Changes
    @GET(MovieUrl.TV_SEASONS_GET_CHANGES)
    fun getTvSeasonsChanges(
        @Path(MovieConstant.PATH_SEASON_ID) season_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvSeasonsChanges>

    // TV SEASONS
    // Get Account States
    @GET(MovieUrl.TV_SEASONS_GET_ACCOUNT_STATES)
    fun getTvSeasonsAccountStates(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_GUEST_SESSION_ID) guest_session_id: String?,
        @Query(MovieConstant.QUERY_SESSION_ID) session_id: String?
    ): Observable<TvSeasonsAccountStates>

    // TV SEASONS
    // Get Credits
    @GET(MovieUrl.TV_SEASONS_GET_CREDITS)
    fun getTvSeasonsCredits(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvSeasonsCredits>

    // TV SEASONS
    // Get External Ids
    @GET(MovieUrl.TV_SEASONS_GET_EXTERNAL_IDS)
    fun getTvSeasonsExternalIds(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvSeasonsExternalIds>

    // TV SEASONS
    // Get Images
    @GET(MovieUrl.TV_SEASONS_GET_IMAGES)
    fun getTvSeasonsImages(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvSeasonsImages>

    // TV SEASONS
    // Get Videos
    @GET(MovieUrl.TV_SEASONS_GET_VIDEOS)
    fun getTvSeasonsVideos(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvSeasonsVideos>

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE
    // Get Details
    @GET(MovieUrl.TV_EPISODES_GET_DETAILS)
    fun getTvEpisodeDetails(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_APPEND_TO_RESPONSE) append_to_response: String?
    ): Observable<TvEpisodeDetails>

    // TV EPISODE
    // Get Changes
    @GET(MovieUrl.TV_EPISODES_GET_CHANGES)
    fun getTvEpisodeChanges(
        @Path(MovieConstant.PATH_EPISODE_ID) episode_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<TvEpisodeChanges>

    // TV EPISODE
    // Get Account States
    @GET(MovieUrl.TV_EPISODES_GET_ACCOUNT_STATES)
    fun getTvEpisodeAccountStates(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_GUEST_SESSION_ID) guest_session_id: String?,
        @Query(MovieConstant.QUERY_SESSION_ID) session_id: String?
    ): Observable<TvEpisodeAccountStates>

    // TV EPISODE
    // Get Credits
    @GET(MovieUrl.TV_EPISODES_GET_CREDITS)
    fun getTvEpisodeCredits(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvEpisodeCredits>

    // TV EPISODE
    // Get External IDs
    @GET(MovieUrl.TV_EPISODES_GET_EXTERNAL_IDS)
    fun getTvEpisodeExternalIds(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvEpisodeExternalIds>

    // TV EPISODE
    // Get Images
    @GET(MovieUrl.TV_EPISODES_GET_IMAGES)
    fun getTvEpisodeImages(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvEpisodeImages>

    // TV EPISODE
    // Get Translations
    @GET(MovieUrl.TV_EPISODES_GET_TRANSLATIONS)
    fun getTvEpisodeTranslations(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<TvEpisodeTranslation>

    // TV EPISODE
    // Get Videos
    @GET(MovieUrl.TV_EPISODES_GET_VIDEOS)
    fun getTvEpisodeVideos(
        @Path(MovieConstant.PATH_TV_ID) tv_id: Int,
        @Path(MovieConstant.PATH_SEASON_NUMBER) season_number: Int,
        @Path(MovieConstant.PATH_EPISODE_NUMBER) episode_number: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvEpisodeVideos>

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE GROUPS
    // Get Details
    @GET(MovieUrl.TV_EPISODES_GET_GROUPS_DETAIL)
    fun getTvEpisodeGroupsDetails(
        @Path(MovieConstant.PATH_ID) id: String?,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<TvEpisodeGroupsDetails>

    // ---------------------------------------------------------------------------------------------

    // PEOPLE
    // Get Details
    @GET(MovieUrl.PEOPLE_GET_DETAILS)
    fun getPeopleDetails(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleDetails>

    // PEOPLE
    // Get Changes
    @GET(MovieUrl.PEOPLE_GET_CHANGES)
    fun getPeopleChanges(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_END_DATE) endDate: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?,
        @Query(MovieConstant.QUERY_START_DATE) startDate: String?
    ): Observable<PeopleChanges>

    // PEOPLE
    // Get Movie Credits
    @GET(MovieUrl.PEOPLE_GET_MOVIE_CREDITS)
    fun getPeopleMovieCredits(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleMovieCredits>

    // PEOPLE
    // Get TV Credits
    @GET(MovieUrl.PEOPLE_GET_TV_CREDITS)
    fun getPeopleTvCredits(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleTvCredits>

    // PEOPLE
    // Get Combined Credits
    @GET(MovieUrl.PEOPLE_GET_COMBINED_CREDITS)
    fun getPeopleCombinedCredits(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleCombinedCredits>

    // PEOPLE
    // Get External IDs
    @GET(MovieUrl.PEOPLE_GET_EXTERNAL_IDS)
    fun getPeopleExternalIds(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleExternalIds>

    // PEOPLE
    // Get Images
    @GET(MovieUrl.PEOPLE_GET_IMAGES)
    fun getPeopleImages(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String
    ): Observable<PeopleImages>

    // PEOPLE
    // Get Tagged Images
    @GET(MovieUrl.PEOPLE_GET_TAGGED_IMAGES)
    fun getPeopleTaggedImages(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<PeopleTaggedImages>

    // PEOPLE
    // Get Translations
    @GET(MovieUrl.PEOPLE_GET_TRANSLATIONS)
    fun getPeopleTranslations(
        @Path(MovieConstant.PATH_PERSON_ID) person_id: Int,
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleTranslations>

    // PEOPLE
    // Get Latest
    @GET(MovieUrl.PEOPLE_GET_LATEST)
    fun getPeopleLatest(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?
    ): Observable<PeopleLatest>

    // PEOPLE
    // Get Popular
    @GET(MovieUrl.PEOPLE_GET_POPULAR)
    fun getPeoplePopular(
        @Query(MovieConstant.QUERY_API_KEY) apiKey: String,
        @Query(MovieConstant.QUERY_LANGUAGE) language: String?,
        @Query(MovieConstant.QUERY_PAGE) page: Int?
    ): Observable<PeoplePopular>

}