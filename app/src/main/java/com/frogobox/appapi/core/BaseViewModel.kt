package com.frogobox.appapi.core

import android.app.Application
import com.frogobox.appapi.source.ApiRepository
import com.frogobox.appapi.util.isDebug
import com.frogobox.sdk.view.FrogoViewModel


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

open class BaseViewModel(
    private val context: Application,
    private val repository: ApiRepository
) : FrogoViewModel(context) {

    protected val newsApi = repository.consumeNewsApi().usingChuckInterceptor(isDebug, context)
    protected val movieApi = repository.consumeMovieApi()
    protected val pixabayApi = repository.consumePixabayApi().usingChuckInterceptor(isDebug, context)
    protected val sportApi = repository.consumeTheSportDbApi()
    protected val mealApi = repository.consumeTheMealDbApi()

}