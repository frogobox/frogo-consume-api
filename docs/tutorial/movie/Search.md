## SEARCH

    // SEARCH
    // Search Companies
    fun searchCompanies(
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    )

    // SEARCH
    // Search Collections
    fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    )

    // SEARCH
    // Search Keywords
    fun searchKeywords(
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
    )

    // SEARCH
    // Search Movies
    fun searchMovies(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    )

    // SEARCH
    // Multi Search
    fun searchMultiSearch(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchMulti>
    )

    // SEARCH
    // Search People
    fun searchPeople(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchPeople>
    )

    // SEARCH
    // Search Tv Shows
    fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    )
