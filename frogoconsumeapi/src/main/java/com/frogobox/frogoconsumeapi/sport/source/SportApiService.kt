package com.frogobox.frogoconsumeapi.sport.source

import com.frogobox.frogoconsumeapi.sport.response.*
import com.frogobox.frogoconsumeapi.sport.util.SportConstant
import com.frogobox.frogoconsumeapi.sport.util.SportUrl
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

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

interface SportApiService {

    // Search for team by name
    @GET(SportUrl.SEARCH_FOR_TEAM)
    fun searchForTeamByName(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_TEAM_NAME) teamName: String?
    ): Observable<Teams>

    // Search for team short code
    @GET(SportUrl.SEARCH_FOR_TEAM)
    fun searchForTeamByShortCode(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_SHORT_CODE_NAME) shortCode: String?
    ): Observable<Teams>

    // Search for all players from team *Patreon ONLY*
    @GET(SportUrl.PATREON_SEARCH_FOR_ALL_PLAYERS_FROM_TEAMS)
    fun searchForAllPlayer(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_TEAM_NAME) teamName: String?
    ): Observable<Players>

    // Search for players by player name
    @GET(SportUrl.PATREON_SEARCH_FOR_ALL_PLAYERS_FROM_TEAMS)
    fun searchForPlayer(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_PLAYER_NAME) playerName: String?
    ): Observable<Players>

    // Search for players by player name and team name
    @GET(SportUrl.PATREON_SEARCH_FOR_ALL_PLAYERS_FROM_TEAMS)
    fun searchForPlayer(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_PLAYER_NAME) playerName: String?,
        @Query(SportConstant.QUERY_TEAM_NAME) teamName: String?
    ): Observable<Players>

    // Search for event by event name
    @GET(SportUrl.SEARCH_FOR_EVENT)
    fun searchForEvent(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_EVENT_NAME) eventName: String?
    ): Observable<Events>

    // Search For event by event name and season
    @GET(SportUrl.SEARCH_FOR_EVENT)
    fun searchForEvent(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_EVENT_NAME) eventName: String?,
        @Query(SportConstant.QUERY_SEASON) season: String?
    ): Observable<Events>

    // Search for event by event file name
    @GET(SportUrl.SEARCH_FOR_EVENT_FILE_NAME)
    fun searchForEventFileName(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_EVENT_NAME) eventFileName: String?
    ): Observable<Events>

    // List all sports
    @GET(SportUrl.GET_ALL_SPORTS)
    fun getAllSports(
        @Path(SportConstant.PATH_API_KEY) apiKey: String
    ): Observable<Sports>

    // List all leagues
    @GET(SportUrl.GET_ALL_LEAGUES)
    fun getAllLeagues(
        @Path(SportConstant.PATH_API_KEY) apiKey: String
    ): Observable<Leagues>

    // List all Leagues in a country
    @GET(SportUrl.SEARCH_ALL_LEAGUES)
    fun searchAllLeagues(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_COUNTRY_NAME) countryName: String?
    ): Observable<Countrys>

    // List all Leagues in a country specific by sport
    @GET(SportUrl.SEARCH_ALL_LEAGUES)
    fun searchAllLeagues(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_COUNTRY_NAME) countryName: String?,
        @Query(SportConstant.QUERY_SPORT_NAME) sportName: String?
    ): Observable<Countrys>

    // List all Seasons in a League
    @GET(SportUrl.SEARCH_ALL_SEASONS)
    fun searchAllSeasons(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idTeam: String?
    ): Observable<Seasons>

    // List all Teams in a League
    @GET(SportUrl.SEARCH_ALL_TEAMS)
    fun searchAllTeam(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_LEAGUE_NAME) league: String?
    ): Observable<Teams>

    // List all Teams in Sport and Country
    @GET(SportUrl.SEARCH_ALL_TEAMS)
    fun searchAllTeam(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_SPORT_NAME) sportName: String?,
        @Query(SportConstant.QUERY_COUNTRY_NAME) countryName: String?
    ): Observable<Teams>

    // List All teams details in a league by Id
    @GET(SportUrl.LOOKUP_ALL_TEAMS)
    fun lookupAllTeam(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idLeague: String?
    ): Observable<Teams>

    // List All players in a team by Team Id *Patreon ONLY*
    @GET(SportUrl.LOOKUP_ALL_PLAYER)
    fun lookupAllPlayer(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idTeam: String?
    ): Observable<Players>

    // List all users loved teams and players
    @GET(SportUrl.SEARCH_LOVES)
    fun searchLoves(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_USER_LOVED) userName: String?
    ): Observable<Users>

    // League Details by Id
    @GET(SportUrl.LOOKUP_LEAGUE)
    fun lookupLeagues(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idLeague: String?
    ): Observable<Leagues>

    // Team Details by Id
    @GET(SportUrl.LOOKUP_TEAM)
    fun lookupTeam(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idTeam: String?
    ): Observable<Teams>

    // Player Details by Id
    @GET(SportUrl.LOOKUP_PLAYER)
    fun lookupPlayer(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idPlayer: String?
    ): Observable<Players>

    // Event Details by Id
    @GET(SportUrl.LOOKUP_EVENT)
    fun lookupEvent(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idEvent: String?
    ): Observable<Events>

    // Player Honours by Player Id
    @GET(SportUrl.LOOKUP_HONOURS)
    fun lookupHonour(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idPlayer: String?
    ): Observable<Honors>

    // Player Former Teams by Player Id
    @GET(SportUrl.LOOKUP_FORMER_TEAM)
    fun lookupFormerTeam(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idPlayer: String?
    ): Observable<FormerTeams>

    // Player Contracts by Player Id
    @GET(SportUrl.LOOKUP_CONTRACTS)
    fun lookupContract(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idPlayer: String?
    ): Observable<Contracts>

    // Lookup Table by League ID and Season
    @GET(SportUrl.LOOKUP_TABLE)
    fun lookupTable(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_LEAGUE_NAME) idLeague: String?,
        @Query(SportConstant.QUERY_SEASON) season: String?
    ): Observable<Tables>

    // Next 5 Events by Team Id
    @GET(SportUrl.EVENTS_NEXT)
    fun eventsNext(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idTeam: String?
    ): Observable<Events>

    // Next 15 Events by League Id
    @GET(SportUrl.EVENTS_NEXT_LEAGUE)
    fun eventsNextLeague(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idLeague: String?
    ): Observable<Events>

    // Last 5 Events by Team Id
    @GET(SportUrl.EVENTS_LAST)
    fun eventsLast(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idTeam: String?
    ): Observable<Results>

    // Last 15 Events by League Id
    @GET(SportUrl.EVENTS_PAST_LEAGUE)
    fun eventsPastLeague(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idLeague: String?
    ): Observable<Events>

    // Events in a specific round by league id/round/season
    @GET(SportUrl.EVENTS_ROUND)
    fun eventsRound(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idLeague: String?,
        @Query(SportConstant.QUERY_ROUND) round: String?,
        @Query(SportConstant.QUERY_SEASON) season: String?
    ): Observable<Events>

    // All events in specific league by season (Free tier limited to 200 events)
    @GET(SportUrl.EVENTS_SEASONS)
    fun eventsSeason(
        @Path(SportConstant.PATH_API_KEY) apiKey: String,
        @Query(SportConstant.QUERY_ID) idLeague: String?,
        @Query(SportConstant.QUERY_SEASON) season: String?
    ): Observable<Events>

}