package com.frogobox.coreapi.movie

import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*
import com.frogobox.coresdk.response.FrogoDataResponse
import io.reactivex.rxjava3.schedulers.Schedulers
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

class CMovieApi(usingScheduler: Boolean, apiKey: String) : IMovieApi {

    private var movieApi = if (usingScheduler) {
        MovieApi(Schedulers.single(), apiKey)
    } else {
        MovieApi(null, apiKey)
    }

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): IMovieApi {
        return movieApi.usingChuckInterceptor(isDebug, chuckerInterceptor)
    }

    override fun getMovieCertifications(callback: FrogoDataResponse<Certifications<CertificationMovie>>) {
        movieApi.getMovieCertifications(callback)
    }

    override fun getTvCertifications(callback: FrogoDataResponse<Certifications<CertificationTv>>) {
        movieApi.getTvCertifications(callback)
    }

    override fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieApi.getMovieChangeList(endDate, startDate, page, callback)
    }

    override fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieApi.getTvChangeList(endDate, startDate, page, callback)
    }

    override fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieApi.getPersonChangeList(endDate, startDate, page, callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsDetail>
    ) {
        movieApi.getCollectionDetails(collection_id, language, callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsImage>
    ) {
        movieApi.getCollectionImages(
            collection_id, language, callback
        )
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsTranslation>
    ) {
        movieApi.getCollectionTranslations(
            collection_id, language, callback
        )
    }

    override fun getCompaniesDetails(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesDetail>
    ) {
        movieApi.getCompaniesDetails(
            company_id, callback
        )
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesAlternateName>
    ) {
        movieApi.getCompaniesAlternativeName(
            company_id, callback
        )
    }

    override fun getCompaniesImage(company_id: Int, callback: FrogoDataResponse<CompaniesImage>) {
        movieApi.getCompaniesImage(
            company_id, callback
        )
    }

    override fun getConfigurationApi(callback: FrogoDataResponse<ConfigurationApi>) {
        movieApi.getConfigurationApi(callback)
    }

    override fun getConfigurationCountries(callback: FrogoDataResponse<List<ConfigurationCountry>>) {
        movieApi.getConfigurationCountries(callback)
    }

    override fun getConfigurationJobs(callback: FrogoDataResponse<List<ConfigurationJob>>) {
        movieApi.getConfigurationJobs(callback)
    }

    override fun getConfigurationLanguages(callback: FrogoDataResponse<List<ConfigurationLanguage>>) {
        movieApi.getConfigurationLanguages(callback)
    }

    override fun getConfigurationTranslations(callback: FrogoDataResponse<List<String>>) {
        movieApi.getConfigurationTranslations(callback)
    }

    override fun getConfigurationTimezones(callback: FrogoDataResponse<List<ConfigurationTimezone>>) {
        movieApi.getConfigurationTimezones(callback)
    }

    override fun getCreditsDetails(credit_id: String, callback: FrogoDataResponse<Credits>) {
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
        callback: FrogoDataResponse<Discover<DiscoverMovie>>
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
        callback: FrogoDataResponse<Discover<DiscoverTv>>
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
        callback: FrogoDataResponse<Find>
    ) {
        movieApi.getFindById(
            external_id,

            external_source, language, callback
        )
    }

    override fun getGenresMovie(language: String?, callback: FrogoDataResponse<Genres>) {
        movieApi.getGenresMovie(language, callback)
    }

    override fun getGenresTv(language: String?, callback: FrogoDataResponse<Genres>) {
        movieApi.getGenresTv(language, callback)
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: FrogoDataResponse<KeywordsDetail>) {
        movieApi.getKeywordsDetail(
            keyword_id, callback
        )
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: FrogoDataResponse<KeywordsMovies>
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
        callback: FrogoDataResponse<MovieDetail>
    ) {
        movieApi.getMoviesDetails(movie_id, language, append_to_response, callback)
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: FrogoDataResponse<MovieAccountState>
    ) {
        movieApi.getMoviesAccountState(movie_id, session_id, guest_session_id, callback)
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: FrogoDataResponse<MovieAlternativeTitle>
    ) {
        movieApi.getMoviesAlternativeTitles(movie_id, country, callback)
    }

    override fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieChanges>
    ) {
        movieApi.getMoviesChanges(movie_id, start_date, end_date, page, callback)
    }

    override fun getMoviesCredits(movie_id: Int, callback: FrogoDataResponse<MovieCredit>) {
        movieApi.getMoviesCredits(movie_id, callback)
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        callback: FrogoDataResponse<MovieExternalId>
    ) {
        movieApi.getMoviesExternalIds(movie_id, callback)
    }

    override fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: FrogoDataResponse<MovieImages>
    ) {
        movieApi.getMoviesImages(movie_id, language, include_image_language, callback)
    }

    override fun getMoviesKeywords(movie_id: Int, callback: FrogoDataResponse<MovieKeywords>) {
        movieApi.getMoviesKeywords(movie_id, callback)
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        callback: FrogoDataResponse<MovieReleaseDates>
    ) {
        movieApi.getMoviesReleaseDates(movie_id, callback)
    }

    override fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: FrogoDataResponse<MovieVideos>
    ) {
        movieApi.getMoviesVideos(movie_id, language, callback)
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        callback: FrogoDataResponse<MovieTranslations>
    ) {
        movieApi.getMoviesTranslations(movie_id, callback)
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieRecommendations>
    ) {
        movieApi.getMoviesRecommendations(movie_id, language, page, callback)
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieSimilarMovies>
    ) {
        movieApi.getMoviesSimilarMovies(movie_id, language, page, callback)
    }

    override fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieReviews>
    ) {
        movieApi.getMoviesReviews(movie_id, language, page, callback)
    }

    override fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieLists>
    ) {
        movieApi.getMoviesLists(movie_id, language, page, callback)
    }

    override fun getMoviesLatest(language: String?, callback: FrogoDataResponse<MovieLatest>) {
        movieApi.getMoviesLatest(language, callback)
    }

    override fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieNowPlayings>
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
        callback: FrogoDataResponse<MoviePopulars>
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
        callback: FrogoDataResponse<MovieTopRated>
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
        callback: FrogoDataResponse<MovieUpcoming>
    ) {
        movieApi.getMoviesUpcoming(
            language,
            page,
            region, callback
        )
    }

    override fun getTrendingAllDay(callback: FrogoDataResponse<Trending<TrendingAll>>) {
        movieApi.getTrendingAllDay(callback)
    }

    override fun getTrendingAllWeek(callback: FrogoDataResponse<Trending<TrendingAll>>) {
        movieApi.getTrendingAllWeek(callback)
    }

    override fun getTrendingMovieDay(callback: FrogoDataResponse<Trending<TrendingMovie>>) {
        movieApi.getTrendingMovieDay(callback)
    }

    override fun getTrendingMovieWeek(callback: FrogoDataResponse<Trending<TrendingMovie>>) {
        movieApi.getTrendingMovieWeek(callback)
    }

    override fun getTrendingPersonDay(callback: FrogoDataResponse<Trending<TrendingPerson>>) {
        movieApi.getTrendingPersonDay(callback)
    }

    override fun getTrendingPersonWeek(callback: FrogoDataResponse<Trending<TrendingPerson>>) {
        movieApi.getTrendingPersonWeek(callback)
    }

    override fun getTrendingTvDay(callback: FrogoDataResponse<Trending<TrendingTv>>) {
        movieApi.getTrendingTvDay(callback)
    }

    override fun getTrendingTvWeek(callback: FrogoDataResponse<Trending<TrendingTv>>) {
        movieApi.getTrendingTvWeek(callback)
    }

    override fun getReviews(review_id: String, callback: FrogoDataResponse<Reviews>) {
        movieApi.getReviews(review_id, callback)
    }

    override fun getNetworkDetail(network_id: Int, callback: FrogoDataResponse<NetworkDetail>) {
        movieApi.getNetworkDetail(
            network_id, callback
        )
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        callback: FrogoDataResponse<NetworkAlternativeName>
    ) {
        movieApi.getNetworkAlternativeName(
            network_id, callback
        )
    }

    override fun getNetworkImage(network_id: Int, callback: FrogoDataResponse<NetworkImage>) {
        movieApi.getNetworkImage(
            network_id, callback
        )
    }

    override fun searchCompanies(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchCompanies>
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
        callback: FrogoDataResponse<SearchCollections>
    ) {
        movieApi.searchCollections(
            query, language,
            page, callback
        )
    }

    override fun searchKeywords(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchKeywords>
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
        callback: FrogoDataResponse<SearchMovies>
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
        callback: FrogoDataResponse<SearchMulti>
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
        callback: FrogoDataResponse<SearchPeople>
    ) {
        movieApi.searchPeople(query, language, page, include_adult, region, callback)
    }

    override fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: FrogoDataResponse<SearchMovies>
    ) {
        movieApi.searchTvShows(query, language, page, include_adult, first_air_date_year, callback)
    }

    override fun getTvDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvDetails>
    ) {
        movieApi.getTvDetails(tv_id, language, append_to_response, callback)
    }

    override fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvAccountStates>
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
        callback: FrogoDataResponse<TvAlternativeTitles>
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
        callback: FrogoDataResponse<TvChanges>
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
        callback: FrogoDataResponse<TvContentRatings>
    ) {
        movieApi.getTvContentRatings(
            tv_id, language, callback
        )
    }

    override fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvCredits>
    ) {
        movieApi.getTvCredits(
            tv_id, language, callback
        )
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroups>
    ) {
        movieApi.getTvEpisodeGroups(
            tv_id, language, callback
        )
    }

    override fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvExternalIds>
    ) {
        movieApi.getTvExternalIds(
            tv_id, language, callback
        )
    }

    override fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvImages>
    ) {
        movieApi.getTvImages(
            tv_id, language, callback
        )
    }

    override fun getTvKeyword(tv_id: Int, callback: FrogoDataResponse<TvKeywords>) {
        movieApi.getTvKeyword(
            tv_id, callback
        )
    }

    override fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvRecommendations>
    ) {
        movieApi.getTvRecommendations(
            tv_id, language,
            page, callback
        )
    }

    override fun getTvReviews(tv_id: Int, callback: FrogoDataResponse<TvReviews>) {
        movieApi.getTvReviews(
            tv_id, callback
        )
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: FrogoDataResponse<TvScreenedTheatrically>
    ) {
        movieApi.getTvScreenedTheatrically(
            tv_id, callback
        )
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSimilarTVShows>
    ) {
        movieApi.getTvSimilarTvShows(
            tv_id, language,
            page, callback
        )
    }

    override fun getTvTranslations(tv_id: Int, callback: FrogoDataResponse<TvTranslations>) {
        movieApi.getTvTranslations(
            tv_id, callback
        )
    }

    override fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvVideos>
    ) {
        movieApi.getTvVideos(
            tv_id, language, callback
        )
    }

    override fun getTvLatest(language: String?, callback: FrogoDataResponse<TvLatest>) {
        movieApi.getTvLatest(language, callback)
    }

    override fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvAiringToday>
    ) {
        movieApi.getTvAiringToday(
            language,
            page, callback
        )
    }

    override fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvOnTheAir>
    ) {
        movieApi.getTvOnTheAir(
            language,
            page, callback
        )
    }

    override fun getTvPopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvPopular>
    ) {
        movieApi.getTvPopular(
            language,
            page, callback
        )
    }

    override fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvTopRated>
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
        callback: FrogoDataResponse<TvSeasonsDetails>
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
        callback: FrogoDataResponse<TvSeasonsChanges>
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
        callback: FrogoDataResponse<TvSeasonsAccountStates>
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
        callback: FrogoDataResponse<TvSeasonsCredits>
    ) {
        movieApi.getTvSeasonsCredits(
            tv_id,
            season_number, language, callback
        )
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsExternalIds>
    ) {
        movieApi.getTvSeasonsExternalIds(
            tv_id,
            season_number, language, callback
        )
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsImages>
    ) {
        movieApi.getTvSeasonsImages(
            tv_id,
            season_number, language, callback
        )
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsVideos>
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
        callback: FrogoDataResponse<TvEpisodeDetails>
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
        callback: FrogoDataResponse<TvEpisodeChanges>
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
        callback: FrogoDataResponse<TvEpisodeAccountStates>
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
        callback: FrogoDataResponse<TvEpisodeCredits>
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
        callback: FrogoDataResponse<TvEpisodeExternalIds>
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
        callback: FrogoDataResponse<TvEpisodeImages>
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
        callback: FrogoDataResponse<TvEpisodeTranslation>
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
        callback: FrogoDataResponse<TvEpisodeVideos>
    ) {
        movieApi.getTvEpisodeVideos(tv_id, season_number, episode_number, language, callback)
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroupsDetails>
    ) {
        movieApi.getTvEpisodeGroupsDetails(id, language, callback)
    }

    override fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleDetails>
    ) {
        movieApi.getPeopleDetails(person_id, language, callback)
    }

    override fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: FrogoDataResponse<PeopleChanges>
    ) {
        movieApi.getPeopleChanges(person_id, endDate, page, startDate, callback)
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleMovieCredits>
    ) {
        movieApi.getPeopleMovieCredits(person_id, language, callback)
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleTvCredits>
    ) {
        movieApi.getPeopleTvCredits(person_id, language, callback)
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleCombinedCredits>
    ) {
        movieApi.getPeopleCombinedCredits(person_id, language, callback)
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleExternalIds>
    ) {
        movieApi.getPeopleExternalIds(person_id, language, callback)
    }

    override fun getPeopleImages(person_id: Int, callback: FrogoDataResponse<PeopleImages>) {
        movieApi.getPeopleImages(person_id, callback)
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeopleTaggedImages>
    ) {
        movieApi.getPeopleTaggedImages(person_id, language, page, callback)
    }

    override fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleTranslations>
    ) {
        movieApi.getPeopleTranslations(person_id, language, callback)
    }

    override fun getPeopleLatest(language: String?, callback: FrogoDataResponse<PeopleLatest>) {
        movieApi.getPeopleLatest(language, callback)
    }

    override fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeoplePopular>
    ) {
        movieApi.getPeoplePopular(language, page, callback)
    }

}