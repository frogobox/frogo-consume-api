package com.frogobox.frogoconsumeapi.movie.data.source

import android.content.Context
import com.frogobox.frogoconsumeapi.movie.data.model.*
import com.frogobox.frogoconsumeapi.movie.data.response.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

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
object MovieRemoteDataSource : MovieDataSource {

    private val movieApiService = MovieApiService

    override fun usingChuckInterceptor(context: Context) {
        movieApiService.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>>
    ) {
        movieApiService.getApiService
            .getMovieCertifications(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Certifications<CertificationMovie>>() {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>>
    ) {
        movieApiService.getApiService
            .getTvCertifications(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Certifications<CertificationTv>>() {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        movieApiService.getApiService
            .getMovieChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        movieApiService.getApiService
            .getTvChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        movieApiService.getApiService
            .getPersonChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsDetail>
    ) {
        movieApiService.getApiService
            .getCollectionDetails(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CollectionsDetail>() {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsImage>
    ) {
        movieApiService.getApiService
            .getCollectionImages(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CollectionsImage>() {
                override fun onSuccess(data: CollectionsImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsTranslation>
    ) {
        movieApiService.getApiService
            .getCollectionTranslations(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CollectionsTranslation>() {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesDetail>
    ) {
        movieApiService.getApiService
            .getCompaniesDetails(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CompaniesDetail>() {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesAlternateName>
    ) {
        movieApiService.getApiService
            .getCompaniesAlternativeName(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CompaniesAlternateName>() {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesImage>
    ) {
        movieApiService.getApiService
            .getCompaniesImage(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<CompaniesImage>() {
                override fun onSuccess(data: CompaniesImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<ConfigurationApi>
    ) {
        movieApiService.getApiService
            .getConfigurationApi(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<ConfigurationApi>() {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationCountry>>
    ) {
        movieApiService.getApiService
            .getConfigurationCountries(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationCountry>>() {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationJob>>
    ) {
        movieApiService.getApiService
            .getConfigurationJobs(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationJob>>() {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationLanguage>>
    ) {
        movieApiService.getApiService
            .getConfigurationLanguages(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationLanguage>>() {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<String>>
    ) {
        movieApiService.getApiService
            .getConfigurationTranslations(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<String>>() {
                override fun onSuccess(data: List<String>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<List<ConfigurationTimezone>>
    ) {
        movieApiService.getApiService
            .getConfigurationTimezones(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<List<ConfigurationTimezone>>() {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Credits>
    ) {
        movieApiService.getApiService
            .getCreditsDetails(credit_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Credits>() {
                override fun onSuccess(data: Credits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
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
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverMovie>>
    ) {
        movieApiService.getApiService
            .getDiscoverMovie(
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
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Discover<DiscoverMovie>>() {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
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
        callback: MovieDataSource.GetRemoteCallback<Discover<DiscoverTv>>
    ) {
        movieApiService.getApiService
            .getDiscoverTv(
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
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Discover<DiscoverTv>>() {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Find>
    ) {
        movieApiService.getApiService
            .getFindById(external_id, apiKey, external_source, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Find>() {
                override fun onSuccess(data: Find) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Genres>
    ) {
        movieApiService.getApiService
            .getGenresMovie(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Genres>() {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<Genres>
    ) {
        movieApiService.getApiService
            .getGenresTv(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Genres>() {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<KeywordsDetail>
    ) {
        movieApiService.getApiService
            .getKeywordsDetail(keyword_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<KeywordsDetail>() {
                override fun onSuccess(data: KeywordsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: MovieDataSource.GetRemoteCallback<KeywordsMovies>
    ) {
        movieApiService.getApiService
            .getKeywordsMovie(keyword_id, apiKey, language, include_adult)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<KeywordsMovies>() {
                override fun onSuccess(data: KeywordsMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieDetail>
    ) {
        movieApiService.getApiService
            .getMoviesDetails(movie_id, apiKey, language, append_to_response)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieDetail>() {
                override fun onSuccess(data: MovieDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieAccountState>
    ) {
        movieApiService.getApiService
            .getMoviesAccountState(movie_id, apiKey, session_id, guest_session_id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieAccountState>() {
                override fun onSuccess(data: MovieAccountState) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieAlternativeTitle>
    ) {
        movieApiService.getApiService
            .getMoviesAlternativeTitles(movie_id, apiKey, country)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieAlternativeTitle>() {
                override fun onSuccess(data: MovieAlternativeTitle) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieChanges>
    ) {
        movieApiService.getApiService
            .getMoviesChanges(movie_id, apiKey, start_date, end_date, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieChanges>() {
                override fun onSuccess(data: MovieChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieCredit>
    ) {
        movieApiService.getApiService
            .getMoviesCredits(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieCredit>() {
                override fun onSuccess(data: MovieCredit) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieExternalId>
    ) {
        movieApiService.getApiService.getMoviesExternalIds(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieExternalId>() {
                override fun onSuccess(data: MovieExternalId) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieImages>
    ) {
        movieApiService.getApiService.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language
        )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieImages>() {
                override fun onSuccess(data: MovieImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieKeywords>
    ) {
        movieApiService.getApiService.getMoviesKeywords(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieKeywords>() {
                override fun onSuccess(data: MovieKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieReleaseDates>
    ) {
        movieApiService.getApiService.getMoviesReleaseDates(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieReleaseDates>() {
                override fun onSuccess(data: MovieReleaseDates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieVideos>
    ) {
        movieApiService.getApiService.getMoviesVideos(movie_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieVideos>() {
                override fun onSuccess(data: MovieVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<MovieTranslations>
    ) {
        movieApiService.getApiService.getMoviesTranslations(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieTranslations>() {
                override fun onSuccess(data: MovieTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieRecommendations>
    ) {
        movieApiService.getApiService.getMoviesRecommendations(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieRecommendations>() {
                override fun onSuccess(data: MovieRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieSimilarMovies>
    ) {
        movieApiService.getApiService.getMoviesSimilarMovies(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieSimilarMovies>() {
                override fun onSuccess(data: MovieSimilarMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieReviews>
    ) {
        movieApiService.getApiService.getMoviesReviews(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieReviews>() {
                override fun onSuccess(data: MovieReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<MovieLists>
    ) {
        movieApiService.getApiService.getMoviesLists(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieLists>() {
                override fun onSuccess(data: MovieLists) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieLatest>
    ) {
        movieApiService.getApiService.getMoviesLatest(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieLatest>() {
                override fun onSuccess(data: MovieLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieNowPlayings>
    ) {
        movieApiService.getApiService.getMoviesNowPlaying(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieNowPlayings>() {
                override fun onSuccess(data: MovieNowPlayings) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MoviePopulars>
    ) {
        movieApiService.getApiService.getMoviesPopular(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MoviePopulars>() {
                override fun onSuccess(data: MoviePopulars) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieTopRated>
    ) {
        movieApiService.getApiService.getMoviesTopRated(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieTopRated>() {
                override fun onSuccess(data: MovieTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<MovieUpcoming>
    ) {
        movieApiService.getApiService.getMoviesUpcoming(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<MovieUpcoming>() {
                override fun onSuccess(data: MovieUpcoming) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingAll>>
    ) {
        movieApiService.getApiService
            .getTrendingAll(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Trending<TrendingAll>>() {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingMovie>>
    ) {
        movieApiService.getApiService
            .getTrendingMovie(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Trending<TrendingMovie>>() {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingPerson>>
    ) {
        movieApiService.getApiService
            .getTrendingPerson(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Trending<TrendingPerson>>() {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Trending<TrendingTv>>
    ) {
        movieApiService.getApiService
            .getTrendingTv(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Trending<TrendingTv>>() {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getReviews(
        review_id: String,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Reviews>
    ) {
        movieApiService.getApiService
            .getReviews(review_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<Reviews>() {
                override fun onSuccess(data: Reviews) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<NetworkDetail>
    ) {
        movieApiService.getApiService
            .getNetworkDetail(network_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<NetworkDetail>() {
                override fun onSuccess(data: NetworkDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<NetworkAlternativeName>
    ) {
        movieApiService.getApiService
            .getNetworkAlternativeName(network_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<NetworkAlternativeName>() {
                override fun onSuccess(data: NetworkAlternativeName) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<NetworkImage>
    ) {
        movieApiService.getApiService
            .getNetworkImage(network_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<NetworkImage>() {
                override fun onSuccess(data: NetworkImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchCompanies>
    ) {
        movieApiService.getApiService
            .searchCompanies(apiKey, query, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchCompanies>() {
                override fun onSuccess(data: SearchCompanies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchCollections>
    ) {
        movieApiService.getApiService
            .searchCollections(apiKey, query, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchCollections>() {
                override fun onSuccess(data: SearchCollections) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchKeywords>
    ) {
        movieApiService.getApiService
            .searchKeywords(apiKey, query, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchKeywords>() {
                override fun onSuccess(data: SearchKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
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
        callback: MovieDataSource.GetRemoteCallback<SearchMovies>
    ) {
        movieApiService.getApiService
            .searchMovies(
                apiKey,
                query,
                language,
                page,
                include_adult,
                region,
                year,
                primary_release_year
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchMovies>() {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchMultiSearch(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<SearchMulti>
    ) {
        movieApiService.getApiService
            .searchMultiSearch(apiKey, query, language, page, include_adult, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchMulti>() {
                override fun onSuccess(data: SearchMulti) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchPeople(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: MovieDataSource.GetRemoteCallback<SearchPeople>
    ) {
        movieApiService.getApiService
            .searchPeople(apiKey, query, language, page, include_adult, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchPeople>() {
                override fun onSuccess(data: SearchPeople) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchTvShows(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: MovieDataSource.GetRemoteCallback<SearchMovies>
    ) {
        movieApiService.getApiService
            .searchTvShows(apiKey, query, language, page, include_adult, first_air_date_year)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<SearchMovies>() {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<TvDetails>
    ) {
        movieApiService.getApiService
            .getTvDetails(tv_id, apiKey, language, append_to_response)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvDetails>() {
                override fun onSuccess(data: TvDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<TvAccountStates>
    ) {
        movieApiService.getApiService
            .getTvAccountStates(tv_id, apiKey, language, guest_session_id, session_id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvAccountStates>() {
                override fun onSuccess(data: TvAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvAlternativeTitles>
    ) {
        movieApiService.getApiService
            .getTvAlternativeTitles(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvAlternativeTitles>() {
                override fun onSuccess(data: TvAlternativeTitles) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvChanges>
    ) {
        movieApiService.getApiService
            .getTvChanges(tv_id, apiKey, startDate, endDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvChanges>() {
                override fun onSuccess(data: TvChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvContentRatings>
    ) {
        movieApiService.getApiService
            .getTvContentRatings(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvContentRatings>() {
                override fun onSuccess(data: TvContentRatings) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvCredits>
    ) {
        movieApiService.getApiService
            .getTvCredits(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvCredits>() {
                override fun onSuccess(data: TvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeGroups>
    ) {
        movieApiService.getApiService
            .getTvEpisodeGroups(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeGroups>() {
                override fun onSuccess(data: TvEpisodeGroups) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvExternalIds>
    ) {
        movieApiService.getApiService
            .getTvExternalIds(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvExternalIds>() {
                override fun onSuccess(data: TvExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvImages>
    ) {
        movieApiService.getApiService
            .getTvImages(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvImages>() {
                override fun onSuccess(data: TvImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvKeywords>
    ) {
        movieApiService.getApiService
            .getTvKeyword(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvKeywords>() {
                override fun onSuccess(data: TvKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvRecommendations>
    ) {
        movieApiService.getApiService
            .getTvRecommendations(tv_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvRecommendations>() {
                override fun onSuccess(data: TvRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvReviews>
    ) {
        movieApiService.getApiService
            .getTvReviews(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvReviews>() {
                override fun onSuccess(data: TvReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvScreenedTheatrically>
    ) {
        movieApiService.getApiService
            .getTvScreenedTheatrically(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvScreenedTheatrically>() {
                override fun onSuccess(data: TvScreenedTheatrically) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvSimilarTVShows>
    ) {
        movieApiService.getApiService
            .getTvSimilarTvShows(tv_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSimilarTVShows>() {
                override fun onSuccess(data: TvSimilarTVShows) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvTranslations>
    ) {
        movieApiService.getApiService
            .getTvTranslations(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvTranslations>() {
                override fun onSuccess(data: TvTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvVideos>
    ) {
        movieApiService.getApiService
            .getTvVideos(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvVideos>() {
                override fun onSuccess(data: TvVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvLatest>
    ) {
        movieApiService.getApiService
            .getTvLatest(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvLatest>() {
                override fun onSuccess(data: TvLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvAiringToday>
    ) {
        movieApiService.getApiService
            .getTvAiringToday(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvAiringToday>() {
                override fun onSuccess(data: TvAiringToday) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvOnTheAir>
    ) {
        movieApiService.getApiService
            .getTvOnTheAir(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvOnTheAir>() {
                override fun onSuccess(data: TvOnTheAir) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvPopular>
    ) {
        movieApiService.getApiService
            .getTvPopular(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvPopular>() {
                override fun onSuccess(data: TvPopular) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvTopRated>
    ) {
        movieApiService.getApiService
            .getTvTopRated(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvTopRated>() {
                override fun onSuccess(data: TvTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsDetails>
    ) {
        movieApiService.getApiService
            .getTvSeasonsDetails(tv_id, season_number, apiKey, language, append_to_response)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsDetails>() {
                override fun onSuccess(data: TvSeasonsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsChanges>
    ) {
        movieApiService.getApiService
            .getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsChanges>() {
                override fun onSuccess(data: TvSeasonsChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsAccountStates>
    ) {
        movieApiService.getApiService
            .getTvSeasonsAccountStates(
                tv_id,
                season_number,
                apiKey,
                language,
                guest_session_id,
                session_id
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsAccountStates>() {
                override fun onSuccess(data: TvSeasonsAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsCredits>
    ) {
        movieApiService.getApiService
            .getTvSeasonsCredits(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsCredits>() {
                override fun onSuccess(data: TvSeasonsCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsExternalIds>
    ) {
        movieApiService.getApiService
            .getTvSeasonsExternalIds(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsExternalIds>() {
                override fun onSuccess(data: TvSeasonsExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsImages>
    ) {
        movieApiService.getApiService
            .getTvSeasonsImages(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsImages>() {
                override fun onSuccess(data: TvSeasonsImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvSeasonsVideos>
    ) {
        movieApiService.getApiService
            .getTvSeasonsVideos(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvSeasonsVideos>() {
                override fun onSuccess(data: TvSeasonsVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeDetails>
    ) {
        movieApiService.getApiService
            .getTvEpisodeDetails(
                tv_id,
                season_number,
                episode_number,
                apiKey,
                language,
                append_to_response
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeDetails>() {
                override fun onSuccess(data: TvEpisodeDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeChanges>
    ) {
        movieApiService.getApiService
            .getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeChanges>() {
                override fun onSuccess(data: TvEpisodeChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeAccountStates>
    ) {
        movieApiService.getApiService
            .getTvEpisodeAccountStates(
                tv_id,
                season_number,
                episode_number,
                apiKey,
                guest_session_id,
                session_id
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeAccountStates>() {
                override fun onSuccess(data: TvEpisodeAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeCredits>
    ) {
        movieApiService.getApiService
            .getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeCredits>() {
                override fun onSuccess(data: TvEpisodeCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeExternalIds>
    ) {
        movieApiService.getApiService
            .getTvEpisodeExternalIds(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeExternalIds>() {
                override fun onSuccess(data: TvEpisodeExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeImages>
    ) {
        movieApiService.getApiService
            .getTvEpisodeImages(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeImages>() {
                override fun onSuccess(data: TvEpisodeImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeTranslation>
    ) {
        movieApiService.getApiService
            .getTvEpisodeTranslations(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeTranslation>() {
                override fun onSuccess(data: TvEpisodeTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeVideos>
    ) {
        movieApiService.getApiService
            .getTvEpisodeVideos(tv_id, season_number, episode_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeVideos>() {
                override fun onSuccess(data: TvEpisodeVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<TvEpisodeGroupsDetails>
    ) {
        movieApiService.getApiService
            .getTvEpisodeGroupsDetails(id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<TvEpisodeGroupsDetails>() {
                override fun onSuccess(data: TvEpisodeGroupsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleDetails>
    ) {
        movieApiService.getApiService
            .getPeopleDetails(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleDetails>() {
                override fun onSuccess(data: PeopleDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleChanges>
    ) {
        movieApiService.getApiService
            .getPeopleChanges(person_id, apiKey, endDate, page, startDate)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleChanges>() {
                override fun onSuccess(data: PeopleChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleMovieCredits>
    ) {
        movieApiService.getApiService
            .getPeopleMovieCredits(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleMovieCredits>() {
                override fun onSuccess(data: PeopleMovieCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleTvCredits>
    ) {
        movieApiService.getApiService
            .getPeopleTvCredits(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleTvCredits>() {
                override fun onSuccess(data: PeopleTvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleCombinedCredits>
    ) {
        movieApiService.getApiService
            .getPeopleCombinedCredits(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleCombinedCredits>() {
                override fun onSuccess(data: PeopleCombinedCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleExternalIds>
    ) {
        movieApiService.getApiService
            .getPeopleExternalIds(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleExternalIds>() {
                override fun onSuccess(data: PeopleExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<PeopleImages>
    ) {
        movieApiService.getApiService
            .getPeopleImages(person_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleImages>() {
                override fun onSuccess(data: PeopleImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<PeopleTaggedImages>
    ) {
        movieApiService.getApiService
            .getPeopleTaggedImages(person_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleTaggedImages>() {
                override fun onSuccess(data: PeopleTaggedImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleTranslations>
    ) {
        movieApiService.getApiService
            .getPeopleTranslations(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleTranslations>() {
                override fun onSuccess(data: PeopleTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<PeopleLatest>
    ) {
        movieApiService.getApiService
            .getPeopleLatest(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeopleLatest>() {
                override fun onSuccess(data: PeopleLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: MovieDataSource.GetRemoteCallback<PeoplePopular>
    ) {
        movieApiService.getApiService
            .getPeoplePopular(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : MovieApiCallback<PeoplePopular>() {
                override fun onSuccess(data: PeoplePopular) {
                    callback.onSuccess(data)
                }

                override fun onFailure(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }
}