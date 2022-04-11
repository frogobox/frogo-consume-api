package com.frogobox.coreapi.sport

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.response.*
import okhttp3.Interceptor


/*
 * Created by faisalamir on 07/04/22
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

interface ISportApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(chuckerInterceptor: Interceptor)

    // Search for team by name
    fun searchForTeamByName(teamName: String?, callback: ConsumeApiResponse<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String?, callback: ConsumeApiResponse<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(teamName: String?, callback: ConsumeApiResponse<Players>)

    // Search for players by player name
    fun searchForPlayer(playerName: String?, callback: ConsumeApiResponse<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    )

    // Search for event by event name
    fun searchForEvent(eventName: String?, callback: ConsumeApiResponse<Events>)

    // Search For event by event name and season
    fun searchForEvent(
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Search for event by event file name
    fun searchForEventFileName(
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    )

    // List all sports
    fun getAllSports(callback: ConsumeApiResponse<Sports>)

    // List all leagues
    fun getAllLeagues(callback: ConsumeApiResponse<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(countryName: String?, callback: ConsumeApiResponse<Countrys>)

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    )

    // List all Seasons in a League
    fun searchAllSeasons(idTeam: String?, callback: ConsumeApiResponse<Seasons>)

    // List all Teams in a League
    fun searchAllTeam(league: String?, callback: ConsumeApiResponse<Teams>)

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // List All teams details in a league by Id
    fun lookupAllTeam(idLeague: String?, callback: ConsumeApiResponse<Teams>)

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(idTeam: String?, callback: ConsumeApiResponse<Players>)

    // List all users loved teams and players
    fun searchLoves(userName: String?, callback: ConsumeApiResponse<Users>)

    // League Details by Id
    fun lookupLeagues(idLeague: String?, callback: ConsumeApiResponse<Leagues>)

    // Team Details by Id
    fun lookupTeam(idTeam: String?, callback: ConsumeApiResponse<Teams>)

    // Player Details by Id
    fun lookupPlayer(idPlayer: String?, callback: ConsumeApiResponse<Players>)

    // Event Details by Id
    fun lookupEvent(idEvent: String?, callback: ConsumeApiResponse<Events>)

    // Player Honours by Player Id
    fun lookupHonour(idPlayer: String?, callback: ConsumeApiResponse<Honors>)

    // Player Former Teams by Player Id
    fun lookupFormerTeam(idPlayer: String?, callback: ConsumeApiResponse<FormerTeams>)

    // Player Contracts by Player Id
    fun lookupContract(idPlayer: String?, callback: ConsumeApiResponse<Contracts>)

    // Lookup Table by League ID and Season
    fun lookupTable(
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    )

    // Next 5 Events by Team Id
    fun eventsNext(idTeam: String?, callback: ConsumeApiResponse<Events>)

    // Next 15 Events by League Id
    fun eventsNextLeague(idLeague: String?, callback: ConsumeApiResponse<Events>)

    // Last 5 Events by Team Id
    fun eventsLast(idTeam: String?, callback: ConsumeApiResponse<Results>)

    // Last 15 Events by League Id
    fun eventsPastLeague(idLeague: String?, callback: ConsumeApiResponse<Events>)

    // Events in a specific round by league id/round/season
    fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

}