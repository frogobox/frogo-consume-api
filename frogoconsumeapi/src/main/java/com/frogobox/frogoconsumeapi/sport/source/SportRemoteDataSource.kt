package com.frogobox.frogoconsumeapi.sport.source

import android.content.Context
import com.frogobox.frogoconsumeapi.sport.response.*
import com.frogobox.frogoconsumeapi.sport.util.SportUrl
import com.frogobox.frogosdk.core.FrogoApiCallback
import com.frogobox.frogosdk.core.FrogoApiClient
import com.frogobox.frogosdk.core.FrogoResponseCallback
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

    private var sportApiService = FrogoApiClient.create<SportApiService>(SportUrl.BASE_URL)

    override fun usingChuckInterceptor(context: Context) {
        sportApiService = FrogoApiClient.create(SportUrl.BASE_URL, context)
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: FrogoResponseCallback<Teams>
    ) {
        sportApiService
            .searchForTeamByName(apiKey, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Teams>() {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: FrogoResponseCallback<Teams>
    ) {
        sportApiService
            .searchForTeamByShortCode(apiKey, shortCode)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Teams>() {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForAllPlayer(
        apiKey: String,
        teamName: String?,
        callback: FrogoResponseCallback<Players>
    ) {
        sportApiService
            .searchForAllPlayer(apiKey, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Players>() {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        callback: FrogoResponseCallback<Players>
    ) {
        sportApiService
            .searchForPlayer(apiKey, playerName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Players>() {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: FrogoResponseCallback<Players>
    ) {
        sportApiService
            .searchForPlayer(apiKey, playerName, teamName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Players>() {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .searchForEvent(apiKey, eventName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .searchForEvent(apiKey, eventName, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .searchForEventFileName(apiKey, eventFileName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getAllSports(apiKey: String, callback: FrogoResponseCallback<Sports>) {
        sportApiService.getAllSports(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Sports>() {
                override fun onSuccess(data: Sports) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getAllLeagues(
        apiKey: String,
        callback: FrogoResponseCallback<Leagues>
    ) {
        sportApiService.getAllLeagues(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Leagues>() {
                override fun onSuccess(data: Leagues) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        callback: FrogoResponseCallback<Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Countrys>() {
                override fun onSuccess(data: Countrys) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: FrogoResponseCallback<Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName, sportName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Countrys>() {
                override fun onSuccess(data: Countrys) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchAllSeasons(
        apiKey: String,
        idTeam: String?,
        callback: FrogoResponseCallback<Seasons>
    ) {
        sportApiService.searchAllSeasons(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Seasons>() {
                override fun onSuccess(data: Seasons) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchAllTeam(
        apiKey: String,
        league: String?,
        callback: FrogoResponseCallback<Teams>
    ) {
        sportApiService
            .searchAllTeam(apiKey, league)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Teams>() {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: FrogoResponseCallback<Teams>
    ) {
        sportApiService
            .searchAllTeam(apiKey, sportName, countryName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Teams>() {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupAllTeam(
        apiKey: String,
        idLeague: String?,
        callback: FrogoResponseCallback<Teams>
    ) {
        sportApiService
            .lookupAllTeam(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Teams>() {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupAllPlayer(
        apiKey: String,
        idTeam: String?,
        callback: FrogoResponseCallback<Players>
    ) {
        sportApiService
            .lookupAllPlayer(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Players>() {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchLoves(
        apiKey: String,
        userName: String?,
        callback: FrogoResponseCallback<Users>
    ) {
        sportApiService
            .searchLoves(apiKey, userName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Users>() {
                override fun onSuccess(data: Users) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupLeagues(
        apiKey: String,
        idLeague: String?,
        callback: FrogoResponseCallback<Leagues>
    ) {
        sportApiService
            .lookupLeagues(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Leagues>() {
                override fun onSuccess(data: Leagues) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupTeam(
        apiKey: String,
        idTeam: String?,
        callback: FrogoResponseCallback<Teams>
    ) {
        sportApiService
            .lookupTeam(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Teams>() {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupPlayer(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoResponseCallback<Players>
    ) {
        sportApiService
            .lookupPlayer(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Players>() {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupEvent(
        apiKey: String,
        idEvent: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .lookupEvent(apiKey, idEvent)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupHonour(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoResponseCallback<Honors>
    ) {
        sportApiService
            .lookupHonour(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Honors>() {
                override fun onSuccess(data: Honors) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupFormerTeam(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoResponseCallback<FormerTeams>
    ) {
        sportApiService
            .lookupFormerTeam(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<FormerTeams>() {
                override fun onSuccess(data: FormerTeams) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupContract(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoResponseCallback<Contracts>
    ) {
        sportApiService
            .lookupContract(apiKey, idPlayer)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Contracts>() {
                override fun onSuccess(data: Contracts) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoResponseCallback<Tables>
    ) {
        sportApiService
            .lookupTable(apiKey, idLeague, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Tables>() {
                override fun onSuccess(data: Tables) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun eventsNext(
        apiKey: String,
        idTeam: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .eventsNext(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun eventsNextLeague(
        apiKey: String,
        idLeague: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .eventsNextLeague(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun eventsLast(
        apiKey: String,
        idTeam: String?,
        callback: FrogoResponseCallback<Results>
    ) {
        sportApiService
            .eventsLast(apiKey, idTeam)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Results>() {
                override fun onSuccess(data: Results) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun eventsPastLeague(
        apiKey: String,
        idLeague: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .eventsPastLeague(apiKey, idLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun eventsRound(
        apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .eventsRound(apiKey, idLeague, round, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoResponseCallback<Events>
    ) {
        sportApiService
            .eventsSeason(apiKey, idLeague, season)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Events>() {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}