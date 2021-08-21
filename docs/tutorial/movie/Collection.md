
## COLLECTION

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    )