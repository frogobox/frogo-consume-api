package com.frogobox.api.sport

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.doRequest
import com.frogobox.coreapi.sport.SportApiService
import com.frogobox.coreapi.sport.SportDataSource
import com.frogobox.coreapi.sport.SportUrl
import com.frogobox.coreapi.sport.response.*
import com.frogobox.coresdk.FrogoApiClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers


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

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context) {
        Log.d(TAG, "Using Chuck Interceptor")
        sportApiService =
            FrogoApiClient.createWithInterceptor(SportUrl.BASE_URL, ChuckerInterceptor(context))
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "Search for team by name")
        sportApiService.searchForTeamByName(apiKey, teamName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "Search for team short code")
        sportApiService.searchForTeamByShortCode(apiKey, shortCode)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForAllPlayer(
        apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Search for all players from team *Patreon ONLY*")
        sportApiService.searchForAllPlayer(apiKey, teamName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Search for players by player name")
        sportApiService.searchForPlayer(apiKey, playerName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Search for players by player name and team name")
        sportApiService.searchForPlayer(apiKey, playerName, teamName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Search for event by event name")
        sportApiService.searchForEvent(apiKey, eventName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Search For event by event name and season")
        sportApiService.searchForEvent(apiKey, eventName, season)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Search for event by event file name")
        sportApiService.searchForEventFileName(apiKey, eventFileName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getAllSports(apiKey: String, callback: ConsumeApiResponse<Sports>) {
        Log.d(TAG, "List all sports")
        sportApiService.getAllSports(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun getAllLeagues(apiKey: String, callback: ConsumeApiResponse<Leagues>) {
        Log.d(TAG, "List all leagues")
        sportApiService.getAllLeagues(apiKey)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        Log.d(TAG, "List all Leagues in a country")
        sportApiService.searchAllLeagues(apiKey, countryName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        Log.d(TAG, "List all Leagues in a country specific by sport")
        sportApiService.searchAllLeagues(apiKey, countryName, sportName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchAllSeasons(
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Seasons>
    ) {
        Log.d(TAG, "List all Seasons in a League")
        sportApiService.searchAllSeasons(apiKey, idTeam)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchAllTeam(
        apiKey: String,
        league: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "List all Teams in a League")
        sportApiService.searchAllTeam(apiKey, league)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "List all Teams in Sport and Country")
        sportApiService.searchAllTeam(apiKey, sportName, countryName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupAllTeam(
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "List All teams details in a league by Id")
        sportApiService.lookupAllTeam(apiKey, idLeague)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupAllPlayer(
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "List All players in a team by Team Id *Patreon ONLY*")
        sportApiService.lookupAllPlayer(apiKey, idTeam)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun searchLoves(
        apiKey: String,
        userName: String?,
        callback: ConsumeApiResponse<Users>
    ) {
        Log.d(TAG, "List all users loved teams and players")
        sportApiService.searchLoves(apiKey, userName)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupLeagues(
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Leagues>
    ) {
        Log.d(TAG, "League Details by Id")
        sportApiService.lookupLeagues(apiKey, idLeague)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupTeam(
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        Log.d(TAG, "Team Details by Id")
        sportApiService.lookupTeam(apiKey, idTeam)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupPlayer(
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        Log.d(TAG, "Player Details by Id")
        sportApiService.lookupPlayer(apiKey, idPlayer)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupEvent(
        apiKey: String,
        idEvent: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Event Details by Id")
        sportApiService.lookupEvent(apiKey, idEvent)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupHonour(
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Honors>
    ) {
        Log.d(TAG, "Player Honours by Player Id")
        sportApiService.lookupHonour(apiKey, idPlayer)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupFormerTeam(
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<FormerTeams>
    ) {
        Log.d(TAG, "Player Former Teams by Player Id")
        sportApiService.lookupFormerTeam(apiKey, idPlayer)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupContract(
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Contracts>
    ) {
        Log.d(TAG, "Player Contracts by Player Id")
        sportApiService.lookupContract(apiKey, idPlayer)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    ) {
        Log.d(TAG, "Lookup Table by League ID and Season")
        sportApiService.lookupTable(apiKey, idLeague, season)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun eventsNext(
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Next 5 Events by Team Id")
        sportApiService.eventsNext(apiKey, idTeam)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun eventsNextLeague(
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Next 15 Events by League Id")
        sportApiService.eventsNextLeague(apiKey, idLeague)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun eventsLast(
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Results>
    ) {
        Log.d(TAG, "Last 5 Events by Team Id")
        sportApiService.eventsLast(apiKey, idTeam)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun eventsPastLeague(
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "Last 15 Events by League Id")
        sportApiService.eventsPastLeague(apiKey, idLeague)
            .doRequest(AndroidSchedulers.mainThread(), callback)
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
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }

    override fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        Log.d(TAG, "All events in specific league by season (Free tier limited to 200 events)")
        sportApiService.eventsSeason(apiKey, idLeague, season)
            .doRequest(AndroidSchedulers.mainThread(), callback)
    }
}