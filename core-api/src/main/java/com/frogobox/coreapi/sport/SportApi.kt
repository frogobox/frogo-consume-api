package com.frogobox.coreapi.sport


import com.frogobox.coresdk.response.FrogoDataResponse
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

class SportApi(
    private val apiKey: String
) : ISportApi {

    private val sportRepository = SportRepository

    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): ISportApi {
        sportRepository.usingChuckInterceptor(isDebug, chuckerInterceptor)
        return this
    }

    override fun searchForTeamByName(
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportRepository.searchForTeamByName(
            apiKey,
            teamName,
            callback
        )
    }

    override fun searchForTeamByShortCode(
        shortCode: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportRepository.searchForTeamByShortCode(
            apiKey,
            shortCode,
            callback
        )
    }

    override fun searchForAllPlayer(
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportRepository.searchForAllPlayer(
            apiKey,
            teamName,
            callback
        )
    }

    override fun searchForPlayer(
        playerName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            callback
        )
    }

    override fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            teamName,
            callback
        )
    }

    override fun searchForEvent(
        eventName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            callback
        )
    }

    override fun searchForEvent(
        eventName: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            season,
            callback
        )
    }

    override fun searchForEventFileName(
        eventFileName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {

        sportRepository.searchForEventFileName(
            apiKey,
            eventFileName,
            callback
        )

    }

    override fun getAllSports(callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Sports>) {
        sportRepository.getAllSports(apiKey, callback)
    }

    override fun getAllLeagues(callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Leagues>) {
        sportRepository.getAllLeagues(apiKey, callback)
    }

    override fun searchAllLeagues(
        countryName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            callback
        )
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            sportName,
            callback
        )
    }

    override fun searchAllSeasons(
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Seasons>
    ) {
        sportRepository.searchAllSeasons(
            apiKey,
            idTeam,
            callback
        )
    }

    override fun searchAllTeam(
        league: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {

        sportRepository.searchAllTeam(
            apiKey,
            league,
            callback
        )
    }

    override fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportRepository.searchAllTeam(
            apiKey,
            sportName,
            countryName,
            callback
        )
    }

    override fun lookupAllTeam(idLeague: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>) {

        sportRepository.lookupAllTeam(
            apiKey,
            idLeague,
            callback
        )

    }

    override fun lookupAllPlayer(
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportRepository.lookupAllPlayer(
            apiKey,
            idTeam,
            callback
        )
    }

    override fun searchLoves(userName: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Users>) {
        sportRepository.searchLoves(
            apiKey,
            userName,
            callback
        )
    }

    override fun lookupLeagues(
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Leagues>
    ) {
        sportRepository.lookupLeagues(
            apiKey,
            idLeague,
            callback
        )
    }

    override fun lookupTeam(idTeam: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>) {
        sportRepository.lookupTeam(
            apiKey,
            idTeam,
            callback
        )
    }

    override fun lookupPlayer(idPlayer: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>) {
        sportRepository.lookupPlayer(
            apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupEvent(idEvent: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>) {
        sportRepository.lookupEvent(
            apiKey,
            idEvent,
            callback
        )
    }

    override fun lookupHonour(idPlayer: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Honors>) {
        sportRepository.lookupHonour(
            apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupFormerTeam(
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.FormerTeams>
    ) {
        sportRepository.lookupFormerTeam(
            apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupContract(
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Contracts>
    ) {
        sportRepository.lookupContract(
            apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupTable(
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Tables>
    ) {
        sportRepository.lookupTable(
            apiKey,
            idLeague,
            season,
            callback
        )
    }

    override fun eventsNext(idTeam: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>) {
        sportRepository.eventsNext(
            apiKey,
            idTeam,
            callback
        )
    }

    override fun eventsNextLeague(
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportRepository.eventsNextLeague(
            apiKey,
            idLeague,
            callback
        )
    }

    override fun eventsLast(idTeam: String?, callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Results>) {
        sportRepository.eventsLast(
            apiKey,
            idTeam,
            callback
        )
    }

    override fun eventsPastLeague(
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportRepository.eventsPastLeague(
            apiKey,
            idLeague,
            callback
        )
    }

    override fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportRepository.eventsRound(
            apiKey,
            idLeague,
            round,
            season,
            callback
        )
    }

    override fun eventsSeason(
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportRepository.eventsSeason(
            apiKey,
            idLeague,
            season,
            callback
        )
    }
}