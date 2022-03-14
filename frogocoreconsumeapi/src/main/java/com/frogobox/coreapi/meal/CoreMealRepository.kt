package com.frogobox.coreapi.meal

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coresdk.FrogoApiClient
import com.frogobox.coresdk.FrogoApiObserver
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-the-meal-db-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogomealsapi.data.source
 *
 */
class CoreMealRepository : CoreMealDataSource {

    companion object {
        val TAG = CoreMealRepository::class.java.simpleName
    }

    protected var mealApiService = FrogoApiClient.create<MealApiService>(MealUrl.BASE_URL)

    override fun searchMeal(
        apiKey: String,
        mealName: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {

        mealApiService
            .searchMeal(apiKey, mealName)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })

    }

    override fun listAllMeal(
        apiKey: String,
        firstLetter: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {

        mealApiService
            .listAllMeal(apiKey, firstLetter)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }


            })
    }

    override fun lookupFullMeal(
        apiKey: String,
        idMeal: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {

        mealApiService
            .lookupFullMeal(apiKey, idMeal)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupRandomMeal(
        apiKey: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {

        mealApiService
            .lookupRandomMeal(apiKey)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Meal>>() {
                override fun onSuccess(data: MealResponse<Meal>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listMealCategories(
        apiKey: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<CategoryResponse>
    ) {

        mealApiService
            .listMealCategories(apiKey)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<CategoryResponse>() {
                override fun onSuccess(data: CategoryResponse) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listAllCateories(
        apiKey: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Category>>
    ) {

        mealApiService
            .listAllCateories(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Category>>() {
                override fun onSuccess(data: MealResponse<Category>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun listAllArea(
        apiKey: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Area>>
    ) {

        mealApiService
            .listAllArea(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Area>>() {
                override fun onSuccess(data: MealResponse<Area>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }


            })
    }

    override fun listAllIngredients(
        apiKey: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<Ingredient>>
    ) {

        mealApiService
            .listAllIngredients(apiKey, MealConstant.VALUE_LIST)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<Ingredient>>() {
                override fun onSuccess(data: MealResponse<Ingredient>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByIngredient(
        apiKey: String,
        ingredient: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {

        mealApiService
            .filterByIngredient(apiKey, ingredient)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByCategory(
        apiKey: String,
        category: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {

        mealApiService
            .filterByCategory(apiKey, category)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun filterByArea(
        apiKey: String,
        area: String,
        rxScheduler: Scheduler,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {

        mealApiService
            .filterByArea(apiKey, area)
            .subscribeOn(Schedulers.io())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .observeOn(rxScheduler)
            .subscribe(object : FrogoApiObserver<MealResponse<MealFilter>>() {
                override fun onSuccess(data: MealResponse<MealFilter>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}