package com.frogobox.coreapi.sport

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.sport.response.*
import com.frogobox.coresdk.FrogoApiClient
import com.frogobox.coresdk.ext.doApiRequest
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
    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        sportApiService =
            FrogoApiClient.createWithInterceptor(SportUrl.BASE_URL, chuckerInterceptor)
    }

    override fun searchForTeamByName(
        scheduler: Scheduler?, apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApiService.searchForTeamByName(apiKey, teamName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }

    }

    override fun searchForTeamByShortCode(
        scheduler: Scheduler?, apiKey: String,
        shortCode: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApiService.searchForTeamByShortCode(apiKey, shortCode).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchForAllPlayer(
        scheduler: Scheduler?, apiKey: String,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApiService.searchForAllPlayer(apiKey, teamName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchForPlayer(
        scheduler: Scheduler?, apiKey: String,
        playerName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApiService.searchForPlayer(apiKey, playerName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchForPlayer(
        scheduler: Scheduler?, apiKey: String,
        playerName: String?,
        teamName: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApiService.searchForPlayer(apiKey, playerName, teamName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchForEvent(
        scheduler: Scheduler?, apiKey: String,
        eventName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.searchForEvent(apiKey, eventName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchForEvent(
        scheduler: Scheduler?, apiKey: String,
        eventName: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.searchForEvent(apiKey, eventName, season).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchForEventFileName(
        scheduler: Scheduler?, apiKey: String,
        eventFileName: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.searchForEventFileName(apiKey, eventFileName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getAllSports(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<Sports>
    ) {
        sportApiService.getAllSports(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun getAllLeagues(
        scheduler: Scheduler?,
        apiKey: String,
        callback: ConsumeApiResponse<Leagues>
    ) {
        sportApiService.getAllLeagues(apiKey).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchAllLeagues(
        scheduler: Scheduler?, apiKey: String,
        countryName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchAllLeagues(
        scheduler: Scheduler?, apiKey: String,
        countryName: String?,
        sportName: String?,
        callback: ConsumeApiResponse<Countrys>
    ) {
        sportApiService.searchAllLeagues(apiKey, countryName, sportName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchAllSeasons(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Seasons>
    ) {
        sportApiService.searchAllSeasons(apiKey, idTeam).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchAllTeam(
        scheduler: Scheduler?, apiKey: String,
        league: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApiService.searchAllTeam(apiKey, league).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchAllTeam(
        scheduler: Scheduler?, apiKey: String,
        sportName: String?,
        countryName: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApiService.searchAllTeam(apiKey, sportName, countryName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupAllTeam(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApiService.lookupAllTeam(apiKey, idLeague).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupAllPlayer(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApiService.lookupAllPlayer(apiKey, idTeam).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun searchLoves(
        scheduler: Scheduler?, apiKey: String,
        userName: String?,
        callback: ConsumeApiResponse<Users>
    ) {
        sportApiService.searchLoves(apiKey, userName).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupLeagues(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Leagues>
    ) {
        sportApiService.lookupLeagues(apiKey, idLeague).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupTeam(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Teams>
    ) {
        sportApiService.lookupTeam(apiKey, idTeam).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupPlayer(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Players>
    ) {
        sportApiService.lookupPlayer(apiKey, idPlayer).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupEvent(
        scheduler: Scheduler?, apiKey: String,
        idEvent: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.lookupEvent(apiKey, idEvent).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupHonour(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Honors>
    ) {
        sportApiService.lookupHonour(apiKey, idPlayer).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupFormerTeam(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<FormerTeams>
    ) {
        sportApiService.lookupFormerTeam(apiKey, idPlayer).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupContract(
        scheduler: Scheduler?, apiKey: String,
        idPlayer: String?,
        callback: ConsumeApiResponse<Contracts>
    ) {
        sportApiService.lookupContract(apiKey, idPlayer).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun lookupTable(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Tables>
    ) {
        sportApiService.lookupTable(apiKey, idLeague, season).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun eventsNext(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.eventsNext(apiKey, idTeam).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun eventsNextLeague(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.eventsNextLeague(apiKey, idLeague).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun eventsLast(
        scheduler: Scheduler?, apiKey: String,
        idTeam: String?,
        callback: ConsumeApiResponse<Results>
    ) {
        sportApiService.eventsLast(apiKey, idTeam).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun eventsPastLeague(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.eventsPastLeague(apiKey, idLeague).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun eventsRound(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        round: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.eventsRound(apiKey, idLeague, round, season).apply {
            if (scheduler != null) {
                doApiRequest(scheduler, callback)
            } else {
                doApiRequest(callback)
            }
        }
    }

    override fun eventsSeason(
        scheduler: Scheduler?, apiKey: String,
        idLeague: String?,
        season: String?,
        callback: ConsumeApiResponse<Events>
    ) {
        sportApiService.eventsSeason(apiKey, idLeague, season)
            .apply {
                if (scheduler != null) {
                    doApiRequest(scheduler, callback)
                } else {
                    doApiRequest(callback)
                }
            }
    }
}