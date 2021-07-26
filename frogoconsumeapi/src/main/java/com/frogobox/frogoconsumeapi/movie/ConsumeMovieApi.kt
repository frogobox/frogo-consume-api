package com.frogobox.frogoconsumeapi.movie

import android.content.Context
import com.frogobox.frogoconsumeapi.movie.callback.MovieResultCallback
import com.frogobox.frogoconsumeapi.movie.data.model.*
import com.frogobox.frogoconsumeapi.movie.data.response.*
import com.frogobox.frogoconsumeapi.movie.data.source.MovieDataSource
import com.frogobox.frogoconsumeapi.movie.data.source.MovieRemoteDataSource
import com.frogobox.frogoconsumeapi.movie.data.source.MovieRepository
import com.frogobox.frogoconsumeapi.movie.util.MovieConstant

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
class ConsumeMovieApi(private val apiKey: String) : ConsumeMovieApiView {

    private val movieRepository = MovieRepository(MovieRemoteDataSource)

    override fun usingChuckInterceptor(context: Context) {
        movieRepository.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(callback: MovieResultCallback<Certifications<CertificationMovie>>) {
        movieRepository.getMovieCertifications(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>> {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvCertifications(callback: MovieResultCallback<Certifications<CertificationTv>>) {
        movieRepository.getTvCertifications(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>> {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<Changes>
    ) {
        movieRepository.getMovieChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : MovieDataSource.GetRemoteCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<Changes>
    ) {
        movieRepository.getTvChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : MovieDataSource.GetRemoteCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<Changes>
    ) {
        movieRepository.getPersonChangeList(
            apiKey,
            endDate,
            startDate,
            page,
            object : MovieDataSource.GetRemoteCallback<Changes> {
                override fun onSuccess(data: Changes) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<CollectionsDetail>
    ) {
        movieRepository.getCollectionDetails(
            collection_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<CollectionsDetail> {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<CollectionsImage>
    ) {
        movieRepository.getCollectionImages(
            collection_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<CollectionsImage> {
                override fun onSuccess(data: CollectionsImage) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<CollectionsTranslation>
    ) {
        movieRepository.getCollectionTranslations(
            collection_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<CollectionsTranslation> {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<CompaniesDetail>
    ) {
        movieRepository.getCompaniesDetails(
            company_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<CompaniesDetail> {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<CompaniesAlternateName>
    ) {
        movieRepository.getCompaniesAlternativeName(
            company_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<CompaniesAlternateName> {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCompaniesImage(company_id: Int, callback: MovieResultCallback<CompaniesImage>) {
        movieRepository.getCompaniesImage(
            company_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<CompaniesImage> {
                override fun onSuccess(data: CompaniesImage) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationApi(callback: MovieResultCallback<ConfigurationApi>) {
        movieRepository.getConfigurationApi(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<ConfigurationApi> {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationCountries(callback: MovieResultCallback<List<ConfigurationCountry>>) {
        movieRepository.getConfigurationCountries(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationCountry>> {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationJobs(callback: MovieResultCallback<List<ConfigurationJob>>) {
        movieRepository.getConfigurationJobs(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationJob>> {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationLanguages(callback: MovieResultCallback<List<ConfigurationLanguage>>) {
        movieRepository.getConfigurationLanguages(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationLanguage>> {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTranslations(callback: MovieResultCallback<List<String>>) {
        movieRepository.getConfigurationTranslations(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<String>> {
                override fun onSuccess(data: List<String>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getConfigurationTimezones(callback: MovieResultCallback<List<ConfigurationTimezone>>) {
        movieRepository.getConfigurationTimezones(
            apiKey,
            object : MovieDataSource.GetRemoteCallback<List<ConfigurationTimezone>> {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getCreditsDetails(credit_id: String, callback: MovieResultCallback<Credits>) {
        movieRepository.getCreditsDetails(
            credit_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Credits> {
                override fun onSuccess(data: Credits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<Discover<DiscoverMovie>>
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
            object : MovieDataSource.GetRemoteCallback<Discover<DiscoverMovie>> {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<Discover<DiscoverTv>>
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
            object : MovieDataSource.GetRemoteCallback<Discover<DiscoverTv>> {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<Find>
    ) {
        movieRepository.getFindById(
            external_id,
            apiKey,
            external_source,
            language,
            object : MovieDataSource.GetRemoteCallback<Find> {
                override fun onSuccess(data: Find) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresMovie(language: String?, callback: MovieResultCallback<Genres>) {
        movieRepository.getGenresMovie(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getGenresTv(language: String?, callback: MovieResultCallback<Genres>) {
        movieRepository.getGenresTv(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<Genres> {
                override fun onSuccess(data: Genres) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getKeywordsDetail(keyword_id: Int, callback: MovieResultCallback<KeywordsDetail>) {
        movieRepository.getKeywordsDetail(
            keyword_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<KeywordsDetail> {
                override fun onSuccess(data: KeywordsDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<KeywordsMovies>
    ) {
        movieRepository.getKeywordsMovie(
            keyword_id,
            apiKey,
            language,
            include_adult,
            object : MovieDataSource.GetRemoteCallback<KeywordsMovies> {
                override fun onSuccess(data: KeywordsMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieDetail>
    ) {
        movieRepository.getMoviesDetails(
            movie_id,
            apiKey,
            language,
            append_to_response,
            object : MovieDataSource.GetRemoteCallback<MovieDetail> {
                override fun onSuccess(data: MovieDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieAccountState>
    ) {
        movieRepository.getMoviesAccountState(
            movie_id,
            apiKey,
            session_id,
            guest_session_id,
            object : MovieDataSource.GetRemoteCallback<MovieAccountState> {
                override fun onSuccess(data: MovieAccountState) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieAlternativeTitle>
    ) {
        movieRepository.getMoviesAlternativeTitles(
            movie_id,
            apiKey,
            country,
            object : MovieDataSource.GetRemoteCallback<MovieAlternativeTitle> {
                override fun onSuccess(data: MovieAlternativeTitle) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieChanges>
    ) {
        movieRepository.getMoviesChanges(
            movie_id,
            apiKey,
            start_date,
            end_date,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieChanges> {
                override fun onSuccess(data: MovieChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesCredits(movie_id: Int, callback: MovieResultCallback<MovieCredit>) {
        movieRepository.getMoviesCredits(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieCredit> {
                override fun onSuccess(data: MovieCredit) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieExternalId>
    ) {
        movieRepository.getMoviesExternalIds(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieExternalId> {
                override fun onSuccess(data: MovieExternalId) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieImages>
    ) {
        movieRepository.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language,
            object : MovieDataSource.GetRemoteCallback<MovieImages> {
                override fun onSuccess(data: MovieImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesKeywords(movie_id: Int, callback: MovieResultCallback<MovieKeywords>) {
        movieRepository.getMoviesKeywords(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieKeywords> {
                override fun onSuccess(data: MovieKeywords) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieReleaseDates>
    ) {
        movieRepository.getMoviesReleaseDates(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieReleaseDates> {
                override fun onSuccess(data: MovieReleaseDates) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieVideos>
    ) {
        movieRepository.getMoviesVideos(
            movie_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<MovieVideos> {
                override fun onSuccess(data: MovieVideos) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieTranslations>
    ) {
        movieRepository.getMoviesTranslations(
            movie_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<MovieTranslations> {
                override fun onSuccess(data: MovieTranslations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieRecommendations>
    ) {
        movieRepository.getMoviesRecommendations(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieRecommendations> {
                override fun onSuccess(data: MovieRecommendations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieSimilarMovies>
    ) {
        movieRepository.getMoviesSimilarMovies(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieSimilarMovies> {
                override fun onSuccess(data: MovieSimilarMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieReviews>
    ) {
        movieRepository.getMoviesReviews(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieReviews> {
                override fun onSuccess(data: MovieReviews) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieLists>
    ) {
        movieRepository.getMoviesLists(
            movie_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<MovieLists> {
                override fun onSuccess(data: MovieLists) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getMoviesLatest(language: String?, callback: MovieResultCallback<MovieLatest>) {
        movieRepository.getMoviesLatest(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<MovieLatest> {
                override fun onSuccess(data: MovieLatest) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieNowPlayings>
    ) {
        movieRepository.getMoviesNowPlaying(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MovieNowPlayings> {
                override fun onSuccess(data: MovieNowPlayings) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MoviePopulars>
    ) {
        movieRepository.getMoviesPopular(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MoviePopulars> {
                override fun onSuccess(data: MoviePopulars) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieTopRated>
    ) {
        movieRepository.getMoviesTopRated(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MovieTopRated> {
                override fun onSuccess(data: MovieTopRated) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<MovieUpcoming>
    ) {
        movieRepository.getMoviesUpcoming(
            apiKey,
            language,
            page,
            region,
            object : MovieDataSource.GetRemoteCallback<MovieUpcoming> {
                override fun onSuccess(data: MovieUpcoming) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingAllDay(callback: MovieResultCallback<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingAllWeek(callback: MovieResultCallback<Trending<TrendingAll>>) {
        movieRepository.getTrendingAll(
            MovieConstant.VALUE_MEDIA_TYPE_ALL,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingAll>> {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingMovieDay(callback: MovieResultCallback<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingMovieWeek(callback: MovieResultCallback<Trending<TrendingMovie>>) {
        movieRepository.getTrendingMovie(
            MovieConstant.VALUE_MEDIA_TYPE_MOVIE,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingMovie>> {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingPersonDay(callback: MovieResultCallback<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingPersonWeek(callback: MovieResultCallback<Trending<TrendingPerson>>) {
        movieRepository.getTrendingPerson(
            MovieConstant.VALUE_MEDIA_TYPE_PERSON,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingPerson>> {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingTvDay(callback: MovieResultCallback<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_DAY,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTrendingTvWeek(callback: MovieResultCallback<Trending<TrendingTv>>) {
        movieRepository.getTrendingTv(
            MovieConstant.VALUE_MEDIA_TYPE_TV,
            MovieConstant.VALUE_TIME_WINDOW_WEEK,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Trending<TrendingTv>> {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getReviews(review_id: String, callback: MovieResultCallback<Reviews>) {
        movieRepository.getReviews(
            review_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<Reviews> {
                override fun onSuccess(data: Reviews) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkDetail(network_id: Int, callback: MovieResultCallback<NetworkDetail>) {
        movieRepository.getNetworkDetail(
            network_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<NetworkDetail> {
                override fun onSuccess(data: NetworkDetail) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<NetworkAlternativeName>
    ) {
        movieRepository.getNetworkAlternativeName(
            network_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<NetworkAlternativeName> {
                override fun onSuccess(data: NetworkAlternativeName) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getNetworkImage(network_id: Int, callback: MovieResultCallback<NetworkImage>) {
        movieRepository.getNetworkImage(
            network_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<NetworkImage> {
                override fun onSuccess(data: NetworkImage) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchCompanies>
    ) {
        movieRepository.searchCompanies(
            apiKey,
            query,
            page,
            object : MovieDataSource.GetRemoteCallback<SearchCompanies> {
                override fun onSuccess(data: SearchCompanies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchCollections>
    ) {
        movieRepository.searchCollections(
            apiKey,
            query,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<SearchCollections> {
                override fun onSuccess(data: SearchCollections) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchKeywords>
    ) {
        movieRepository.searchKeywords(
            apiKey,
            query,
            page,
            object : MovieDataSource.GetRemoteCallback<SearchKeywords> {
                override fun onSuccess(data: SearchKeywords) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchMovies>
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
            object : MovieDataSource.GetRemoteCallback<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchMulti>
    ) {
        movieRepository.searchMultiSearch(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            object : MovieDataSource.GetRemoteCallback<SearchMulti> {
                override fun onSuccess(data: SearchMulti) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchPeople>
    ) {
        movieRepository.searchPeople(
            apiKey,
            query,
            language,
            page,
            include_adult,
            region,
            object : MovieDataSource.GetRemoteCallback<SearchPeople> {
                override fun onSuccess(data: SearchPeople) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<SearchMovies>
    ) {
        movieRepository.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year,
            object : MovieDataSource.GetRemoteCallback<SearchMovies> {
                override fun onSuccess(data: SearchMovies) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvDetails>
    ) {
        movieRepository.getTvDetails(
            tv_id,
            apiKey,
            language,
            append_to_response,
            object : MovieDataSource.GetRemoteCallback<TvDetails> {
                override fun onSuccess(data: TvDetails) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvAccountStates>
    ) {
        movieRepository.getTvAccountStates(
            tv_id,
            apiKey,
            language,
            guest_session_id,
            session_id,
            object : MovieDataSource.GetRemoteCallback<TvAccountStates> {
                override fun onSuccess(data: TvAccountStates) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvAlternativeTitles>
    ) {
        movieRepository.getTvAlternativeTitles(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvAlternativeTitles> {
                override fun onSuccess(data: TvAlternativeTitles) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvChanges>
    ) {
        movieRepository.getTvChanges(
            tv_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : MovieDataSource.GetRemoteCallback<TvChanges> {
                override fun onSuccess(data: TvChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvContentRatings>
    ) {
        movieRepository.getTvContentRatings(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvContentRatings> {
                override fun onSuccess(data: TvContentRatings) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvCredits>
    ) {
        movieRepository.getTvCredits(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvCredits> {
                override fun onSuccess(data: TvCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeGroups>
    ) {
        movieRepository.getTvEpisodeGroups(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeGroups> {
                override fun onSuccess(data: TvEpisodeGroups) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvExternalIds>
    ) {
        movieRepository.getTvExternalIds(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvExternalIds> {
                override fun onSuccess(data: TvExternalIds) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvImages>
    ) {
        movieRepository.getTvImages(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvImages> {
                override fun onSuccess(data: TvImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvKeyword(tv_id: Int, callback: MovieResultCallback<TvKeywords>) {
        movieRepository.getTvKeyword(
            tv_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvKeywords> {
                override fun onSuccess(data: TvKeywords) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvRecommendations>
    ) {
        movieRepository.getTvRecommendations(
            tv_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvRecommendations> {
                override fun onSuccess(data: TvRecommendations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvReviews(tv_id: Int, callback: MovieResultCallback<TvReviews>) {
        movieRepository.getTvReviews(
            tv_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvReviews> {
                override fun onSuccess(data: TvReviews) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvScreenedTheatrically>
    ) {
        movieRepository.getTvScreenedTheatrically(
            tv_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvScreenedTheatrically> {
                override fun onSuccess(data: TvScreenedTheatrically) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSimilarTVShows>
    ) {
        movieRepository.getTvSimilarTvShows(
            tv_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvSimilarTVShows> {
                override fun onSuccess(data: TvSimilarTVShows) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvTranslations(tv_id: Int, callback: MovieResultCallback<TvTranslations>) {
        movieRepository.getTvTranslations(
            tv_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvTranslations> {
                override fun onSuccess(data: TvTranslations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvVideos>
    ) {
        movieRepository.getTvVideos(
            tv_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvVideos> {
                override fun onSuccess(data: TvVideos) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getTvLatest(language: String?, callback: MovieResultCallback<TvLatest>) {
        movieRepository.getTvLatest(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvLatest> {
                override fun onSuccess(data: TvLatest) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvAiringToday>
    ) {
        movieRepository.getTvAiringToday(
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvAiringToday> {
                override fun onSuccess(data: TvAiringToday) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvOnTheAir>
    ) {
        movieRepository.getTvOnTheAir(
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvOnTheAir> {
                override fun onSuccess(data: TvOnTheAir) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvPopular>
    ) {
        movieRepository.getTvPopular(
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvPopular> {
                override fun onSuccess(data: TvPopular) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvTopRated>
    ) {
        movieRepository.getTvTopRated(
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<TvTopRated> {
                override fun onSuccess(data: TvTopRated) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsDetails>
    ) {
        movieRepository.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsDetails> {
                override fun onSuccess(data: TvSeasonsDetails) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsChanges>
    ) {
        movieRepository.getTvSeasonsChanges(
            season_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsChanges> {
                override fun onSuccess(data: TvSeasonsChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsAccountStates>
    ) {
        movieRepository.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsAccountStates> {
                override fun onSuccess(data: TvSeasonsAccountStates) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsCredits>
    ) {
        movieRepository.getTvSeasonsCredits(
            tv_id,
            season_number,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsCredits> {
                override fun onSuccess(data: TvSeasonsCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsExternalIds>
    ) {
        movieRepository.getTvSeasonsExternalIds(
            tv_id,
            season_number,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsExternalIds> {
                override fun onSuccess(data: TvSeasonsExternalIds) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsImages>
    ) {
        movieRepository.getTvSeasonsImages(
            tv_id,
            season_number,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsImages> {
                override fun onSuccess(data: TvSeasonsImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvSeasonsVideos>
    ) {
        movieRepository.getTvSeasonsVideos(
            tv_id,
            season_number,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvSeasonsVideos> {
                override fun onSuccess(data: TvSeasonsVideos) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeDetails>
    ) {
        movieRepository.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeDetails> {
                override fun onSuccess(data: TvEpisodeDetails) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeChanges>
    ) {
        movieRepository.getTvEpisodeChanges(
            episode_id,
            apiKey,
            startDate,
            endDate,
            page,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeChanges> {
                override fun onSuccess(data: TvEpisodeChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeAccountStates>
    ) {
        movieRepository.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeAccountStates> {
                override fun onSuccess(data: TvEpisodeAccountStates) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeCredits>
    ) {
        movieRepository.getTvEpisodeCredits(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeCredits> {
                override fun onSuccess(data: TvEpisodeCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeExternalIds>
    ) {
        movieRepository.getTvEpisodeExternalIds(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeExternalIds> {
                override fun onSuccess(data: TvEpisodeExternalIds) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeImages>
    ) {
        movieRepository.getTvEpisodeImages(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeImages> {
                override fun onSuccess(data: TvEpisodeImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeTranslation>
    ) {
        movieRepository.getTvEpisodeTranslations(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeTranslation> {
                override fun onSuccess(data: TvEpisodeTranslation) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeVideos>
    ) {
        movieRepository.getTvEpisodeVideos(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeVideos> {
                override fun onSuccess(data: TvEpisodeVideos) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<TvEpisodeGroupsDetails>
    ) {
        movieRepository.getTvEpisodeGroupsDetails(
            id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<TvEpisodeGroupsDetails> {
                override fun onSuccess(data: TvEpisodeGroupsDetails) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleDetails>
    ) {
        movieRepository.getPeopleDetails(
            person_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleDetails> {
                override fun onSuccess(data: PeopleDetails) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleChanges>
    ) {
        movieRepository.getPeopleChanges(
            person_id,
            apiKey,
            endDate,
            page,
            startDate,
            object : MovieDataSource.GetRemoteCallback<PeopleChanges> {
                override fun onSuccess(data: PeopleChanges) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleMovieCredits>
    ) {
        movieRepository.getPeopleMovieCredits(
            person_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleMovieCredits> {
                override fun onSuccess(data: PeopleMovieCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleTvCredits>
    ) {
        movieRepository.getPeopleTvCredits(
            person_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleTvCredits> {
                override fun onSuccess(data: PeopleTvCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleCombinedCredits>
    ) {
        movieRepository.getPeopleCombinedCredits(
            person_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleCombinedCredits> {
                override fun onSuccess(data: PeopleCombinedCredits) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleExternalIds>
    ) {
        movieRepository.getPeopleExternalIds(
            person_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleExternalIds> {
                override fun onSuccess(data: PeopleExternalIds) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleImages(person_id: Int, callback: MovieResultCallback<PeopleImages>) {
        movieRepository.getPeopleImages(
            person_id,
            apiKey,
            object : MovieDataSource.GetRemoteCallback<PeopleImages> {
                override fun onSuccess(data: PeopleImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleTaggedImages>
    ) {
        movieRepository.getPeopleTaggedImages(
            person_id,
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<PeopleTaggedImages> {
                override fun onSuccess(data: PeopleTaggedImages) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeopleTranslations>
    ) {
        movieRepository.getPeopleTranslations(
            person_id,
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleTranslations> {
                override fun onSuccess(data: PeopleTranslations) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun getPeopleLatest(language: String?, callback: MovieResultCallback<PeopleLatest>) {
        movieRepository.getPeopleLatest(
            apiKey,
            language,
            object : MovieDataSource.GetRemoteCallback<PeopleLatest> {
                override fun onSuccess(data: PeopleLatest) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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
        callback: MovieResultCallback<PeoplePopular>
    ) {
        movieRepository.getPeoplePopular(
            apiKey,
            language,
            page,
            object : MovieDataSource.GetRemoteCallback<PeoplePopular> {
                override fun onSuccess(data: PeoplePopular) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
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