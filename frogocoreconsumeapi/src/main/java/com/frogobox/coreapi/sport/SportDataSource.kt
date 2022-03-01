package com.frogobox.coreapi.sport

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.response.*

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

    // Search for team by name
    fun searchForTeamByName(apiKey: String, teamName: String?, callback: ConsumeApiResponse<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(apiKey: String, teamName: String?, callback: ConsumeApiResponse<Players>)

    // Search for players by player name
    fun searchForPlayer(apiKey: String, playerName: String?, callback: ConsumeApiResponse<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    )

    // Search for event by event name
    fun searchForEvent(apiKey: String, eventName: String?, callback: ConsumeApiResponse<Events>)

    // Search For event by event name and season
    fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Search for event by event file name
    fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    )

    // List all sports
    fun getAllSports(apiKey: String, callback: ConsumeApiResponse<Sports>)

    // List all leagues
    fun getAllLeagues(apiKey: String, callback: ConsumeApiResponse<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(apiKey: String, countryName: String?, callback: ConsumeApiResponse<Countrys>)

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    )

    // List all Seasons in a League
    fun searchAllSeasons(apiKey: String, idTeam: String?, callback: ConsumeApiResponse<Seasons>)

    // List all Teams in a League
    fun searchAllTeam(apiKey: String, league: String?, callback: ConsumeApiResponse<Teams>)

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    )

    // List All teams details in a league by Id
    fun lookupAllTeam(apiKey: String, idLeague: String?, callback: ConsumeApiResponse<Teams>)

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(apiKey: String, idTeam: String?, callback: ConsumeApiResponse<Players>)

    // List all users loved teams and players
    fun searchLoves(apiKey: String, userName: String?, callback: ConsumeApiResponse<Users>)

    // League Details by Id
    fun lookupLeagues(apiKey: String, idLeague: String?, callback: ConsumeApiResponse<Leagues>)

    // Team Details by Id
    fun lookupTeam(apiKey: String, idTeam: String?, callback: ConsumeApiResponse<Teams>)

    // Player Details by Id
    fun lookupPlayer(apiKey: String, idPlayer: String?, callback: ConsumeApiResponse<Players>)

    // Event Details by Id
    fun lookupEvent(apiKey: String, idEvent: String?, callback: ConsumeApiResponse<Events>)

    // Player Honours by Player Id
    fun lookupHonour(apiKey: String, idPlayer: String?, callback: ConsumeApiResponse<Honors>)

    // Player Former Teams by Player Id
    fun lookupFormerTeam(apiKey: String, idPlayer: String?, callback: ConsumeApiResponse<FormerTeams>)

    // Player Contracts by Player Id
    fun lookupContract(apiKey: String, idPlayer: String?, callback: ConsumeApiResponse<Contracts>)

    // Lookup Table by League ID and Season
    fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    )

    // Next 5 Events by Team Id
    fun eventsNext(apiKey: String, idTeam: String?, callback: ConsumeApiResponse<Events>)

    // Next 15 Events by League Id
    fun eventsNextLeague(apiKey: String, idLeague: String?, callback: ConsumeApiResponse<Events>)

    // Last 5 Events by Team Id
    fun eventsLast(apiKey: String, idTeam: String?, callback: ConsumeApiResponse<Results>)

    // Last 15 Events by League Id
    fun eventsPastLeague(apiKey: String, idLeague: String?, callback: ConsumeApiResponse<Events>)

    // Events in a specific round by league id/round/season
    fun eventsRound(
        apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    )

    // Event TV by Event Id *Patreon ONLY*

    // Events on a specific day *Patreon ONLY*

    // TV Events on a day (By Sport/Date/TV Station Country) channel (Latest) *Patreon ONLY*


}