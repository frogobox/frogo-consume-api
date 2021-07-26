package com.frogobox.frogoconsumeapi.movie

import android.content.Context
import com.frogobox.frogoconsumeapi.movie.model.*
import com.frogobox.frogoconsumeapi.movie.response.*
import com.frogobox.frogoconsumeapi.movie.source.MovieRemoteDataSource
import com.frogobox.frogoconsumeapi.movie.util.MovieConstant
import com.frogobox.frogosdk.core.FrogoResponseCallback

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
class ConsumeMovieApi(private val apiKey: String) : IConsumeMovieApi {

    private val movieRepository = MovieRemoteDataSource

    override fun usingChuckInterceptor(context: Context) {
        movieRepository.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(callback: FrogoResponseCallback<Certifications<CertificationMovie>>) {
        movieRepository.getMovieCertifications(
            apiKey,
            object : FrogoResponseCallback<Certifications<CertificationMovie>> {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvCertifications(callback: FrogoResponseCallback<Certifications<CertificationTv>>) {
        movieRepository.getTvCertifications(
            apiKey,
            object : FrogoResponseCallback<Certifications<CertificationTv>> {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<Changes>
    ) {
        movieRepository.getMovieChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : FrogoResponseCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<Changes>
    ) {
        movieRepository.getTvChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : FrogoResponseCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<Changes>
    ) {
        movieRepository.getPersonChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : FrogoResponseCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<CollectionsDetail>
    ) {
        movieRepository.getCollectionDetails(
            collection_id,
            apiKey,
            language,
            object : FrogoResponseCallback<CollectionsDetail> {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<CollectionsImage>
    ) {
        movieRepository.getCollectionImages(
            collection_id,
            apiKey,
            language,
            object : FrogoResponseCallback<CollectionsImage> {
                override fun onSuccess(data: CollectionsImage) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<CollectionsTranslation>
    ) {
        movieRepository.getCollectionTranslations(
            collection_id,
            apiKey,
            language,
            object : FrogoResponseCallback<CollectionsTranslation> {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<CompaniesDetail>
    ) {
        movieRepository.getCompaniesDetails(
            company_id,
            apiKey,
            object : FrogoResponseCallback<CompaniesDetail> {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<CompaniesAlternateName>
    ) {
        movieRepository.getCompaniesAlternativeName(
            company_id,
            apiKey,
            object : FrogoResponseCallback<CompaniesAlternateName> {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesImage(company_id: Int, callback: FrogoResponseCallback<CompaniesImage>) {
        movieRepository.getCompaniesImage(
            company_id,
            apiKey,
            object : FrogoResponseCallback<CompaniesImage> {
                override fun onSuccess(data: CompaniesImage) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationApi(callback: FrogoResponseCallback<ConfigurationApi>) {
        movieRepository.getConfigurationApi(
            apiKey,
            object : FrogoResponseCallback<ConfigurationApi> {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationCountries(callback: FrogoResponseCallback<List<ConfigurationCountry>>) {
        movieRepository.getConfigurationCountries(
            apiKey,
            object : FrogoResponseCallback<List<ConfigurationCountry>> {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationJobs(callback: FrogoResponseCallback<List<ConfigurationJob>>) {
        movieRepository.getConfigurationJobs(
            apiKey,
            object : FrogoResponseCallback<List<ConfigurationJob>> {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationLanguages(callback: FrogoResponseCallback<List<ConfigurationLanguage>>) {
        movieRepository.getConfigurationLanguages(
            apiKey,
            object : FrogoResponseCallback<List<ConfigurationLanguage>> {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTranslations(callback: FrogoResponseCallback<List<String>>) {
        movieRepository.getConfigurationTranslations(
            apiKey,
            object : FrogoResponseCallback<List<String>> {
                override fun onSuccess(data: List<String>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTimezones(callback: FrogoResponseCallback<List<ConfigurationTimezone>>) {
        movieRepository.getConfigurationTimezones(
            apiKey,
            object : FrogoResponseCallback<List<ConfigurationTimezone>> {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCreditsDetails(credit_id: String, callback: FrogoResponseCallback<Credits>) {
        movieRepository.getCreditsDetails(
            credit_id,
            apiKey,
            object : FrogoResponseCallback<Credits> {
                override fun onSuccess(data: Credits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<Discover<DiscoverMovie>>
    ) {
        movieRepository.getDiscoverMovie(
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
            object : FrogoResponseCallback<Discover<DiscoverMovie>> {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<Discover<DiscoverTv>>
    ) {
        movieRepository.getDiscoverTv(
            apiKey, language,
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
            object : FrogoResponseCallback<Discover<DiscoverTv>> {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<Find>
    ) {
        movieRepository.getFindById(
            external_id,
            apiKey,
            external_source,
            language,
            object : FrogoResponseCallback<Find> {
                override fun onSuccess(data: Find) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresMovie(language: String?, callback: FrogoResponseCallback<Genres>) {
        movieRepository.getGenresMovie(
            apiKey,
            language,
            object : FrogoResponseCallback<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresTv(language: String?, callback: FrogoResponseCallback<Genres>) {
        movieRepository.getGenresTv(
            apiKey,
            language,
            object : FrogoResponseCallback<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: FrogoResponseCallback<KeywordsDetail>) {
        movieRepository.getKeywordsDetail(
            keyword_id,
            apiKey,
            object : FrogoResponseCallback<KeywordsDetail> {
                override fun onSuccess(data: KeywordsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<KeywordsMovies>
    ) {
        movieRepository.getKeywordsMovie(
            keyword_id,
            apiKey,
            language,
            include_adult,
            object : FrogoResponseCallback<KeywordsMovies> {
                override fun onSuccess(data: KeywordsMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieDetail>
    ) {
        movieRepository.getMoviesDetails(
            movie_id,
            apiKey,
            language,
            append_to_response,
            object : FrogoResponseCallback<MovieDetail> {
                override fun onSuccess(data: MovieDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieAccountState>
    ) {
        movieRepository.getMoviesAccountState(
            movie_id,
            apiKey,
            session_id,
            guest_session_id,
            object : FrogoResponseCallback<MovieAccountState> {
                override fun onSuccess(data: MovieAccountState) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieAlternativeTitle>
    ) {
        movieRepository.getMoviesAlternativeTitles(
            movie_id,
            apiKey,
            country,
            object : FrogoResponseCallback<MovieAlternativeTitle> {
                override fun onSuccess(data: MovieAlternativeTitle) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieChanges>
    ) {
        movieRepository.getMoviesChanges(
            movie_id,
            apiKey,
            start_date,
            end_date,
            page,
            object : FrogoResponseCallback<MovieChanges> {
                override fun onSuccess(data: MovieChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesCredits(movie_id: Int, callback: FrogoResponseCallback<MovieCredit>) {
        movieRepository.getMoviesCredits(
            movie_id,
            apiKey,
            object : FrogoResponseCallback<MovieCredit> {
                override fun onSuccess(data: MovieCredit) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieExternalId>
    ) {
        movieRepository.getMoviesExternalIds(
            movie_id,
            apiKey,
            object : FrogoResponseCallback<MovieExternalId> {
                override fun onSuccess(data: MovieExternalId) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieImages>
    ) {
        movieRepository.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language,
            object : FrogoResponseCallback<MovieImages> {
                override fun onSuccess(data: MovieImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesKeywords(movie_id: Int, callback: FrogoResponseCallback<MovieKeywords>) {
        movieRepository.getMoviesKeywords(
            movie_id,
            apiKey,
            object : FrogoResponseCallback<MovieKeywords> {
                override fun onSuccess(data: MovieKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieReleaseDates>
    ) {
        movieRepository.getMoviesReleaseDates(
            movie_id,
            apiKey,
            object : FrogoResponseCallback<MovieReleaseDates> {
                override fun onSuccess(data: MovieReleaseDates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieVideos>
    ) {
        movieRepository.getMoviesVideos(
            movie_id,
            apiKey,
            language,
            object : FrogoResponseCallback<MovieVideos> {
                override fun onSuccess(data: MovieVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieTranslations>
    ) {
        movieRepository.getMoviesTranslations(
            movie_id,
            apiKey,
            object : FrogoResponseCallback<MovieTranslations> {
                override fun onSuccess(data: MovieTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieRecommendations>
    ) {
        movieRepository.getMoviesRecommendations(
            movie_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<MovieRecommendations> {
                override fun onSuccess(data: MovieRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieSimilarMovies>
    ) {
        movieRepository.getMoviesSimilarMovies(
            movie_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<MovieSimilarMovies> {
                override fun onSuccess(data: MovieSimilarMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieReviews>
    ) {
        movieRepository.getMoviesReviews(
            movie_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<MovieReviews> {
                override fun onSuccess(data: MovieReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieLists>
    ) {
        movieRepository.getMoviesLists(
            movie_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<MovieLists> {
                override fun onSuccess(data: MovieLists) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesLatest(language: String?, callback: FrogoResponseCallback<MovieLatest>) {
        movieRepository.getMoviesLatest(
            apiKey,
            language,
            object : FrogoResponseCallback<MovieLatest> {
                override fun onSuccess(data: MovieLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieNowPlayings>
    ) {
        movieRepository.getMoviesNowPlaying(
            apiKey,
            language,
            page,
            region,
            object : FrogoResponseCallback<MovieNowPlayings> {
                override fun onSuccess(data: MovieNowPlayings) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MoviePopulars>
    ) {
        movieRepository.getMoviesPopular(
            apiKey,
            language,
            page,
            region,
            object : FrogoResponseCallback<MoviePopulars> {
                override fun onSuccess(data: MoviePopulars) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieTopRated>
    ) {
        movieRepository.getMoviesTopRated(
            apiKey,
            language,
            page,
            region,
            object : FrogoResponseCallback<MovieTopRated> {
                override fun onSuccess(data: MovieTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<MovieUpcoming>
    ) {
        movieRepository.getMoviesUpcoming(
            apiKey,
            language,
            page,
            region,
            object : FrogoResponseCallback<MovieUpcoming> {
                override fun onSuccess(data: MovieUpcoming) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingAllDay(callback: FrogoResponseCallback<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingAllWeek(callback: FrogoResponseCallback<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingMovieDay(callback: FrogoResponseCallback<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingMovieWeek(callback: FrogoResponseCallback<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingPersonDay(callback: FrogoResponseCallback<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingPersonWeek(callback: FrogoResponseCallback<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingTvDay(callback: FrogoResponseCallback<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingTvWeek(callback: FrogoResponseCallback<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : FrogoResponseCallback<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getReviews(review_id: String, callback: FrogoResponseCallback<Reviews>) {
        movieRepository.getReviews(
            review_id,
            apiKey,
            object : FrogoResponseCallback<Reviews> {
                override fun onSuccess(data: Reviews) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkDetail(network_id: Int, callback: FrogoResponseCallback<NetworkDetail>) {
        movieRepository.getNetworkDetail(
            network_id,
            apiKey,
            object : FrogoResponseCallback<NetworkDetail> {
                override fun onSuccess(data: NetworkDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<NetworkAlternativeName>
    ) {
        movieRepository.getNetworkAlternativeName(
            network_id,
            apiKey,
            object : FrogoResponseCallback<NetworkAlternativeName> {
                override fun onSuccess(data: NetworkAlternativeName) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkImage(network_id: Int, callback: FrogoResponseCallback<NetworkImage>) {
        movieRepository.getNetworkImage(
            network_id,
            apiKey,
            object : FrogoResponseCallback<NetworkImage> {
                override fun onSuccess(data: NetworkImage) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchCompanies>
    ) {
        movieRepository.searchCompanies(
            apiKey,
            query,
            page,
            object : FrogoResponseCallback<SearchCompanies> {
                override fun onSuccess(data: SearchCompanies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchCollections>
    ) {
        movieRepository.searchCollections(
            apiKey,
            query,
            language,
            page,
            object : FrogoResponseCallback<SearchCollections> {
                override fun onSuccess(data: SearchCollections) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchKeywords>
    ) {
        movieRepository.searchKeywords(
            apiKey,
            query,
            page,
            object : FrogoResponseCallback<SearchKeywords> {
                override fun onSuccess(data: SearchKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchMovies>
    ) {
        movieRepository.searchMovies(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            year,
            primary_release_year,
            object : FrogoResponseCallback<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchMulti>
    ) {
        movieRepository.searchMultiSearch(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            object : FrogoResponseCallback<SearchMulti> {
                override fun onSuccess(data: SearchMulti) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchPeople>
    ) {
        movieRepository.searchPeople(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            object : FrogoResponseCallback<SearchPeople> {
                override fun onSuccess(data: SearchPeople) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<SearchMovies>
    ) {
        movieRepository.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year,
            object : FrogoResponseCallback<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvDetails>
    ) {
        movieRepository.getTvDetails(
            tv_id,
            apiKey,
            language,
            append_to_response,
            object : FrogoResponseCallback<TvDetails> {
                override fun onSuccess(data: TvDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvAccountStates>
    ) {
        movieRepository.getTvAccountStates(
            tv_id,
            apiKey,
            language,
            guest_session_id,
            session_id,
            object : FrogoResponseCallback<TvAccountStates> {
                override fun onSuccess(data: TvAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvAlternativeTitles>
    ) {
        movieRepository.getTvAlternativeTitles(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvAlternativeTitles> {
                override fun onSuccess(data: TvAlternativeTitles) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvChanges>
    ) {
        movieRepository.getTvChanges(
            tv_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : FrogoResponseCallback<TvChanges> {
                override fun onSuccess(data: TvChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvContentRatings>
    ) {
        movieRepository.getTvContentRatings(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvContentRatings> {
                override fun onSuccess(data: TvContentRatings) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvCredits>
    ) {
        movieRepository.getTvCredits(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvCredits> {
                override fun onSuccess(data: TvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeGroups>
    ) {
        movieRepository.getTvEpisodeGroups(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvEpisodeGroups> {
                override fun onSuccess(data: TvEpisodeGroups) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvExternalIds>
    ) {
        movieRepository.getTvExternalIds(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvExternalIds> {
                override fun onSuccess(data: TvExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvImages>
    ) {
        movieRepository.getTvImages(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvImages> {
                override fun onSuccess(data: TvImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvKeyword(tv_id: Int, callback: FrogoResponseCallback<TvKeywords>) {
        movieRepository.getTvKeyword(
            tv_id,
            apiKey,
            object : FrogoResponseCallback<TvKeywords> {
                override fun onSuccess(data: TvKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvRecommendations>
    ) {
        movieRepository.getTvRecommendations(
            tv_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<TvRecommendations> {
                override fun onSuccess(data: TvRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvReviews(tv_id: Int, callback: FrogoResponseCallback<TvReviews>) {
        movieRepository.getTvReviews(
            tv_id,
            apiKey,
            object : FrogoResponseCallback<TvReviews> {
                override fun onSuccess(data: TvReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvScreenedTheatrically>
    ) {
        movieRepository.getTvScreenedTheatrically(
            tv_id,
            apiKey,
            object : FrogoResponseCallback<TvScreenedTheatrically> {
                override fun onSuccess(data: TvScreenedTheatrically) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSimilarTVShows>
    ) {
        movieRepository.getTvSimilarTvShows(
            tv_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<TvSimilarTVShows> {
                override fun onSuccess(data: TvSimilarTVShows) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvTranslations(tv_id: Int, callback: FrogoResponseCallback<TvTranslations>) {
        movieRepository.getTvTranslations(
            tv_id,
            apiKey,
            object : FrogoResponseCallback<TvTranslations> {
                override fun onSuccess(data: TvTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvVideos>
    ) {
        movieRepository.getTvVideos(
            tv_id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvVideos> {
                override fun onSuccess(data: TvVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvLatest(language: String?, callback: FrogoResponseCallback<TvLatest>) {
        movieRepository.getTvLatest(
            apiKey,
            language,
            object : FrogoResponseCallback<TvLatest> {
                override fun onSuccess(data: TvLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvAiringToday>
    ) {
        movieRepository.getTvAiringToday(
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<TvAiringToday> {
                override fun onSuccess(data: TvAiringToday) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvOnTheAir>
    ) {
        movieRepository.getTvOnTheAir(
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<TvOnTheAir> {
                override fun onSuccess(data: TvOnTheAir) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvPopular>
    ) {
        movieRepository.getTvPopular(
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<TvPopular> {
                override fun onSuccess(data: TvPopular) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvTopRated>
    ) {
        movieRepository.getTvTopRated(
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<TvTopRated> {
                override fun onSuccess(data: TvTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsDetails>
    ) {
        movieRepository.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response,
            object : FrogoResponseCallback<TvSeasonsDetails> {
                override fun onSuccess(data: TvSeasonsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsChanges>
    ) {
        movieRepository.getTvSeasonsChanges(
            season_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : FrogoResponseCallback<TvSeasonsChanges> {
                override fun onSuccess(data: TvSeasonsChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsAccountStates>
    ) {
        movieRepository.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id,
            object : FrogoResponseCallback<TvSeasonsAccountStates> {
                override fun onSuccess(data: TvSeasonsAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsCredits>
    ) {
        movieRepository.getTvSeasonsCredits(
            tv_id,
            season_number,
            apiKey,
            language,
            object : FrogoResponseCallback<TvSeasonsCredits> {
                override fun onSuccess(data: TvSeasonsCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsExternalIds>
    ) {
        movieRepository.getTvSeasonsExternalIds(
            tv_id,
            season_number,
            apiKey,
            language,
            object : FrogoResponseCallback<TvSeasonsExternalIds> {
                override fun onSuccess(data: TvSeasonsExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsImages>
    ) {
        movieRepository.getTvSeasonsImages(
            tv_id,
            season_number,
            apiKey,
            language,
            object : FrogoResponseCallback<TvSeasonsImages> {
                override fun onSuccess(data: TvSeasonsImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvSeasonsVideos>
    ) {
        movieRepository.getTvSeasonsVideos(
            tv_id,
            season_number,
            apiKey,
            language,
            object : FrogoResponseCallback<TvSeasonsVideos> {
                override fun onSuccess(data: TvSeasonsVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeDetails>
    ) {
        movieRepository.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response,
            object : FrogoResponseCallback<TvEpisodeDetails> {
                override fun onSuccess(data: TvEpisodeDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeChanges>
    ) {
        movieRepository.getTvEpisodeChanges(
            episode_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : FrogoResponseCallback<TvEpisodeChanges> {
                override fun onSuccess(data: TvEpisodeChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeAccountStates>
    ) {
        movieRepository.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id,
            object : FrogoResponseCallback<TvEpisodeAccountStates> {
                override fun onSuccess(data: TvEpisodeAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeCredits>
    ) {
        movieRepository.getTvEpisodeCredits(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : FrogoResponseCallback<TvEpisodeCredits> {
                override fun onSuccess(data: TvEpisodeCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeExternalIds>
    ) {
        movieRepository.getTvEpisodeExternalIds(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : FrogoResponseCallback<TvEpisodeExternalIds> {
                override fun onSuccess(data: TvEpisodeExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeImages>
    ) {
        movieRepository.getTvEpisodeImages(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : FrogoResponseCallback<TvEpisodeImages> {
                override fun onSuccess(data: TvEpisodeImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeTranslation>
    ) {
        movieRepository.getTvEpisodeTranslations(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : FrogoResponseCallback<TvEpisodeTranslation> {
                override fun onSuccess(data: TvEpisodeTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeVideos>
    ) {
        movieRepository.getTvEpisodeVideos(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            object : FrogoResponseCallback<TvEpisodeVideos> {
                override fun onSuccess(data: TvEpisodeVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<TvEpisodeGroupsDetails>
    ) {
        movieRepository.getTvEpisodeGroupsDetails(
            id,
            apiKey,
            language,
            object : FrogoResponseCallback<TvEpisodeGroupsDetails> {
                override fun onSuccess(data: TvEpisodeGroupsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleDetails>
    ) {
        movieRepository.getPeopleDetails(
            person_id,
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleDetails> {
                override fun onSuccess(data: PeopleDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleChanges>
    ) {
        movieRepository.getPeopleChanges(
            person_id,
            apiKey,
            endDate,
            page,
            startDate,
            object : FrogoResponseCallback<PeopleChanges> {
                override fun onSuccess(data: PeopleChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleMovieCredits>
    ) {
        movieRepository.getPeopleMovieCredits(
            person_id,
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleMovieCredits> {
                override fun onSuccess(data: PeopleMovieCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleTvCredits>
    ) {
        movieRepository.getPeopleTvCredits(
            person_id,
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleTvCredits> {
                override fun onSuccess(data: PeopleTvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleCombinedCredits>
    ) {
        movieRepository.getPeopleCombinedCredits(
            person_id,
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleCombinedCredits> {
                override fun onSuccess(data: PeopleCombinedCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleExternalIds>
    ) {
        movieRepository.getPeopleExternalIds(
            person_id,
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleExternalIds> {
                override fun onSuccess(data: PeopleExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleImages(person_id: Int, callback: FrogoResponseCallback<PeopleImages>) {
        movieRepository.getPeopleImages(
            person_id,
            apiKey,
            object : FrogoResponseCallback<PeopleImages> {
                override fun onSuccess(data: PeopleImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleTaggedImages>
    ) {
        movieRepository.getPeopleTaggedImages(
            person_id,
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<PeopleTaggedImages> {
                override fun onSuccess(data: PeopleTaggedImages) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeopleTranslations>
    ) {
        movieRepository.getPeopleTranslations(
            person_id,
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleTranslations> {
                override fun onSuccess(data: PeopleTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleLatest(language: String?, callback: FrogoResponseCallback<PeopleLatest>) {
        movieRepository.getPeopleLatest(
            apiKey,
            language,
            object : FrogoResponseCallback<PeopleLatest> {
                override fun onSuccess(data: PeopleLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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
        callback: FrogoResponseCallback<PeoplePopular>
    ) {
        movieRepository.getPeoplePopular(
            apiKey,
            language,
            page,
            object : FrogoResponseCallback<PeoplePopular> {
                override fun onSuccess(data: PeoplePopular) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.onFailed(statusCode, errorMessage)
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