package com.frogobox.coreapi.movie


import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.FrogoApiClient
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
    private var movieApiService = FrogoApiClient.create<MovieApiService>(com.frogobox.coreutil.movie.MovieUrl.BASE_URL)

    // Switch For Using Chuck Interceptor
    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): MovieDataSource {
        movieApiService = FrogoApiClient.create(com.frogobox.coreutil.movie.MovieUrl.BASE_URL, isDebug, chuckInterceptor = chuckerInterceptor)
        return this
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Certifications<com.frogobox.coreutil.movie.model.CertificationMovie>>
    ) {
        movieApiService.getMovieCertifications(apiKey).doApiRequest(callback)
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Certifications<com.frogobox.coreutil.movie.model.CertificationTv>>
    ) {
        movieApiService.getTvCertifications(apiKey).doApiRequest(callback)
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Changes>
    ) {
        movieApiService.getMovieChangeList(apiKey, endDate, startDate, page)
            .doApiRequest(callback)
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Changes>
    ) {
        movieApiService.getTvChangeList(apiKey, endDate, startDate, page)
            .doApiRequest(callback)
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Changes>
    ) {
        movieApiService.getPersonChangeList(apiKey, endDate, startDate, page)
            .doApiRequest(callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CollectionsDetail>
    ) {
        movieApiService.getCollectionDetails(collection_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CollectionsImage>
    ) {
        movieApiService.getCollectionImages(collection_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CollectionsTranslation>
    ) {
        movieApiService.getCollectionTranslations(collection_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CompaniesDetail>
    ) {
        movieApiService.getCompaniesDetails(company_id, apiKey).doApiRequest(callback)
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CompaniesAlternateName>
    ) {
        movieApiService.getCompaniesAlternativeName(company_id, apiKey)
            .doApiRequest(callback)
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CompaniesImage>
    ) {
        movieApiService.getCompaniesImage(company_id, apiKey).doApiRequest(callback)
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.ConfigurationApi>
    ) {
        movieApiService.getConfigurationApi(apiKey).doApiRequest(callback)
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationCountry>>
    ) {
        movieApiService.getConfigurationCountries(apiKey).doApiRequest(callback)
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationJob>>
    ) {
        movieApiService.getConfigurationJobs(apiKey).doApiRequest(callback)
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationLanguage>>
    ) {
        movieApiService.getConfigurationLanguages(apiKey).doApiRequest(callback)
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: FrogoDataResponse<List<String>>
    ) {
        movieApiService.getConfigurationTranslations(apiKey).doApiRequest(callback)
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationTimezone>>
    ) {
        movieApiService.getConfigurationTimezones(apiKey).doApiRequest(callback)

    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Credits>
    ) {
        movieApiService.getCreditsDetails(credit_id, apiKey).doApiRequest(callback)
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
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Discover<com.frogobox.coreutil.movie.model.DiscoverMovie>>
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
        ).doApiRequest(callback)
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
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Discover<com.frogobox.coreutil.movie.model.DiscoverTv>>
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
        ).doApiRequest(callback)
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Find>
    ) {
        movieApiService.getFindById(external_id, apiKey, external_source, language)
            .doApiRequest(callback)
    }

    override fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Genres>
    ) {
        movieApiService.getGenresMovie(apiKey, language).doApiRequest(callback)
    }

    override fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Genres>
    ) {
        movieApiService.getGenresTv(apiKey, language).doApiRequest(callback)
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.KeywordsDetail>
    ) {
        movieApiService.getKeywordsDetail(keyword_id, apiKey).doApiRequest(callback)
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.KeywordsMovies>
    ) {
        movieApiService.getKeywordsMovie(keyword_id, apiKey, language, include_adult)
            .doApiRequest(callback)
    }

    override fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieDetail>
    ) {
        movieApiService.getMoviesDetails(movie_id, apiKey, language, append_to_response)
            .doApiRequest(callback)
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieAccountState>
    ) {
        movieApiService.getMoviesAccountState(movie_id, apiKey, session_id, guest_session_id)
            .doApiRequest(callback)
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieAlternativeTitle>
    ) {
        movieApiService.getMoviesAlternativeTitles(movie_id, apiKey, country)
            .doApiRequest(callback)
    }

    override fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieChanges>
    ) {
        movieApiService.getMoviesChanges(movie_id, apiKey, start_date, end_date, page)
            .doApiRequest(callback)
    }

    override fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieCredit>
    ) {
        movieApiService.getMoviesCredits(movie_id, apiKey).doApiRequest(callback)
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieExternalId>
    ) {
        movieApiService.getMoviesExternalIds(movie_id, apiKey).doApiRequest(callback)
    }

    override fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieImages>
    ) {
        movieApiService.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language
        ).doApiRequest(callback)
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieKeywords>
    ) {
        movieApiService.getMoviesKeywords(movie_id, apiKey).doApiRequest(callback)
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieReleaseDates>
    ) {
        movieApiService.getMoviesReleaseDates(movie_id, apiKey).doApiRequest(callback)
    }

    override fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieVideos>
    ) {
        movieApiService.getMoviesVideos(movie_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieTranslations>
    ) {
        movieApiService.getMoviesTranslations(movie_id, apiKey).doApiRequest(callback)
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieRecommendations>
    ) {
        movieApiService.getMoviesRecommendations(movie_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieSimilarMovies>
    ) {
        movieApiService.getMoviesSimilarMovies(movie_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieReviews>
    ) {
        movieApiService.getMoviesReviews(movie_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieLists>
    ) {
        movieApiService.getMoviesLists(movie_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieLatest>
    ) {
        movieApiService.getMoviesLatest(apiKey, language).doApiRequest(callback)
    }

    override fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieNowPlayings>
    ) {
        movieApiService.getMoviesNowPlaying(apiKey, language, page, region)
            .doApiRequest(callback)
    }

    override fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MoviePopulars>
    ) {
        movieApiService.getMoviesPopular(apiKey, language, page, region)
            .doApiRequest(callback)
    }

    override fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieTopRated>
    ) {
        movieApiService.getMoviesTopRated(apiKey, language, page, region)
            .doApiRequest(callback)
    }

    override fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieUpcoming>
    ) {
        movieApiService.getMoviesUpcoming(apiKey, language, page, region)
                .doApiRequest(callback)
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingAll>>
    ) {
        movieApiService.getTrendingAll(media_type, time_window, apiKey)
                .doApiRequest(callback)
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingMovie>>
    ) {
        movieApiService.getTrendingMovie(media_type, time_window, apiKey)
                .doApiRequest(callback)
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingPerson>>
    ) {
        movieApiService.getTrendingPerson(media_type, time_window, apiKey)
                .doApiRequest(callback)
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingTv>>
    ) {
        movieApiService.getTrendingTv(media_type, time_window, apiKey)
                .doApiRequest(callback)
    }

    override fun getReviews(
        review_id: String,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Reviews>
    ) {
        movieApiService.getReviews(review_id, apiKey)
                .doApiRequest(callback)
    }

    override fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.NetworkDetail>
    ) {
        movieApiService.getNetworkDetail(network_id, apiKey).doApiRequest(callback)
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.NetworkAlternativeName>
    ) {
        movieApiService.getNetworkAlternativeName(network_id, apiKey)
            .doApiRequest(callback)
    }

    override fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.NetworkImage>
    ) {
        movieApiService.getNetworkImage(network_id, apiKey).doApiRequest(callback)
    }

    override fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchCompanies>
    ) {
        movieApiService.searchCompanies(apiKey, query, page).doApiRequest(callback)
    }

    override fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchCollections>
    ) {
        movieApiService.searchCollections(apiKey, query, language, page)
            .doApiRequest(callback)
    }

    override fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchKeywords>
    ) {
        movieApiService.searchKeywords(apiKey, query, page).doApiRequest(callback)
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
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchMovies>
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
        ).doApiRequest(callback)
    }

    override fun searchMultiSearch(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchMulti>
    ) {
        movieApiService.searchMultiSearch(apiKey, query, language, page, include_adult, region)
            .doApiRequest(callback)
    }

    override fun searchPeople(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchPeople>
    ) {
        movieApiService.searchPeople(apiKey, query, language, page, include_adult, region)
            .doApiRequest(callback)
    }

    override fun searchTvShows(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchMovies>
    ) {
        movieApiService.searchTvShows(
            apiKey,
            query,
            language,
            page,
            include_adult,
            first_air_date_year
        ).doApiRequest(callback)
    }

    override fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvDetails>
    ) {
        movieApiService.getTvDetails(tv_id, apiKey, language, append_to_response)
            .doApiRequest(callback)
    }

    override fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvAccountStates>
    ) {
        movieApiService.getTvAccountStates(tv_id, apiKey, language, guest_session_id, session_id)
            .doApiRequest(callback)
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvAlternativeTitles>
    ) {
        movieApiService.getTvAlternativeTitles(tv_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvChanges>
    ) {
        movieApiService.getTvChanges(tv_id, apiKey, startDate, endDate, page)
            .doApiRequest(callback)
    }

    override fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvContentRatings>
    ) {
        movieApiService.getTvContentRatings(tv_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvCredits>
    ) {
        movieApiService.getTvCredits(tv_id, apiKey, language).doApiRequest(callback)
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeGroups>
    ) {
        movieApiService.getTvEpisodeGroups(tv_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvExternalIds>
    ) {
        movieApiService.getTvExternalIds(tv_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvImages>
    ) {
        movieApiService.getTvImages(tv_id, apiKey, language).doApiRequest(callback)
    }

    override fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvKeywords>
    ) {
        movieApiService.getTvKeyword(tv_id, apiKey).doApiRequest(callback)
    }

    override fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvRecommendations>
    ) {
        movieApiService.getTvRecommendations(tv_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvReviews>
    ) {
        movieApiService.getTvReviews(tv_id, apiKey).doApiRequest(callback)
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvScreenedTheatrically>
    ) {
        movieApiService.getTvScreenedTheatrically(tv_id, apiKey)
            .doApiRequest(callback)
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSimilarTVShows>
    ) {
        movieApiService.getTvSimilarTvShows(tv_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvTranslations>
    ) {
        movieApiService.getTvTranslations(tv_id, apiKey).doApiRequest(callback)
    }

    override fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvVideos>
    ) {
        movieApiService.getTvVideos(tv_id, apiKey, language).doApiRequest(callback)
    }

    override fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvLatest>
    ) {
        movieApiService.getTvLatest(apiKey, language).doApiRequest(callback)
    }

    override fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvAiringToday>
    ) {
        movieApiService.getTvAiringToday(apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvOnTheAir>
    ) {
        movieApiService.getTvOnTheAir(apiKey, language, page).doApiRequest(callback)
    }

    override fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvPopular>
    ) {
        movieApiService.getTvPopular(apiKey, language, page).doApiRequest(callback)
    }

    override fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvTopRated>
    ) {
        movieApiService.getTvTopRated(apiKey, language, page).doApiRequest(callback)
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsDetails>
    ) {
        movieApiService.getTvSeasonsDetails(
            tv_id,
            season_number,
            apiKey,
            language,
            append_to_response
        ).doApiRequest(callback)
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsChanges>
    ) {
        movieApiService.getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page)
            .doApiRequest(callback)
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsAccountStates>
    ) {
        movieApiService.getTvSeasonsAccountStates(
            tv_id,
            season_number,
            apiKey,
            language,
            guest_session_id,
            session_id
        ).doApiRequest(callback)
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsCredits>
    ) {
        movieApiService.getTvSeasonsCredits(tv_id, season_number, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsExternalIds>
    ) {
        movieApiService.getTvSeasonsExternalIds(tv_id, season_number, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsImages>
    ) {
        movieApiService.getTvSeasonsImages(tv_id, season_number, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsVideos>
    ) {
        movieApiService.getTvSeasonsVideos(tv_id, season_number, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeDetails>
    ) {
        movieApiService.getTvEpisodeDetails(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            language,
            append_to_response
        ).doApiRequest(callback)
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeChanges>
    ) {
        movieApiService.getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeAccountStates>
    ) {
        movieApiService.getTvEpisodeAccountStates(
            tv_id,
            season_number,
            episode_number,
            apiKey,
            guest_session_id,
            session_id
        ).doApiRequest(callback)
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeCredits>
    ) {
        movieApiService.getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeExternalIds>
    ) {
        movieApiService.getTvEpisodeExternalIds(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeImages>
    ) {
        movieApiService.getTvEpisodeImages(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.model.TvEpisodeTranslation>
    ) {
        movieApiService.getTvEpisodeTranslations(tv_id, season_number, episode_number, apiKey)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeVideos>
    ) {
        movieApiService.getTvEpisodeVideos(tv_id, season_number, episode_number, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeGroupsDetails>
    ) {
        movieApiService.getTvEpisodeGroupsDetails(id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleDetails>
    ) {
        movieApiService.getPeopleDetails(person_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleChanges>
    ) {
        movieApiService.getPeopleChanges(person_id, apiKey, endDate, page, startDate)
            .doApiRequest(callback)
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleMovieCredits>
    ) {
        movieApiService.getPeopleMovieCredits(person_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleTvCredits>
    ) {
        movieApiService.getPeopleTvCredits(person_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleCombinedCredits>
    ) {
        movieApiService.getPeopleCombinedCredits(person_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleExternalIds>
    ) {
        movieApiService.getPeopleExternalIds(person_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleImages>
    ) {
        movieApiService.getPeopleImages(person_id, apiKey).doApiRequest(callback)
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleTaggedImages>
    ) {
        movieApiService.getPeopleTaggedImages(person_id, apiKey, language, page)
            .doApiRequest(callback)
    }

    override fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleTranslations>
    ) {
        movieApiService.getPeopleTranslations(person_id, apiKey, language)
            .doApiRequest(callback)
    }

    override fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleLatest>
    ) {
        movieApiService.getPeopleLatest(apiKey, language).doApiRequest(callback)
    }

    override fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeoplePopular>
    ) {
        movieApiService.getPeoplePopular(apiKey, language, page)
            .doApiRequest(callback)
    }
}