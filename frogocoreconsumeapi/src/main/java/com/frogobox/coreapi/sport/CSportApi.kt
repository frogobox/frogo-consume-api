package com.frogobox.coreapi.sport

import com.frogobox.coreapi.ConsumeApiResponse
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

class CSportApi(usingScheduler: Boolean, apiKey: String) : ISportApi {

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
        sportResultCallback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchForTeamByName(

            teamName,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }

            })
    }

    override fun searchForTeamByShortCode(
        shortCode: String?,
        sportResultCallback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchForTeamByShortCode(

            shortCode,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchForAllPlayer(
        teamName: String?,
        sportResultCallback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForAllPlayer(

            teamName,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchForPlayer(
        playerName: String?,
        sportResultCallback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForPlayer(

            playerName,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        sportResultCallback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForPlayer(

            playerName,
            teamName,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchForEvent(
        eventName: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEvent(

            eventName,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchForEvent(
        eventName: String?,
        season: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEvent(

            eventName,
            season,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchForEventFileName(
        eventFileName: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {

        sportApi.searchForEventFileName(

            eventFileName,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })

    }

    override fun getAllSports(sportResultCallback: ConsumeApiResponse<Sports>) {
        sportApi.getAllSports(object : ConsumeApiResponse<Sports> {
            override fun onSuccess(data: Sports) {
                sportResultCallback.onSuccess(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                sportResultCallback.onFailed(statusCode, errorMessage)
            }

            override fun onShowProgress() {
                sportResultCallback.onShowProgress()
            }

            override fun onHideProgress() {
                sportResultCallback.onHideProgress()
            }
        })
    }

    override fun getAllLeagues(sportResultCallback: ConsumeApiResponse<Leagues>) {
        sportApi.getAllLeagues(object : ConsumeApiResponse<Leagues> {
            override fun onSuccess(data: Leagues) {
                sportResultCallback.onSuccess(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                sportResultCallback.onFailed(statusCode, errorMessage)
            }

            override fun onShowProgress() {
                sportResultCallback.onShowProgress()
            }

            override fun onHideProgress() {
                sportResultCallback.onHideProgress()
            }
        })
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportResultCallback: ConsumeApiResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(

            countryName,
            object : ConsumeApiResponse<Countrys> {
                override fun onSuccess(data: Countrys) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        sportResultCallback: ConsumeApiResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(

            countryName,
            sportName,
            object : ConsumeApiResponse<Countrys> {
                override fun onSuccess(data: Countrys) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchAllSeasons(
        idTeam: String?,
        sportResultCallback: ConsumeApiResponse<Seasons>
    ) {
        sportApi.searchAllSeasons(

            idTeam,
            object : ConsumeApiResponse<Seasons> {
                override fun onSuccess(data: Seasons) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchAllTeam(
        league: String?,
        sportResultCallback: ConsumeApiResponse<Teams>
    ) {

        sportApi.searchAllTeam(

            league,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        sportResultCallback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchAllTeam(

            sportName,
            countryName,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupAllTeam(idLeague: String?, sportResultCallback: ConsumeApiResponse<Teams>) {

        sportApi.lookupAllTeam(

            idLeague,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })

    }

    override fun lookupAllPlayer(
        idTeam: String?,
        sportResultCallback: ConsumeApiResponse<Players>
    ) {
        sportApi.lookupAllPlayer(

            idTeam,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchLoves(userName: String?, sportResultCallback: ConsumeApiResponse<Users>) {
        sportApi.searchLoves(

            userName,
            object : ConsumeApiResponse<Users> {
                override fun onSuccess(data: Users) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupLeagues(
        idLeague: String?,
        sportResultCallback: ConsumeApiResponse<Leagues>
    ) {
        sportApi.lookupLeagues(

            idLeague,
            object : ConsumeApiResponse<Leagues> {
                override fun onSuccess(data: Leagues) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupTeam(idTeam: String?, sportResultCallback: ConsumeApiResponse<Teams>) {
        sportApi.lookupTeam(

            idTeam,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupPlayer(idPlayer: String?, sportResultCallback: ConsumeApiResponse<Players>) {
        sportApi.lookupPlayer(

            idPlayer,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupEvent(idEvent: String?, sportResultCallback: ConsumeApiResponse<Events>) {
        sportApi.lookupEvent(

            idEvent,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupHonour(idPlayer: String?, sportResultCallback: ConsumeApiResponse<Honors>) {
        sportApi.lookupHonour(

            idPlayer,
            object : ConsumeApiResponse<Honors> {
                override fun onSuccess(data: Honors) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupFormerTeam(
        idPlayer: String?,
        sportResultCallback: ConsumeApiResponse<FormerTeams>
    ) {
        sportApi.lookupFormerTeam(

            idPlayer,
            object : ConsumeApiResponse<FormerTeams> {
                override fun onSuccess(data: FormerTeams) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupContract(
        idPlayer: String?,
        sportResultCallback: ConsumeApiResponse<Contracts>
    ) {
        sportApi.lookupContract(

            idPlayer,
            object : ConsumeApiResponse<Contracts> {
                override fun onSuccess(data: Contracts) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupTable(
        idLeague: String?,
        season: String?,
        sportResultCallback: ConsumeApiResponse<Tables>
    ) {
        sportApi.lookupTable(

            idLeague,
            season,
            object : ConsumeApiResponse<Tables> {
                override fun onSuccess(data: Tables) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsNext(idTeam: String?, sportResultCallback: ConsumeApiResponse<Events>) {
        sportApi.eventsNext(

            idTeam,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsNextLeague(
        idLeague: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsNextLeague(

            idLeague,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsLast(idTeam: String?, sportResultCallback: ConsumeApiResponse<Results>) {
        sportApi.eventsLast(

            idTeam,
            object : ConsumeApiResponse<Results> {
                override fun onSuccess(data: Results) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsPastLeague(
        idLeague: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsPastLeague(

            idLeague,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsRound(
            idLeague,
            round,
            season,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsSeason(
        idLeague: String?,
        season: String?,
        sportResultCallback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsSeason(

            idLeague,
            season,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.onFailed(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }
}