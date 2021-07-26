package com.frogobox.frogoconsumeapi.sport.data.source

import android.content.Context
import com.frogobox.frogoconsumeapi.sport.data.response.*

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
open class SportRepository(private val remoteDataSource: SportRemoteDataSource) :
    SportDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchForTeamByName(apiKey, teamName, callback)
    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchForTeamByShortCode(apiKey, shortCode, callback)
    }

    override fun searchForAllPlayer(
        apiKey: String,
        teamName: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForAllPlayer(apiKey, teamName, callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForPlayer(apiKey, playerName, callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.searchForPlayer(
            apiKey,
            playerName,
            teamName,
            callback
        )
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.searchForEvent(apiKey, eventName, callback)
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.searchForEvent(apiKey, eventName, season, callback)
    }

    override fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.searchForEventFileName(apiKey, eventFileName, callback)
    }

    override fun getAllSports(apiKey: String, callback: SportDataSource.GetRemoteCallback<Sports>) {
        remoteDataSource.getAllSports(apiKey, callback)
    }

    override fun getAllLeagues(
        apiKey: String,
        callback: SportDataSource.GetRemoteCallback<Leagues>
    ) {
        remoteDataSource.getAllLeagues(apiKey, callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        callback: SportDataSource.GetRemoteCallback<Countrys>
    ) {
        remoteDataSource.searchAllLeagues(apiKey, countryName, callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: SportDataSource.GetRemoteCallback<Countrys>
    ) {
        remoteDataSource.searchAllLeagues(apiKey, countryName, sportName, callback)
    }

    override fun searchAllSeasons(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Seasons>
    ) {
        remoteDataSource.searchAllSeasons(apiKey, idTeam, callback)
    }

    override fun searchAllTeam(
        apiKey: String,
        league: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchAllTeam(apiKey, league, callback)
    }

    override fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.searchAllTeam(apiKey, sportName, countryName, callback)
    }

    override fun lookupAllTeam(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.lookupAllTeam(apiKey, idLeague, callback)
    }

    override fun lookupAllPlayer(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.lookupAllPlayer(apiKey, idTeam, callback)
    }

    override fun searchLoves(
        apiKey: String,
        userName: String?,
        callback: SportDataSource.GetRemoteCallback<Users>
    ) {
        remoteDataSource.searchLoves(apiKey, userName, callback)
    }

    override fun lookupLeagues(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Leagues>
    ) {
        remoteDataSource.lookupLeagues(apiKey, idLeague, callback)
    }

    override fun lookupTeam(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Teams>
    ) {
        remoteDataSource.lookupTeam(apiKey, idTeam, callback)
    }

    override fun lookupPlayer(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<Players>
    ) {
        remoteDataSource.lookupPlayer(apiKey, idPlayer, callback)
    }

    override fun lookupEvent(
        apiKey: String,
        idEvent: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.lookupEvent(apiKey, idEvent, callback)
    }

    override fun lookupHonour(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<Honors>
    ) {
        remoteDataSource.lookupHonour(apiKey, idPlayer, callback)
    }

    override fun lookupFormerTeam(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<FormerTeams>
    ) {
        remoteDataSource.lookupFormerTeam(apiKey, idPlayer, callback)
    }

    override fun lookupContract(
        apiKey: String,
        idPlayer: String?,
        callback: SportDataSource.GetRemoteCallback<Contracts>
    ) {
        remoteDataSource.lookupContract(apiKey, idPlayer, callback)
    }

    override fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Tables>
    ) {
        remoteDataSource.lookupTable(apiKey, idLeague, season, callback)
    }

    override fun eventsNext(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.eventsNext(apiKey, idTeam, callback)
    }

    override fun eventsNextLeague(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.eventsNextLeague(apiKey, idLeague, callback)
    }

    override fun eventsLast(
        apiKey: String,
        idTeam: String?,
        callback: SportDataSource.GetRemoteCallback<Results>
    ) {
        remoteDataSource.eventsLast(apiKey, idTeam, callback)
    }

    override fun eventsPastLeague(
        apiKey: String,
        idLeague: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.eventsPastLeague(apiKey, idLeague, callback)
    }

    override fun eventsRound(
        apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.eventsRound(apiKey, idLeague, round, season, callback)
    }

    override fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: SportDataSource.GetRemoteCallback<Events>
    ) {
        remoteDataSource.eventsSeason(apiKey, idLeague, season, callback)
    }
}