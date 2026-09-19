package com.frogobox.coreapi.sport


import com.frogobox.coresdk.response.FrogoDataResponse
import okhttp3.Interceptor

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
interface SportDataSource {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(isDebug: Boolean, chuckerInterceptor: Interceptor): SportDataSource

    // Search for team by name
    fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    )

    // Search for team short code
    fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    )

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(
        apiKey: String,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    )

    // Search for players by player name
    fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    )

    // Search for players by player name and team name
    fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    )

    // Search for event by event name
    fun searchForEvent(
        apiKey: String,
        eventName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Search For event by event name and season
    fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Search for event by event file name
    fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // List all sports
    fun getAllSports(apiKey: String, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Sports>)

    // List all leagues
    fun getAllLeagues(apiKey: String, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Countrys>
    )

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Countrys>
    )

    // List all Seasons in a League
    fun searchAllSeasons(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Seasons>
    )

    // List all Teams in a League
    fun searchAllTeam(
        apiKey: String,
        league: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    )

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    )

    // List All teams details in a league by Id
    fun lookupAllTeam(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    )

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    )

    // List all users loved teams and players
    fun searchLoves(
        apiKey: String,
        userName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Users>
    )

    // League Details by Id
    fun lookupLeagues(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Leagues>
    )

    // Team Details by Id
    fun lookupTeam(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    )

    // Player Details by Id
    fun lookupPlayer(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    )

    // Event Details by Id
    fun lookupEvent(
        apiKey: String,
        idEvent: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Player Honours by Player Id
    fun lookupHonour(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Honors>
    )

    // Player Former Teams by Player Id
    fun lookupFormerTeam(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.FormerTeams>
    )

    // Player Contracts by Player Id
    fun lookupContract(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Contracts>
    )

    // Lookup Table by League ID and Season
    fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Tables>
    )

    // Next 5 Events by Team Id
    fun eventsNext(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Next 15 Events by League Id
    fun eventsNextLeague(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Last 5 Events by Team Id
    fun eventsLast(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Results>
    )

    // Last 15 Events by League Id
    fun eventsPastLeague(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Events in a specific round by league id/round/season
    fun eventsRound(
        apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    )

    // Event TV by Event Id *Patreon ONLY*

    // Events on a specific day *Patreon ONLY*

    // TV Events on a day (By Sport/Date/TV Station Country) channel (Latest) *Patreon ONLY*


}