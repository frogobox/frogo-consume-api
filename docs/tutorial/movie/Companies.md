## COMPANIES

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        callback: ConsumeApiResponse<CompaniesImage>
    )