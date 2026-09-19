package com.frogobox.appapi.di

import com.frogobox.api.meal.ConsumeTheMealDbApi
import com.frogobox.api.movie.ConsumeMovieApi
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.api.pixabay.ConsumePixabayApi
import com.frogobox.api.sport.ConsumeTheSportDbApi
import com.frogobox.coreutil.meal.MealUrl
import com.frogobox.coreutil.movie.MovieUrl
import com.frogobox.coreutil.news.NewsUrl
import com.frogobox.coreutil.pixabay.PixabayUrl
import com.frogobox.coreutil.sport.SportUrl
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
object ConsumeApiModule {

    @Provides
    @Singleton
    fun provideConsumeNewsApi(): ConsumeNewsApi {
        return ConsumeNewsApi(NewsUrl.API_KEY)
    }

    @Provides
    @Singleton
    fun provideConsumeTheSportDbApi(): ConsumeTheSportDbApi {
        return ConsumeTheSportDbApi(SportUrl.API_KEY)
    }

    @Provides
    @Singleton
    fun provideConsumeTheMealDbApi(): ConsumeTheMealDbApi {
        return ConsumeTheMealDbApi(MealUrl.API_KEY)
    }

    @Provides
    @Singleton
    fun provideConsumePixabayApi(): ConsumePixabayApi {
        return ConsumePixabayApi(PixabayUrl.API_KEY)
    }

    @Provides
    @Singleton
    fun provideConsumeMovieApi(): ConsumeMovieApi {
        return ConsumeMovieApi(MovieUrl.API_KEY)
    }

}