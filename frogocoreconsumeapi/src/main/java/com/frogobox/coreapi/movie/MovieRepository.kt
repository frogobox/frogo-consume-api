package com.frogobox.coreapi.movie

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*
import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.source.FrogoApiClient
import io.reactivex.rxjava3.core.Scheduler
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
 * com.frogobox.frogoconsumeapi.movie.data.source
 *
 */
object MovieRepository : MovieDataSource {

    private val TAG = MovieRepository::class.java.simpleName
    private var movieApiService = FrogoApiClient.create<MovieApiService>(MovieUrl.BASE_URL)

    // Switch For Using Chuck Interceptor
    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        movieApiService =
            FrogoApiClient.createWithInterceptor(MovieUrl.BASE_URL, chuckerInterceptor)
    }

    override fun getMovieCertifications(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<Certifications<CertificationMovie>>
    ) {
        if (scheduler != null) {
            movieApiService.getMovieCertifications(apiKey).doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getMovieCertifications(apiKey).doApiRequest(null, callback) {}
        }
    }

    override fun getTvCertifications(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<Certifications<CertificationTv>>
    ) {
        movieApiService.getTvCertifications(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getMovieChangeList(
        scheduler: Scheduler?,
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieApiService.getMovieChangeList(apiKey, endDate, startDate, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvChangeList(
        scheduler: Scheduler?,
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieApiService.getTvChangeList(apiKey, endDate, startDate, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPersonChangeList(
        scheduler: Scheduler?,
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<Changes>
    ) {
        movieApiService.getPersonChangeList(apiKey, endDate, startDate, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getCollectionDetails(
        collection_id: Int,
        scheduler: Scheduler?,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<CollectionsDetail>
    ) {
        movieApiService.getCollectionDetails(collection_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getCollectionImages(
        collection_id: Int,
        scheduler: Scheduler?,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<CollectionsImage>
    ) {
        movieApiService.getCollectionImages(collection_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        scheduler: Scheduler?,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<CollectionsTranslation>
    ) {
        movieApiService.getCollectionTranslations(collection_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getCompaniesDetails(
        company_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<CompaniesDetail>
    ) {
        movieApiService.getCompaniesDetails(company_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<CompaniesAlternateName>
    ) {
        movieApiService.getCompaniesAlternativeName(company_id, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getCompaniesImage(
        company_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<CompaniesImage>
    ) {
        movieApiService.getCompaniesImage(company_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getConfigurationApi(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<ConfigurationApi>
    ) {
        movieApiService.getConfigurationApi(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getConfigurationCountries(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<List<ConfigurationCountry>>
    ) {
        movieApiService.getConfigurationCountries(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getConfigurationJobs(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<List<ConfigurationJob>>
    ) {
        movieApiService.getConfigurationJobs(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getConfigurationLanguages(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<List<ConfigurationLanguage>>
    ) {
        movieApiService.getConfigurationLanguages(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getConfigurationTranslations(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<List<String>>
    ) {
        movieApiService.getConfigurationTranslations(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getConfigurationTimezones(
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<List<ConfigurationTimezone>>
    ) {
        movieApiService.getConfigurationTimezones(apiKey).doApiRequest(scheduler, callback) {}

    }

    override fun getCreditsDetails(
        credit_id: String,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<Credits>
    ) {
        movieApiService.getCreditsDetails(credit_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getDiscoverMovie(
        scheduler: Scheduler?, apiKey: String,
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

        movieApiService.getDiscoverMovie(
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
            with_original_language
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getDiscoverTv(
        scheduler: Scheduler?, apiKey: String,
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
        movieApiService.getDiscoverTv(
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
            with_keywords
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getFindById(
        external_id: String,
        scheduler: Scheduler?, apiKey: String,
        external_source: String,
        language: String?,
        callback: FrogoDataResponse<Find>
    ) {
        movieApiService.getFindById(external_id, apiKey, external_source, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getGenresMovie(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<Genres>
    ) {
        movieApiService.getGenresMovie(apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getGenresTv(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<Genres>
    ) {
        movieApiService.getGenresTv(apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<KeywordsDetail>
    ) {
        movieApiService.getKeywordsDetail(keyword_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: FrogoDataResponse<KeywordsMovies>
    ) {
        movieApiService.getKeywordsMovie(keyword_id, apiKey, language, include_adult)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesDetails(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<MovieDetail>
    ) {
        movieApiService.getMoviesDetails(movie_id, apiKey, language, append_to_response)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: FrogoDataResponse<MovieAccountState>
    ) {
        movieApiService.getMoviesAccountState(movie_id, apiKey, session_id, guest_session_id)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        country: String?,
        callback: FrogoDataResponse<MovieAlternativeTitle>
    ) {
        movieApiService.getMoviesAlternativeTitles(movie_id, apiKey, country)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesChanges(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieChanges>
    ) {
        movieApiService.getMoviesChanges(movie_id, apiKey, start_date, end_date, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesCredits(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<MovieCredit>
    ) {
        movieApiService.getMoviesCredits(movie_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<MovieExternalId>
    ) {
        movieApiService.getMoviesExternalIds(movie_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesImages(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: FrogoDataResponse<MovieImages>
    ) {
        movieApiService.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<MovieKeywords>
    ) {
        movieApiService.getMoviesKeywords(movie_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<MovieReleaseDates>
    ) {
        movieApiService.getMoviesReleaseDates(movie_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesVideos(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<MovieVideos>
    ) {
        movieApiService.getMoviesVideos(movie_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<MovieTranslations>
    ) {
        movieApiService.getMoviesTranslations(movie_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieRecommendations>
    ) {
        movieApiService.getMoviesRecommendations(movie_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieSimilarMovies>
    ) {
        movieApiService.getMoviesSimilarMovies(movie_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesReviews(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieReviews>
    ) {
        movieApiService.getMoviesReviews(movie_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesLists(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<MovieLists>
    ) {
        movieApiService.getMoviesLists(movie_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesLatest(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<MovieLatest>
    ) {
        movieApiService.getMoviesLatest(apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesNowPlaying(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieNowPlayings>
    ) {
        movieApiService.getMoviesNowPlaying(apiKey, language, page, region)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesPopular(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MoviePopulars>
    ) {
        movieApiService.getMoviesPopular(apiKey, language, page, region)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesTopRated(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieTopRated>
    ) {
        movieApiService.getMoviesTopRated(apiKey, language, page, region)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getMoviesUpcoming(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<MovieUpcoming>
    ) {
        if (scheduler != null) {
            movieApiService.getMoviesUpcoming(apiKey, language, page, region)
                .doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getMoviesUpcoming(apiKey, language, page, region)
                .doApiRequest(null, callback) {}
        }
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<Trending<TrendingAll>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingAll(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getTrendingAll(media_type, time_window, apiKey)
                .doApiRequest(null, callback) {}
        }
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<Trending<TrendingMovie>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingMovie(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getTrendingMovie(media_type, time_window, apiKey)
                .doApiRequest(null, callback) {}
        }
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<Trending<TrendingPerson>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingPerson(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getTrendingPerson(media_type, time_window, apiKey)
                .doApiRequest(null, callback) {}
        }
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<Trending<TrendingTv>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingTv(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getTrendingTv(media_type, time_window, apiKey)
                .doApiRequest(null, callback) {}
        }
    }

    override fun getReviews(
        review_id: String,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<Reviews>
    ) {
        if (scheduler != null) {
            movieApiService.getReviews(review_id, apiKey)
                .doApiRequest(scheduler, callback) {}
        } else {
            movieApiService.getReviews(review_id, apiKey)
                .doApiRequest(null, callback) {}
        }
    }

    override fun getNetworkDetail(
        network_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<NetworkDetail>
    ) {
        movieApiService.getNetworkDetail(network_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<NetworkAlternativeName>
    ) {
        movieApiService.getNetworkAlternativeName(network_id, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getNetworkImage(
        network_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<NetworkImage>
    ) {
        movieApiService.getNetworkImage(network_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun searchCompanies(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchCompanies>
    ) {
        movieApiService.searchCompanies(apiKey, query, page).doApiRequest(scheduler, callback) {}
    }

    override fun searchCollections(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<SearchCollections>
    ) {
        movieApiService.searchCollections(apiKey, query, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchKeywords(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        page: Int?,
        callback: FrogoDataResponse<SearchKeywords>
    ) {
        movieApiService.searchKeywords(apiKey, query, page).doApiRequest(scheduler, callback) {}
    }

    override fun searchMovies(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: FrogoDataResponse<SearchMovies>
    ) {
        movieApiService.searchMovies(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            year,
            primary_release_year
        ).doApiRequest(scheduler, callback) {}
    }

    override fun searchMultiSearch(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<SearchMulti>
    ) {
        movieApiService.searchMultiSearch(apiKey, query, language, page, include_adult, region)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchPeople(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<SearchPeople>
    ) {
        movieApiService.searchPeople(apiKey, query, language, page, include_adult, region)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchTvShows(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: FrogoDataResponse<SearchMovies>
    ) {
        movieApiService.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getTvDetails(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvDetails>
    ) {
        movieApiService.getTvDetails(tv_id, apiKey, language, append_to_response)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvAccountStates(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvAccountStates>
    ) {
        movieApiService.getTvAccountStates(tv_id, apiKey, language, guest_session_id, session_id)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvAlternativeTitles>
    ) {
        movieApiService.getTvAlternativeTitles(tv_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvChanges(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvChanges>
    ) {
        movieApiService.getTvChanges(tv_id, apiKey, startDate, endDate, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvContentRatings(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvContentRatings>
    ) {
        movieApiService.getTvContentRatings(tv_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvCredits(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvCredits>
    ) {
        movieApiService.getTvCredits(tv_id, apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroups>
    ) {
        movieApiService.getTvEpisodeGroups(tv_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvExternalIds(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvExternalIds>
    ) {
        movieApiService.getTvExternalIds(tv_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvImages(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvImages>
    ) {
        movieApiService.getTvImages(tv_id, apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getTvKeyword(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvKeywords>
    ) {
        movieApiService.getTvKeyword(tv_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getTvRecommendations(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvRecommendations>
    ) {
        movieApiService.getTvRecommendations(tv_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvReviews(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvReviews>
    ) {
        movieApiService.getTvReviews(tv_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvScreenedTheatrically>
    ) {
        movieApiService.getTvScreenedTheatrically(tv_id, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSimilarTVShows>
    ) {
        movieApiService.getTvSimilarTvShows(tv_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvTranslations(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvTranslations>
    ) {
        movieApiService.getTvTranslations(tv_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getTvVideos(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvVideos>
    ) {
        movieApiService.getTvVideos(tv_id, apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getTvLatest(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvLatest>
    ) {
        movieApiService.getTvLatest(apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getTvAiringToday(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvAiringToday>
    ) {
        movieApiService.getTvAiringToday(apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvOnTheAir(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvOnTheAir>
    ) {
        movieApiService.getTvOnTheAir(apiKey, language, page).doApiRequest(scheduler, callback) {}
    }

    override fun getTvPopular(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvPopular>
    ) {
        movieApiService.getTvPopular(apiKey, language, page).doApiRequest(scheduler, callback) {}
    }

    override fun getTvTopRated(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<TvTopRated>
    ) {
        movieApiService.getTvTopRated(apiKey, language, page).doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvSeasonsDetails>
    ) {
        movieApiService.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        scheduler: Scheduler?, apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvSeasonsChanges>
    ) {
        movieApiService.getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvSeasonsAccountStates>
    ) {
        movieApiService.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsCredits>
    ) {
        movieApiService.getTvSeasonsCredits(tv_id, season_number, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsExternalIds>
    ) {
        movieApiService.getTvSeasonsExternalIds(tv_id, season_number, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsImages>
    ) {
        movieApiService.getTvSeasonsImages(tv_id, season_number, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvSeasonsVideos>
    ) {
        movieApiService.getTvSeasonsVideos(tv_id, season_number, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<TvEpisodeDetails>
    ) {
        movieApiService.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        scheduler: Scheduler?, apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<TvEpisodeChanges>
    ) {
        movieApiService.getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<TvEpisodeAccountStates>
    ) {
        movieApiService.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id
        ).doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvEpisodeCredits>
    ) {
        movieApiService.getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvEpisodeExternalIds>
    ) {
        movieApiService.getTvEpisodeExternalIds(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvEpisodeImages>
    ) {
        movieApiService.getTvEpisodeImages(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<TvEpisodeTranslation>
    ) {
        movieApiService.getTvEpisodeTranslations(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeVideos>
    ) {
        movieApiService.getTvEpisodeVideos(tv_id, season_number, episode_number, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<TvEpisodeGroupsDetails>
    ) {
        movieApiService.getTvEpisodeGroupsDetails(id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleDetails(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleDetails>
    ) {
        movieApiService.getPeopleDetails(person_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleChanges(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: FrogoDataResponse<PeopleChanges>
    ) {
        movieApiService.getPeopleChanges(person_id, apiKey, endDate, page, startDate)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleMovieCredits>
    ) {
        movieApiService.getPeopleMovieCredits(person_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleTvCredits>
    ) {
        movieApiService.getPeopleTvCredits(person_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleCombinedCredits>
    ) {
        movieApiService.getPeopleCombinedCredits(person_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleExternalIds>
    ) {
        movieApiService.getPeopleExternalIds(person_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleImages(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: FrogoDataResponse<PeopleImages>
    ) {
        movieApiService.getPeopleImages(person_id, apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeopleTaggedImages>
    ) {
        movieApiService.getPeopleTaggedImages(person_id, apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleTranslations(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleTranslations>
    ) {
        movieApiService.getPeopleTranslations(person_id, apiKey, language)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getPeopleLatest(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: FrogoDataResponse<PeopleLatest>
    ) {
        movieApiService.getPeopleLatest(apiKey, language).doApiRequest(scheduler, callback) {}
    }

    override fun getPeoplePopular(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<PeoplePopular>
    ) {
        movieApiService.getPeoplePopular(apiKey, language, page)
            .doApiRequest(scheduler, callback) {}
    }
}