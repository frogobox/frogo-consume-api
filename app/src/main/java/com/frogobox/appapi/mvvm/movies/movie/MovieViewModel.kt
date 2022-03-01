package com.frogobox.appapi.mvvm.movies.movie

import android.app.Application
import com.frogobox.appapi.mvvm.movies.core.MoviesViewModel
import com.frogobox.coreapi.movie.model.TrendingMovie
import com.frogobox.coreapi.movie.response.Trending
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.sdk.FrogoMutableLiveData

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

    val listDataDay = FrogoMutableLiveData<List<TrendingMovie>>()
    val listDataWeek = FrogoMutableLiveData<List<TrendingMovie>>()

    fun getTrendingMovieDay() {
        consumeMovieApi().getTrendingMovieDay(object : ConsumeApiResponse<Trending<TrendingMovie>> {
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
            ConsumeApiResponse<Trending<TrendingMovie>> {
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