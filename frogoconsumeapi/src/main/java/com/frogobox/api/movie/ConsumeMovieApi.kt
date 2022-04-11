package com.frogobox.api.movie

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.movie.MovieApi
import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import okhttp3.Interceptor

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
 * com.frogobox.frogoconsumeapi.movie
 *
 */
class ConsumeMovieApi(apiKey: String) : IConsumeMovieApi {

    private var movieApi = MovieApi(AndroidSchedulers.mainThread(), apiKey)

    override fun usingChuckInterceptor(context: Context) {
        usingChuckInterceptor(ChuckerInterceptor(context))
    }

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        movieApi.usingChuckInterceptor(chuckerInterceptor)
    }


    override fun getMovieCertifications(callback: ConsumeApiResponse<Certifications<CertificationMovie>>) {
        movieApi.getMovieCertifications(callback)
    }

    override fun getTvCertifications(callback: ConsumeApiResponse<Certifications<CertificationTv>>) {
        movieApi.getTvCertifications(callback)
    }

    override fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApi.getMovieChangeList(endDate, startDate, page, callback)
    }

    override fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApi.getTvChangeList(endDate, startDate, page, callback)
    }

    override fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApi.getPersonChangeList(endDate, startDate, page, callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    ) {
        movieApi.getCollectionDetails(collection_id, language, callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    ) {
        movieApi.getCollectionImages(
            collection_id, language, callback
        )
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    ) {
        movieApi.getCollectionTranslations(
            collection_id, language, callback
        )
    }

    override fun getCompaniesDetails(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesDetail>
    ) {
        movieApi.getCompaniesDetails(
            company_id, callback
        )
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    ) {
        movieApi.getCompaniesAlternativeName(
            company_id, callback
        )
    }

    override fun getCompaniesImage(company_id: Int, callback: ConsumeApiResponse<CompaniesImage>) {
        movieApi.getCompaniesImage(
            company_id, callback
        )
    }

    override fun getConfigurationApi(callback: ConsumeApiResponse<ConfigurationApi>) {
        movieApi.getConfigurationApi(callback)
    }

    override fun getConfigurationCountries(callback: ConsumeApiResponse<List<ConfigurationCountry>>) {
        movieApi.getConfigurationCountries(callback)
    }

    override fun getConfigurationJobs(callback: ConsumeApiResponse<List<ConfigurationJob>>) {
        movieApi.getConfigurationJobs(callback)
    }

    override fun getConfigurationLanguages(callback: ConsumeApiResponse<List<ConfigurationLanguage>>) {
        movieApi.getConfigurationLanguages(callback)
    }

    override fun getConfigurationTranslations(callback: ConsumeApiResponse<List<String>>) {
        movieApi.getConfigurationTranslations(callback)
    }

    override fun getConfigurationTimezones(callback: ConsumeApiResponse<List<ConfigurationTimezone>>) {
        movieApi.getConfigurationTimezones(callback)
    }

    override fun getCreditsDetails(credit_id: String, callback: ConsumeApiResponse<Credits>) {
        movieApi.getCreditsDetails(credit_id, callback)
    }

    override fun getDiscoverMovie(
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
    ) {
        movieApi.getDiscoverMovie(
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
            with_original_language, callback
        )
    }

    override fun getDiscoverTv(
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
    ) {
        movieApi.getDiscoverTv(
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
            with_keywords, callback
        )
    }

    override fun getFindById(
        external_id: String,
        external_source: String,
        language: String?,
        callback: ConsumeApiResponse<Find>
    ) {
        movieApi.getFindById(
            external_id,

            external_source, language, callback
        )
    }

    override fun getGenresMovie(language: String?, callback: ConsumeApiResponse<Genres>) {
        movieApi.getGenresMovie(language, callback)
    }

    override fun getGenresTv(language: String?, callback: ConsumeApiResponse<Genres>) {
        movieApi.getGenresTv(language, callback)
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: ConsumeApiResponse<KeywordsDetail>) {
        movieApi.getKeywordsDetail(
            keyword_id, callback
        )
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: ConsumeApiResponse<KeywordsMovies>
    ) {
        movieApi.getKeywordsMovie(
            keyword_id, language,
            include_adult, callback
        )
    }

    override fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    ) {
        movieApi.getMoviesDetails(movie_id, language, append_to_response, callback)
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    ) {
        movieApi.getMoviesAccountState(movie_id, session_id, guest_session_id, callback)
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    ) {
        movieApi.getMoviesAlternativeTitles(movie_id, country, callback)
    }

    override fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    ) {
        movieApi.getMoviesChanges(movie_id, start_date, end_date, page, callback)
    }

    override fun getMoviesCredits(movie_id: Int, callback: ConsumeApiResponse<MovieCredit>) {
        movieApi.getMoviesCredits(movie_id, callback)
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieExternalId>
    ) {
        movieApi.getMoviesExternalIds(movie_id, callback)
    }

    override fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    ) {
        movieApi.getMoviesImages(movie_id, language, include_image_language, callback)
    }

    override fun getMoviesKeywords(movie_id: Int, callback: ConsumeApiResponse<MovieKeywords>) {
        movieApi.getMoviesKeywords(movie_id, callback)
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieReleaseDates>
    ) {
        movieApi.getMoviesReleaseDates(movie_id, callback)
    }

    override fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    ) {
        movieApi.getMoviesVideos(movie_id, language, callback)
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieTranslations>
    ) {
        movieApi.getMoviesTranslations(movie_id, callback)
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    ) {
        movieApi.getMoviesRecommendations(movie_id, language, page, callback)
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    ) {
        movieApi.getMoviesSimilarMovies(movie_id, language, page, callback)
    }

    override fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    ) {
        movieApi.getMoviesReviews(movie_id, language, page, callback)
    }

    override fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    ) {
        movieApi.getMoviesLists(movie_id, language, page, callback)
    }

    override fun getMoviesLatest(language: String?, callback: ConsumeApiResponse<MovieLatest>) {
        movieApi.getMoviesLatest(language, callback)
    }

    override fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieNowPlayings>
    ) {
        movieApi.getMoviesNowPlaying(
            language,
            page,
            region, callback
        )
    }

    override fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MoviePopulars>
    ) {
        movieApi.getMoviesPopular(
            language,
            page,
            region, callback
        )
    }

    override fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieTopRated>
    ) {
        movieApi.getMoviesTopRated(
            language,
            page,
            region, callback
        )
    }

    override fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieUpcoming>
    ) {
        movieApi.getMoviesUpcoming(
            language,
            page,
            region, callback
        )
    }

    override fun getTrendingAllDay(callback: ConsumeApiResponse<Trending<TrendingAll>>) {
        movieApi.getTrendingAllDay(callback)
    }

    override fun getTrendingAllWeek(callback: ConsumeApiResponse<Trending<TrendingAll>>) {
        movieApi.getTrendingAllWeek(callback)
    }

    override fun getTrendingMovieDay(callback: ConsumeApiResponse<Trending<TrendingMovie>>) {
        movieApi.getTrendingMovieDay(callback)
    }

    override fun getTrendingMovieWeek(callback: ConsumeApiResponse<Trending<TrendingMovie>>) {
        movieApi.getTrendingMovieWeek(callback)
    }

    override fun getTrendingPersonDay(callback: ConsumeApiResponse<Trending<TrendingPerson>>) {
        movieApi.getTrendingPersonDay(callback)
    }

    override fun getTrendingPersonWeek(callback: ConsumeApiResponse<Trending<TrendingPerson>>) {
        movieApi.getTrendingPersonWeek(callback)
    }

    override fun getTrendingTvDay(callback: ConsumeApiResponse<Trending<TrendingTv>>) {
        movieApi.getTrendingTvDay(callback)
    }

    override fun getTrendingTvWeek(callback: ConsumeApiResponse<Trending<TrendingTv>>) {
        movieApi.getTrendingTvWeek(callback)
    }

    override fun getReviews(review_id: String, callback: ConsumeApiResponse<Reviews>) {
        movieApi.getReviews(review_id, callback)
    }

    override fun getNetworkDetail(network_id: Int, callback: ConsumeApiResponse<NetworkDetail>) {
        movieApi.getNetworkDetail(
            network_id, callback
        )
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        callback: ConsumeApiResponse<NetworkAlternativeName>
    ) {
        movieApi.getNetworkAlternativeName(
            network_id, callback
        )
    }

    override fun getNetworkImage(network_id: Int, callback: ConsumeApiResponse<NetworkImage>) {
        movieApi.getNetworkImage(
            network_id, callback
        )
    }

    override fun searchCompanies(
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    ) {
        movieApi.searchCompanies(
            query,
            page, callback
        )
    }

    override fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    ) {
        movieApi.searchCollections(
            query, language,
            page, callback
        )
    }

    override fun searchKeywords(
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
    ) {
        movieApi.searchKeywords(
            query,
            page, callback
        )
    }

    override fun searchMovies(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        movieApi.searchMovies(
            query, language,
            page,
            include_adult,
            region,
            year,
            primary_release_year, callback
        )
    }

    override fun searchMultiSearch(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchMulti>
    ) {
        movieApi.searchMultiSearch(
            query, language,
            page,
            include_adult,
            region, callback
        )
    }

    override fun searchPeople(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchPeople>
    ) {
        movieApi.searchPeople(query, language, page, include_adult, region, callback)
    }

    override fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        movieApi.searchTvShows(query, language, page, include_adult, first_air_date_year, callback)
    }

    override fun getTvDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    ) {
        movieApi.getTvDetails(tv_id, language, append_to_response, callback)
    }

    override fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    ) {
        movieApi.getTvAccountStates(
            tv_id, language,
            guest_session_id,
            session_id, callback
        )
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    ) {
        movieApi.getTvAlternativeTitles(
            tv_id, language, callback
        )
    }

    override fun getTvChanges(
        tv_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvChanges>
    ) {
        movieApi.getTvChanges(
            tv_id,

            startDate,
            endDate,
            page, callback
        )
    }

    override fun getTvContentRatings(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    ) {
        movieApi.getTvContentRatings(
            tv_id, language, callback
        )
    }

    override fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    ) {
        movieApi.getTvCredits(
            tv_id, language, callback
        )
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    ) {
        movieApi.getTvEpisodeGroups(
            tv_id, language, callback
        )
    }

    override fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    ) {
        movieApi.getTvExternalIds(
            tv_id, language, callback
        )
    }

    override fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    ) {
        movieApi.getTvImages(
            tv_id, language, callback
        )
    }

    override fun getTvKeyword(tv_id: Int, callback: ConsumeApiResponse<TvKeywords>) {
        movieApi.getTvKeyword(
            tv_id, callback
        )
    }

    override fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    ) {
        movieApi.getTvRecommendations(
            tv_id, language,
            page, callback
        )
    }

    override fun getTvReviews(tv_id: Int, callback: ConsumeApiResponse<TvReviews>) {
        movieApi.getTvReviews(
            tv_id, callback
        )
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    ) {
        movieApi.getTvScreenedTheatrically(
            tv_id, callback
        )
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    ) {
        movieApi.getTvSimilarTvShows(
            tv_id, language,
            page, callback
        )
    }

    override fun getTvTranslations(tv_id: Int, callback: ConsumeApiResponse<TvTranslations>) {
        movieApi.getTvTranslations(
            tv_id, callback
        )
    }

    override fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    ) {
        movieApi.getTvVideos(
            tv_id, language, callback
        )
    }

    override fun getTvLatest(language: String?, callback: ConsumeApiResponse<TvLatest>) {
        movieApi.getTvLatest(language, callback)
    }

    override fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    ) {
        movieApi.getTvAiringToday(
            language,
            page, callback
        )
    }

    override fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    ) {
        movieApi.getTvOnTheAir(
            language,
            page, callback
        )
    }

    override fun getTvPopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    ) {
        movieApi.getTvPopular(
            language,
            page, callback
        )
    }

    override fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
    ) {
        movieApi.getTvTopRated(
            language,
            page, callback
        )
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvSeasonsDetails>
    ) {
        movieApi.getTvSeasonsDetails(
            tv_id,
            season_number, language,
            append_to_response, callback
        )
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSeasonsChanges>
    ) {
        movieApi.getTvSeasonsChanges(
            season_id,
            startDate,
            endDate,
            page, callback
        )
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvSeasonsAccountStates>
    ) {
        movieApi.getTvSeasonsAccountStates(
            tv_id,
            season_number, language,
            guest_session_id,
            session_id, callback
        )
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsCredits>
    ) {
        movieApi.getTvSeasonsCredits(tv_id, season_number, language, callback)
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsExternalIds>
    ) {
        movieApi.getTvSeasonsExternalIds(tv_id, season_number, language, callback)
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsImages>
    ) {
        movieApi.getTvSeasonsImages(tv_id, season_number, language, callback)
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsVideos>
    ) {
        movieApi.getTvSeasonsVideos(
            tv_id,
            season_number, language, callback
        )
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvEpisodeDetails>
    ) {
        movieApi.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number, language,
            append_to_response, callback
        )
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvEpisodeChanges>
    ) {
        movieApi.getTvEpisodeChanges(
            episode_id,
            startDate,
            endDate,
            page, callback
        )
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvEpisodeAccountStates>
    ) {
        movieApi.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,

            guest_session_id,
            session_id, callback
        )
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeCredits>
    ) {
        movieApi.getTvEpisodeCredits(
            tv_id,
            season_number,
            episode_number, callback
        )
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeExternalIds>
    ) {
        movieApi.getTvEpisodeExternalIds(
            tv_id,
            season_number,
            episode_number, callback
        )
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeImages>
    ) {
        movieApi.getTvEpisodeImages(
            tv_id,
            season_number,
            episode_number, callback
        )
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeTranslation>
    ) {
        movieApi.getTvEpisodeTranslations(
            tv_id,
            season_number,
            episode_number, callback
        )
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    ) {
        movieApi.getTvEpisodeVideos(tv_id, season_number, episode_number, language, callback)
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroupsDetails>
    ) {
        movieApi.getTvEpisodeGroupsDetails(id, language, callback)
    }

    override fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    ) {
        movieApi.getPeopleDetails(person_id, language, callback)
    }

    override fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    ) {
        movieApi.getPeopleChanges(person_id, endDate, page, startDate, callback)
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    ) {
        movieApi.getPeopleMovieCredits(person_id, language, callback)
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    ) {
        movieApi.getPeopleTvCredits(person_id, language, callback)
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    ) {
        movieApi.getPeopleCombinedCredits(person_id, language, callback)
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    ) {
        movieApi.getPeopleExternalIds(person_id, language, callback)
    }

    override fun getPeopleImages(person_id: Int, callback: ConsumeApiResponse<PeopleImages>) {
        movieApi.getPeopleImages(person_id, callback)
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    ) {
        movieApi.getPeopleTaggedImages(person_id, language, page, callback)
    }

    override fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    ) {
        movieApi.getPeopleTranslations(person_id, language, callback)
    }

    override fun getPeopleLatest(language: String?, callback: ConsumeApiResponse<PeopleLatest>) {
        movieApi.getPeopleLatest(language, callback)
    }

    override fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    ) {
        movieApi.getPeoplePopular(language, page, callback)
    }

}