## PEOPLE

    // PEOPLE
    // Get Details
    fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    )

    // PEOPLE
    // Get Changes
    fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    )

    // PEOPLE
    // Get Movie Credits
    fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    )

    // PEOPLE
    // Get TV Credits
    fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    )

    // PEOPLE
    // Get Combined Credits
    fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    )

    // PEOPLE
    // Get External IDs
    fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    )

    // PEOPLE
    // Get Images
    fun getPeopleImages(
        person_id: Int,
        callback: ConsumeApiResponse<PeopleImages>
    )

    // PEOPLE
    // Get Tagged Images
    fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    )

    // PEOPLE
    // Get Translations
    fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    )

    // PEOPLE
    // Get Latest
    fun getPeopleLatest(
        language: String?,
        callback: ConsumeApiResponse<PeopleLatest>
    )

    // PEOPLE
    // Get Popular
    fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    )