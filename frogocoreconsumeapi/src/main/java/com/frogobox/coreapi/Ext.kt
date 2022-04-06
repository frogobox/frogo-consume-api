package com.frogobox.coreapi

import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.coresdk.FrogoApiObserver
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers


/*
 * Created by faisalamir on 06/04/22
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
 
fun <T : Any> Observable<T>.doRequest(scheduler: Scheduler, callback: ConsumeApiResponse<T>) {
        subscribeOn(Schedulers.io())
        .doOnSubscribe { callback.onShowProgress() }
        .doOnTerminate { callback.onHideProgress() }
        .observeOn(scheduler)
        .subscribe(object : FrogoApiObserver<T>() {
            override fun onSuccess(data: T) {
                callback.onSuccess(data)
            }

            override fun onFailure(code: Int, errorMessage: String) {
                callback.onFailed(code, errorMessage)
            }
        })
}