package com.frogobox.appapi.mvvm.news

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.frogobox.appapi.core.BaseViewModel
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.appapi.util.isDebug
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coresdk.source.Resource
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_BUSINESS
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_ENTERTAINMENT
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_GENERAL
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_HEALTH
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_SCIENCE
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_SPORTS
import com.frogobox.coreutil.news.NewsConstant.CATEGORY_TECHNOLOGY
import com.frogobox.coreutil.news.NewsConstant.COUNTRY_ID
import com.frogobox.sdk.ext.showLogDebug
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
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
class NewsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val repository: ApiRepository,
) : BaseViewModel() {

    private var _listDataCategory = MutableLiveData<List<com.frogobox.coreutil.news.model.Article>>()
    var listDataCategory: LiveData<List<com.frogobox.coreutil.news.model.Article>> = _listDataCategory

    private var _listData = MutableLiveData<List<com.frogobox.coreutil.news.model.Article>>()
    var listData: LiveData<List<com.frogobox.coreutil.news.model.Article>> = _listData

    private var _listCategory = MutableLiveData<List<String>>()
    var listCategory : LiveData<List<String>> = _listCategory

    private val _topHeadlineState = MutableStateFlow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>>(Resource.Loading())
    val topHeadlineState: StateFlow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>> = _topHeadlineState.asStateFlow()

    private val _categoryHeadlineState = MutableStateFlow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>>(Resource.Loading())
    val categoryHeadlineState: StateFlow<Resource<com.frogobox.coreutil.news.response.ArticleResponse?>> = _categoryHeadlineState.asStateFlow()

    val newsApi = repository.consumeNewsApi().usingChuckInterceptor(isDebug, context)

    fun setupCategory() {
        val categories = mutableListOf<String>()
        categories.add(CATEGORY_BUSINESS)
        categories.add(CATEGORY_HEALTH)
        categories.add(CATEGORY_ENTERTAINMENT)
        categories.add(CATEGORY_GENERAL)
        categories.add(CATEGORY_SCIENCE)
        categories.add(CATEGORY_SPORTS)
        categories.add(CATEGORY_TECHNOLOGY)
        _listCategory.postValue(categories)
    }

    fun getTopHeadline(category: String) {
        newsApi.getTopHeadline(
            null,
            null,
            category,
            COUNTRY_ID,
            null,
            null,
            object : ConsumeApiResponse<com.frogobox.coreutil.news.response.ArticleResponse> {

                override fun onSuccess(data: com.frogobox.coreutil.news.response.ArticleResponse) {
                    // Your Ui or data
                    data.articles?.let { _listDataCategory.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // Your failed to do
                    _eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // Your Progress Show
                    showLogDebug("onShowProgress --------------------------------------------------->")
                    _eventShowProgressState.postValue(true)
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    showLogDebug("onHideProgress --------------------------------------------------->")
                    _eventShowProgressState.postValue(false)
                }
            })
    }

    fun getTopHeadline() {
        newsApi.getTopHeadline(
            null,
            null,
            null,
            COUNTRY_ID,
            null,
            null,
            object : ConsumeApiResponse<com.frogobox.coreutil.news.response.ArticleResponse> {

                override fun onSuccess(data: com.frogobox.coreutil.news.response.ArticleResponse) {
                    // Your Ui or data
                    data.articles?.let { _listData.postValue(it) }
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    // Your failed to do
                    _eventFailed.postValue(errorMessage)
                }

                override fun onFinish() {

                }

                override fun onShowProgress() {
                    // Your Progress Show
                    showLogDebug("onShowProgress --------------------------------------------------->")
                    _eventShowProgressState.postValue(true)
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    showLogDebug("onHideProgress --------------------------------------------------->")
                    _eventShowProgressState.postValue(false)
                }

            })
    }

    fun getTopHeadlineFlow() {
        viewModelScope.launch {
            newsApi.getTopHeadlineFlow(
                null,
                null,
                null,
                COUNTRY_ID,
                null,
                null
            ).collect { resource ->
                _topHeadlineState.value = resource
                when (resource) {
                    is Resource.Loading -> {
                        _eventShowProgressState.postValue(true)
                    }
                    is Resource.Success -> {
                        _eventShowProgressState.postValue(false)
                        resource.result?.articles?.let { _listData.postValue(it) }
                    }
                    is Resource.Error -> {
                        _eventShowProgressState.postValue(false)
                        _eventFailed.postValue(resource.message ?: "Unknown Error")
                    }
                }
            }
        }
    }

    fun getTopHeadlineFlow(category: String) {
        viewModelScope.launch {
            newsApi.getTopHeadlineFlow(
                null,
                null,
                category,
                COUNTRY_ID,
                null,
                null
            ).collect { resource ->
                _categoryHeadlineState.value = resource
                when (resource) {
                    is Resource.Loading -> {
                        _eventShowProgressState.postValue(true)
                    }
                    is Resource.Success -> {
                        _eventShowProgressState.postValue(false)
                        resource.result?.articles?.let { _listDataCategory.postValue(it) }
                    }
                    is Resource.Error -> {
                        _eventShowProgressState.postValue(false)
                        _eventFailed.postValue(resource.message ?: "Unknown Error")
                    }
                }
            }
        }
    }

}