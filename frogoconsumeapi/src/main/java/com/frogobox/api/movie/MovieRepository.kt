package com.frogobox.api.movie

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.doRequest
import com.frogobox.coreapi.movie.MovieApiService
import com.frogobox.coreapi.movie.MovieDataSource
import com.frogobox.coreapi.movie.MovieUrl
import com.frogobox.coreapi.movie.model.*
import com.frogobox.coreapi.movie.response.*
import com.frogobox.coresdk.FrogoApiClient
import com.frogobox.coresdk.FrogoApiObserver
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

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
    fun usingChuckInterceptor(context: Context) {
        Log.d(TAG, "Using Chuck Interceptor")
        movieApiService = FrogoApiClient.createWithInterceptor(MovieUrl.BASE_URL, ChuckerInterceptor(context))
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: ConsumeApiResponse<Certifications<CertificationMovie>>
    ) {
        Log.d(TAG, "Get Movie Certifications")
        movieApiService.getMovieCertifications(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: ConsumeApiResponse<Certifications<CertificationTv>>
    ) {
        Log.d(TAG, "Get TV Certifications")
        movieApiService.getTvCertifications(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        Log.d(TAG, "Get Movie Change List")
        movieApiService.getMovieChangeList(apiKey, endDate, startDate, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        Log.d(TAG, "Get TV Change List")
        movieApiService.getTvChangeList(apiKey, endDate, startDate, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        Log.d(TAG, "Get Person Change List")
        movieApiService.getPersonChangeList(apiKey, endDate, startDate, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCollectionDetails(collection_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCollectionImages(collection_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCollectionTranslations(collection_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesDetail>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCompaniesDetails(company_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCompaniesAlternativeName(company_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesImage>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCompaniesImage(company_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: ConsumeApiResponse<ConfigurationApi>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getConfigurationApi(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationCountry>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getConfigurationCountries(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationJob>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getConfigurationJobs(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationLanguage>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getConfigurationLanguages(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: ConsumeApiResponse<List<String>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getConfigurationTranslations(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationTimezone>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getConfigurationTimezones(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: ConsumeApiResponse<Credits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getCreditsDetails(credit_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
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
        callback: ConsumeApiResponse<Discover<DiscoverMovie>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
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
        ).doRequest(AndroidSchedulers.mainThread(), callback)
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
        callback: ConsumeApiResponse<Discover<DiscoverTv>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
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
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: ConsumeApiResponse<Find>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getFindById(external_id, apiKey, external_source, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getGenresMovie(apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getGenresTv(apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<KeywordsDetail>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getKeywordsDetail(keyword_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: ConsumeApiResponse<KeywordsMovies>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getKeywordsMovie(keyword_id, apiKey, language, include_adult)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesDetails(movie_id, apiKey, language, append_to_response)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesAccountState(movie_id, apiKey, session_id, guest_session_id)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesAlternativeTitles(movie_id, apiKey, country)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesChanges(movie_id, apiKey, start_date, end_date, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieCredit>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesCredits(movie_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieExternalId>
    ) {
        movieApiService.getMoviesExternalIds(movie_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieKeywords>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesKeywords(movie_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieReleaseDates>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesReleaseDates(movie_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesVideos(movie_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieTranslations>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesTranslations(movie_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesRecommendations(movie_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesSimilarMovies(movie_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesReviews(movie_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesLists(movie_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieLatest>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesLatest(apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieNowPlayings>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesNowPlaying(apiKey, language, page, region)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MoviePopulars>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesPopular(apiKey, language, page, region)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieTopRated>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesTopRated(apiKey, language, page, region)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieUpcoming>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getMoviesUpcoming(apiKey, language, page, region)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingAll>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTrendingAll(media_type, time_window, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingMovie>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTrendingMovie(media_type, time_window, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingPerson>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTrendingPerson(media_type, time_window, apiKey)

            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiObserver<Trending<TrendingPerson>>() {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingTv>>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTrendingTv(media_type, time_window, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getReviews(
        review_id: String,
        apiKey: String,
        callback: ConsumeApiResponse<Reviews>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getReviews(review_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkDetail>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getNetworkDetail(network_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkAlternativeName>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getNetworkAlternativeName(network_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkImage>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getNetworkImage(network_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchCompanies(apiKey, query, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchCollections(apiKey, query, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchKeywords(apiKey, query, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
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
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchMovies(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            year,
            primary_release_year
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchMultiSearch(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchMulti>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchMultiSearch(apiKey, query, language, page, include_adult, region)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchPeople(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchPeople>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchPeople(apiKey, query, language, page, include_adult, region)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchTvShows(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvDetails(tv_id, apiKey, language, append_to_response)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvAccountStates(tv_id, apiKey, language, guest_session_id, session_id)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvAlternativeTitles(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvChanges>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvChanges(tv_id, apiKey, startDate, endDate, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvContentRatings(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvCredits(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeGroups(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvExternalIds(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvImages(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvKeywords>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvKeyword(tv_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvRecommendations(tv_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvReviews>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvReviews(tv_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvScreenedTheatrically(tv_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSimilarTvShows(tv_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvTranslations>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvTranslations(tv_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvVideos(tv_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvLatest>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvLatest(apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvAiringToday(apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvOnTheAir(apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvPopular(apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvTopRated(apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvSeasonsDetails>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSeasonsChanges>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvSeasonsAccountStates>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsCredits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsCredits(tv_id, season_number, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsExternalIds>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsExternalIds(tv_id, season_number, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsImages>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsImages(tv_id, season_number, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsVideos>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvSeasonsVideos(tv_id, season_number, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvEpisodeDetails>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response
        )
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvEpisodeChanges>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvEpisodeAccountStates>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id
        ).doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeCredits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeExternalIds>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeExternalIds(tv_id, season_number, episode_number, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeImages>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeImages(tv_id, season_number, episode_number, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeTranslation>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeTranslations(tv_id, season_number, episode_number, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeVideos(tv_id, season_number, episode_number, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroupsDetails>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getTvEpisodeGroupsDetails(id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleDetails(person_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleChanges(person_id, apiKey, endDate, page, startDate)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleMovieCredits(person_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleTvCredits(person_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleCombinedCredits(person_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleExternalIds(person_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<PeopleImages>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleImages(person_id, apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleTaggedImages(person_id, apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleTranslations(person_id, apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleLatest>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeopleLatest(apiKey, language)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    ) {
        Log.d(TAG, "Request Data From The Movie DB API")
        movieApiService.getPeoplePopular(apiKey, language, page)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }
}