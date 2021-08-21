## MOVIES

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    )

    // MOVIES
    // Get Alternative Titles
    fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    )

    // MOVIES
    // Get Changes
    fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    )

    // MOVIES
    // Get Credits
    fun getMoviesCredits(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieCredit>
    )

    // MOVIES
    // Get External Ids
    fun getMoviesExternalIds(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieExternalId>
    )

    // MOVIES
    // Get Images
    fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    )

    // MOVIES
    // Get Keywords
    fun getMoviesKeywords(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieKeywords>
    )

    // MOVIES
    // Get Release Dates
    fun getMoviesReleaseDates(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieReleaseDates>
    )

    // MOVIES
    // Get Videos
    fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    )

    // MOVIES
    // Get Translations
    fun getMoviesTranslations(
        movie_id: Int,
        callback: ConsumeApiResponse<MovieTranslations>
    )

    // MOVIES
    // Get Recommendations
    fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    )

    // MOVIES
    // Get Similar Movies
    fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    )

    // MOVIES
    // Get Reviews
    fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    )

    // MOVIES
    // Get Lists
    fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    )

    // MOVIES
    // Get Latest
    fun getMoviesLatest(
        language: String?,
        callback: ConsumeApiResponse<MovieLatest>
    )

    // MOVIES
    // Get Now Playing
    fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieNowPlayings>
    )

    // MOVIES
    // Get Popular
    fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MoviePopulars>
    )

    // MOVIES
    // Get Top Rated
    fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieTopRated>
    )

    // MOVIES
    // Get Upcoming
    fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieUpcoming>
    )

