package com.frogobox.frogoconsumeapi.movie.data.source

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.data.source
 *
 */
abstract class MovieApiCallback<M> : Observer<M> {

    abstract fun onSuccess(data: M)

    abstract fun onFailure(statusCode: Int, errorMessage: String)

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
                val code = e.code()
                var msg = e.message()
                try {
                    val body = e.response()?.errorBody()
                } catch (exception: Exception) {
                    onFailure(code, exception.message!!)
                }

                when (code) {
                    504 -> {
                        msg = "Error Response"
                    }
                    502, 404 -> {
                        msg = "Error Connect or Resource Not Found"
                    }
                    400 -> {
                        msg = "Bad Request"
                    }
                    401 -> {
                        msg = "Not Authorized"
                    }
                }

                onFailure(code, msg)
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