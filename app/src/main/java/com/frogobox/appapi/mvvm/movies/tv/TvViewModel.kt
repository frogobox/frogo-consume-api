package com.frogobox.appapi.mvvm.movies.tv

import android.app.Application
import com.frogobox.appapi.mvvm.movies.core.MoviesViewModel
import com.frogobox.api.movie.model.TrendingTv
import com.frogobox.api.movie.response.Trending
import com.frogobox.sdk.core.FrogoLiveEvent
import com.frogobox.sdk.core.FrogoResponseCallback

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
class TvViewModel(private val context: Application) : MoviesViewModel(context) {

    val listDataDay = FrogoLiveEvent<List<TrendingTv>>()
    val listDataWeek = FrogoLiveEvent<List<TrendingTv>>()

    fun getTrendingTvDay() {
        consumeMovieApi().getTrendingTvDay(object : FrogoResponseCallback<Trending<TrendingTv>> {
            override fun onSuccess(data: Trending<TrendingTv>) {
                // On Success
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

    fun getTrendingTvWeek() {
        consumeMovieApi().getTrendingTvWeek(object : FrogoResponseCallback<Trending<TrendingTv>> {
            override fun onSuccess(data: Trending<TrendingTv>) {
                // On Success
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