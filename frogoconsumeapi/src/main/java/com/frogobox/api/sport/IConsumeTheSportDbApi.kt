package com.frogobox.api.sport

import android.content.Context
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.ISportApi
import com.frogobox.coreapi.sport.response.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 04/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.util
 *
 */

interface IConsumeTheSportDbApi : ISportApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

}