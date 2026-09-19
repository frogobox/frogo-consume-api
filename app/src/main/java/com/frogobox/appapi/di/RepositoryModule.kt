package com.frogobox.appapi.di

import com.frogobox.api.meal.ConsumeTheMealDbApi
import com.frogobox.api.movie.ConsumeMovieApi
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.api.pixabay.ConsumePixabayApi
import com.frogobox.api.sport.ConsumeTheSportDbApi
import com.frogobox.appapi.source.ApiDataSource
import com.frogobox.appapi.source.ApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by faisalamir on 01/05/22
 * FrogoConsumeApi
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideApiRepository(
        consumeNewsApi: ConsumeNewsApi,
        consumePixabayApi: ConsumePixabayApi,
        consumeMovieApi: ConsumeMovieApi,
        consumeTheSportDbApi: ConsumeTheSportDbApi,
        consumeTheMealDbApi: ConsumeTheMealDbApi
    ): ApiRepository {
        return ApiRepository(
            consumeNewsApi,
            consumePixabayApi,
            consumeMovieApi,
            consumeTheSportDbApi,
            consumeTheMealDbApi
        )
    }

    @Provides
    @Singleton
    fun provideApiDataSource(apiRepository: ApiRepository): ApiDataSource {
        return apiRepository
    }

}