package com.frogobox.coreapi.sport


import com.frogobox.coremodel.sport.response.Contracts
import com.frogobox.coremodel.sport.response.Countrys
import com.frogobox.coremodel.sport.response.Events
import com.frogobox.coremodel.sport.response.FormerTeams
import com.frogobox.coremodel.sport.response.Honors
import com.frogobox.coremodel.sport.response.Leagues
import com.frogobox.coremodel.sport.response.Players
import com.frogobox.coremodel.sport.response.Results
import com.frogobox.coremodel.sport.response.Seasons
import com.frogobox.coremodel.sport.response.Sports
import com.frogobox.coremodel.sport.response.Tables
import com.frogobox.coremodel.sport.response.Teams
import com.frogobox.coremodel.sport.response.Users
import com.frogobox.coremodel.sport.SportUrl
import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.FrogoApiClient
import io.reactivex.rxjava3.core.Scheduler
import okhttp3.Interceptor


/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 26/01/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.sport.source
 *
 */
object SportRepository : SportDataSource {

    private val TAG = SportRepository::class.java.simpleName
    private var sportApiService = FrogoApiClient.create<SportApiService>(SportUrl.BASE_URL)

    // Switch For Using Chuck Interceptor
    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): SportDataSource {
        sportApiService = FrogoApiClient.create(SportUrl.BASE_URL, isDebug, chuckerInterceptor)
        return this
    }

    override fun searchForTeamByName(
        scheduler: Scheduler?, apiKey: String,
        teamName: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApiService.searchForTeamByName(apiKey, teamName).doApiRequest(scheduler, callback) {}

    }

    override fun searchForTeamByShortCode(
        scheduler: Scheduler?, apiKey: String,
        shortCode: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApiService.searchForTeamByShortCode(apiKey, shortCode)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchForAllPlayer(
        scheduler: Scheduler?, apiKey: String,
        teamName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApiService.searchForAllPlayer(apiKey, teamName).doApiRequest(scheduler, callback) {}
    }

    override fun searchForPlayer(
        scheduler: Scheduler?, apiKey: String,
        playerName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApiService.searchForPlayer(apiKey, playerName).doApiRequest(scheduler, callback) {}
    }

    override fun searchForPlayer(
        scheduler: Scheduler?, apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApiService.searchForPlayer(apiKey, playerName, teamName)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchForEvent(
        scheduler: Scheduler?, apiKey: String,
        eventName: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.searchForEvent(apiKey, eventName).doApiRequest(scheduler, callback) {}
    }

    override fun searchForEvent(
        scheduler: Scheduler?, apiKey: String,
        eventName: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.searchForEvent(apiKey, eventName, season)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchForEventFileName(
        scheduler: Scheduler?, apiKey: String,
        eventFileName: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.searchForEventFileName(apiKey, eventFileName)
            .doApiRequest(scheduler, callback) {}
    }

    override fun getAllSports(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<Sports>
    ) {
        sportApiService.getAllSports(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun getAllLeagues(
        scheduler: Scheduler?,
        apiKey: String,
        callback: FrogoDataResponse<Leagues>
    ) {
        sportApiService.getAllLeagues(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun searchAllLeagues(
        scheduler: Scheduler?, apiKey: String,
        countryName: String?,
        callback: FrogoDataResponse<Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName).doApiRequest(scheduler, callback) {}
    }

    override fun searchAllLeagues(
        scheduler: Scheduler?, apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: FrogoDataResponse<Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName, sportName)
            .doApiRequest(scheduler, callback) {}
    }

    override fun searchAllSeasons(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<Seasons>
    ) {
        sportApiService.searchAllSeasons(apiKey, idTeam).doApiRequest(scheduler, callback) {}
    }

    override fun searchAllTeam(
        scheduler: Scheduler?, apiKey: String,
        league: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApiService.searchAllTeam(apiKey, league).doApiRequest(scheduler, callback) {}
    }

    override fun searchAllTeam(
        scheduler: Scheduler?, apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApiService.searchAllTeam(apiKey, sportName, countryName)
            .doApiRequest(scheduler, callback) {}
    }

    override fun lookupAllTeam(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApiService.lookupAllTeam(apiKey, idLeague).doApiRequest(scheduler, callback) {}
    }

    override fun lookupAllPlayer(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApiService.lookupAllPlayer(apiKey, idTeam).doApiRequest(scheduler, callback) {}
    }

    override fun searchLoves(
        scheduler: Scheduler?, apiKey: String,
        userName: String?,
        callback: FrogoDataResponse<Users>
    ) {
        sportApiService.searchLoves(apiKey, userName).doApiRequest(scheduler, callback) {}
    }

    override fun lookupLeagues(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<Leagues>
    ) {
        sportApiService.lookupLeagues(apiKey, idLeague).doApiRequest(scheduler, callback) {}
    }

    override fun lookupTeam(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<Teams>
    ) {
        sportApiService.lookupTeam(apiKey, idTeam).doApiRequest(scheduler, callback) {}
    }

    override fun lookupPlayer(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<Players>
    ) {
        sportApiService.lookupPlayer(apiKey, idPlayer).doApiRequest(scheduler, callback) {}
    }

    override fun lookupEvent(
        scheduler: Scheduler?, apiKey: String,
        idEvent: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.lookupEvent(apiKey, idEvent).doApiRequest(scheduler, callback) {}
    }

    override fun lookupHonour(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<Honors>
    ) {
        sportApiService.lookupHonour(apiKey, idPlayer).doApiRequest(scheduler, callback) {}
    }

    override fun lookupFormerTeam(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<FormerTeams>
    ) {
        sportApiService.lookupFormerTeam(apiKey, idPlayer).doApiRequest(scheduler, callback) {}
    }

    override fun lookupContract(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<Contracts>
    ) {
        sportApiService.lookupContract(apiKey, idPlayer).doApiRequest(scheduler, callback) {}
    }

    override fun lookupTable(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<Tables>
    ) {
        sportApiService.lookupTable(apiKey, idLeague, season).doApiRequest(scheduler, callback) {}
    }

    override fun eventsNext(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.eventsNext(apiKey, idTeam).doApiRequest(scheduler, callback) {}
    }

    override fun eventsNextLeague(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.eventsNextLeague(apiKey, idLeague).doApiRequest(scheduler, callback) {}
    }

    override fun eventsLast(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<Results>
    ) {
        sportApiService.eventsLast(apiKey, idTeam).doApiRequest(scheduler, callback) {}
    }

    override fun eventsPastLeague(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.eventsPastLeague(apiKey, idLeague).doApiRequest(scheduler, callback) {}
    }

    override fun eventsRound(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.eventsRound(apiKey, idLeague, round, season)
            .doApiRequest(scheduler, callback) {}
    }

    override fun eventsSeason(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<Events>
    ) {
        sportApiService.eventsSeason(apiKey, idLeague, season).doApiRequest(scheduler, callback) {}
    }
}