## CONFIGURATION

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(callback: ConsumeApiResponse<ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(callback: ConsumeApiResponse<List<ConfigurationCountry>>)

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(callback: ConsumeApiResponse<List<ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(callback: ConsumeApiResponse<List<ConfigurationLanguage>>)

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(callback: ConsumeApiResponse<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(callback: ConsumeApiResponse<List<ConfigurationTimezone>>)
