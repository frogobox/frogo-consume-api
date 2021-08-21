## TV EPISODES

    // TV EPISODE
    // Get Details
    fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvEpisodeDetails>
    )

    // TV EPISODE
    // Get Changes
    fun getTvEpisodeChanges(
        episode_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvEpisodeChanges>
    )

    // TV EPISODE
    // Get Account States
    fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvEpisodeAccountStates>
    )

    // TV EPISODE
    // Get Credits
    fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeCredits>
    )

    // TV EPISODE
    // Get External IDs
    fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeExternalIds>
    )

    // TV EPISODE
    // Get Images
    fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeImages>
    )

    // TV EPISODE
    // Get Translations
    fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: ConsumeApiResponse<TvEpisodeTranslation>
    )

    // TV EPISODE
    // Get Videos
    fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    )