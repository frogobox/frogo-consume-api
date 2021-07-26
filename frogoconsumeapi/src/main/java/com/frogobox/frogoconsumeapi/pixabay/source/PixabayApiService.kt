package com.frogobox.frogoconsumeapi.pixabay.source

import com.frogobox.frogoconsumeapi.pixabay.model.PixabayImage
import com.frogobox.frogoconsumeapi.pixabay.model.PixabayVideo
import com.frogobox.frogoconsumeapi.pixabay.response.Response
import com.frogobox.frogoconsumeapi.pixabay.util.PixabayConstant
import com.frogobox.frogoconsumeapi.pixabay.util.PixabayUrl
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * PixabayAPI
 * Copyright (C) 14/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.pixabay.data.source
 *
 */
interface PixabayApiService {

    // Search for Image
    @GET(PixabayUrl.PATH_IMAGE)
    fun searchImage(
        @Query(PixabayConstant.QUERY_API_KEY) apiKey: String,
        @Query(PixabayConstant.QUERY_Q) q: String,
        @Query(PixabayConstant.QUERY_LANG) lang: String?,
        @Query(PixabayConstant.QUERY_ID) id: String?,
        @Query(PixabayConstant.QUERY_IMAGE_TYPE) imageType: String?,
        @Query(PixabayConstant.QUERY_ORIENTATION) orientation: String?,
        @Query(PixabayConstant.QUERY_CATEGORY) category: String?,
        @Query(PixabayConstant.QUERY_MIN_WIDTH) minWidth: Int?,
        @Query(PixabayConstant.QUERY_MIN_HEIGHT) minHeight: Int?,
        @Query(PixabayConstant.QUERY_COLORS) colors: String?,
        @Query(PixabayConstant.QUERY_EDITORS_CHOICE) editorsChoice: Boolean?,
        @Query(PixabayConstant.QUERY_SAFE_SEARCH) safeSearch: Boolean?,
        @Query(PixabayConstant.QUERY_ORDER) order: String?,
        @Query(PixabayConstant.QUERY_PAGE) page: Int?,
        @Query(PixabayConstant.QUERY_PER_PAGE) perPage: Int?
    ): Observable<Response<PixabayImage>>

    // Search for Video
    @GET(PixabayUrl.PATH_VIDEO)
    fun searchVideo(
        @Query(PixabayConstant.QUERY_API_KEY) apiKey: String,
        @Query(PixabayConstant.QUERY_Q) q: String,
        @Query(PixabayConstant.QUERY_LANG) lang: String?,
        @Query(PixabayConstant.QUERY_ID) id: String?,
        @Query(PixabayConstant.QUERY_VIDEO_TYPE) videoType: String?,
        @Query(PixabayConstant.QUERY_CATEGORY) category: String?,
        @Query(PixabayConstant.QUERY_MIN_WIDTH) minWidth: Int?,
        @Query(PixabayConstant.QUERY_MIN_HEIGHT) minHeight: Int?,
        @Query(PixabayConstant.QUERY_EDITORS_CHOICE) editorsChoice: Boolean?,
        @Query(PixabayConstant.QUERY_SAFE_SEARCH) safeSearch: Boolean?,
        @Query(PixabayConstant.QUERY_ORDER) order: String?,
        @Query(PixabayConstant.QUERY_PAGE) page: Int?,
        @Query(PixabayConstant.QUERY_PER_PAGE) perPage: Int?
    ): Observable<Response<PixabayVideo>>

}