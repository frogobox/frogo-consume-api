package com.frogobox.frogoconsumeapi.movie.data.source

import android.content.Context
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
class MovieRepository(private val remoteDataSource: MovieRemoteDataSource) : MovieDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>>
    ) {
        remoteDataSource.getMovieCertifications(apiKey, callback)
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>>
    ) {
        remoteDataSource.getTvCertifications(apiKey, callback)
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getMovieChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getTvChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getPersonChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsDetail>
    ) {
        remoteDataSource.getCollectionDetails(collection_id, apiKey, language, callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsImage>
    ) {
        remoteDataSource.getCollectionImages(collection_id, apiKey, language, callback)
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsTranslation>
    ) {
        remoteDataSource.getCollectionTranslations(collection_id, apiKey, language, callback)
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesDetail>
    ) {
        remoteDataSource.getCompaniesDetails(company_id, apiKey, callback)
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesAlternateName>
    ) {
        remoteDataSource.getCompaniesAlternativeName(company_id, apiKey, callback)
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesImage>
    ) {
        remoteDataSource.getCompaniesImage(company_id, apiKey, callback)
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<ConfigurationApi>
    ) {
        remoteDataSource.getConfigurationApi(apiKey, callback)
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationCountry>>
    ) {
        remoteDataSource.getConfigurationCountries(apiKey, callback)
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationJob>>
    ) {
        remoteDataSource.getConfigurationJobs(apiKey, callback)
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationLanguage>>
    ) {
        remoteDataSource.getConfigurationLanguages(apiKey, callback)
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<String>>
    ) {
        remoteDataSource.getConfigurationTranslations(apiKey, callback)
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationTimezone>>
    ) {
        remoteDataSource.getConfigurationTimezones(apiKey, callback)
    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Credits>
    ) {
        remoteDataSource.getCreditsDetails(credit_id, apiKey, callback)
    }

    override fun getDiscoverMovie(
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
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverMovie>>
    ) {
        remoteDataSource.getDiscoverMovie(
            apiKey,
            language,
            region,
            sort_by,
            certification_country,
            certification,
            certification_lte,
            certification_gte,
            include_adult,
            include_video,
            page,
            primary_release_year,
            primary_release_date_gte,
            primary_release_date_lte,
            release_date_gte,
            release_date_lte,
            with_release_type,
            year,
            vote_count_gte,
            vote_count_lte,
            vote_average_gte,
            vote_average_lte,
            with_cast,
            with_crew,
            with_people,
            with_companies,
            with_genres,
            without_genres,
            with_keywords,
            without_keywords,
            with_runtime_gte,
            with_runtime_lte,
            with_original_language,
            callback
        )
    }

    override fun getDiscoverTv(
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
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverTv>>
    ) {
        remoteDataSource.getDiscoverTv(
            apiKey,
            language,
            sort_by,
            air_date_gte,
            air_date_lte,
            first_air_date_gte,
            first_air_date_lte,
            first_air_date_year,
            page,
            timezone,
            vote_average_gte,
            vote_count_gte,
            with_genres,
            with_networks,
            without_genres,
            with_runtime_gte,
            with_runtime_lte,
            include_null_first_air_dates,
            with_original_language,
            without_keywords,
            screened_theatrically,
            with_companies,
            with_keywords,
            callback
        )
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Find>
    ) {
        remoteDataSource.getFindById(external_id, apiKey, external_source, language, callback)
    }

    override fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Genres>
    ) {
        remoteDataSource.getGenresMovie(apiKey, language, callback)
    }

    override fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Genres>
    ) {
        remoteDataSource.getGenresTv(apiKey, language, callback)
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<KeywordsDetail>
    ) {
        remoteDataSource.getKeywordsDetail(keyword_id, apiKey, callback)
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: MovieDataSource.GetRemoteCallback<KeywordsMovies>
    ) {
        remoteDataSource.getKeywordsMovie(keyword_id, apiKey, language, include_adult, callback)
    }

    override fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieDetail>
    ) {
        remoteDataSource.getMoviesDetails(movie_id, apiKey, language, append_to_response, callback)
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieAccountState>
    ) {
        remoteDataSource.getMoviesAccountState(
            movie_id,
            apiKey,
            session_id,
            guest_session_id,
            callback
        )
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieAlternativeTitle>
    ) {
        remoteDataSource.getMoviesAlternativeTitles(movie_id, apiKey, country, callback)
    }

    override fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieChanges>
    ) {
        remoteDataSource.getMoviesChanges(movie_id, apiKey, start_date, end_date, page, callback)
    }

    override fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieCredit>
    ) {
        remoteDataSource.getMoviesCredits(movie_id, apiKey, callback)
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieExternalId>
    ) {
        remoteDataSource.getMoviesExternalIds(movie_id, apiKey, callback)
    }

    override fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieImages>
    ) {
        remoteDataSource.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language,
            callback
        )
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieKeywords>
    ) {
        remoteDataSource.getMoviesKeywords(movie_id, apiKey, callback)
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieReleaseDates>
    ) {
        remoteDataSource.getMoviesReleaseDates(movie_id, apiKey, callback)
    }

    override fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieVideos>
    ) {
        remoteDataSource.getMoviesVideos(movie_id, apiKey, language, callback)
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieTranslations>
    ) {
        remoteDataSource.getMoviesTranslations(movie_id, apiKey, callback)
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieRecommendations>
    ) {
        remoteDataSource.getMoviesRecommendations(movie_id, apiKey, language, page, callback)
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieSimilarMovies>
    ) {
        remoteDataSource.getMoviesSimilarMovies(movie_id, apiKey, language, page, callback)
    }

    override fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieReviews>
    ) {
        remoteDataSource.getMoviesReviews(movie_id, apiKey, language, page, callback)
    }

    override fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieLists>
    ) {
        remoteDataSource.getMoviesLists(movie_id, apiKey, language, page, callback)
    }

    override fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieLatest>
    ) {
        remoteDataSource.getMoviesLatest(apiKey, language, callback)
    }

    override fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieNowPlayings>
    ) {
        remoteDataSource.getMoviesNowPlaying(apiKey, language, page, region, callback)
    }

    override fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MoviePopulars>
    ) {
        remoteDataSource.getMoviesPopular(apiKey, language, page, region, callback)
    }

    override fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieTopRated>
    ) {
        remoteDataSource.getMoviesTopRated(apiKey, language, page, region, callback)
    }

    override fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieUpcoming>
    ) {
        remoteDataSource.getMoviesUpcoming(apiKey, language, page, region, callback)
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingAll>>
    ) {
        remoteDataSource.getTrendingAll(media_type, time_window, apiKey, callback)
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingMovie>>
    ) {
        remoteDataSource.getTrendingMovie(media_type, time_window, apiKey, callback)
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingPerson>>
    ) {
        remoteDataSource.getTrendingPerson(media_type, time_window, apiKey, callback)
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingTv>>
    ) {
        remoteDataSource.getTrendingTv(media_type, time_window, apiKey, callback)
    }

    override fun getReviews(
        review_id: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Reviews>
    ) {
        remoteDataSource.getReviews(review_id, apiKey, callback)
    }

    override fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<NetworkDetail>
    ) {
        remoteDataSource.getNetworkDetail(network_id, apiKey, callback)
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<NetworkAlternativeName>
    ) {
        remoteDataSource.getNetworkAlternativeName(network_id, apiKey, callback)
    }

    override fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<NetworkImage>
    ) {
        remoteDataSource.getNetworkImage(network_id, apiKey, callback)
    }

    override fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchCompanies>
    ) {
        remoteDataSource.searchCompanies(apiKey, query, page, callback)
    }

    override fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchCollections>
    ) {
        remoteDataSource.searchCollections(apiKey, query, language, page, callback)
    }

    override fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchKeywords>
    ) {
        remoteDataSource.searchKeywords(apiKey, query, page, callback)
    }

    override fun searchMovies(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchMovies>
    ) {
        remoteDataSource.searchMovies(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            year,
            primary_release_year,
            callback
        )
    }

    override fun searchMultiSearch(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<SearchMulti>
    ) {
        remoteDataSource.searchMultiSearch(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            callback
        )
    }

    override fun searchPeople(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<SearchPeople>
    ) {
        remoteDataSource.searchPeople(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            callback
        )
    }

    override fun searchTvShows(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchMovies>
    ) {
        remoteDataSource.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year,
            callback
        )
    }

    override fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<TvDetails>
    ) {
        remoteDataSource.getTvDetails(tv_id, apiKey, language, append_to_response, callback)
    }

    override fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<TvAccountStates>
    ) {
        remoteDataSource.getTvAccountStates(
            tv_id,
            apiKey,
            language,
            guest_session_id,
            session_id,
            callback
        )
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvAlternativeTitles>
    ) {
        remoteDataSource.getTvAlternativeTitles(tv_id, apiKey, language, callback)
    }

    override fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvChanges>
    ) {
        remoteDataSource.getTvChanges(tv_id, apiKey, startDate, endDate, page, callback)
    }

    override fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvContentRatings>
    ) {
        remoteDataSource.getTvContentRatings(tv_id, apiKey, language, callback)
    }

    override fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvCredits>
    ) {
        remoteDataSource.getTvCredits(tv_id, apiKey, language, callback)
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeGroups>
    ) {
        remoteDataSource.getTvEpisodeGroups(tv_id, apiKey, language, callback)
    }

    override fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvExternalIds>
    ) {
        remoteDataSource.getTvExternalIds(tv_id, apiKey, language, callback)
    }

    override fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvImages>
    ) {
        remoteDataSource.getTvImages(tv_id, apiKey, language, callback)
    }

    override fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvKeywords>
    ) {
        remoteDataSource.getTvKeyword(tv_id, apiKey, callback)
    }

    override fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvRecommendations>
    ) {
        remoteDataSource.getTvRecommendations(tv_id, apiKey, language, page, callback)
    }

    override fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvReviews>
    ) {
        remoteDataSource.getTvReviews(tv_id, apiKey, callback)
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvScreenedTheatrically>
    ) {
        remoteDataSource.getTvScreenedTheatrically(tv_id, apiKey, callback)
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvSimilarTVShows>
    ) {
        remoteDataSource.getTvSimilarTvShows(tv_id, apiKey, language, page, callback)
    }

    override fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvTranslations>
    ) {
        remoteDataSource.getTvTranslations(tv_id, apiKey, callback)
    }

    override fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvVideos>
    ) {
        remoteDataSource.getTvVideos(tv_id, apiKey, language, callback)
    }

    override fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvLatest>
    ) {
        remoteDataSource.getTvLatest(apiKey, language, callback)
    }

    override fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvAiringToday>
    ) {
        remoteDataSource.getTvAiringToday(apiKey, language, page, callback)
    }

    override fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvOnTheAir>
    ) {
        remoteDataSource.getTvOnTheAir(apiKey, language, page, callback)
    }

    override fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvPopular>
    ) {
        remoteDataSource.getTvPopular(apiKey, language, page, callback)
    }

    override fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvTopRated>
    ) {
        remoteDataSource.getTvTopRated(apiKey, language, page, callback)
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsDetails>
    ) {
        remoteDataSource.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response,
            callback
        )
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsChanges>
    ) {
        remoteDataSource.getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page, callback)
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsAccountStates>
    ) {
        remoteDataSource.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id,
            callback
        )
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsCredits>
    ) {
        remoteDataSource.getTvSeasonsCredits(tv_id, season_number, apiKey, language, callback)
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsExternalIds>
    ) {
        remoteDataSource.getTvSeasonsExternalIds(tv_id, season_number, apiKey, language, callback)
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsImages>
    ) {
        remoteDataSource.getTvSeasonsImages(tv_id, season_number, apiKey, language, callback)
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsVideos>
    ) {
        remoteDataSource.getTvSeasonsVideos(tv_id, season_number, apiKey, language, callback)
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeDetails>
    ) {
        remoteDataSource.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response,
            callback
        )
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeChanges>
    ) {
        remoteDataSource.getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page, callback)
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeAccountStates>
    ) {
        remoteDataSource.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id,
            callback
        )
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeCredits>
    ) {
        remoteDataSource.getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey, callback)
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeExternalIds>
    ) {
        remoteDataSource.getTvEpisodeExternalIds(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            callback
        )
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeImages>
    ) {
        remoteDataSource.getTvEpisodeImages(tv_id, season_number, episode_number, apiKey, callback)
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeTranslation>
    ) {
        remoteDataSource.getTvEpisodeTranslations(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            callback
        )
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeVideos>
    ) {
        remoteDataSource.getTvEpisodeVideos(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            callback
        )
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeGroupsDetails>
    ) {
        remoteDataSource.getTvEpisodeGroupsDetails(id, apiKey, language, callback)
    }

    override fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleDetails>
    ) {
        remoteDataSource.getPeopleDetails(person_id, apiKey, language, callback)
    }

    override fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleChanges>
    ) {
        remoteDataSource.getPeopleChanges(person_id, apiKey, endDate, page, startDate, callback)
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleMovieCredits>
    ) {
        remoteDataSource.getPeopleMovieCredits(person_id, apiKey, language, callback)
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleTvCredits>
    ) {
        remoteDataSource.getPeopleTvCredits(person_id, apiKey, language, callback)
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleCombinedCredits>
    ) {
        remoteDataSource.getPeopleCombinedCredits(person_id, apiKey, language, callback)
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleExternalIds>
    ) {
        remoteDataSource.getPeopleExternalIds(person_id, apiKey, language, callback)
    }

    override fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<PeopleImages>
    ) {
        remoteDataSource.getPeopleImages(person_id, apiKey, callback)
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<PeopleTaggedImages>
    ) {
        remoteDataSource.getPeopleTaggedImages(person_id, apiKey, language, page, callback)
    }

    override fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleTranslations>
    ) {
        remoteDataSource.getPeopleTranslations(person_id, apiKey, language, callback)
    }

    override fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleLatest>
    ) {
        remoteDataSource.getPeopleLatest(apiKey, language, callback)
    }

    override fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<PeoplePopular>
    ) {
        remoteDataSource.getPeoplePopular(apiKey, language, page, callback)
    }
}