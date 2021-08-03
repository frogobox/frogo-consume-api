package com.frogobox.consumable.mvvm.movies.movie

import android.app.Application
import com.frogobox.consumable.mvvm.movies.core.MoviesViewModel
import com.frogobox.frogoconsumeapi.movie.model.TrendingMovie
import com.frogobox.frogoconsumeapi.movie.response.Trending
import com.frogobox.frogosdk.core.FrogoLiveEvent
import com.frogobox.frogosdk.core.FrogoResponseCallback

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
class MovieViewModel(private val context: Application) : MoviesViewModel(context) {

    val listDataDay = FrogoLiveEvent<List<TrendingMovie>>()
    val listDataWeek = FrogoLiveEvent<List<TrendingMovie>>()

    fun getTrendingMovieDay() {
        consumeMovieApi().getTrendingMovieDay(object : FrogoResponseCallback<Trending<TrendingMovie>> {
            override fun onSuccess(data: Trending<TrendingMovie>) {
                data.results?.let { listDataDay.postValue(it) }
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                // Your failed to do
                eventFailed.postValue(errorMessage)
            }

            override fun onShowProgress() {
                // Your Progress Show
                eventShowProgress.postValue(true)
            }

            override fun onHideProgress() {
                // Your Progress Hide
                eventShowProgress.postValue(false)
            }

        })
    }

    fun getTrendingMovieWeek() {
        consumeMovieApi().getTrendingMovieWeek(object :
            FrogoResponseCallback<Trending<TrendingMovie>> {
            override fun onSuccess(data: Trending<TrendingMovie>) {
                data.results?.let { listDataWeek.postValue(it) }
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                // Your failed to do
                eventFailed.postValue(errorMessage)
            }

            override fun onShowProgress() {
                // Your Progress Show
                eventShowProgress.postValue(true)
            }

            override fun onHideProgress() {
                // Your Progress Hide
                eventShowProgress.postValue(false)
            }

        })
    }


}