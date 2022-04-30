package com.frogobox.appapi.di

import com.frogobox.api.meal.ConsumeTheMealDbApi
import com.frogobox.api.movie.ConsumeMovieApi
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.api.pixabay.ConsumePixabayApi
import com.frogobox.api.sport.ConsumeTheSportDbApi
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.appapi.util.isDebug
import com.frogobox.coreapi.meal.MealUrl
import com.frogobox.coreapi.movie.MovieUrl
import com.frogobox.coreapi.news.NewsUrl
import com.frogobox.coreapi.pixabay.PixabayUrl
import com.frogobox.coreapi.sport.SportUrl
import com.frogobox.sdk.ext.usingChuck
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


/*
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

val consumeApiModule = module {

    single {
        ConsumeNewsApi(NewsUrl.API_KEY)
    }

    single {
        ConsumeTheSportDbApi(SportUrl.API_KEY)
    }

    single {
        ConsumeTheMealDbApi(MealUrl.API_KEY)
    }

    single {
        ConsumePixabayApi(PixabayUrl.API_KEY)
    }

    single {
        ConsumeMovieApi(MovieUrl.API_KEY)
    }

}