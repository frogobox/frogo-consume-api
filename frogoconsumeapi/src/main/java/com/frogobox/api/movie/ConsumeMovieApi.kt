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
        movieApi.getMovieCertifications(
            object : ConsumeApiResponse<Certifications<CertificationMovie>> {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvCertifications(callback: ConsumeApiResponse<Certifications<CertificationTv>>) {
        movieApi.getTvCertifications(

            object : ConsumeApiResponse<Certifications<CertificationTv>> {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApi.getMovieChangeList(

            endDate,
            startDate,
            page,
            object : ConsumeApiResponse<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApi.getTvChangeList(

            endDate,
            startDate,
            page,
            object : ConsumeApiResponse<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApi.getPersonChangeList(

            endDate,
            startDate,
            page,
            object : ConsumeApiResponse<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    ) {
        movieApi.getCollectionDetails(
            collection_id,

            language,
            object : ConsumeApiResponse<CollectionsDetail> {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    ) {
        movieApi.getCollectionImages(
            collection_id,

            language,
            object : ConsumeApiResponse<CollectionsImage> {
                override fun onSuccess(data: CollectionsImage) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    ) {
        movieApi.getCollectionTranslations(
            collection_id,

            language,
            object : ConsumeApiResponse<CollectionsTranslation> {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesDetails(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesDetail>
    ) {
        movieApi.getCompaniesDetails(
            company_id,

            object : ConsumeApiResponse<CompaniesDetail> {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    ) {
        movieApi.getCompaniesAlternativeName(
            company_id,

            object : ConsumeApiResponse<CompaniesAlternateName> {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesImage(company_id: Int, callback: ConsumeApiResponse<CompaniesImage>) {
        movieApi.getCompaniesImage(
            company_id,

            object : ConsumeApiResponse<CompaniesImage> {
                override fun onSuccess(data: CompaniesImage) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationApi(callback: ConsumeApiResponse<ConfigurationApi>) {
        movieApi.getConfigurationApi(

            object : ConsumeApiResponse<ConfigurationApi> {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationCountries(callback: ConsumeApiResponse<List<ConfigurationCountry>>) {
        movieApi.getConfigurationCountries(

            object : ConsumeApiResponse<List<ConfigurationCountry>> {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationJobs(callback: ConsumeApiResponse<List<ConfigurationJob>>) {
        movieApi.getConfigurationJobs(

            object : ConsumeApiResponse<List<ConfigurationJob>> {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationLanguages(callback: ConsumeApiResponse<List<ConfigurationLanguage>>) {
        movieApi.getConfigurationLanguages(

            object : ConsumeApiResponse<List<ConfigurationLanguage>> {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTranslations(callback: ConsumeApiResponse<List<String>>) {
        movieApi.getConfigurationTranslations(

            object : ConsumeApiResponse<List<String>> {
                override fun onSuccess(data: List<String>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTimezones(callback: ConsumeApiResponse<List<ConfigurationTimezone>>) {
        movieApi.getConfigurationTimezones(

            object : ConsumeApiResponse<List<ConfigurationTimezone>> {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCreditsDetails(credit_id: String, callback: ConsumeApiResponse<Credits>) {
        movieApi.getCreditsDetails(
            credit_id,

            object : ConsumeApiResponse<Credits> {
                override fun onSuccess(data: Credits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            with_original_language,
            object : ConsumeApiResponse<Discover<DiscoverMovie>> {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            }
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
            with_keywords,
            object : ConsumeApiResponse<Discover<DiscoverTv>> {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            }
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

            external_source,
            language,
            object : ConsumeApiResponse<Find> {
                override fun onSuccess(data: Find) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresMovie(language: String?, callback: ConsumeApiResponse<Genres>) {
        movieApi.getGenresMovie(

            language,
            object : ConsumeApiResponse<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresTv(language: String?, callback: ConsumeApiResponse<Genres>) {
        movieApi.getGenresTv(

            language,
            object : ConsumeApiResponse<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: ConsumeApiResponse<KeywordsDetail>) {
        movieApi.getKeywordsDetail(
            keyword_id,

            object : ConsumeApiResponse<KeywordsDetail> {
                override fun onSuccess(data: KeywordsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: ConsumeApiResponse<KeywordsMovies>
    ) {
        movieApi.getKeywordsMovie(
            keyword_id,

            language,
            include_adult,
            object : ConsumeApiResponse<KeywordsMovies> {
                override fun onSuccess(data: KeywordsMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    ) {
        movieApi.getMoviesDetails(
            movie_id,

            language,
            append_to_response,
            object : ConsumeApiResponse<MovieDetail> {
                override fun onSuccess(data: MovieDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    ) {
        movieApi.getMoviesAccountState(
            movie_id,

            session_id,
            guest_session_id,
            object : ConsumeApiResponse<MovieAccountState> {
                override fun onSuccess(data: MovieAccountState) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    ) {
        movieApi.getMoviesAlternativeTitles(
            movie_id,

            country,
            object : ConsumeApiResponse<MovieAlternativeTitle> {
                override fun onSuccess(data: MovieAlternativeTitle) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    ) {
        movieApi.getMoviesChanges(
            movie_id,

            start_date,
            end_date,
            page,
            object : ConsumeApiResponse<MovieChanges> {
                override fun onSuccess(data: MovieChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesCredits(movie_id: Int, callback: ConsumeApiResponse<MovieCredit>) {
        movieApi.getMoviesCredits(
            movie_id,

            object : ConsumeApiResponse<MovieCredit> {
                override fun onSuccess(data: MovieCredit) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieExternalId>
    ) {
        movieApi.getMoviesExternalIds(
            movie_id,

            object : ConsumeApiResponse<MovieExternalId> {
                override fun onSuccess(data: MovieExternalId) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    ) {
        movieApi.getMoviesImages(
            movie_id,

            language,
            include_image_language,
            object : ConsumeApiResponse<MovieImages> {
                override fun onSuccess(data: MovieImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesKeywords(movie_id: Int, callback: ConsumeApiResponse<MovieKeywords>) {
        movieApi.getMoviesKeywords(
            movie_id,

            object : ConsumeApiResponse<MovieKeywords> {
                override fun onSuccess(data: MovieKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieReleaseDates>
    ) {
        movieApi.getMoviesReleaseDates(
            movie_id,

            object : ConsumeApiResponse<MovieReleaseDates> {
                override fun onSuccess(data: MovieReleaseDates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    ) {
        movieApi.getMoviesVideos(
            movie_id,

            language,
            object : ConsumeApiResponse<MovieVideos> {
                override fun onSuccess(data: MovieVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieTranslations>
    ) {
        movieApi.getMoviesTranslations(
            movie_id,

            object : ConsumeApiResponse<MovieTranslations> {
                override fun onSuccess(data: MovieTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    ) {
        movieApi.getMoviesRecommendations(
            movie_id,

            language,
            page,
            object : ConsumeApiResponse<MovieRecommendations> {
                override fun onSuccess(data: MovieRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    ) {
        movieApi.getMoviesSimilarMovies(
            movie_id,

            language,
            page,
            object : ConsumeApiResponse<MovieSimilarMovies> {
                override fun onSuccess(data: MovieSimilarMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    ) {
        movieApi.getMoviesReviews(
            movie_id,

            language,
            page,
            object : ConsumeApiResponse<MovieReviews> {
                override fun onSuccess(data: MovieReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    ) {
        movieApi.getMoviesLists(
            movie_id,

            language,
            page,
            object : ConsumeApiResponse<MovieLists> {
                override fun onSuccess(data: MovieLists) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesLatest(language: String?, callback: ConsumeApiResponse<MovieLatest>) {
        movieApi.getMoviesLatest(

            language,
            object : ConsumeApiResponse<MovieLatest> {
                override fun onSuccess(data: MovieLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            region,
            object : ConsumeApiResponse<MovieNowPlayings> {
                override fun onSuccess(data: MovieNowPlayings) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            region,
            object : ConsumeApiResponse<MoviePopulars> {
                override fun onSuccess(data: MoviePopulars) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            region,
            object : ConsumeApiResponse<MovieTopRated> {
                override fun onSuccess(data: MovieTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            region,
            object : ConsumeApiResponse<MovieUpcoming> {
                override fun onSuccess(data: MovieUpcoming) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
        movieApi.getReviews(
            review_id,

            object : ConsumeApiResponse<Reviews> {
                override fun onSuccess(data: Reviews) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkDetail(network_id: Int, callback: ConsumeApiResponse<NetworkDetail>) {
        movieApi.getNetworkDetail(
            network_id,
            object : ConsumeApiResponse<NetworkDetail> {
                override fun onSuccess(data: NetworkDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        callback: ConsumeApiResponse<NetworkAlternativeName>
    ) {
        movieApi.getNetworkAlternativeName(
            network_id,

            object : ConsumeApiResponse<NetworkAlternativeName> {
                override fun onSuccess(data: NetworkAlternativeName) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkImage(network_id: Int, callback: ConsumeApiResponse<NetworkImage>) {
        movieApi.getNetworkImage(
            network_id,

            object : ConsumeApiResponse<NetworkImage> {
                override fun onSuccess(data: NetworkImage) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchCompanies(
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    ) {
        movieApi.searchCompanies(
            query,
            page,
            object : ConsumeApiResponse<SearchCompanies> {
                override fun onSuccess(data: SearchCompanies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    ) {
        movieApi.searchCollections(

            query,
            language,
            page,
            object : ConsumeApiResponse<SearchCollections> {
                override fun onSuccess(data: SearchCollections) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchKeywords(
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
    ) {
        movieApi.searchKeywords(

            query,
            page,
            object : ConsumeApiResponse<SearchKeywords> {
                override fun onSuccess(data: SearchKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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

            query,
            language,
            page,
            include_adult,
            region,
            year,
            primary_release_year,
            object : ConsumeApiResponse<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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

            query,
            language,
            page,
            include_adult,
            region,
            object : ConsumeApiResponse<SearchMulti> {
                override fun onSuccess(data: SearchMulti) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchPeople(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchPeople>
    ) {
        movieApi.searchPeople(

            query,
            language,
            page,
            include_adult,
            region,
            object : ConsumeApiResponse<SearchPeople> {
                override fun onSuccess(data: SearchPeople) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        movieApi.searchTvShows(

            query,
            language,
            page,
            include_adult,
            first_air_date_year,
            object : ConsumeApiResponse<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    ) {
        movieApi.getTvDetails(
            tv_id,

            language,
            append_to_response,
            object : ConsumeApiResponse<TvDetails> {
                override fun onSuccess(data: TvDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    ) {
        movieApi.getTvAccountStates(
            tv_id,

            language,
            guest_session_id,
            session_id,
            object : ConsumeApiResponse<TvAccountStates> {
                override fun onSuccess(data: TvAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    ) {
        movieApi.getTvAlternativeTitles(
            tv_id,

            language,
            object : ConsumeApiResponse<TvAlternativeTitles> {
                override fun onSuccess(data: TvAlternativeTitles) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            page,
            object : ConsumeApiResponse<TvChanges> {
                override fun onSuccess(data: TvChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvContentRatings(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    ) {
        movieApi.getTvContentRatings(
            tv_id,

            language,
            object : ConsumeApiResponse<TvContentRatings> {
                override fun onSuccess(data: TvContentRatings) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    ) {
        movieApi.getTvCredits(
            tv_id,

            language,
            object : ConsumeApiResponse<TvCredits> {
                override fun onSuccess(data: TvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    ) {
        movieApi.getTvEpisodeGroups(
            tv_id,

            language,
            object : ConsumeApiResponse<TvEpisodeGroups> {
                override fun onSuccess(data: TvEpisodeGroups) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    ) {
        movieApi.getTvExternalIds(
            tv_id,

            language,
            object : ConsumeApiResponse<TvExternalIds> {
                override fun onSuccess(data: TvExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    ) {
        movieApi.getTvImages(
            tv_id,

            language,
            object : ConsumeApiResponse<TvImages> {
                override fun onSuccess(data: TvImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvKeyword(tv_id: Int, callback: ConsumeApiResponse<TvKeywords>) {
        movieApi.getTvKeyword(
            tv_id,

            object : ConsumeApiResponse<TvKeywords> {
                override fun onSuccess(data: TvKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    ) {
        movieApi.getTvRecommendations(
            tv_id,

            language,
            page,
            object : ConsumeApiResponse<TvRecommendations> {
                override fun onSuccess(data: TvRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvReviews(tv_id: Int, callback: ConsumeApiResponse<TvReviews>) {
        movieApi.getTvReviews(
            tv_id,

            object : ConsumeApiResponse<TvReviews> {
                override fun onSuccess(data: TvReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    ) {
        movieApi.getTvScreenedTheatrically(
            tv_id,

            object : ConsumeApiResponse<TvScreenedTheatrically> {
                override fun onSuccess(data: TvScreenedTheatrically) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    ) {
        movieApi.getTvSimilarTvShows(
            tv_id,

            language,
            page,
            object : ConsumeApiResponse<TvSimilarTVShows> {
                override fun onSuccess(data: TvSimilarTVShows) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvTranslations(tv_id: Int, callback: ConsumeApiResponse<TvTranslations>) {
        movieApi.getTvTranslations(
            tv_id,

            object : ConsumeApiResponse<TvTranslations> {
                override fun onSuccess(data: TvTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    ) {
        movieApi.getTvVideos(
            tv_id,

            language,
            object : ConsumeApiResponse<TvVideos> {
                override fun onSuccess(data: TvVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvLatest(language: String?, callback: ConsumeApiResponse<TvLatest>) {
        movieApi.getTvLatest(

            language,
            object : ConsumeApiResponse<TvLatest> {
                override fun onSuccess(data: TvLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    ) {
        movieApi.getTvAiringToday(

            language,
            page,
            object : ConsumeApiResponse<TvAiringToday> {
                override fun onSuccess(data: TvAiringToday) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    ) {
        movieApi.getTvOnTheAir(

            language,
            page,
            object : ConsumeApiResponse<TvOnTheAir> {
                override fun onSuccess(data: TvOnTheAir) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvPopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    ) {
        movieApi.getTvPopular(

            language,
            page,
            object : ConsumeApiResponse<TvPopular> {
                override fun onSuccess(data: TvPopular) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
    ) {
        movieApi.getTvTopRated(

            language,
            page,
            object : ConsumeApiResponse<TvTopRated> {
                override fun onSuccess(data: TvTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            season_number,

            language,
            append_to_response,
            object : ConsumeApiResponse<TvSeasonsDetails> {
                override fun onSuccess(data: TvSeasonsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            page,
            object : ConsumeApiResponse<TvSeasonsChanges> {
                override fun onSuccess(data: TvSeasonsChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            season_number,

            language,
            guest_session_id,
            session_id,
            object : ConsumeApiResponse<TvSeasonsAccountStates> {
                override fun onSuccess(data: TvSeasonsAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsCredits>
    ) {
        movieApi.getTvSeasonsCredits(
            tv_id,
            season_number,

            language,
            object : ConsumeApiResponse<TvSeasonsCredits> {
                override fun onSuccess(data: TvSeasonsCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsExternalIds>
    ) {
        movieApi.getTvSeasonsExternalIds(
            tv_id,
            season_number,

            language,
            object : ConsumeApiResponse<TvSeasonsExternalIds> {
                override fun onSuccess(data: TvSeasonsExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsImages>
    ) {
        movieApi.getTvSeasonsImages(
            tv_id,
            season_number,

            language,
            object : ConsumeApiResponse<TvSeasonsImages> {
                override fun onSuccess(data: TvSeasonsImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsVideos>
    ) {
        movieApi.getTvSeasonsVideos(
            tv_id,
            season_number,

            language,
            object : ConsumeApiResponse<TvSeasonsVideos> {
                override fun onSuccess(data: TvSeasonsVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            episode_number,

            language,
            append_to_response,
            object : ConsumeApiResponse<TvEpisodeDetails> {
                override fun onSuccess(data: TvEpisodeDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            page,
            object : ConsumeApiResponse<TvEpisodeChanges> {
                override fun onSuccess(data: TvEpisodeChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            session_id,
            object : ConsumeApiResponse<TvEpisodeAccountStates> {
                override fun onSuccess(data: TvEpisodeAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            episode_number,

            object : ConsumeApiResponse<TvEpisodeCredits> {
                override fun onSuccess(data: TvEpisodeCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            episode_number,

            object : ConsumeApiResponse<TvEpisodeExternalIds> {
                override fun onSuccess(data: TvEpisodeExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            episode_number,

            object : ConsumeApiResponse<TvEpisodeImages> {
                override fun onSuccess(data: TvEpisodeImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
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
            episode_number,

            object : ConsumeApiResponse<TvEpisodeTranslation> {
                override fun onSuccess(data: TvEpisodeTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    ) {
        movieApi.getTvEpisodeVideos(
            tv_id,
            season_number,
            episode_number,

            language,
            object : ConsumeApiResponse<TvEpisodeVideos> {
                override fun onSuccess(data: TvEpisodeVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroupsDetails>
    ) {
        movieApi.getTvEpisodeGroupsDetails(
            id,

            language,
            object : ConsumeApiResponse<TvEpisodeGroupsDetails> {
                override fun onSuccess(data: TvEpisodeGroupsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    ) {
        movieApi.getPeopleDetails(
            person_id,

            language,
            object : ConsumeApiResponse<PeopleDetails> {
                override fun onSuccess(data: PeopleDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    ) {
        movieApi.getPeopleChanges(
            person_id,

            endDate,
            page,
            startDate,
            object : ConsumeApiResponse<PeopleChanges> {
                override fun onSuccess(data: PeopleChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    ) {
        movieApi.getPeopleMovieCredits(
            person_id,

            language,
            object : ConsumeApiResponse<PeopleMovieCredits> {
                override fun onSuccess(data: PeopleMovieCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    ) {
        movieApi.getPeopleTvCredits(
            person_id,

            language,
            object : ConsumeApiResponse<PeopleTvCredits> {
                override fun onSuccess(data: PeopleTvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    ) {
        movieApi.getPeopleCombinedCredits(
            person_id,

            language,
            object : ConsumeApiResponse<PeopleCombinedCredits> {
                override fun onSuccess(data: PeopleCombinedCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    ) {
        movieApi.getPeopleExternalIds(
            person_id,

            language,
            object : ConsumeApiResponse<PeopleExternalIds> {
                override fun onSuccess(data: PeopleExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleImages(person_id: Int, callback: ConsumeApiResponse<PeopleImages>) {
        movieApi.getPeopleImages(
            person_id,

            object : ConsumeApiResponse<PeopleImages> {
                override fun onSuccess(data: PeopleImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    ) {
        movieApi.getPeopleTaggedImages(
            person_id,

            language,
            page,
            object : ConsumeApiResponse<PeopleTaggedImages> {
                override fun onSuccess(data: PeopleTaggedImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    ) {
        movieApi.getPeopleTranslations(
            person_id,

            language,
            object : ConsumeApiResponse<PeopleTranslations> {
                override fun onSuccess(data: PeopleTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleLatest(language: String?, callback: ConsumeApiResponse<PeopleLatest>) {
        movieApi.getPeopleLatest(

            language,
            object : ConsumeApiResponse<PeopleLatest> {
                override fun onSuccess(data: PeopleLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    ) {
        movieApi.getPeoplePopular(

            language,
            page,
            object : ConsumeApiResponse<PeoplePopular> {
                override fun onSuccess(data: PeoplePopular) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }
}