package com.frogobox.appapi.mvvm.movies.person

import android.app.Application
import com.frogobox.appapi.mvvm.movies.core.MoviesViewModel
import com.frogobox.coreapi.movie.model.TrendingPerson
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
class PersonViewModel(private val context: Application) : MoviesViewModel(context) {

    val listDataDay = FrogoMutableLiveData<List<TrendingPerson>>()
    val listDataWeek = FrogoMutableLiveData<List<TrendingPerson>>()

    fun getTrendingPersonDay() {
        consumeMovieApi().getTrendingPersonDay(object :
            ConsumeApiResponse<Trending<TrendingPerson>> {
            override fun onSuccess(data: Trending<TrendingPerson>) {
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

    fun getTrendingPersonWeek() {
        consumeMovieApi().getTrendingPersonWeek(object :
            ConsumeApiResponse<Trending<TrendingPerson>> {
            override fun onSuccess(data: Trending<TrendingPerson>) {
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