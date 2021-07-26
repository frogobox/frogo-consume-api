package com.frogobox.frogoconsumeapi.pixabay.base

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * PixabayAPI
 * Copyright (C) 14/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.pixabay.base
 *
 */
interface BasePixabayDataSource {

    interface ResponseCallback<T> {

        // If success fetching data from API
        fun onSuccess(data: T)

        // If failed fetching data from API
        fun onFailed(statusCode: Int, errorMessage: String? = "")

        // Show your progress view
        fun onShowProgress()

        // Hide your progress view
        fun onHideProgress()

    }

}