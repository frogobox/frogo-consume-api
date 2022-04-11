package com.frogobox.api.sport

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.SportApi
import com.frogobox.coreapi.sport.response.*
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
        usingChuckInterceptor(ChuckerInterceptor(context))
    }

    override fun searchForTeamByName(
        teamName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchForTeamByName(

            teamName,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }

            })
    }

    override fun searchForTeamByShortCode(
        shortCode: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchForTeamByShortCode(

            shortCode,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchForAllPlayer(
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForAllPlayer(

            teamName,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchForPlayer(
        playerName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForPlayer(

            playerName,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchForPlayer(
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.searchForPlayer(

            playerName,
            teamName,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchForEvent(
        eventName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEvent(

            eventName,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchForEvent(
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.searchForEvent(

            eventName,
            season,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchForEventFileName(
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    ) {

        sportApi.searchForEventFileName(

            eventFileName,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })

    }

    override fun getAllSports(callback: ConsumeApiResponse<Sports>) {
        sportApi.getAllSports(object : ConsumeApiResponse<Sports> {
            override fun onSuccess(data: Sports) {
                callback.onSuccess(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
            }

            override fun onShowProgress() {
                callback.onShowProgress()
            }

            override fun onHideProgress() {
                callback.onHideProgress()
            }
        })
    }

    override fun getAllLeagues(callback: ConsumeApiResponse<Leagues>) {
        sportApi.getAllLeagues(object : ConsumeApiResponse<Leagues> {
            override fun onSuccess(data: Leagues) {
                callback.onSuccess(data)
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
            }

            override fun onShowProgress() {
                callback.onShowProgress()
            }

            override fun onHideProgress() {
                callback.onHideProgress()
            }
        })
    }

    override fun searchAllLeagues(
        countryName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(

            countryName,
            object : ConsumeApiResponse<Countrys> {
                override fun onSuccess(data: Countrys) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchAllLeagues(
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        sportApi.searchAllLeagues(

            countryName,
            sportName,
            object : ConsumeApiResponse<Countrys> {
                override fun onSuccess(data: Countrys) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchAllSeasons(
        idTeam: String?,
        callback: ConsumeApiResponse<Seasons>
    ) {
        sportApi.searchAllSeasons(

            idTeam,
            object : ConsumeApiResponse<Seasons> {
                override fun onSuccess(data: Seasons) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchAllTeam(
        league: String?,
        callback: ConsumeApiResponse<Teams>
    ) {

        sportApi.searchAllTeam(

            league,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchAllTeam(
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApi.searchAllTeam(

            sportName,
            countryName,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupAllTeam(idLeague: String?, callback: ConsumeApiResponse<Teams>) {

        sportApi.lookupAllTeam(

            idLeague,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })

    }

    override fun lookupAllPlayer(
        idTeam: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApi.lookupAllPlayer(

            idTeam,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun searchLoves(userName: String?, callback: ConsumeApiResponse<Users>) {
        sportApi.searchLoves(

            userName,
            object : ConsumeApiResponse<Users> {
                override fun onSuccess(data: Users) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupLeagues(
        idLeague: String?,
        callback: ConsumeApiResponse<Leagues>
    ) {
        sportApi.lookupLeagues(

            idLeague,
            object : ConsumeApiResponse<Leagues> {
                override fun onSuccess(data: Leagues) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupTeam(idTeam: String?, callback: ConsumeApiResponse<Teams>) {
        sportApi.lookupTeam(

            idTeam,
            object : ConsumeApiResponse<Teams> {
                override fun onSuccess(data: Teams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupPlayer(idPlayer: String?, callback: ConsumeApiResponse<Players>) {
        sportApi.lookupPlayer(

            idPlayer,
            object : ConsumeApiResponse<Players> {
                override fun onSuccess(data: Players) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupEvent(idEvent: String?, callback: ConsumeApiResponse<Events>) {
        sportApi.lookupEvent(

            idEvent,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupHonour(idPlayer: String?, callback: ConsumeApiResponse<Honors>) {
        sportApi.lookupHonour(

            idPlayer,
            object : ConsumeApiResponse<Honors> {
                override fun onSuccess(data: Honors) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupFormerTeam(
        idPlayer: String?,
        callback: ConsumeApiResponse<FormerTeams>
    ) {
        sportApi.lookupFormerTeam(

            idPlayer,
            object : ConsumeApiResponse<FormerTeams> {
                override fun onSuccess(data: FormerTeams) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupContract(
        idPlayer: String?,
        callback: ConsumeApiResponse<Contracts>
    ) {
        sportApi.lookupContract(

            idPlayer,
            object : ConsumeApiResponse<Contracts> {
                override fun onSuccess(data: Contracts) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun lookupTable(
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    ) {
        sportApi.lookupTable(

            idLeague,
            season,
            object : ConsumeApiResponse<Tables> {
                override fun onSuccess(data: Tables) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun eventsNext(idTeam: String?, callback: ConsumeApiResponse<Events>) {
        sportApi.eventsNext(

            idTeam,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun eventsNextLeague(
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsNextLeague(

            idLeague,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun eventsLast(idTeam: String?, callback: ConsumeApiResponse<Results>) {
        sportApi.eventsLast(

            idTeam,
            object : ConsumeApiResponse<Results> {
                override fun onSuccess(data: Results) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun eventsPastLeague(
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsPastLeague(

            idLeague,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun eventsRound(
        idLeague: String?,
        round: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsRound(
            idLeague,
            round,
            season,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }

    override fun eventsSeason(
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApi.eventsSeason(

            idLeague,
            season,
            object : ConsumeApiResponse<Events> {
                override fun onSuccess(data: Events) {
                    callback.onSuccess(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String) {
                    callback.onFailed(statusCode, errorMessage)
                }

                override fun onFinish() {
                    callback.onFinish()
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }
}