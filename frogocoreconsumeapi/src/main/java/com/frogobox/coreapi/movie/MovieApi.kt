package com.frogobox.coreapi.movie

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*
import io.reactivex.rxjava3.core.Scheduler
import okhttp3.Interceptor


/*
 * Created by faisalamir on 07/04/22
 * FrogoConsumeApi
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : MMfaisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

class MovieApi(
    private val scheduler: Scheduler?,
    private val apiKey: String
) : IMovieApi {

    private val movieRepository = MovieRepository

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        movieRepository.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun getMovieCertifications(callback: FrogoDataResponse<Certifications<CertificationMovie>>) {
        movieRepository.getMovieCertifications(
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvCertifications(callback: FrogoDataResponse<Certifications<CertificationTv>>) {
        movieRepository.getTvCertifications(
            scheduler, apiKey,
            callback
        )
    }

    override fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieRepository.getMovieChangeList(
            scheduler, apiKey,
            endDate,
            startDate,
            page,
            callback
        )
    }

    override fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieRepository.getTvChangeList(
            scheduler, apiKey,
            endDate,
            startDate,
            page,
            callback
        )
    }

    override fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieRepository.getPersonChangeList(
            scheduler, apiKey,
            endDate,
            startDate,
            page,
            callback
        )
    }

    override fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsDetail>
    ) {
        movieRepository.getCollectionDetails(
            collection_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsImage>
    ) {
        movieRepository.getCollectionImages(
            collection_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<CollectionsTranslation>
    ) {
        movieRepository.getCollectionTranslations(
            collection_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getCompaniesDetails(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesDetail>
    ) {
        movieRepository.getCompaniesDetails(
            company_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        callback: FrogoDataResponse<CompaniesAlternateName>
    ) {
        movieRepository.getCompaniesAlternativeName(
            company_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getCompaniesImage(company_id: Int, callback: FrogoDataResponse<CompaniesImage>) {
        movieRepository.getCompaniesImage(
            company_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getConfigurationApi(callback: FrogoDataResponse<ConfigurationApi>) {
        movieRepository.getConfigurationApi(
            scheduler, apiKey,
            callback
        )
    }

    override fun getConfigurationCountries(callback: FrogoDataResponse<List<ConfigurationCountry>>) {
        movieRepository.getConfigurationCountries(
            scheduler, apiKey,
            callback
        )
    }

    override fun getConfigurationJobs(callback: FrogoDataResponse<List<ConfigurationJob>>) {
        movieRepository.getConfigurationJobs(
            scheduler, apiKey,
            callback
        )
    }

    override fun getConfigurationLanguages(callback: FrogoDataResponse<List<ConfigurationLanguage>>) {
        movieRepository.getConfigurationLanguages(
            scheduler, apiKey,
            callback
        )
    }

    override fun getConfigurationTranslations(callback: FrogoDataResponse<List<String>>) {
        movieRepository.getConfigurationTranslations(
            scheduler, apiKey,
            callback
        )
    }

    override fun getConfigurationTimezones(callback: FrogoDataResponse<List<ConfigurationTimezone>>) {
        movieRepository.getConfigurationTimezones(
            scheduler, apiKey,
            callback
        )
    }

    override fun getCreditsDetails(credit_id: String, callback: FrogoDataResponse<Credits>) {
        movieRepository.getCreditsDetails(
            credit_id,
            scheduler, apiKey,
            callback
        )
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
        movieRepository.getDiscoverMovie(
            scheduler, apiKey,
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
        movieRepository.getDiscoverTv(
            scheduler, apiKey, language,
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
        external_source: String,
        language: String?,
        callback: FrogoDataResponse<Find>
    ) {
        movieRepository.getFindById(
            external_id,
            scheduler, apiKey,
            external_source,
            language,
            callback
        )
    }

    override fun getGenresMovie(language: String?, callback: FrogoDataResponse<Genres>) {
        movieRepository.getGenresMovie(
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getGenresTv(language: String?, callback: FrogoDataResponse<Genres>) {
        movieRepository.getGenresTv(
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: FrogoDataResponse<KeywordsDetail>) {
        movieRepository.getKeywordsDetail(
            keyword_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: FrogoDataResponse<KeywordsMovies>
    ) {
        movieRepository.getKeywordsMovie(
            keyword_id,
            scheduler, apiKey,
            language,
            include_adult,
            callback
        )
    }

    override fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<MovieDetail>
    ) {
        movieRepository.getMoviesDetails(
            movie_id,
            scheduler, apiKey,
            language,
            append_to_response,
            callback
        )
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: FrogoDataResponse<MovieAccountState>
    ) {
        movieRepository.getMoviesAccountState(
            movie_id,
            scheduler, apiKey,
            session_id,
            guest_session_id,
            callback
        )
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: FrogoDataResponse<MovieAlternativeTitle>
    ) {
        movieRepository.getMoviesAlternativeTitles(
            movie_id,
            scheduler, apiKey,
            country,
            callback
        )
    }

    override fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieChanges>
    ) {
        movieRepository.getMoviesChanges(
            movie_id,
            scheduler, apiKey,
            start_date,
            end_date,
            page,
            callback
        )
    }

    override fun getMoviesCredits(movie_id: Int, callback: FrogoDataResponse<MovieCredit>) {
        movieRepository.getMoviesCredits(
            movie_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        callback: FrogoDataResponse<MovieExternalId>
    ) {
        movieRepository.getMoviesExternalIds(
            movie_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: FrogoDataResponse<MovieImages>
    ) {
        movieRepository.getMoviesImages(
            movie_id,
            scheduler, apiKey,
            language,
            include_image_language,
            callback
        )
    }

    override fun getMoviesKeywords(movie_id: Int, callback: FrogoDataResponse<MovieKeywords>) {
        movieRepository.getMoviesKeywords(
            movie_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        callback: FrogoDataResponse<MovieReleaseDates>
    ) {
        movieRepository.getMoviesReleaseDates(
            movie_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: FrogoDataResponse<MovieVideos>
    ) {
        movieRepository.getMoviesVideos(
            movie_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        callback: FrogoDataResponse<MovieTranslations>
    ) {
        movieRepository.getMoviesTranslations(
            movie_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieRecommendations>
    ) {
        movieRepository.getMoviesRecommendations(
            movie_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieSimilarMovies>
    ) {
        movieRepository.getMoviesSimilarMovies(
            movie_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieReviews>
    ) {
        movieRepository.getMoviesReviews(
            movie_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieLists>
    ) {
        movieRepository.getMoviesLists(
            movie_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getMoviesLatest(language: String?, callback: FrogoDataResponse<MovieLatest>) {
        movieRepository.getMoviesLatest(
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieNowPlayings>
    ) {
        movieRepository.getMoviesNowPlaying(
            scheduler, apiKey,
            language,
            page,
            region,
            callback
        )
    }

    override fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MoviePopulars>
    ) {
        movieRepository.getMoviesPopular(
            scheduler, apiKey,
            language,
            page,
            region,
            callback
        )
    }

    override fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieTopRated>
    ) {
        movieRepository.getMoviesTopRated(
            scheduler, apiKey,
            language,
            page,
            region,
            callback
        )
    }

    override fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieUpcoming>
    ) {
        movieRepository.getMoviesUpcoming(
            scheduler, apiKey,
            language,
            page,
            region,
            callback
        )
    }

    override fun getTrendingAllDay(callback: FrogoDataResponse<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingAllWeek(callback: FrogoDataResponse<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingMovieDay(callback: FrogoDataResponse<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingMovieWeek(callback: FrogoDataResponse<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingPersonDay(callback: FrogoDataResponse<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingPersonWeek(callback: FrogoDataResponse<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingTvDay(callback: FrogoDataResponse<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTrendingTvWeek(callback: FrogoDataResponse<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            callback
        )
    }

    override fun getReviews(review_id: String, callback: FrogoDataResponse<Reviews>) {
        movieRepository.getReviews(
            review_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getNetworkDetail(network_id: Int, callback: FrogoDataResponse<NetworkDetail>) {
        movieRepository.getNetworkDetail(
            network_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        callback: FrogoDataResponse<NetworkAlternativeName>
    ) {
        movieRepository.getNetworkAlternativeName(
            network_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getNetworkImage(network_id: Int, callback: FrogoDataResponse<NetworkImage>) {
        movieRepository.getNetworkImage(
            network_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun searchCompanies(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchCompanies>
    ) {
        movieRepository.searchCompanies(
            scheduler, apiKey,
            query,
            page,
            callback
        )
    }

    override fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<SearchCollections>
    ) {
        movieRepository.searchCollections(
            scheduler, apiKey,
            query,
            language,
            page,
            callback
        )
    }

    override fun searchKeywords(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchKeywords>
    ) {
        movieRepository.searchKeywords(
            scheduler, apiKey,
            query,
            page,
            callback
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
        movieRepository.searchMovies(
            scheduler, apiKey,
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
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<SearchMulti>
    ) {
        movieRepository.searchMultiSearch(
            scheduler, apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            callback
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
        movieRepository.searchPeople(
            scheduler, apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            callback
        )
    }

    override fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: FrogoDataResponse<SearchMovies>
    ) {
        movieRepository.searchTvShows(
            scheduler, apiKey,
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
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvDetails>
    ) {
        movieRepository.getTvDetails(
            tv_id,
            scheduler, apiKey,
            language,
            append_to_response,
            callback
        )
    }

    override fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvAccountStates>
    ) {
        movieRepository.getTvAccountStates(
            tv_id,
            scheduler, apiKey,
            language,
            guest_session_id,
            session_id,
            callback
        )
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvAlternativeTitles>
    ) {
        movieRepository.getTvAlternativeTitles(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvChanges(
        tv_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvChanges>
    ) {
        movieRepository.getTvChanges(
            tv_id,
            scheduler, apiKey,
            startDate,
            endDate,
            page,
            callback
        )
    }

    override fun getTvContentRatings(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvContentRatings>
    ) {
        movieRepository.getTvContentRatings(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvCredits>
    ) {
        movieRepository.getTvCredits(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroups>
    ) {
        movieRepository.getTvEpisodeGroups(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvExternalIds>
    ) {
        movieRepository.getTvExternalIds(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvImages>
    ) {
        movieRepository.getTvImages(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvKeyword(tv_id: Int, callback: FrogoDataResponse<TvKeywords>) {
        movieRepository.getTvKeyword(
            tv_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvRecommendations>
    ) {
        movieRepository.getTvRecommendations(
            tv_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getTvReviews(tv_id: Int, callback: FrogoDataResponse<TvReviews>) {
        movieRepository.getTvReviews(
            tv_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: FrogoDataResponse<TvScreenedTheatrically>
    ) {
        movieRepository.getTvScreenedTheatrically(
            tv_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSimilarTVShows>
    ) {
        movieRepository.getTvSimilarTvShows(
            tv_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getTvTranslations(tv_id: Int, callback: FrogoDataResponse<TvTranslations>) {
        movieRepository.getTvTranslations(
            tv_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<TvVideos>
    ) {
        movieRepository.getTvVideos(
            tv_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvLatest(language: String?, callback: FrogoDataResponse<TvLatest>) {
        movieRepository.getTvLatest(
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvAiringToday>
    ) {
        movieRepository.getTvAiringToday(
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvOnTheAir>
    ) {
        movieRepository.getTvOnTheAir(
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getTvPopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvPopular>
    ) {
        movieRepository.getTvPopular(
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvTopRated>
    ) {
        movieRepository.getTvTopRated(
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvSeasonsDetails>
    ) {
        movieRepository.getTvSeasonsDetails(
            tv_id,
            season_number,
            scheduler, apiKey,
            language,
            append_to_response,
            callback
        )
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSeasonsChanges>
    ) {
        movieRepository.getTvSeasonsChanges(
            season_id,
            scheduler, apiKey,
            startDate,
            endDate,
            page,
            callback
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
        movieRepository.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            scheduler, apiKey,
            language,
            guest_session_id,
            session_id,
            callback
        )
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsCredits>
    ) {
        movieRepository.getTvSeasonsCredits(
            tv_id,
            season_number,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsExternalIds>
    ) {
        movieRepository.getTvSeasonsExternalIds(
            tv_id,
            season_number,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsImages>
    ) {
        movieRepository.getTvSeasonsImages(
            tv_id,
            season_number,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsVideos>
    ) {
        movieRepository.getTvSeasonsVideos(
            tv_id,
            season_number,
            scheduler, apiKey,
            language,
            callback
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
        movieRepository.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            language,
            append_to_response,
            callback
        )
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvEpisodeChanges>
    ) {
        movieRepository.getTvEpisodeChanges(
            episode_id,
            scheduler, apiKey,
            startDate,
            endDate,
            page,
            callback
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
        movieRepository.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            guest_session_id,
            session_id,
            callback
        )
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeCredits>
    ) {
        movieRepository.getTvEpisodeCredits(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeExternalIds>
    ) {
        movieRepository.getTvEpisodeExternalIds(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeImages>
    ) {
        movieRepository.getTvEpisodeImages(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<TvEpisodeTranslation>
    ) {
        movieRepository.getTvEpisodeTranslations(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeVideos>
    ) {
        movieRepository.getTvEpisodeVideos(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroupsDetails>
    ) {
        movieRepository.getTvEpisodeGroupsDetails(
            id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleDetails>
    ) {
        movieRepository.getPeopleDetails(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: FrogoDataResponse<PeopleChanges>
    ) {
        movieRepository.getPeopleChanges(
            person_id,
            scheduler, apiKey,
            endDate,
            page,
            startDate,
            callback
        )
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleMovieCredits>
    ) {
        movieRepository.getPeopleMovieCredits(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleTvCredits>
    ) {
        movieRepository.getPeopleTvCredits(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleCombinedCredits>
    ) {
        movieRepository.getPeopleCombinedCredits(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleExternalIds>
    ) {
        movieRepository.getPeopleExternalIds(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleImages(person_id: Int, callback: FrogoDataResponse<PeopleImages>) {
        movieRepository.getPeopleImages(
            person_id,
            scheduler, apiKey,
            callback
        )
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeopleTaggedImages>
    ) {
        movieRepository.getPeopleTaggedImages(
            person_id,
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }

    override fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<PeopleTranslations>
    ) {
        movieRepository.getPeopleTranslations(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleLatest(language: String?, callback: FrogoDataResponse<PeopleLatest>) {
        movieRepository.getPeopleLatest(
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeoplePopular>
    ) {
        movieRepository.getPeoplePopular(
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }
}