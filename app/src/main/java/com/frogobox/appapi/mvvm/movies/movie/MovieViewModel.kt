package com.frogobox.appapi.mvvm.movies.movie

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.frogobox.appapi.mvvm.movies.core.BaseMovieApiViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreutil.movie.model.TrendingMovie
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

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
@HiltViewModel
class MovieViewModel @Inject constructor(
    @ApplicationContext context: Context,
    repository: ApiRepository
) : BaseMovieApiViewModel(context, repository) {

    private val _listDataDay = MutableLiveData<List<TrendingMovie>>()
    val listDataDay: LiveData<List<TrendingMovie>> = _listDataDay

    private val _listDataWeek = MutableLiveData<List<TrendingMovie>>()
    val listDataWeek: LiveData<List<TrendingMovie>> = _listDataWeek

    fun getTrendingMovieDay() {
        movieApi.getTrendingMovieDay(object : ConsumeApiResponse<com.frogobox.coreutil.movie.response.Trending<TrendingMovie>> {
            override fun onSuccess(data: com.frogobox.coreutil.movie.response.Trending<TrendingMovie>) {
                data.results?.let { _listDataDay.postValue(it) }
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                // Your failed to do
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {

            }

            override fun onShowProgress() {
                // Your Progress Show
                _eventShowProgressState.postValue(true)
            }

            override fun onHideProgress() {
                // Your Progress Hide
                _eventShowProgressState.postValue(false)
            }

        })
    }

    fun getTrendingMovieWeek() {
        movieApi.getTrendingMovieWeek(object :
            ConsumeApiResponse<com.frogobox.coreutil.movie.response.Trending<TrendingMovie>> {
            override fun onSuccess(data: com.frogobox.coreutil.movie.response.Trending<TrendingMovie>) {
                data.results?.let { _listDataWeek.postValue(it) }
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                // Your failed to do
                _eventFailed.postValue(errorMessage)
            }

            override fun onFinish() {

            }

            override fun onShowProgress() {
                // Your Progress Show
                _eventShowProgressState.postValue(true)
            }

            override fun onHideProgress() {
                // Your Progress Hide
                _eventShowProgressState.postValue(false)
            }

        })
    }

}