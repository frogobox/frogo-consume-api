package com.frogobox.frogoconsumeapi.pixabay.data.source

import android.content.Context
import com.frogobox.frogoconsumeapi.pixabay.data.model.PixabayImage
import com.frogobox.frogoconsumeapi.pixabay.data.model.PixabayVideo
import com.frogobox.frogoconsumeapi.pixabay.data.response.Response
import com.frogobox.frogoconsumeapi.pixabay.util.PixabayConstant
import com.frogobox.frogoconsumeapi.pixabay.util.PixabayUrl
import com.readystatesoftware.chuck.ChuckInterceptor
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

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

    companion object Factory {

        private var isUsingChuckInterceptor = false
        private lateinit var context: Context

        fun usingChuckInterceptor(context: Context) {
            isUsingChuckInterceptor = true
            this.context = context
        }

        val getApiService: PixabayApiService by lazy {
            val mLoggingInterceptor = HttpLoggingInterceptor()
            mLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val mClient = if (isUsingChuckInterceptor) {
                OkHttpClient.Builder()
                    .addInterceptor(mLoggingInterceptor)
                    .addInterceptor(ChuckInterceptor(context))
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            } else {
                OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            }

            val mRetrofit = Retrofit.Builder()
                .baseUrl(PixabayUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mClient)
                .build()

            mRetrofit.create(PixabayApiService::class.java)
        }
    }

}