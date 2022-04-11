package com.frogobox.api.sport

import android.content.Context
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.SportApi
import com.frogobox.coreapi.sport.response.*
import com.frogobox.sdk.ext.usingChuck
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import okhttp3.Interceptor

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
 * com.frogobox.frogoconsumeapi.sport
 *
 */
class ConsumeTheSportDbApi(apiKey: String) : IConsumeTheSportDbApi {

    private var sportApi = SportApi(AndroidSchedulers.mainThread(), apiKey)

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        sportApi.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun usingChuckInterceptor(context: Context) {
        usingChuckInterceptor(context.usingChuck())
    }

    override fun searchForTeamByName(
        teamName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchForTeamByName(teamName, callback)
    }

    override fun searchForTeamByShortCode(
        shortCode: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchForTeamByShortCode(shortCode, callback)
    }

    override fun searchForAllPlayer(
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForAllPlayer(teamName, callback)
    }

    override fun searchForPlayer(
        playerName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForPlayer(playerName, callback)
    }

    override fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForPlayer(playerName, teamName, callback)
    }

    override fun searchForEvent(
        eventName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEvent(eventName, callback)
    }

    override fun searchForEvent(
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEvent(eventName, season, callback)
    }

    override fun searchForEventFileName(
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEventFileName(eventFileName, callback)

    }

    override fun getAllSports(callback: ConsumeApiResponse<Sports>) {
        sportApi.getAllSports(callback)
    }

    override fun getAllLeagues(callback: ConsumeApiResponse<Leagues>) {
        sportApi.getAllLeagues(callback)
    }

    override fun searchAllLeagues(
        countryName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(countryName, callback)
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(countryName, sportName, callback)
    }

    override fun searchAllSeasons(
        idTeam: String?,
        callback: ConsumeApiResponse<Seasons>
    ) {
        sportApi.searchAllSeasons(idTeam, callback)
    }

    override fun searchAllTeam(
        league: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchAllTeam(league, callback)
    }

    override fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchAllTeam(sportName, countryName, callback)
    }

    override fun lookupAllTeam(idLeague: String?, callback: ConsumeApiResponse<Teams>) {
        sportApi.lookupAllTeam(idLeague, callback)
    }

    override fun lookupAllPlayer(
        idTeam: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.lookupAllPlayer(idTeam, callback)
    }

    override fun searchLoves(userName: String?, callback: ConsumeApiResponse<Users>) {
        sportApi.searchLoves(userName, callback)
    }

    override fun lookupLeagues(
        idLeague: String?,
        callback: ConsumeApiResponse<Leagues>
    ) {
        sportApi.lookupLeagues(idLeague, callback)
    }

    override fun lookupTeam(idTeam: String?, callback: ConsumeApiResponse<Teams>) {
        sportApi.lookupTeam(idTeam, callback)
    }

    override fun lookupPlayer(idPlayer: String?, callback: ConsumeApiResponse<Players>) {
        sportApi.lookupPlayer(idPlayer, callback)
    }

    override fun lookupEvent(idEvent: String?, callback: ConsumeApiResponse<Events>) {
        sportApi.lookupEvent(idEvent, callback)
    }

    override fun lookupHonour(idPlayer: String?, callback: ConsumeApiResponse<Honors>) {
        sportApi.lookupHonour(idPlayer, callback)
    }

    override fun lookupFormerTeam(
        idPlayer: String?,
        callback: ConsumeApiResponse<FormerTeams>
    ) {
        sportApi.lookupFormerTeam(idPlayer, callback)
    }

    override fun lookupContract(
        idPlayer: String?,
        callback: ConsumeApiResponse<Contracts>
    ) {
        sportApi.lookupContract(idPlayer, callback)
    }

    override fun lookupTable(
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    ) {
        sportApi.lookupTable(idLeague, season, callback)
    }

    override fun eventsNext(idTeam: String?, callback: ConsumeApiResponse<Events>) {
        sportApi.eventsNext(idTeam, callback)
    }

    override fun eventsNextLeague(
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsNextLeague(idLeague, callback)
    }

    override fun eventsLast(idTeam: String?, callback: ConsumeApiResponse<Results>) {
        sportApi.eventsLast(idTeam, callback)
    }

    override fun eventsPastLeague(
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsPastLeague(idLeague, callback)
    }

    override fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsRound(idLeague, round, season, callback)
    }

    override fun eventsSeason(
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsSeason(idLeague, season, callback)
    }

}