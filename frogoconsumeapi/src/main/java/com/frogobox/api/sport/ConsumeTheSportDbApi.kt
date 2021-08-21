package com.frogobox.api.sport

import android.content.Context
import com.frogobox.api.sport.response.*
import com.frogobox.api.sport.source.SportRepository
import com.frogobox.api.core.ConsumeApiResponse

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
class ConsumeTheSportDbApi(private val apiKey: String) : IConsumeTheSportDbApi {

    private val sportRepository = SportRepository

    override fun usingChuckInterceptor(context: Context) {
        sportRepository.usingChuckInterceptor(context)
    }

    override fun searchForTeamByName(
        teamName: String?,
        sportResultCallback: ConsumeApiResponse<Teams>
    ) {
        sportRepository.searchForTeamByName(
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
        sportRepository.getAllSports(apiKey, object : ConsumeApiResponse<Sports> {
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
        sportRepository.getAllLeagues(apiKey, object : ConsumeApiResponse<Leagues> {
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
            apiKey,
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
        sportRepository.eventsRound(apiKey,
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
            apiKey,
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