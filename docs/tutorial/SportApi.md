## consumable-code-the-sport-db-api
[![](https://jitpack.io/v/amirisback/consumable-code-the-sport-db-api.svg?style=flat-square)](https://jitpack.io/#amirisback/consumable-code-the-sport-db-api) <br>
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

## Screenshoot Apps

| The Sport DB API |   Chuck Data 1              |   Chuck Data 2  |
|:------------------:|:----------------------------:|:---------------------:|
|<span align="center"><img width="200px" height="360px" src="docs/image/ss_main.png"></span> | <span align="center"><img width="200px" height="360px" src="docs/image/ss_chuck_1.png"></span> | <span align="center"><img width="200px" height="360px" src="docs/image/ss_chuck_2.png"></span>

## Version Release
This Is Latest Release

    $version_release = 1.1.1

What's New??

    * Update Build Gradle *
    * Enhance Performance *

## How To Use This Project
<h3>Step 1. Add the JitPack repository to your build file</h3>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
<h3>Step 2. Add the dependency</h3>

	dependencies {
	        // library consumable code the sport db api
            implementation 'com.github.amirisback:consumable-code-the-sport-db-api:1.1.1'
	}
	
<h3>Step 3. Declaration ConsumeTheSportDbApi</h3>

	val consumeTheSportDbApi = ConsumeTheSportDbApi("1") // "1" is API KEY
	
	consumeTheSportDbApi.usingChuckInterceptor(this) // This is Code Chuck Interceptor
	
    consumeTheSportDbApi.searchForPlayerByName(
        "Danny Welbeck",
        object : SportResultCallback<Players> {
            override fun getResultData(data: Players) {
                
                // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *

            }

            override fun failedResult(statusCode: Int, errorMessage: String?) {
                // failed result
            }

            override fun onShowProgress() {
                // showing your progress view
            }

            override fun onHideProgress() {
                // hiding your progress view
            }
        })

## Documentation THE SPORT DB API
https://www.thesportsdb.com/api.php

## Function Main From This Project

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for team by name
    fun searchForTeamByName(teamName: String?, sportResultCallback: SportResultCallback<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String?, sportResultCallback: SportResultCallback<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(teamName: String?, sportResultCallback: SportResultCallback<Players>)

    // Search for players by player name
    fun searchForPlayer(playerName: String?, sportResultCallback: SportResultCallback<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(playerName: String?, teamName: String?, sportResultCallback: SportResultCallback<Players>)

    // Search for event by event name
    fun searchForEvent(eventName: String?, sportResultCallback: SportResultCallback<Events>)

    // Search For event by event name and season
    fun searchForEvent(eventName: String?, season: String?, sportResultCallback: SportResultCallback<Events>)

    // Search for event by event file name
    fun searchForEventFileName(eventFileName: String?, sportResultCallback: SportResultCallback<Events>)

    // List all sports
    fun getAllSports(sportResultCallback: SportResultCallback<Sports>)

    // List all leagues
    fun getAllLeagues(sportResultCallback: SportResultCallback<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(countryName: String?, sportResultCallback: SportResultCallback<Countrys>)

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(countryName: String?, sportName: String?, sportResultCallback: SportResultCallback<Countrys>)

    // List all Seasons in a League
    fun searchAllSeasons(idTeam: String?, sportResultCallback: SportResultCallback<Seasons>)

    // List all Teams in a League
    fun searchAllTeam(league: String?, sportResultCallback: SportResultCallback<Teams>)

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(sportName: String?, countryName: String?, sportResultCallback: SportResultCallback<Teams>)

    // List All teams details in a league by Id
    fun lookupAllTeam(idLeague: String?, sportResultCallback: SportResultCallback<Teams>)

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(idTeam: String?, sportResultCallback: SportResultCallback<Players>)

    // List all users loved teams and players
    fun searchLoves(userName: String?, sportResultCallback: SportResultCallback<Users>)

    // League Details by Id
    fun lookupLeagues(idLeague: String?, sportResultCallback: SportResultCallback<Leagues>)

    // Team Details by Id
    fun lookupTeam(idTeam: String?, sportResultCallback: SportResultCallback<Teams>)

    // Player Details by Id
    fun lookupPlayer(idPlayer: String?, sportResultCallback: SportResultCallback<Players>)

    // Event Details by Id
    fun lookupEvent(idEvent: String?, sportResultCallback: SportResultCallback<Events>)

    // Player Honours by Player Id
    fun lookupHonour(idPlayer: String?, sportResultCallback: SportResultCallback<Honors>)

    // Player Former Teams by Player Id
    fun lookupFormerTeam(idPlayer: String?, sportResultCallback: SportResultCallback<FormerTeams>)

    // Player Contracts by Player Id
    fun lookupContract(idPlayer: String?, sportResultCallback: SportResultCallback<Contracts>)

    // Lookup Table by League ID and Season
    fun lookupTable(idLeague: String?, season: String?, sportResultCallback: SportResultCallback<Tables>)

    // Next 5 Events by Team Id
    fun eventsNext(idTeam: String?, sportResultCallback: SportResultCallback<Events>)

    // Next 15 Events by League Id
    fun eventsNextLeague(idLeague: String?, sportResultCallback: SportResultCallback<Events>)

    // Last 5 Events by Team Id
    fun eventsLast(idTeam: String?, sportResultCallback: SportResultCallback<Results>)

    // Last 15 Events by League Id
    fun eventsPastLeague(idLeague: String?, sportResultCallback: SportResultCallback<Events>)

    // Events in a specific round by league id/round/season
    fun eventsRound(idLeague: String?, round: String?, season: String?, sportResultCallback: SportResultCallback<Events>)

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(idLeague: String?, season: String?, sportResultCallback: SportResultCallback<Events>)


## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account
- If you like this library, please help me / you can donate to buy patreon services