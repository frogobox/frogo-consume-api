package com.frogobox.frogoconsumeapi.sport

import android.content.Context
import com.frogobox.frogoconsumeapi.sport.callback.SportResultCallback
import com.frogobox.frogoconsumeapi.sport.data.response.*
import com.frogobox.frogoconsumeapi.sport.data.source.SportDataSource
import com.frogobox.frogoconsumeapi.sport.data.source.SportRemoteDataSource
import com.frogobox.frogoconsumeapi.sport.data.source.SportRepository

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
class ConsumeTheSportDbApi(private val apiKey: String) : ConsumeTheSportDbApiView {

    private val sportRepository = SportRepository(SportRemoteDataSource)

    override fun usingChuckInterceptor(context: Context) {
        sportRepository.usingChuckInterceptor(context)
    }

    override fun searchForTeamByName(
        teamName: String?,
        sportResultCallback: SportResultCallback<Teams>
    ) {
        sportRepository.searchForTeamByName(
            apiKey,
            teamName,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Teams>
    ) {
        sportRepository.searchForTeamByShortCode(
            apiKey,
            shortCode,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForAllPlayer(
            apiKey,
            teamName,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.searchForPlayer(
            apiKey,
            playerName,
            teamName,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.searchForEvent(
            apiKey,
            eventName,
            season,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {

        sportRepository.searchForEventFileName(
            apiKey,
            eventFileName,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })

    }

    override fun getAllSports(sportResultCallback: SportResultCallback<Sports>) {
        sportRepository.getAllSports(apiKey, object : SportDataSource.GetRemoteCallback<Sports> {
            override fun onSuccess(data: Sports) {
                sportResultCallback.getResultData(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                sportResultCallback.failedResult(statusCode, errorMessage)
            }

            override fun onShowProgress() {
                sportResultCallback.onShowProgress()
            }

            override fun onHideProgress() {
                sportResultCallback.onHideProgress()
            }
        })
    }

    override fun getAllLeagues(sportResultCallback: SportResultCallback<Leagues>) {
        sportRepository.getAllLeagues(apiKey, object : SportDataSource.GetRemoteCallback<Leagues> {
            override fun onSuccess(data: Leagues) {
                sportResultCallback.getResultData(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            object : SportDataSource.GetRemoteCallback<Countrys> {
                override fun onSuccess(data: Countrys) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Countrys>
    ) {
        sportRepository.searchAllLeagues(
            apiKey,
            countryName,
            sportName,
            object : SportDataSource.GetRemoteCallback<Countrys> {
                override fun onSuccess(data: Countrys) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Seasons>
    ) {
        sportRepository.searchAllSeasons(
            apiKey,
            idTeam,
            object : SportDataSource.GetRemoteCallback<Seasons> {
                override fun onSuccess(data: Seasons) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Teams>
    ) {

        sportRepository.searchAllTeam(
            apiKey,
            league,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Teams>
    ) {
        sportRepository.searchAllTeam(
            apiKey,
            sportName,
            countryName,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupAllTeam(idLeague: String?, sportResultCallback: SportResultCallback<Teams>) {

        sportRepository.lookupAllTeam(
            apiKey,
            idLeague,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Players>
    ) {
        sportRepository.lookupAllPlayer(
            apiKey,
            idTeam,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun searchLoves(userName: String?, sportResultCallback: SportResultCallback<Users>) {
        sportRepository.searchLoves(
            apiKey,
            userName,
            object : SportDataSource.GetRemoteCallback<Users> {
                override fun onSuccess(data: Users) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Leagues>
    ) {
        sportRepository.lookupLeagues(
            apiKey,
            idLeague,
            object : SportDataSource.GetRemoteCallback<Leagues> {
                override fun onSuccess(data: Leagues) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupTeam(idTeam: String?, sportResultCallback: SportResultCallback<Teams>) {
        sportRepository.lookupTeam(
            apiKey,
            idTeam,
            object : SportDataSource.GetRemoteCallback<Teams> {
                override fun onSuccess(data: Teams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupPlayer(idPlayer: String?, sportResultCallback: SportResultCallback<Players>) {
        sportRepository.lookupPlayer(
            apiKey,
            idPlayer,
            object : SportDataSource.GetRemoteCallback<Players> {
                override fun onSuccess(data: Players) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupEvent(idEvent: String?, sportResultCallback: SportResultCallback<Events>) {
        sportRepository.lookupEvent(
            apiKey,
            idEvent,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun lookupHonour(idPlayer: String?, sportResultCallback: SportResultCallback<Honors>) {
        sportRepository.lookupHonour(
            apiKey,
            idPlayer,
            object : SportDataSource.GetRemoteCallback<Honors> {
                override fun onSuccess(data: Honors) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<FormerTeams>
    ) {
        sportRepository.lookupFormerTeam(
            apiKey,
            idPlayer,
            object : SportDataSource.GetRemoteCallback<FormerTeams> {
                override fun onSuccess(data: FormerTeams) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Contracts>
    ) {
        sportRepository.lookupContract(
            apiKey,
            idPlayer,
            object : SportDataSource.GetRemoteCallback<Contracts> {
                override fun onSuccess(data: Contracts) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Tables>
    ) {
        sportRepository.lookupTable(
            apiKey,
            idLeague,
            season,
            object : SportDataSource.GetRemoteCallback<Tables> {
                override fun onSuccess(data: Tables) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsNext(idTeam: String?, sportResultCallback: SportResultCallback<Events>) {
        sportRepository.eventsNext(
            apiKey,
            idTeam,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.eventsNextLeague(
            apiKey,
            idLeague,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    sportResultCallback.onShowProgress()
                }

                override fun onHideProgress() {
                    sportResultCallback.onHideProgress()
                }
            })
    }

    override fun eventsLast(idTeam: String?, sportResultCallback: SportResultCallback<Results>) {
        sportRepository.eventsLast(
            apiKey,
            idTeam,
            object : SportDataSource.GetRemoteCallback<Results> {
                override fun onSuccess(data: Results) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.eventsPastLeague(
            apiKey,
            idLeague,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.eventsRound(apiKey,
            idLeague,
            round,
            season,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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
        sportResultCallback: SportResultCallback<Events>
    ) {
        sportRepository.eventsSeason(
            apiKey,
            idLeague,
            season,
            object : SportDataSource.GetRemoteCallback<Events> {
                override fun onSuccess(data: Events) {
                    sportResultCallback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    sportResultCallback.failedResult(statusCode, errorMessage)
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