package com.frogobox.frogoconsumeapi.sport.data.source

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

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
 * com.frogobox.base.modular.source.remote
 *
 */
abstract class SportApiCallback<M> : Observer<M> {

    abstract fun onSuccess(model: M)

    abstract fun onFailure(code: Int, errorMessage: String)

    abstract fun onFinish()

    override fun onComplete() {
        onFinish()
    }

    override fun onNext(t: M) {
        onSuccess(t)
    }

    override fun onSubscribe(d: Disposable) {

    }

    override fun onError(e: Throwable) {
        e.printStackTrace()
        when (e) {
            is HttpException -> {

                var baseDao: M? = null
                try {
                    val body = e.response()?.errorBody()
                } catch (exception: Exception) {
                    onFailure(504, exception.message!!)
                }

                onFailure(504, "Error Response")
            }

            is UnknownHostException -> onFailure(
                -1,
                "Telah terjadi kesalahan ketika koneksi ke server: ${e.message}"
            )
            is SocketTimeoutException -> onFailure(
                -1,
                "Telah terjadi kesalahan ketika koneksi ke server: ${e.message}"
            )
            else -> onFailure(-1, e.message ?: "Unknown error occured")
        }

        onFinish()
    }
}