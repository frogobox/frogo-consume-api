## TV

    // TV
    // Get Details
    fun getTvDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    )

    // TV
    // Get Account States
    fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    )

    // TV
    // Get Alternative Titles
    fun getTvAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    )

    // TV
    // Get Changes
    fun getTvChanges(
        tv_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvChanges>
    )

    // TV
    // Get Content Ratings
    fun getTvContentRatings(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    )

    // TV
    // Get Credits
    fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    )

    // TV
    // Get Episode Groups
    fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    )

    // TV
    // Get External IDs
    fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    )

    // TV
    // Get Images
    fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    )

    // TV
    // Get Keyword
    fun getTvKeyword(
        tv_id: Int,
        callback: ConsumeApiResponse<TvKeywords>
    )

    // TV
    // Get Recommendations
    fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    )

    // TV
    // Get Reviews
    fun getTvReviews(
        tv_id: Int,
        callback: ConsumeApiResponse<TvReviews>
    )

    // TV
    // Get Screened Theatrically
    fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    )

    // TV
    // Get Similar TV Shows
    fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    )

    // TV
    // Get Translations
    fun getTvTranslations(
        tv_id: Int,
        callback: ConsumeApiResponse<TvTranslations>
    )

    // TV
    // Get Videos
    fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    )

    // TV
    // Get Latest
    fun getTvLatest(
        language: String?,
        callback: ConsumeApiResponse<TvLatest>
    )

    // TV
    // Get TV Airing Today
    fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    )

    // TV
    // Get TV On The Air
    fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    )

    // TV
    // Get Popular
    fun getTvPopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    )

    // TV
    // Get Top Rated
    fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
    )