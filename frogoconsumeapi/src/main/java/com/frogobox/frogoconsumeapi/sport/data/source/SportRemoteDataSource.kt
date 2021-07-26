package com.frogobox.frogoconsumeapi.sport.data.source

import android.content.Context
import com.frogobox.frogoconsumeapi.sport.data.response.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 26/01/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.source
 *
 */
object SportRemoteDataSource :
    SportDataSource {

    private val sportApiService = SportApiService

    override fun usingChuckInterceptor(context: Context) {
        sportApiService.usingChuckInterceptor(context)
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchForTeamByName(apiKey, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchForTeamByShortCode(apiKey, shortCode)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForAllPlayer(
        apiKey: String,
        teamName: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .searchForAllPlayer(apiKey, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .searchForPlayer(apiKey, playerName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .searchForPlayer(apiKey, playerName, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .searchForEvent(apiKey, eventName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .searchForEvent(apiKey, eventName, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .searchForEventFileName(apiKey, eventFileName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getAllSports(apiKey: String, callback: SportDataSource.GetRemoteCallback<Sports>) {
        sportApiService.getApiService.getAllSports(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Sports>() {
                override fun onSuccess(model: Sports) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun getAllLeagues(
        apiKey: String,
        callback: SportDataSource.GetRemoteCallback<Leagues>
    ) {
        sportApiService.getApiService.getAllLeagues(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Leagues>() {
                override fun onSuccess(model: Leagues) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        callback: SportDataSource.GetRemoteCallback<Countrys>
    ) {
        sportApiService.getApiService.searchAllLeagues(apiKey, countryName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Countrys>() {
                override fun onSuccess(model: Countrys) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: SportDataSource.GetRemoteCallback<Countrys>
    ) {
        sportApiService.getApiService.searchAllLeagues(apiKey, countryName, sportName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Countrys>() {
                override fun onSuccess(model: Countrys) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchAllSeasons(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Seasons>
    ) {
        sportApiService.getApiService.searchAllSeasons(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Seasons>() {
                override fun onSuccess(model: Seasons) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchAllTeam(
        apiKey: String,
        league: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchAllTeam(apiKey, league)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .searchAllTeam(apiKey, sportName, countryName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupAllTeam(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .lookupAllTeam(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupAllPlayer(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .lookupAllPlayer(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun searchLoves(
        apiKey: String,
        userName: String?,
        callback: SportDataSource.GetRemoteCallback<Users>
    ) {
        sportApiService.getApiService
            .searchLoves(apiKey, userName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Users>() {
                override fun onSuccess(model: Users) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupLeagues(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Leagues>
    ) {
        sportApiService.getApiService
            .lookupLeagues(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Leagues>() {
                override fun onSuccess(model: Leagues) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupTeam(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        sportApiService.getApiService
            .lookupTeam(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Teams>() {
                override fun onSuccess(model: Teams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupPlayer(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        sportApiService.getApiService
            .lookupPlayer(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Players>() {
                override fun onSuccess(model: Players) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupEvent(
        apiKey: String,
        idEvent: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .lookupEvent(apiKey, idEvent)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupHonour(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<Honors>
    ) {
        sportApiService.getApiService
            .lookupHonour(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Honors>() {
                override fun onSuccess(model: Honors) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupFormerTeam(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<FormerTeams>
    ) {
        sportApiService.getApiService
            .lookupFormerTeam(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<FormerTeams>() {
                override fun onSuccess(model: FormerTeams) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupContract(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<Contracts>
    ) {
        sportApiService.getApiService
            .lookupContract(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Contracts>() {
                override fun onSuccess(model: Contracts) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Tables>
    ) {
        sportApiService.getApiService
            .lookupTable(apiKey, idLeague, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Tables>() {
                override fun onSuccess(model: Tables) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun eventsNext(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .eventsNext(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun eventsNextLeague(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .eventsNextLeague(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun eventsLast(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Results>
    ) {
        sportApiService.getApiService
            .eventsLast(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Results>() {
                override fun onSuccess(model: Results) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun eventsPastLeague(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .eventsPastLeague(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun eventsRound(
        apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .eventsRound(apiKey, idLeague, round, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }

    override fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        sportApiService.getApiService
            .eventsSeason(apiKey, idLeague, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : SportApiCallback<Events>() {
                override fun onSuccess(model: Events) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {
                }
            })
    }
}