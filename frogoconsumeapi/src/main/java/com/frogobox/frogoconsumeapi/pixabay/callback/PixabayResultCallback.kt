package com.frogobox.frogoconsumeapi.pixabay.callback

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
 * com.frogobox.frogoconsumeapi.pixabay.callback
 *
 */
interface PixabayResultCallback<T> {

    // Getting Data From API
    fun getResultData(data: T)

    // Failed Meesage
    fun failedResult(statusCode: Int, errorMessage: String?)

    // Show your progress view
    fun onShowProgress()

    // Hide your progress view
    fun onHideProgress()

}