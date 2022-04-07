package com.frogobox.coreapi.sport

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.response.*
import io.reactivex.rxjava3.core.Scheduler
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
    fun usingChuckInterceptor(chuckerInterceptor: Interceptor)

    // Search for team by name
    fun searchForTeamByName(
        scheduler: Scheduler?,
        apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // Search for team short code
    fun searchForTeamByShortCode(
        scheduler: Scheduler?, apiKey: String,
        shortCode: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(
        scheduler: Scheduler?,
        apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    )

    // Search for players by player name
    fun searchForPlayer(
        scheduler: Scheduler?,
        apiKey: String,
        playerName: String?,
        callback: ConsumeApiResponse<Players>
    )

    // Search for players by player name and team name
    fun searchForPlayer(
        scheduler: Scheduler?, apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    )

    // Search for event by event name
    fun searchForEvent(
        scheduler: Scheduler?,
        apiKey: String,
        eventName: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Search For event by event name and season
    fun searchForEvent(
        scheduler: Scheduler?, apiKey: String,
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Search for event by event file name
    fun searchForEventFileName(
        scheduler: Scheduler?, apiKey: String,
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    )

    // List all sports
    fun getAllSports(scheduler: Scheduler?, apiKey: String, callback: ConsumeApiResponse<Sports>)

    // List all leagues
    fun getAllLeagues(scheduler: Scheduler?, apiKey: String, callback: ConsumeApiResponse<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(
        scheduler: Scheduler?,
        apiKey: String,
        countryName: String?,
        callback: ConsumeApiResponse<Countrys>
    )

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(
        scheduler: Scheduler?, apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    )

    // List all Seasons in a League
    fun searchAllSeasons(
        scheduler: Scheduler?,
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Seasons>
    )

    // List all Teams in a League
    fun searchAllTeam(
        scheduler: Scheduler?,
        apiKey: String,
        league: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(
        scheduler: Scheduler?, apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // List All teams details in a league by Id
    fun lookupAllTeam(
        scheduler: Scheduler?,
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(
        scheduler: Scheduler?,
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Players>
    )

    // List all users loved teams and players
    fun searchLoves(
        scheduler: Scheduler?,
        apiKey: String,
        userName: String?,
        callback: ConsumeApiResponse<Users>
    )

    // League Details by Id
    fun lookupLeagues(
        scheduler: Scheduler?,
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Leagues>
    )

    // Team Details by Id
    fun lookupTeam(
        scheduler: Scheduler?,
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // Player Details by Id
    fun lookupPlayer(
        scheduler: Scheduler?,
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Players>
    )

    // Event Details by Id
    fun lookupEvent(
        scheduler: Scheduler?,
        apiKey: String,
        idEvent: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Player Honours by Player Id
    fun lookupHonour(
        scheduler: Scheduler?,
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Honors>
    )

    // Player Former Teams by Player Id
    fun lookupFormerTeam(
        scheduler: Scheduler?,
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<FormerTeams>
    )

    // Player Contracts by Player Id
    fun lookupContract(
        scheduler: Scheduler?,
        apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Contracts>
    )

    // Lookup Table by League ID and Season
    fun lookupTable(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    )

    // Next 5 Events by Team Id
    fun eventsNext(
        scheduler: Scheduler?,
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Next 15 Events by League Id
    fun eventsNextLeague(
        scheduler: Scheduler?,
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Last 5 Events by Team Id
    fun eventsLast(
        scheduler: Scheduler?,
        apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Results>
    )

    // Last 15 Events by League Id
    fun eventsPastLeague(
        scheduler: Scheduler?,
        apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Events in a specific round by league id/round/season
    fun eventsRound(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Event TV by Event Id *Patreon ONLY*

    // Events on a specific day *Patreon ONLY*

    // TV Events on a day (By Sport/Date/TV Station Country) channel (Latest) *Patreon ONLY*


}