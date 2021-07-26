package com.frogobox.frogoconsumeapi.sport.base

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * mvvm
 * Copyright (C) 16/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport
 *
 */
interface BaseSportDataSource {

    interface ResponseCallback<T> {

        // If success fetching data from API
        fun onSuccess(data: T)

        // If failed fetching data from API
        fun onFailed(statusCode: Int, errorMessage: String? = "")

        // Show progress view
        fun onShowProgress()

        // Show progress view
        fun onHideProgress()

    }

}