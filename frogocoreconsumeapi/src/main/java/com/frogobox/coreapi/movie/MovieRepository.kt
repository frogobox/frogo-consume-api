package com.frogobox.coreapi.movie

import com.frogobox.coreapi.ConsumeApiResponse
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
        callback: ConsumeApiResponse<Certifications<CertificationMovie>>
    ) {
        if (scheduler != null) {
            movieApiService.getMovieCertifications(apiKey).doApiRequest(scheduler, callback)
        } else {
            movieApiService.getMovieCertifications(apiKey).doApiRequest(callback)
        }
    }

    override fun getTvCertifications(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<Certifications<CertificationTv>>
    ) {
        movieApiService.getTvCertifications(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMovieChangeList(
        scheduler: Scheduler?,
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApiService.getMovieChangeList(apiKey, endDate, startDate, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvChangeList(
        scheduler: Scheduler?,
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApiService.getTvChangeList(apiKey, endDate, startDate, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPersonChangeList(
        scheduler: Scheduler?,
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApiService.getPersonChangeList(apiKey, endDate, startDate, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getCollectionDetails(
        collection_id: Int,
        scheduler: Scheduler?,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    ) {
        movieApiService.getCollectionDetails(collection_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getCollectionImages(
        collection_id: Int,
        scheduler: Scheduler?,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    ) {
        movieApiService.getCollectionImages(collection_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        scheduler: Scheduler?,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    ) {
        movieApiService.getCollectionTranslations(collection_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getCompaniesDetails(
        company_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<CompaniesDetail>
    ) {
        movieApiService.getCompaniesDetails(company_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    ) {
        movieApiService.getCompaniesAlternativeName(company_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getCompaniesImage(
        company_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<CompaniesImage>
    ) {
        movieApiService.getCompaniesImage(company_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getConfigurationApi(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<ConfigurationApi>
    ) {
        movieApiService.getConfigurationApi(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getConfigurationCountries(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationCountry>>
    ) {
        movieApiService.getConfigurationCountries(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getConfigurationJobs(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationJob>>
    ) {
        movieApiService.getConfigurationJobs(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getConfigurationLanguages(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationLanguage>>
    ) {
        movieApiService.getConfigurationLanguages(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getConfigurationTranslations(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<List<String>>
    ) {
        movieApiService.getConfigurationTranslations(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getConfigurationTimezones(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationTimezone>>
    ) {
        movieApiService.getConfigurationTimezones(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }

    }

    override fun getCreditsDetails(
        credit_id: String,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<Credits>
    ) {
        movieApiService.getCreditsDetails(credit_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
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
        callback: ConsumeApiResponse<Discover<DiscoverMovie>>
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
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
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
        callback: ConsumeApiResponse<Discover<DiscoverTv>>
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
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getFindById(
        external_id: String,
        scheduler: Scheduler?, apiKey: String,
        external_source: String,
        language: String?,
        callback: ConsumeApiResponse<Find>
    ) {
        movieApiService.getFindById(external_id, apiKey, external_source, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getGenresMovie(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    ) {
        movieApiService.getGenresMovie(apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getGenresTv(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    ) {
        movieApiService.getGenresTv(apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<KeywordsDetail>
    ) {
        movieApiService.getKeywordsDetail(keyword_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: ConsumeApiResponse<KeywordsMovies>
    ) {
        movieApiService.getKeywordsMovie(keyword_id, apiKey, language, include_adult).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesDetails(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    ) {
        movieApiService.getMoviesDetails(movie_id, apiKey, language, append_to_response).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    ) {
        movieApiService.getMoviesAccountState(movie_id, apiKey, session_id, guest_session_id)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    ) {
        movieApiService.getMoviesAlternativeTitles(movie_id, apiKey, country).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesChanges(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    ) {
        movieApiService.getMoviesChanges(movie_id, apiKey, start_date, end_date, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesCredits(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MovieCredit>
    ) {
        movieApiService.getMoviesCredits(movie_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MovieExternalId>
    ) {
        movieApiService.getMoviesExternalIds(movie_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesImages(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    ) {
        movieApiService.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MovieKeywords>
    ) {
        movieApiService.getMoviesKeywords(movie_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MovieReleaseDates>
    ) {
        movieApiService.getMoviesReleaseDates(movie_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesVideos(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    ) {
        movieApiService.getMoviesVideos(movie_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MovieTranslations>
    ) {
        movieApiService.getMoviesTranslations(movie_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    ) {
        movieApiService.getMoviesRecommendations(movie_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    ) {
        movieApiService.getMoviesSimilarMovies(movie_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesReviews(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    ) {
        movieApiService.getMoviesReviews(movie_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesLists(
        movie_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    ) {
        movieApiService.getMoviesLists(movie_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesLatest(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieLatest>
    ) {
        movieApiService.getMoviesLatest(apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesNowPlaying(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieNowPlayings>
    ) {
        movieApiService.getMoviesNowPlaying(apiKey, language, page, region).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesPopular(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MoviePopulars>
    ) {
        movieApiService.getMoviesPopular(apiKey, language, page, region).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesTopRated(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieTopRated>
    ) {
        movieApiService.getMoviesTopRated(apiKey, language, page, region).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getMoviesUpcoming(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieUpcoming>
    ) {
        if (scheduler != null) {
            movieApiService.getMoviesUpcoming(apiKey, language, page, region)
                .doApiRequest(scheduler, callback)
        } else {
            movieApiService.getMoviesUpcoming(apiKey, language, page, region)
                .doApiRequest(callback)
        }
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingAll>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingAll(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback)
        } else {
            movieApiService.getTrendingAll(media_type, time_window, apiKey)
                .doApiRequest(callback)
        }
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingMovie>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingMovie(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback)
        } else {
            movieApiService.getTrendingMovie(media_type, time_window, apiKey).doApiRequest(callback)
        }
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingPerson>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingPerson(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback)
        } else {
            movieApiService.getTrendingPerson(media_type, time_window, apiKey)
                .doApiRequest(callback)
        }
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingTv>>
    ) {
        if (scheduler != null) {
            movieApiService.getTrendingTv(media_type, time_window, apiKey)
                .doApiRequest(scheduler, callback)
        } else {
            movieApiService.getTrendingTv(media_type, time_window, apiKey)
                .doApiRequest(callback)
        }
    }

    override fun getReviews(
        review_id: String,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<Reviews>
    ) {
        if (scheduler != null) {
            movieApiService.getReviews(review_id, apiKey)
                .doApiRequest(scheduler, callback)
        } else {
            movieApiService.getReviews(review_id, apiKey)
                .doApiRequest(callback)
        }
    }

    override fun getNetworkDetail(
        network_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<NetworkDetail>
    ) {
        movieApiService.getNetworkDetail(network_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<NetworkAlternativeName>
    ) {
        movieApiService.getNetworkAlternativeName(network_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getNetworkImage(
        network_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<NetworkImage>
    ) {
        movieApiService.getNetworkImage(network_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchCompanies(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    ) {
        movieApiService.searchCompanies(apiKey, query, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchCollections(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    ) {
        movieApiService.searchCollections(apiKey, query, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchKeywords(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
    ) {
        movieApiService.searchKeywords(apiKey, query, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
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
        callback: ConsumeApiResponse<SearchMovies>
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
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchMultiSearch(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchMulti>
    ) {
        movieApiService.searchMultiSearch(apiKey, query, language, page, include_adult, region)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun searchPeople(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchPeople>
    ) {
        movieApiService.searchPeople(apiKey, query, language, page, include_adult, region).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchTvShows(
        scheduler: Scheduler?, apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        movieApiService.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvDetails(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    ) {
        movieApiService.getTvDetails(tv_id, apiKey, language, append_to_response).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvAccountStates(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    ) {
        movieApiService.getTvAccountStates(tv_id, apiKey, language, guest_session_id, session_id)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    ) {
        movieApiService.getTvAlternativeTitles(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvChanges(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvChanges>
    ) {
        movieApiService.getTvChanges(tv_id, apiKey, startDate, endDate, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvContentRatings(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    ) {
        movieApiService.getTvContentRatings(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvCredits(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    ) {
        movieApiService.getTvCredits(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    ) {
        movieApiService.getTvEpisodeGroups(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvExternalIds(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    ) {
        movieApiService.getTvExternalIds(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvImages(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    ) {
        movieApiService.getTvImages(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvKeyword(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvKeywords>
    ) {
        movieApiService.getTvKeyword(tv_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvRecommendations(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    ) {
        movieApiService.getTvRecommendations(tv_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvReviews(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvReviews>
    ) {
        movieApiService.getTvReviews(tv_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    ) {
        movieApiService.getTvScreenedTheatrically(tv_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    ) {
        movieApiService.getTvSimilarTvShows(tv_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvTranslations(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvTranslations>
    ) {
        movieApiService.getTvTranslations(tv_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvVideos(
        tv_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    ) {
        movieApiService.getTvVideos(tv_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvLatest(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvLatest>
    ) {
        movieApiService.getTvLatest(apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvAiringToday(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    ) {
        movieApiService.getTvAiringToday(apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvOnTheAir(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    ) {
        movieApiService.getTvOnTheAir(apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvPopular(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    ) {
        movieApiService.getTvPopular(apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvTopRated(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
    ) {
        movieApiService.getTvTopRated(apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvSeasonsDetails>
    ) {
        movieApiService.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        scheduler: Scheduler?, apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSeasonsChanges>
    ) {
        movieApiService.getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvSeasonsAccountStates>
    ) {
        movieApiService.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsCredits>
    ) {
        movieApiService.getTvSeasonsCredits(tv_id, season_number, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsExternalIds>
    ) {
        movieApiService.getTvSeasonsExternalIds(tv_id, season_number, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsImages>
    ) {
        movieApiService.getTvSeasonsImages(tv_id, season_number, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsVideos>
    ) {
        movieApiService.getTvSeasonsVideos(tv_id, season_number, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvEpisodeDetails>
    ) {
        movieApiService.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        scheduler: Scheduler?, apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvEpisodeChanges>
    ) {
        movieApiService.getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvEpisodeAccountStates>
    ) {
        movieApiService.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id
        ).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeCredits>
    ) {
        movieApiService.getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeExternalIds>
    ) {
        movieApiService.getTvEpisodeExternalIds(tv_id, season_number, episode_number, apiKey)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeImages>
    ) {
        movieApiService.getTvEpisodeImages(tv_id, season_number, episode_number, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeTranslation>
    ) {
        movieApiService.getTvEpisodeTranslations(tv_id, season_number, episode_number, apiKey)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    ) {
        movieApiService.getTvEpisodeVideos(tv_id, season_number, episode_number, apiKey, language)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroupsDetails>
    ) {
        movieApiService.getTvEpisodeGroupsDetails(id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleDetails(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    ) {
        movieApiService.getPeopleDetails(person_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleChanges(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    ) {
        movieApiService.getPeopleChanges(person_id, apiKey, endDate, page, startDate).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    ) {
        movieApiService.getPeopleMovieCredits(person_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    ) {
        movieApiService.getPeopleTvCredits(person_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    ) {
        movieApiService.getPeopleCombinedCredits(person_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    ) {
        movieApiService.getPeopleExternalIds(person_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleImages(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<PeopleImages>
    ) {
        movieApiService.getPeopleImages(person_id, apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    ) {
        movieApiService.getPeopleTaggedImages(person_id, apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleTranslations(
        person_id: Int,
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    ) {
        movieApiService.getPeopleTranslations(person_id, apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeopleLatest(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleLatest>
    ) {
        movieApiService.getPeopleLatest(apiKey, language).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getPeoplePopular(
        scheduler: Scheduler?, apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    ) {
        movieApiService.getPeoplePopular(apiKey, language, page).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }
}