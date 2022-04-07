package com.frogobox.coreapi.sport

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.response.*
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

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        sportRepository.usingChuckInterceptor(chuckerInterceptor)
    }

    override fun searchForTeamByName(
        teamName: String?,
        sportResultCallback: ConsumeApiResponse<Teams>
    ) {
        sportRepository.searchForTeamByName(
            scheduler, apiKey,
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
        sportRepository.searchForTeamByShortCode(
            scheduler, apiKey,
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
        sportRepository.searchForAllPlayer(
            scheduler, apiKey,
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
        sportRepository.searchForPlayer(
            scheduler, apiKey,
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
        sportRepository.searchForPlayer(
            scheduler, apiKey,
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
        sportRepository.searchForEvent(
            scheduler, apiKey,
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
        sportRepository.searchForEvent(
            scheduler, apiKey,
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

        sportRepository.searchForEventFileName(
            scheduler, apiKey,
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
        sportRepository.getAllSports(scheduler, apiKey, object : ConsumeApiResponse<Sports> {
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
        sportRepository.getAllLeagues(scheduler, apiKey, object : ConsumeApiResponse<Leagues> {
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
        sportRepository.searchAllLeagues(
            scheduler, apiKey,
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
        sportRepository.searchAllLeagues(
            scheduler, apiKey,
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
        sportRepository.searchAllSeasons(
            scheduler, apiKey,
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

        sportRepository.searchAllTeam(
            scheduler, apiKey,
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
        sportRepository.searchAllTeam(
            scheduler, apiKey,
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

        sportRepository.lookupAllTeam(
            scheduler, apiKey,
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
        sportRepository.lookupAllPlayer(
            scheduler, apiKey,
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
        sportRepository.searchLoves(
            scheduler, apiKey,
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
        sportRepository.lookupLeagues(
            scheduler, apiKey,
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
        sportRepository.lookupTeam(
            scheduler, apiKey,
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
        sportRepository.lookupPlayer(
            scheduler, apiKey,
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
        sportRepository.lookupEvent(
            scheduler, apiKey,
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
        sportRepository.lookupHonour(
            scheduler, apiKey,
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
        sportRepository.lookupFormerTeam(
            scheduler, apiKey,
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
        sportRepository.lookupContract(
            scheduler, apiKey,
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
        sportRepository.lookupTable(
            scheduler, apiKey,
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
        sportRepository.eventsNext(
            scheduler, apiKey,
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
        sportRepository.eventsNextLeague(
            scheduler, apiKey,
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
        sportRepository.eventsLast(
            scheduler, apiKey,
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
        sportRepository.eventsPastLeague(
            scheduler, apiKey,
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
        sportRepository.eventsRound(scheduler, apiKey,
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
        sportRepository.eventsSeason(
            scheduler, apiKey,
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