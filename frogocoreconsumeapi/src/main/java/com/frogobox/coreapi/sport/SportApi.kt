package com.frogobox.coreapi.sport

import com.frogobox.coreapi.sport.response.*
import com.frogobox.coresdk.response.FrogoDataResponse
import io.reactivex.rxjava3.core.Scheduler
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
    private val scheduler: Scheduler?,
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
        callback: FrogoDataResponse<Teams>
    ) {
        sportRepository.searchForTeamByName(
            scheduler, apiKey,
            teamName,
            callback
        )
    }

    override fun searchForTeamByShortCode(
        shortCode: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportRepository.searchForTeamByShortCode(
            scheduler, apiKey,
            shortCode,
            callback
        )
    }

    override fun searchForAllPlayer(
        teamName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportRepository.searchForAllPlayer(
            scheduler, apiKey,
            teamName,
            callback
        )
    }

    override fun searchForPlayer(
        playerName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportRepository.searchForPlayer(
            scheduler, apiKey,
            playerName,
            callback
        )
    }

    override fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportRepository.searchForPlayer(
            scheduler, apiKey,
            playerName,
            teamName,
            callback
        )
    }

    override fun searchForEvent(
        eventName: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportRepository.searchForEvent(
            scheduler, apiKey,
            eventName,
            callback
        )
    }

    override fun searchForEvent(
        eventName: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportRepository.searchForEvent(
            scheduler, apiKey,
            eventName,
            season,
            callback
        )
    }

    override fun searchForEventFileName(
        eventFileName: String?,
        callback: FrogoDataResponse<Events>
    ) {

        sportRepository.searchForEventFileName(
            scheduler, apiKey,
            eventFileName,
            callback
        )

    }

    override fun getAllSports(callback: FrogoDataResponse<Sports>) {
        sportRepository.getAllSports(scheduler, apiKey, callback)
    }

    override fun getAllLeagues(callback: FrogoDataResponse<Leagues>) {
        sportRepository.getAllLeagues(scheduler, apiKey, callback)
    }

    override fun searchAllLeagues(
        countryName: String?,
        callback: FrogoDataResponse<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            scheduler, apiKey,
            countryName,
            callback
        )
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        callback: FrogoDataResponse<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            scheduler, apiKey,
            countryName,
            sportName,
            callback
        )
    }

    override fun searchAllSeasons(
        idTeam: String?,
        callback: FrogoDataResponse<Seasons>
    ) {
        sportRepository.searchAllSeasons(
            scheduler, apiKey,
            idTeam,
            callback
        )
    }

    override fun searchAllTeam(
        league: String?,
        callback: FrogoDataResponse<Teams>
    ) {

        sportRepository.searchAllTeam(
            scheduler, apiKey,
            league,
            callback
        )
    }

    override fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportRepository.searchAllTeam(
            scheduler, apiKey,
            sportName,
            countryName,
            callback
        )
    }

    override fun lookupAllTeam(idLeague: String?, callback: FrogoDataResponse<Teams>) {

        sportRepository.lookupAllTeam(
            scheduler, apiKey,
            idLeague,
            callback
        )

    }

    override fun lookupAllPlayer(
        idTeam: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportRepository.lookupAllPlayer(
            scheduler, apiKey,
            idTeam,
            callback
        )
    }

    override fun searchLoves(userName: String?, callback: FrogoDataResponse<Users>) {
        sportRepository.searchLoves(
            scheduler, apiKey,
            userName,
            callback
        )
    }

    override fun lookupLeagues(
        idLeague: String?,
        callback: FrogoDataResponse<Leagues>
    ) {
        sportRepository.lookupLeagues(
            scheduler, apiKey,
            idLeague,
            callback
        )
    }

    override fun lookupTeam(idTeam: String?, callback: FrogoDataResponse<Teams>) {
        sportRepository.lookupTeam(
            scheduler, apiKey,
            idTeam,
            callback
        )
    }

    override fun lookupPlayer(idPlayer: String?, callback: FrogoDataResponse<Players>) {
        sportRepository.lookupPlayer(
            scheduler, apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupEvent(idEvent: String?, callback: FrogoDataResponse<Events>) {
        sportRepository.lookupEvent(
            scheduler, apiKey,
            idEvent,
            callback
        )
    }

    override fun lookupHonour(idPlayer: String?, callback: FrogoDataResponse<Honors>) {
        sportRepository.lookupHonour(
            scheduler, apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupFormerTeam(
        idPlayer: String?,
        callback: FrogoDataResponse<FormerTeams>
    ) {
        sportRepository.lookupFormerTeam(
            scheduler, apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupContract(
        idPlayer: String?,
        callback: FrogoDataResponse<Contracts>
    ) {
        sportRepository.lookupContract(
            scheduler, apiKey,
            idPlayer,
            callback
        )
    }

    override fun lookupTable(
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<Tables>
    ) {
        sportRepository.lookupTable(
            scheduler, apiKey,
            idLeague,
            season,
            callback
        )
    }

    override fun eventsNext(idTeam: String?, callback: FrogoDataResponse<Events>) {
        sportRepository.eventsNext(
            scheduler, apiKey,
            idTeam,
            callback
        )
    }

    override fun eventsNextLeague(
        idLeague: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportRepository.eventsNextLeague(
            scheduler, apiKey,
            idLeague,
            callback
        )
    }

    override fun eventsLast(idTeam: String?, callback: FrogoDataResponse<Results>) {
        sportRepository.eventsLast(
            scheduler, apiKey,
            idTeam,
            callback
        )
    }

    override fun eventsPastLeague(
        idLeague: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportRepository.eventsPastLeague(
            scheduler, apiKey,
            idLeague,
            callback
        )
    }

    override fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportRepository.eventsRound(
            scheduler, apiKey,
            idLeague,
            round,
            season,
            callback
        )
    }

    override fun eventsSeason(
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportRepository.eventsSeason(
            scheduler, apiKey,
            idLeague,
            season,
            callback
        )
    }
}