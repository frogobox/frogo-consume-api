package com.frogobox.coreapi.sport

import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coreapi.sport.response.*
import io.reactivex.rxjava3.schedulers.Schedulers
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

class CTheSportDbApi(usingScheduler: Boolean, apiKey: String) : ISportApi {

    private var sportApi = if (usingScheduler) {
        SportApi(Schedulers.single(), apiKey)
    } else {
        SportApi(null, apiKey)
    }

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        sportApi.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun searchForTeamByName(
        teamName: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApi.searchForTeamByName(teamName, callback)
    }

    override fun searchForTeamByShortCode(
        shortCode: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApi.searchForTeamByShortCode(shortCode, callback)
    }

    override fun searchForAllPlayer(
        teamName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApi.searchForAllPlayer(teamName, callback)
    }

    override fun searchForPlayer(
        playerName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApi.searchForPlayer(playerName, callback)
    }

    override fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApi.searchForPlayer(playerName, teamName, callback)
    }

    override fun searchForEvent(
        eventName: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.searchForEvent(eventName, callback)
    }

    override fun searchForEvent(
        eventName: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.searchForEvent(eventName, season, callback)
    }

    override fun searchForEventFileName(
        eventFileName: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.searchForEventFileName(eventFileName, callback)

    }

    override fun getAllSports(callback: FrogoDataResponse<Sports>) {
        sportApi.getAllSports(callback)
    }

    override fun getAllLeagues(callback: FrogoDataResponse<Leagues>) {
        sportApi.getAllLeagues(callback)
    }

    override fun searchAllLeagues(
        countryName: String?,
        callback: FrogoDataResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(countryName, callback)
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        callback: FrogoDataResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(countryName, sportName, callback)
    }

    override fun searchAllSeasons(
        idTeam: String?,
        callback: FrogoDataResponse<Seasons>
    ) {
        sportApi.searchAllSeasons(idTeam, callback)
    }

    override fun searchAllTeam(
        league: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApi.searchAllTeam(league, callback)
    }

    override fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApi.searchAllTeam(sportName, countryName, callback)
    }

    override fun lookupAllTeam(idLeague: String?, callback: FrogoDataResponse<Teams>) {
        sportApi.lookupAllTeam(idLeague, callback)
    }

    override fun lookupAllPlayer(
        idTeam: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApi.lookupAllPlayer(idTeam, callback)
    }

    override fun searchLoves(userName: String?, callback: FrogoDataResponse<Users>) {
        sportApi.searchLoves(userName, callback)
    }

    override fun lookupLeagues(
        idLeague: String?,
        callback: FrogoDataResponse<Leagues>
    ) {
        sportApi.lookupLeagues(idLeague, callback)
    }

    override fun lookupTeam(idTeam: String?, callback: FrogoDataResponse<Teams>) {
        sportApi.lookupTeam(idTeam, callback)
    }

    override fun lookupPlayer(idPlayer: String?, callback: FrogoDataResponse<Players>) {
        sportApi.lookupPlayer(idPlayer, callback)
    }

    override fun lookupEvent(idEvent: String?, callback: FrogoDataResponse<Events>) {
        sportApi.lookupEvent(idEvent, callback)
    }

    override fun lookupHonour(idPlayer: String?, callback: FrogoDataResponse<Honors>) {
        sportApi.lookupHonour(idPlayer, callback)
    }

    override fun lookupFormerTeam(
        idPlayer: String?,
        callback: FrogoDataResponse<FormerTeams>
    ) {
        sportApi.lookupFormerTeam(idPlayer, callback)
    }

    override fun lookupContract(
        idPlayer: String?,
        callback: FrogoDataResponse<Contracts>
    ) {
        sportApi.lookupContract(idPlayer, callback)
    }

    override fun lookupTable(
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<Tables>
    ) {
        sportApi.lookupTable(idLeague, season, callback)
    }

    override fun eventsNext(idTeam: String?, callback: FrogoDataResponse<Events>) {
        sportApi.eventsNext(idTeam, callback)
    }

    override fun eventsNextLeague(
        idLeague: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.eventsNextLeague(idLeague, callback)
    }

    override fun eventsLast(idTeam: String?, callback: FrogoDataResponse<Results>) {
        sportApi.eventsLast(idTeam, callback)
    }

    override fun eventsPastLeague(
        idLeague: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.eventsPastLeague(idLeague, callback)
    }

    override fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.eventsRound(idLeague, round, season, callback)
    }

    override fun eventsSeason(
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApi.eventsSeason(idLeague, season, callback)
    }

}