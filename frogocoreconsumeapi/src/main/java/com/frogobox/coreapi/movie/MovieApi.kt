package com.frogobox.coreapi.movie

import com.frogobox.coreapi.ConsumeApiResponse
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

    override fun getMovieCertifications(callback: ConsumeApiResponse<Certifications<CertificationMovie>>) {
        movieRepository.getMovieCertifications(
            scheduler, apiKey,
            callback
        )
    }

    override fun getTvCertifications(callback: ConsumeApiResponse<Certifications<CertificationTv>>) {
        movieRepository.getTvCertifications(
            scheduler, apiKey,
            callback
        )
    }

    override fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieRepository.getMovieChangeList(
            scheduler, apiKey,
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
        movieRepository.getTvChangeList(
            scheduler, apiKey,
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
        movieRepository.getPersonChangeList(
            scheduler, apiKey,
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
        movieRepository.getCollectionDetails(
            collection_id,
            scheduler, apiKey,
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
        movieRepository.getCollectionImages(
            collection_id,
            scheduler, apiKey,
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
        movieRepository.getCollectionTranslations(
            collection_id,
            scheduler, apiKey,
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
        movieRepository.getCompaniesDetails(
            company_id,
            scheduler, apiKey,
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
        movieRepository.getCompaniesAlternativeName(
            company_id,
            scheduler, apiKey,
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
        movieRepository.getCompaniesImage(
            company_id,
            scheduler, apiKey,
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
        movieRepository.getConfigurationApi(
            scheduler, apiKey,
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
        movieRepository.getConfigurationCountries(
            scheduler, apiKey,
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
        movieRepository.getConfigurationJobs(
            scheduler, apiKey,
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
        movieRepository.getConfigurationLanguages(
            scheduler, apiKey,
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
        movieRepository.getConfigurationTranslations(
            scheduler, apiKey,
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
        movieRepository.getConfigurationTimezones(
            scheduler, apiKey,
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
        movieRepository.getCreditsDetails(
            credit_id,
            scheduler, apiKey,
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
        movieRepository.getFindById(
            external_id,
            scheduler, apiKey,
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
        movieRepository.getGenresMovie(
            scheduler, apiKey,
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
        movieRepository.getGenresTv(
            scheduler, apiKey,
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
        movieRepository.getKeywordsDetail(
            keyword_id,
            scheduler, apiKey,
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
        movieRepository.getKeywordsMovie(
            keyword_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesDetails(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesAccountState(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesAlternativeTitles(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesChanges(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesCredits(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesExternalIds(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesImages(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesKeywords(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesReleaseDates(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesVideos(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesTranslations(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesRecommendations(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesSimilarMovies(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesReviews(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesLists(
            movie_id,
            scheduler, apiKey,
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
        movieRepository.getMoviesLatest(
            scheduler, apiKey,
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
        movieRepository.getMoviesNowPlaying(
            scheduler, apiKey,
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
        movieRepository.getMoviesPopular(
            scheduler, apiKey,
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
        movieRepository.getMoviesTopRated(
            scheduler, apiKey,
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
        movieRepository.getMoviesUpcoming(
            scheduler, apiKey,
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
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
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

    override fun getTrendingAllWeek(callback: ConsumeApiResponse<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
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

    override fun getTrendingMovieDay(callback: ConsumeApiResponse<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
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

    override fun getTrendingMovieWeek(callback: ConsumeApiResponse<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
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

    override fun getTrendingPersonDay(callback: ConsumeApiResponse<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
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

    override fun getTrendingPersonWeek(callback: ConsumeApiResponse<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
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

    override fun getTrendingTvDay(callback: ConsumeApiResponse<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
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

    override fun getTrendingTvWeek(callback: ConsumeApiResponse<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            scheduler, apiKey,
            object : ConsumeApiResponse<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
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

    override fun getReviews(review_id: String, callback: ConsumeApiResponse<Reviews>) {
        movieRepository.getReviews(
            review_id,
            scheduler, apiKey,
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
        movieRepository.getNetworkDetail(
            network_id,
            scheduler, apiKey,
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
        movieRepository.getNetworkAlternativeName(
            network_id,
            scheduler, apiKey,
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
        movieRepository.getNetworkImage(
            network_id,
            scheduler, apiKey,
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
        movieRepository.searchCompanies(
            scheduler, apiKey,
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
        movieRepository.searchCollections(
            scheduler, apiKey,
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
        movieRepository.searchKeywords(
            scheduler, apiKey,
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
        movieRepository.searchMovies(
            scheduler, apiKey,
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
        movieRepository.searchMultiSearch(
            scheduler, apiKey,
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
        movieRepository.searchPeople(
            scheduler, apiKey,
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
        movieRepository.searchTvShows(
            scheduler, apiKey,
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
        movieRepository.getTvDetails(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvAccountStates(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvAlternativeTitles(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvChanges(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvContentRatings(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvCredits(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeGroups(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvExternalIds(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvImages(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvKeyword(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvRecommendations(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvReviews(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvScreenedTheatrically(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvSimilarTvShows(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvTranslations(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvVideos(
            tv_id,
            scheduler, apiKey,
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
        movieRepository.getTvLatest(
            scheduler, apiKey,
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
        movieRepository.getTvAiringToday(
            scheduler, apiKey,
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
        movieRepository.getTvOnTheAir(
            scheduler, apiKey,
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
        movieRepository.getTvPopular(
            scheduler, apiKey,
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
        movieRepository.getTvTopRated(
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsDetails(
            tv_id,
            season_number,
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsChanges(
            season_id,
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsCredits(
            tv_id,
            season_number,
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsExternalIds(
            tv_id,
            season_number,
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsImages(
            tv_id,
            season_number,
            scheduler, apiKey,
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
        movieRepository.getTvSeasonsVideos(
            tv_id,
            season_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeChanges(
            episode_id,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeCredits(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeExternalIds(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeImages(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeTranslations(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeVideos(
            tv_id,
            season_number,
            episode_number,
            scheduler, apiKey,
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
        movieRepository.getTvEpisodeGroupsDetails(
            id,
            scheduler, apiKey,
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
        movieRepository.getPeopleDetails(
            person_id,
            scheduler, apiKey,
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
        movieRepository.getPeopleChanges(
            person_id,
            scheduler, apiKey,
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
        movieRepository.getPeopleMovieCredits(
            person_id,
            scheduler, apiKey,
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
        movieRepository.getPeopleTvCredits(
            person_id,
            scheduler, apiKey,
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
        movieRepository.getPeopleCombinedCredits(
            person_id,
            scheduler, apiKey,
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
        movieRepository.getPeopleExternalIds(
            person_id,
            scheduler, apiKey,
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
        callback: ConsumeApiResponse<PeopleTaggedImages>
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
        callback: ConsumeApiResponse<PeopleTranslations>
    ) {
        movieRepository.getPeopleTranslations(
            person_id,
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeopleLatest(language: String?, callback: ConsumeApiResponse<PeopleLatest>) {
        movieRepository.getPeopleLatest(
            scheduler, apiKey,
            language,
            callback
        )
    }

    override fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    ) {
        movieRepository.getPeoplePopular(
            scheduler, apiKey,
            language,
            page,
            callback
        )
    }
}