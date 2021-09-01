package com.frogobox.api.sport.source

import android.content.Context
import android.util.Log
import com.frogobox.api.core.ConsumeApiResponse
import com.frogobox.api.sport.response.*
import com.frogobox.api.sport.util.SportUrl
import com.frogobox.sdk.core.FrogoApiCallback
import com.frogobox.sdk.core.FrogoApiClient
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
object SportRepository : SportDataSource {

    private val TAG = SportRepository::class.java.simpleName
    private var sportApiService = FrogoApiClient.create<SportApiService>(SportUrl.BASE_URL)

    override fun usingChuckInterceptor(context: Context) {
        Log.d(TAG, "Using Chuck Interceptor")
        sportApiService = FrogoApiClient.create(SportUrl.BASE_URL, context)
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "Search for team by name")
        sportApiService.searchForTeamByName(apiKey, teamName)
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
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "Search for team short code")
        sportApiService.searchForTeamByShortCode(apiKey, shortCode)
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
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Search for all players from team *Patreon ONLY*")
        sportApiService.searchForAllPlayer(apiKey, teamName)
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
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Search for players by player name")
        sportApiService.searchForPlayer(apiKey, playerName)
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
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Search for players by player name and team name")
        sportApiService.searchForPlayer(apiKey, playerName, teamName)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Search for event by event name")
        sportApiService.searchForEvent(apiKey, eventName)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Search For event by event name and season")
        sportApiService.searchForEvent(apiKey, eventName, season)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Search for event by event file name")
        sportApiService.searchForEventFileName(apiKey, eventFileName)
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

    override fun getAllSports(apiKey: String, callback: ConsumeApiResponse<Sports>) {
        Log.d(TAG, "List all sports")
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

    override fun getAllLeagues(apiKey: String, callback: ConsumeApiResponse<Leagues>) {
        Log.d(TAG, "List all leagues")
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
        callback: ConsumeApiResponse<Countrys>
    ) {
        Log.d(TAG, "List all Leagues in a country")
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
        callback: ConsumeApiResponse<Countrys>
    ) {
        Log.d(TAG, "List all Leagues in a country specific by sport")
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
        callback: ConsumeApiResponse<Seasons>
    ) {
        Log.d(TAG, "List all Seasons in a League")
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
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "List all Teams in a League")
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
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "List all Teams in Sport and Country")
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
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "List All teams details in a league by Id")
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
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "List All players in a team by Team Id *Patreon ONLY*")
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
        callback: ConsumeApiResponse<Users>
    ) {
        Log.d(TAG, "List all users loved teams and players")
        sportApiService.searchLoves(apiKey, userName)
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
        callback: ConsumeApiResponse<Leagues>
    ) {
        Log.d(TAG, "League Details by Id")
        sportApiService.lookupLeagues(apiKey, idLeague)
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
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "Team Details by Id")
        sportApiService.lookupTeam(apiKey, idTeam)
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
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Player Details by Id")
        sportApiService.lookupPlayer(apiKey, idPlayer)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Event Details by Id")
        sportApiService.lookupEvent(apiKey, idEvent)
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
        callback: ConsumeApiResponse<Honors>
    ) {
        Log.d(TAG, "Player Honours by Player Id")
        sportApiService.lookupHonour(apiKey, idPlayer)
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
        callback: ConsumeApiResponse<FormerTeams>
    ) {
        Log.d(TAG, "Player Former Teams by Player Id")
        sportApiService.lookupFormerTeam(apiKey, idPlayer)
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
        callback: ConsumeApiResponse<Contracts>
    ) {
        Log.d(TAG, "Player Contracts by Player Id")
        sportApiService.lookupContract(apiKey, idPlayer)
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
        callback: ConsumeApiResponse<Tables>
    ) {
        Log.d(TAG, "Lookup Table by League ID and Season")
        sportApiService.lookupTable(apiKey, idLeague, season)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Next 5 Events by Team Id")
        sportApiService.eventsNext(apiKey, idTeam)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Next 15 Events by League Id")
        sportApiService.eventsNextLeague(apiKey, idLeague)
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
        callback: ConsumeApiResponse<Results>
    ) {
        Log.d(TAG, "Last 5 Events by Team Id")
        sportApiService.eventsLast(apiKey, idTeam)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Last 15 Events by League Id")
        sportApiService.eventsPastLeague(apiKey, idLeague)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Events in a specific round by league id/round/season")
        sportApiService.eventsRound(apiKey, idLeague, round, season)
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
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "All events in specific league by season (Free tier limited to 200 events)")
        sportApiService.eventsSeason(apiKey, idLeague, season)
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