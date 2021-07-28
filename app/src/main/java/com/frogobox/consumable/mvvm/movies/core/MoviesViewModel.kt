package com.frogobox.consumable.mvvm.movies.core

import android.app.Application
import com.frogobox.frogoconsumeapi.movie.ConsumeMovieApi
import com.frogobox.frogoconsumeapi.movie.util.MovieUrl
import com.frogobox.frogosdk.core.FrogoViewModel

/*
 * Created by faisalamir on 28/07/21
 * Consumable
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
abstract class MoviesViewModel(private val context: Application) : FrogoViewModel(context) {

    protected fun consumeMovieApi() : ConsumeMovieApi{
        val api = ConsumeMovieApi(MovieUrl.API_KEY)
        api.usingChuckInterceptor(context)
        return api
    }

}