![ScreenShoot Apps](https://raw.githubusercontent.com/frogobox/frogo-consume-api/master/docs/image/ss_banner.png?raw=true)

## About This Project
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-frogo--consume--api-brightgreen.svg?style=flat-square)](https://android-arsenal.com/details/1/8407)
[![](https://jitpack.io/v/frogobox/frogo-consume-api.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-consume-api)
[![Android CI](https://github.com/frogobox/frogo-consume-api/actions/workflows/android-ci.yml/badge.svg)](https://github.com/frogobox/frogo-consume-api/actions/workflows/android-ci.yml)
[![Scan with Detekt](https://github.com/frogobox/frogo-consume-api/actions/workflows/detekt-analysis.yml/badge.svg)](https://github.com/frogobox/frogo-consume-api/actions/workflows/detekt-analysis.yml)
[![pages-build-deployment](https://github.com/frogobox/frogo-consume-api/actions/workflows/pages/pages-build-deployment/badge.svg)](https://github.com/frogobox/frogo-consume-api/actions/workflows/pages/pages-build-deployment)

- Available on Google Dev Library [Click Here](https://devlibrary.withgoogle.com/products/android/repos/frogobox-frogo-consume-api)
- SDK for anything your problem to make easier developing android apps
- Migrate frogo-android-sdk to frogo-sdk [Click Here](https://github.com/frogobox/frogo-sdk)
- Migrate frogo-android-ui-kit to frogo-ui [Click Here](https://github.com/frogobox/frogo-ui)
- Privacy Policy [Click Here](https://github.com/frogobox/frogo-consume-api/blob/master/PRIVACY-POLICY.md)
- License [Click Here](https://github.com/frogobox/frogo-consume-api/blob/master/LICENSE)

## Screen Shoot
| The Meals API      |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
| <img width="200px" height="360px" src="docs/image/meals/ss_main.png"> | <img width="200px" height="360px" src="docs/image/meals/ss_chuck_1.png"> | <img width="200px" height="360px" src="docs/image/meals/ss_chuck_2.png"> |

|TV                  |   Movie                      |     Person            |
|:------------------:|:----------------------------:|:---------------------:|
| <img width="200px" height="360px" src="docs/image/movie/ss_tv.png"> | <img width="200px" height="360px" src="docs/image/movie/ss_movie.png"> | <img width="200px" height="360px" src="docs/image/movie/ss_person.png"> |

## Version Release
This Is Latest Release

    $version_release = 2.3.2

What's New??

    * Update Code *
    * Available for android and desktop *
    * Migrate frogo-android-sdk to frogo-sdk *
    * Migrate frogo-android-ui-kit to frogo-ui *
    * Migrate Chuck Ready Software To ChuckerTeam/Chuck *
    * Please Reimport RedColored Code *
    * For Android >> Consume{class}Api - Sample : ConsumeNewsApi*
    * For Desktop >> C{class}Api - Sample : CNewsApi *

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)
    
#### <Option 1> Groovy Gradle

    // Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

#### <Option 2> Kotlin DSL Gradle

```kotlin
// Add it in your root build.gradle.kts at the end of repositories:

allprojects {
    repositories {
        ...
        maven("https://jitpack.io")
    }
}
```

### Step 2. Add the dependency (build.gradle : Module)

#### <Option 1> Groovy Gradle

    dependencies {
        // library frogo-consume-api
        implementation 'com.github.frogobox:frogo-consume-api:2.3.2'

        // library frogo-consume-api for desktop
        implementation 'com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:2.3.2'
    }

#### <Option 2> Kotlin DSL Gradle

    dependencies {
        // library frogo-consume-api
        implementation("com.github.frogobox:frogo-consume-api:2.3.2")

        // library frogo-consume-api for desktop
        implementation("com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:2.3.2")
    }


### Step 3. Click Detail Below

#### News Api
<details>
<summary>Click for detail !!!</summary>

### About
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

### Documentation The News API
https://newsapi.org/

### Screenshoot Apps
| News API           |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
|<img width="200px" height="360px" src="docs/image/news/ss_main.png"> | <img width="200px" height="360px" src="docs/image/news/ss_chuck_1.png"> | <img width="200px" height="360px" src="docs/image/news/ss_chuck_2.png"> |

### Declaration ConsumeNewsApi

	val consumeNewsApi = ConsumeNewsApi(NewsUrl.NEWS_API_KEY) // Your API_KEY
    consumeNewsApi.usingChuckInterceptor(this) // Using Chuck Interceptor
    consumeNewsApi.getTopHeadline( // Adding Base Parameter on main function
        null, 
        null,
        CATEGORY_HEALTH,
        COUNTRY_ID,
        null,
        null,
        object : ConsumeApiResponse<ArticleResponse> {
            override fun onSuccess(data: ArticleResponse) {
                // Your Ui or data
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                // Your failed to do
            }

            override fun onShowProgress() {
                // Your Progress Show
            }

            override fun onHideProgress() {
                // Your Progress Hide
            }

        })
	

### Contant Value Category

    object NewsConstant {
    
        const val CATEGORY_BUSINESS = "business"
        const val CATEGORY_ENTERTAIMENT = "entertainment"
        const val CATEGORY_GENERAL = "general"
        const val CATEGORY_HEALTH = "health"
        const val CATEGORY_SCIENCE = "science"
        const val CATEGORY_SPORTS = "sports"
        const val CATEGORY_TECHNOLOGY = "technology"
    
    }

### Function Main From This Project
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
        callback: FrogoDataResponse<ArticleResponse>
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
        callback: FrogoDataResponse<ArticleResponse>
    )

    // Get Sources
    fun getSources(
        language: String,
        country: String,
        category: String,
        callback: FrogoDataResponse<SourceResponse>
    )
</details>

#### Meals API
<details>
<summary>Click for detail !!!</summary>

### About    
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API <br>

### Documentation The News API
https://www.themealdb.com/api.php

### Screen Shoot Apps
| The Meals API      |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
| <img width="200px" height="360px" src="docs/image/meals/ss_main.png"> | <img width="200px" height="360px" src="docs/image/meals/ss_chuck_1.png"> | <img width="200px" height="360px" src="docs/image/meals/ss_chuck_2.png"> |
    

### Declaration ConsumeTheMealDbApi</h3>

	val consumeMealApi = ConsumeTheMealDbApi("1") Your API_KEY
    consumeMealApi.usingChuckInterceptor(this) // Using Chuck Interceptor
    consumeMealApi.listAllCateories(object : ConsumeApiResponse<MealResponse<Category>> {
        override fun onSuccess(data: MealResponse<Category>) {

            // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *

        }

        override fun onFailed(statusCode: Int, errorMessage: String) {
            // Failed Status
        }

        override fun onShowProgress() {
            // Show Your Progress View
        }

        override fun onHideProgress() {
            // Hide Your Progress View
        }
        
    })
	

### Function Main From This Project

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search meal by name
    fun searchMeal(mealName: String, callback: FrogoDataResponse<MealResponse<Meal>>)

    // List all meals by first letter
    fun listAllMeal(firstLetter: String, callback: FrogoDataResponse<MealResponse<Meal>>)

    // Lookup full meal details by id
    fun lookupFullMeal(idMeal: String, callback: FrogoDataResponse<MealResponse<Meal>>)

    // Lookup a single random meal
    fun lookupRandomMeal(callback: FrogoDataResponse<MealResponse<Meal>>)

    // List all meal categories
    fun listMealCategories(callback: FrogoDataResponse<CategoryResponse>)

    // List all Categories
    fun listAllCateories(callback: FrogoDataResponse<MealResponse<Category>>)

    // List all Area
    fun listAllArea(callback: FrogoDataResponse<MealResponse<Area>>)

    // List all Ingredients
    fun listAllIngredients(callback: FrogoDataResponse<MealResponse<Ingredient>>)

    // Filter by main ingredient
    fun filterByIngredient(ingredient: String, callback: FrogoDataResponse<MealResponse<MealFilter>>)

    // Filter by Category
    fun filterByCategory(category: String, callback: FrogoDataResponse<MealResponse<MealFilter>>)

    // Filter by Area
    fun filterByArea(area: String, callback: FrogoDataResponse<MealResponse<MealFilter>>)
    
</details>

#### Pixabay API
<details>
<summary>Click for detail !!!</summary>

### About
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

### Documentation Pixabay Api
https://pixabay.com/api/docs/

### Screen Shoot Apps
| Pixabay API        |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
| <img width="200px" height="360px" src="docs/image/pixabay/ss_main.png"> | <img width="200px" height="360px" src="docs/image/pixabay/ss_chuck_1.png">| <img width="200px" height="360px" src="docs/image/pixabay/ss_chuck_2.png"> |

### Declaration ConsumePixabayApi

    val consumePixabayApi = ConsumePixabayApi(PixabayConstant.API_KEY) // Your API Key
    consumePixabayApi.usingChuckInterceptor(this) // Using Chuck Interceptor

    val query = "Nature"

    consumePixabayApi.searchImage(
        query,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        object : ConsumeApiResponse<Response<PixabayImage>> {
            override fun onSuccess(data: Response<PixabayImage>) {
                // Place your UI / Data
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                // failed to do
            }

            override fun onShowProgress() {
                // showing your progress view
            }

            override fun onHideProgress() {
                // hide your progress view
            }
        })

### Function Main From This Project
    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for Image
    fun searchImage(
        q: String,
        lang: String?,
        id: String?,
        imageType: String?,
        orientation: String?,
        category: String?,
        minWidth: Int?,
        minHeight: Int?,
        colors: String?,
        editorsChoice: Boolean?,
        safeSearch: Boolean?,
        order: String?,
        page: Int?,
        perPage: Int?,
        callback: FrogoDataResponse<Response<PixabayImage>>
    )

    // Search for Video
    fun searchVideo(
        q: String,
        lang: String?,
        id: String?,
        videoType: String?,
        category: String?,
        minWidth: Int?,
        minHeight: Int?,
        editorsChoice: Boolean?,
        safeSearch: Boolean?,
        order: String?,
        page: Int?,
        perPage: Int?,
        callback: FrogoDataResponse<Response<PixabayVideo>>
    )
    
</details>

#### Sport API
<details>
<summary>Click for detail !!!</summary>

### About
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

### Documentation THE SPORT DB API
https://www.thesportsdb.com/api.php

### Screenshoot Apps

| The Sport DB API   |   Chuck Data 1               |   Chuck Data 2        |
|:------------------:|:----------------------------:|:---------------------:|
|<img width="200px" height="360px" src="docs/image/sport/ss_main.png"> | <img width="200px" height="360px" src="docs/image/sport/ss_chuck_1.png"> | <img width="200px" height="360px" src="docs/image/sport/ss_chuck_2.png"> |

    
### Declaration ConsumeTheSportDbApi

	val consumeTheSportDbApi = ConsumeTheSportDbApi("1") // "1" is API KEY
	
	consumeTheSportDbApi.usingChuckInterceptor(this) // This is Code Chuck Interceptor
	
    consumeTheSportDbApi.searchForPlayerByName(
        "Danny Welbeck",
        object : ConsumeApiResponse<Players> {
            override fun onSuccess(data: Players) {
                
                // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *

            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                // failed result
            }

            override fun onShowProgress() {
                // showing your progress view
            }

            override fun onHideProgress() {
                // hiding your progress view
            }
        })



### Function Main From This Project

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Search for team by name
    fun searchForTeamByName(teamName: String?, callback: FrogoDataResponse<Teams>)

    // Search for team short code
    fun searchForTeamByShortCode(shortCode: String?, callback: FrogoDataResponse<Teams>)

    // Search for all players from team *Patreon ONLY*
    fun searchForAllPlayer(teamName: String?, callback: FrogoDataResponse<Players>)

    // Search for players by player name
    fun searchForPlayer(playerName: String?, callback: FrogoDataResponse<Players>)

    // Search for players by player name and team name
    fun searchForPlayer(playerName: String?, teamName: String?, callback: FrogoDataResponse<Players>)

    // Search for event by event name
    fun searchForEvent(eventName: String?, callback: FrogoDataResponse<Events>)

    // Search For event by event name and season
    fun searchForEvent(eventName: String?, season: String?, callback: FrogoDataResponse<Events>)

    // Search for event by event file name
    fun searchForEventFileName(eventFileName: String?, callback: FrogoDataResponse<Events>)

    // List all sports
    fun getAllSports(callback: FrogoDataResponse<Sports>)

    // List all leagues
    fun getAllLeagues(callback: FrogoDataResponse<Leagues>)

    // List all Leagues in a country
    fun searchAllLeagues(countryName: String?, callback: FrogoDataResponse<Countrys>)

    // List all Leagues in a country specific by sport
    fun searchAllLeagues(countryName: String?, sportName: String?, callback: FrogoDataResponse<Countrys>)

    // List all Seasons in a League
    fun searchAllSeasons(idTeam: String?, callback: FrogoDataResponse<Seasons>)

    // List all Teams in a League
    fun searchAllTeam(league: String?, callback: FrogoDataResponse<Teams>)

    // List all Teams in Sportname & Country Name
    fun searchAllTeam(sportName: String?, countryName: String?, callback: FrogoDataResponse<Teams>)

    // List All teams details in a league by Id
    fun lookupAllTeam(idLeague: String?, callback: FrogoDataResponse<Teams>)

    // List All players in a team by Team Id *Patreon ONLY*
    fun lookupAllPlayer(idTeam: String?, callback: FrogoDataResponse<Players>)

    // List all users loved teams and players
    fun searchLoves(userName: String?, callback: FrogoDataResponse<Users>)

    // League Details by Id
    fun lookupLeagues(idLeague: String?, callback: FrogoDataResponse<Leagues>)

    // Team Details by Id
    fun lookupTeam(idTeam: String?, callback: FrogoDataResponse<Teams>)

    // Player Details by Id
    fun lookupPlayer(idPlayer: String?, callback: FrogoDataResponse<Players>)

    // Event Details by Id
    fun lookupEvent(idEvent: String?, callback: FrogoDataResponse<Events>)

    // Player Honours by Player Id
    fun lookupHonour(idPlayer: String?, callback: FrogoDataResponse<Honors>)

    // Player Former Teams by Player Id
    fun lookupFormerTeam(idPlayer: String?, callback: FrogoDataResponse<FormerTeams>)

    // Player Contracts by Player Id
    fun lookupContract(idPlayer: String?, callback: FrogoDataResponse<Contracts>)

    // Lookup Table by League ID and Season
    fun lookupTable(idLeague: String?, season: String?, callback: FrogoDataResponse<Tables>)

    // Next 5 Events by Team Id
    fun eventsNext(idTeam: String?, callback: FrogoDataResponse<Events>)

    // Next 15 Events by League Id
    fun eventsNextLeague(idLeague: String?, callback: FrogoDataResponse<Events>)

    // Last 5 Events by Team Id
    fun eventsLast(idTeam: String?, callback: FrogoDataResponse<Results>)

    // Last 15 Events by League Id
    fun eventsPastLeague(idLeague: String?, callback: FrogoDataResponse<Events>)

    // Events in a specific round by league id/round/season
    fun eventsRound(idLeague: String?, round: String?, season: String?, callback: FrogoDataResponse<Events>)

    // All events in specific league by season (Free tier limited to 200 events)
    fun eventsSeason(idLeague: String?, season: String?, callback: FrogoDataResponse<Events>)

    
</details>

#### Movie API
<details>
<summary>Click for detail !!!</summary>
    
### About
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

### Documentation The Movie DB API
https://developers.themoviedb.org/3/getting-started/introduction


### Screen Shoot Apps
|TV                  |   Movie                      |     Person            |       Chuck Data  |
|:------------------:|:----------------------------:|:---------------------:|:-----------------:|
| <img width="200px" height="360px" src="docs/image/movie/ss_tv.png"> | <img width="200px" height="360px" src="docs/image/movie/ss_movie.png"> | <img width="200px" height="360px" src="docs/image/movie/ss_person.png"> | <img width="200px" height="360px" src="docs/image/movie/ss_api.png"> |

### Step 3. Declaration ConsumeMovieApi

    val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY) // your api_key
    consumeMovieApi.usingChuckInterceptor(this) // This is Code Chuck Interceptor
    consumeMovieApi.getMovieChangeList(
        null,
        null,
        null,
        object : ConsumeApiResponse<Changes> {
            override fun onSuccess(data: Changes) {
                // * PLACE YOUR CODE HERE FOR UI / ARRAYLIST *
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                // failed result
            }

            override fun onShowProgress() {
                // showing your progress view
            }

            override fun onHideProgress() {
                // hiding your progress view
            }
        })
	


### Function Main From This Project
- Chuck Interceptor [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/ChuckInterceptor.md)
- Certifications [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Certifications.md)
- Changes [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Changes.md)
- Collection [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Collection.md)
- Companies [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Companies.md)
- Configuration [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Configuration.md)
- Credits [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Credits.md)
- Discover [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Discover.md)
- Find [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Find.md)
- Genres [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Genres.md)
- Keyords [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Keywords.md)
- Reviews [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Reviews.md)
- Trending [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Trending.md)
- Networks [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Networks.md)
- Movies [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Movies.md)
- Search [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Search.md)
- TV [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/TV.md)
- TV Seasons [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/TVSeasons.md)
- TV Episodes [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/TVEpisodes.md)
- TV Episodes Groups [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/TVEpisodesGroups.md)
- People [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/People.md)
- * ON DEVELOPMENT [Here](https://github.com/frogobox/frogo-consume-api/tree/master/docs/tutorial/movie/Development.md)

### Github Actions Hackathon (March 5-31, 2020) [See list winner](https://github.com/frogobox/frogo-consume-api/blob/master/docs/github_action_hackathon_winners.xlsx)
:star: This four-week hackathon challenges the community to create original GitHub Actions. Actions connect all of the tools in your workflow: You can solve problems, build containers, deploy to any cloud, and more.    
![ScreenShoot Apps](docs/image/movie/ss_github_hackathon1.png?raw=true)
![ScreenShoot Apps](docs/image/movie/ss_github_hackathon3.png?raw=true)
![ScreenShoot Apps](docs/image/movie/ss_github_hackathon2.png?raw=true)

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
