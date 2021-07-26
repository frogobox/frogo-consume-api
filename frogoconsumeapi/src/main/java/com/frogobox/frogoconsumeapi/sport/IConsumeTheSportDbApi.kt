package com.frogobox.frogoconsumeapi.sport

import android.content.Context
import com.frogobox.frogoconsumeapi.sport.response.*
import com.frogobox.frogosdk.core.FrogoResponseCallback

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 04/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.util
 *
 */
interface IConsumeTheSportDbApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for team by name
    fun searchForTeamByName(teamName: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(teamName: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Search for players by player name
    fun searchForPlayer(playerName: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(playerName: String?, teamName: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Search for event by event name
    fun searchForEvent(eventName: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Search For event by event name and season
    fun searchForEvent(eventName: String?, season: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Search for event by event file name
    fun searchForEventFileName(eventFileName: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // List all sports
    fun getAllSports(sportResultCallback: FrogoResponseCallback<Sports>)

    // List all leagues
    fun getAllLeagues(sportResultCallback: FrogoResponseCallback<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(countryName: String?, sportResultCallback: FrogoResponseCallback<Countrys>)

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(countryName: String?, sportName: String?, sportResultCallback: FrogoResponseCallback<Countrys>)

    // List all Seasons in a League
    fun searchAllSeasons(idTeam: String?, sportResultCallback: FrogoResponseCallback<Seasons>)

    // List all Teams in a League
    fun searchAllTeam(league: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(sportName: String?, countryName: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // List All teams details in a league by Id
    fun lookupAllTeam(idLeague: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(idTeam: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // List all users loved teams and players
    fun searchLoves(userName: String?, sportResultCallback: FrogoResponseCallback<Users>)

    // League Details by Id
    fun lookupLeagues(idLeague: String?, sportResultCallback: FrogoResponseCallback<Leagues>)

    // Team Details by Id
    fun lookupTeam(idTeam: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // Player Details by Id
    fun lookupPlayer(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Event Details by Id
    fun lookupEvent(idEvent: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Player Honours by Player Id
    fun lookupHonour(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Honors>)

    // Player Former Teams by Player Id
    fun lookupFormerTeam(idPlayer: String?, sportResultCallback: FrogoResponseCallback<FormerTeams>)

    // Player Contracts by Player Id
    fun lookupContract(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Contracts>)

    // Lookup Table by League ID and Season
    fun lookupTable(idLeague: String?, season: String?, sportResultCallback: FrogoResponseCallback<Tables>)

    // Next 5 Events by Team Id
    fun eventsNext(idTeam: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Next 15 Events by League Id
    fun eventsNextLeague(idLeague: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Last 5 Events by Team Id
    fun eventsLast(idTeam: String?, sportResultCallback: FrogoResponseCallback<Results>)

    // Last 15 Events by League Id
    fun eventsPastLeague(idLeague: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Events in a specific round by league id/round/season
    fun eventsRound(idLeague: String?, round: String?, season: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(idLeague: String?, season: String?, sportResultCallback: FrogoResponseCallback<Events>)
    
}