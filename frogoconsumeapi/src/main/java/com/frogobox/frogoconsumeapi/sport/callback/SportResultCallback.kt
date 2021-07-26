package com.frogobox.frogoconsumeapi.sport.callback

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 05/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.callback
 *
 */
interface SportResultCallback<T> {

    // Getting Data From API
    fun getResultData(data: T)

    // Failed Meesage
    fun failedResult(statusCode: Int, errorMessage: String?)

    // Show progress view
    fun onShowProgress()

    // Show progress view
    fun onHideProgress()

}