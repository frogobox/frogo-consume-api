package com.frogobox.api.sport

import android.content.Context
import com.frogobox.api.sport.response.*
import com.frogobox.api.sport.source.SportRepository
import com.frogobox.sdk.core.FrogoResponseCallback

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
        sportResultCallback: FrogoResponseCallback<Teams>
    ) {
        sportRepository.searchForTeamByName(
            apiKey,
            teamName,
            object : FrogoResponseCallback<Teams> {
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
        sportResultCallback: FrogoResponseCallback<Teams>
    ) {
        sportRepository.searchForTeamByShortCode(
            apiKey,
            shortCode,
            object : FrogoResponseCallback<Teams> {
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
        sportResultCallback: FrogoResponseCallback<Players>
    ) {
        sportRepository.searchForAllPlayer(
            apiKey,
            teamName,
            object : FrogoResponseCallback<Players> {
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
        sportResultCallback: FrogoResponseCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            object : FrogoResponseCallback<Players> {
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
        sportResultCallback: FrogoResponseCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            teamName,
            object : FrogoResponseCallback<Players> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            object : FrogoResponseCallback<Events> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            season,
            object : FrogoResponseCallback<Events> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {

        sportRepository.searchForEventFileName(
            apiKey,
            eventFileName,
            object : FrogoResponseCallback<Events> {
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

    override fun getAllSports(sportResultCallback: FrogoResponseCallback<Sports>) {
        sportRepository.getAllSports(apiKey, object : FrogoResponseCallback<Sports> {
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

    override fun getAllLeagues(sportResultCallback: FrogoResponseCallback<Leagues>) {
        sportRepository.getAllLeagues(apiKey, object : FrogoResponseCallback<Leagues> {
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
        sportResultCallback: FrogoResponseCallback<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            object : FrogoResponseCallback<Countrys> {
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
        sportResultCallback: FrogoResponseCallback<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            sportName,
            object : FrogoResponseCallback<Countrys> {
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
        sportResultCallback: FrogoResponseCallback<Seasons>
    ) {
        sportRepository.searchAllSeasons(
            apiKey,
            idTeam,
            object : FrogoResponseCallback<Seasons> {
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
        sportResultCallback: FrogoResponseCallback<Teams>
    ) {

        sportRepository.searchAllTeam(
            apiKey,
            league,
            object : FrogoResponseCallback<Teams> {
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
        sportResultCallback: FrogoResponseCallback<Teams>
    ) {
        sportRepository.searchAllTeam(
            apiKey,
            sportName,
            countryName,
            object : FrogoResponseCallback<Teams> {
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

    override fun lookupAllTeam(idLeague: String?, sportResultCallback: FrogoResponseCallback<Teams>) {

        sportRepository.lookupAllTeam(
            apiKey,
            idLeague,
            object : FrogoResponseCallback<Teams> {
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
        sportResultCallback: FrogoResponseCallback<Players>
    ) {
        sportRepository.lookupAllPlayer(
            apiKey,
            idTeam,
            object : FrogoResponseCallback<Players> {
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

    override fun searchLoves(userName: String?, sportResultCallback: FrogoResponseCallback<Users>) {
        sportRepository.searchLoves(
            apiKey,
            userName,
            object : FrogoResponseCallback<Users> {
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
        sportResultCallback: FrogoResponseCallback<Leagues>
    ) {
        sportRepository.lookupLeagues(
            apiKey,
            idLeague,
            object : FrogoResponseCallback<Leagues> {
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

    override fun lookupTeam(idTeam: String?, sportResultCallback: FrogoResponseCallback<Teams>) {
        sportRepository.lookupTeam(
            apiKey,
            idTeam,
            object : FrogoResponseCallback<Teams> {
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

    override fun lookupPlayer(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Players>) {
        sportRepository.lookupPlayer(
            apiKey,
            idPlayer,
            object : FrogoResponseCallback<Players> {
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

    override fun lookupEvent(idEvent: String?, sportResultCallback: FrogoResponseCallback<Events>) {
        sportRepository.lookupEvent(
            apiKey,
            idEvent,
            object : FrogoResponseCallback<Events> {
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

    override fun lookupHonour(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Honors>) {
        sportRepository.lookupHonour(
            apiKey,
            idPlayer,
            object : FrogoResponseCallback<Honors> {
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
        sportResultCallback: FrogoResponseCallback<FormerTeams>
    ) {
        sportRepository.lookupFormerTeam(
            apiKey,
            idPlayer,
            object : FrogoResponseCallback<FormerTeams> {
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
        sportResultCallback: FrogoResponseCallback<Contracts>
    ) {
        sportRepository.lookupContract(
            apiKey,
            idPlayer,
            object : FrogoResponseCallback<Contracts> {
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
        sportResultCallback: FrogoResponseCallback<Tables>
    ) {
        sportRepository.lookupTable(
            apiKey,
            idLeague,
            season,
            object : FrogoResponseCallback<Tables> {
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

    override fun eventsNext(idTeam: String?, sportResultCallback: FrogoResponseCallback<Events>) {
        sportRepository.eventsNext(
            apiKey,
            idTeam,
            object : FrogoResponseCallback<Events> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {
        sportRepository.eventsNextLeague(
            apiKey,
            idLeague,
            object : FrogoResponseCallback<Events> {
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

    override fun eventsLast(idTeam: String?, sportResultCallback: FrogoResponseCallback<Results>) {
        sportRepository.eventsLast(
            apiKey,
            idTeam,
            object : FrogoResponseCallback<Results> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {
        sportRepository.eventsPastLeague(
            apiKey,
            idLeague,
            object : FrogoResponseCallback<Events> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {
        sportRepository.eventsRound(apiKey,
            idLeague,
            round,
            season,
            object : FrogoResponseCallback<Events> {
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
        sportResultCallback: FrogoResponseCallback<Events>
    ) {
        sportRepository.eventsSeason(
            apiKey,
            idLeague,
            season,
            object : FrogoResponseCallback<Events> {
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