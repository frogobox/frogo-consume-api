![ScreenShoot Apps](docs/image/ss_banner.png?raw=true)

## About This Project

[![](https://jitpack.io/v/frogobox/frogo-consume-api.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-consume-api) <br>
SDK for anything your problem to make easier developing android apps

## Version Release
This Is Latest Release

    $version_release = 1.0.1

What's New??

    * Release *

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)
    
    Add it in your root build.gradle at the end of repositories:
    
    	allprojects {
    		repositories {
    			...
    			maven { url 'https://jitpack.io' }
    		}
    	}
      
### Step 2. Add the dependency (build.gradle : Module)
    
    dependencies {
            // library frogo-consume-api
            implementation 'com.github.frogobox:frogo-consume-api:1.0.1'
    }

### Step 3. Use Like Consumable Code Amirisback


<details><summary>News Api</summary>
#### About
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

#### Documentation The News API
https://newsapi.org/

#### Screenshoot Apps
| News API           |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
|<img width="200px" height="360px" src="docs/image/news/ss_main.png"> | <img width="200px" height="360px" src="docs/image/news/ss_chuck_1.png"> | <img width="200px" height="360px" src="docs/image/news/ss_chuck_2.png"> |

#### Declaration ConsumeNewsApi

	val consumeNewsApi = ConsumeNewsApi(NewsUrl.NEWS_API_KEY) // Your API_KEY
    consumeNewsApi.usingChuckInterceptor(this) // Using Chuck Interceptor
    consumeNewsApi.getTopHeadline( // Adding Base Parameter on main function
        null, 
        null,
        CATEGORY_HEALTH,
        COUNTRY_ID,
        null,
        null,
        object : FrogoResponseCallback<ArticleResponse> {
            override fun onSuccess(data: ArticleResponse) {
                // Your Ui or data
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                // Your failed to do
            }

            override fun onShowProgress() {
                // Your Progress Show
            }

            override fun onHideProgress() {
                // Your Progress Hide
            }

        })
	

#### Contant Value Category

    object NewsConstant {
    
        const val CATEGORY_BUSINESS = "business"
        const val CATEGORY_ENTERTAIMENT = "entertainment"
        const val CATEGORY_GENERAL = "general"
        const val CATEGORY_HEALTH = "health"
        const val CATEGORY_SCIENCE = "science"
        const val CATEGORY_SPORTS = "sports"
        const val CATEGORY_TECHNOLOGY = "technology"
    
    }

#### Function Main From This Project
    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Get Top Headline
    fun getTopHeadline(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoResponseCallback<ArticleResponse>
    )

    // Get Everythings
    fun getEverythings(
        q: String?,
        from: String?,
        to: String?,
        qInTitle: String?,
        sources: String?,
        domains: String?,
        excludeDomains: String?,
        language: String?,
        sortBy: String?,
        pageSize: Int?,
        page: Int?,
        callback: FrogoResponseCallback<ArticleResponse>
    )

    // Get Sources
    fun getSources(
        language: String,
        country: String,
        category: String,
        callback: FrogoResponseCallback<SourceResponse>
    )
</details>

<details><summary>Meal Api</summary>
    
</details>

<details><summary>Pixabay Api</summary>
    
</details>

<details><summary>Sport Api</summary>

#### About
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

#### Documentation THE SPORT DB API
https://www.thesportsdb.com/api.php

#### Screenshoot Apps

| The Sport DB API   |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
|<img width="200px" height="360px" src="docs/image/sport/ss_main.png"> | <img width="200px" height="360px" src="docs/image/sport/ss_chuck_1.png"> | <img width="200px" height="360px" src="docs/image/sport/ss_chuck_2.png"> |

    
#### Declaration ConsumeTheSportDbApi

	val consumeTheSportDbApi = ConsumeTheSportDbApi("1") // "1" is API KEY
	
	consumeTheSportDbApi.usingChuckInterceptor(this) // This is Code Chuck Interceptor
	
    consumeTheSportDbApi.searchForPlayerByName(
        "Danny Welbeck",
        object : FrogoResponseCallback<Players> {
            override fun onSuccess(data: Players) {
                
                // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *

            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                // failed result
            }

            override fun onShowProgress() {
                // showing your progress view
            }

            override fun onHideProgress() {
                // hiding your progress view
            }
        })



#### Function Main From This Project

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for team by name
    fun searchForTeamByName(teamName: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(teamName: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Search for players by player name
    fun searchForPlayer(playerName: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(playerName: String?, teamName: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Search for event by event name
    fun searchForEvent(eventName: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Search For event by event name and season
    fun searchForEvent(eventName: String?, season: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Search for event by event file name
    fun searchForEventFileName(eventFileName: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // List all sports
    fun getAllSports(sportResultCallback: FrogoResponseCallback<Sports>)

    // List all leagues
    fun getAllLeagues(sportResultCallback: FrogoResponseCallback<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(countryName: String?, sportResultCallback: FrogoResponseCallback<Countrys>)

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(countryName: String?, sportName: String?, sportResultCallback: FrogoResponseCallback<Countrys>)

    // List all Seasons in a League
    fun searchAllSeasons(idTeam: String?, sportResultCallback: FrogoResponseCallback<Seasons>)

    // List all Teams in a League
    fun searchAllTeam(league: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(sportName: String?, countryName: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // List All teams details in a league by Id
    fun lookupAllTeam(idLeague: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(idTeam: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // List all users loved teams and players
    fun searchLoves(userName: String?, sportResultCallback: FrogoResponseCallback<Users>)

    // League Details by Id
    fun lookupLeagues(idLeague: String?, sportResultCallback: FrogoResponseCallback<Leagues>)

    // Team Details by Id
    fun lookupTeam(idTeam: String?, sportResultCallback: FrogoResponseCallback<Teams>)

    // Player Details by Id
    fun lookupPlayer(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Players>)

    // Event Details by Id
    fun lookupEvent(idEvent: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Player Honours by Player Id
    fun lookupHonour(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Honors>)

    // Player Former Teams by Player Id
    fun lookupFormerTeam(idPlayer: String?, sportResultCallback: FrogoResponseCallback<FormerTeams>)

    // Player Contracts by Player Id
    fun lookupContract(idPlayer: String?, sportResultCallback: FrogoResponseCallback<Contracts>)

    // Lookup Table by League ID and Season
    fun lookupTable(idLeague: String?, season: String?, sportResultCallback: FrogoResponseCallback<Tables>)

    // Next 5 Events by Team Id
    fun eventsNext(idTeam: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Next 15 Events by League Id
    fun eventsNextLeague(idLeague: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Last 5 Events by Team Id
    fun eventsLast(idTeam: String?, sportResultCallback: FrogoResponseCallback<Results>)

    // Last 15 Events by League Id
    fun eventsPastLeague(idLeague: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // Events in a specific round by league id/round/season
    fun eventsRound(idLeague: String?, round: String?, season: String?, sportResultCallback: FrogoResponseCallback<Events>)

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(idLeague: String?, season: String?, sportResultCallback: FrogoResponseCallback<Events>)

    
</details>

<details><summary>Movie Api</summary>
    
</details>

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
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account

![ScreenShoot Apps](docs/image/mad_score.png?raw=true)
