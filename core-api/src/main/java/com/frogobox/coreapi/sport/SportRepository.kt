package com.frogobox.coreapi.sport


import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.FrogoApiClient
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
    private var sportApiService = FrogoApiClient.create<SportApiService>(com.frogobox.coreutil.sport.SportUrl.BASE_URL)

    // Switch For Using Chuck Interceptor
    override fun usingChuckInterceptor(
        isDebug: Boolean,
        chuckerInterceptor: Interceptor
    ): SportDataSource {
        sportApiService = FrogoApiClient.create(com.frogobox.coreutil.sport.SportUrl.BASE_URL, isDebug, chuckInterceptor = chuckerInterceptor)
        return this
    }

    override fun searchForTeamByName(
        apiKey: String,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportApiService.searchForTeamByName(apiKey, teamName).doApiRequest(callback)

    }

    override fun searchForTeamByShortCode(
        apiKey: String,
        shortCode: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportApiService.searchForTeamByShortCode(apiKey, shortCode)
            .doApiRequest(callback)
    }

    override fun searchForAllPlayer(
        apiKey: String,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportApiService.searchForAllPlayer(apiKey, teamName).doApiRequest(callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportApiService.searchForPlayer(apiKey, playerName).doApiRequest(callback)
    }

    override fun searchForPlayer(
        apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportApiService.searchForPlayer(apiKey, playerName, teamName)
            .doApiRequest(callback)
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.searchForEvent(apiKey, eventName).doApiRequest(callback)
    }

    override fun searchForEvent(
        apiKey: String,
        eventName: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.searchForEvent(apiKey, eventName, season)
            .doApiRequest(callback)
    }

    override fun searchForEventFileName(
        apiKey: String,
        eventFileName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.searchForEventFileName(apiKey, eventFileName)
            .doApiRequest(callback)
    }

    override fun getAllSports(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Sports>
    ) {
        sportApiService.getAllSports(apiKey).doApiRequest(callback)
    }

    override fun getAllLeagues(
        apiKey: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Leagues>
    ) {
        sportApiService.getAllLeagues(apiKey).doApiRequest(callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName).doApiRequest(callback)
    }

    override fun searchAllLeagues(
        apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName, sportName)
            .doApiRequest(callback)
    }

    override fun searchAllSeasons(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Seasons>
    ) {
        sportApiService.searchAllSeasons(apiKey, idTeam).doApiRequest(callback)
    }

    override fun searchAllTeam(
        apiKey: String,
        league: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportApiService.searchAllTeam(apiKey, league).doApiRequest(callback)
    }

    override fun searchAllTeam(
        apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportApiService.searchAllTeam(apiKey, sportName, countryName)
            .doApiRequest(callback)
    }

    override fun lookupAllTeam(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportApiService.lookupAllTeam(apiKey, idLeague).doApiRequest(callback)
    }

    override fun lookupAllPlayer(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportApiService.lookupAllPlayer(apiKey, idTeam).doApiRequest(callback)
    }

    override fun searchLoves(
        apiKey: String,
        userName: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Users>
    ) {
        sportApiService.searchLoves(apiKey, userName).doApiRequest(callback)
    }

    override fun lookupLeagues(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Leagues>
    ) {
        sportApiService.lookupLeagues(apiKey, idLeague).doApiRequest(callback)
    }

    override fun lookupTeam(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Teams>
    ) {
        sportApiService.lookupTeam(apiKey, idTeam).doApiRequest(callback)
    }

    override fun lookupPlayer(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Players>
    ) {
        sportApiService.lookupPlayer(apiKey, idPlayer).doApiRequest(callback)
    }

    override fun lookupEvent(
        apiKey: String,
        idEvent: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.lookupEvent(apiKey, idEvent).doApiRequest(callback)
    }

    override fun lookupHonour(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Honors>
    ) {
        sportApiService.lookupHonour(apiKey, idPlayer).doApiRequest(callback)
    }

    override fun lookupFormerTeam(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.FormerTeams>
    ) {
        sportApiService.lookupFormerTeam(apiKey, idPlayer).doApiRequest(callback)
    }

    override fun lookupContract(
        apiKey: String,
        idPlayer: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Contracts>
    ) {
        sportApiService.lookupContract(apiKey, idPlayer).doApiRequest(callback)
    }

    override fun lookupTable(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Tables>
    ) {
        sportApiService.lookupTable(apiKey, idLeague, season).doApiRequest(callback)
    }

    override fun eventsNext(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.eventsNext(apiKey, idTeam).doApiRequest(callback)
    }

    override fun eventsNextLeague(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.eventsNextLeague(apiKey, idLeague).doApiRequest(callback)
    }

    override fun eventsLast(
        apiKey: String,
        idTeam: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Results>
    ) {
        sportApiService.eventsLast(apiKey, idTeam).doApiRequest(callback)
    }

    override fun eventsPastLeague(
        apiKey: String,
        idLeague: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.eventsPastLeague(apiKey, idLeague).doApiRequest(callback)
    }

    override fun eventsRound(
        apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.eventsRound(apiKey, idLeague, round, season)
            .doApiRequest(callback)
    }

    override fun eventsSeason(
        apiKey: String,
        idLeague: String?,
        season: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.sport.response.Events>
    ) {
        sportApiService.eventsSeason(apiKey, idLeague, season).doApiRequest(callback)
    }
}