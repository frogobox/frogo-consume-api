## consumable-code-movie-tmdb-api
[![JitPack](https://jitpack.io/v/amirisback/consumable-code-movie-tmdb-api.svg?style=flat-square)](https://jitpack.io/#amirisback/consumable-code-movie-tmdb-api) <br>
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

## Screen Shoot Apps
|TV                 |   Movie                       |   Person            |         Chuck Data  |
|:------------------:|:----------------------------:|:---------------------:|:-----------------:|
| <span align="center"><img width="200px" height="360px" src="docs/image/ss_tv.png"></span> | <span align="center"><img width="200px" height="360px" src="docs/image/ss_movie.png"></span> | <span align="center"><img width="200px" height="360px" src="docs/image/ss_person.png"></span> | <span align="center"><img width="200px" height="360px" src="docs/image/ss_api.png"></span> |

## Version Release
This Is Latest Release

    $version_release = 1.2.1

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
	        // library consumable code movie tmdb api
            implementation 'com.github.amirisback:consumable-code-movie-tmdb-api:1.2.1'
	}
	
<h3>Step 3. Declaration ConsumeMovieApi</h3>

    val consumeMovieApi = ConsumeMovieApi(MovieUrl.API_KEY) // your api_key
    consumeMovieApi.usingChuckInterceptor(this) // This is Code Chuck Interceptor
    consumeMovieApi.getMovieChangeList(
        null,
        null,
        null,
        object : MovieResultCallback<Changes> {
            override fun getResultData(data: Changes) {
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
	

## Documentation The Movie DB API
https://developers.themoviedb.org/3/getting-started/introduction

## Function Main From This Project
- Chuck Interceptor [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/ChuckInterceptor.md)
- Certifications [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Certifications.md)
- Changes [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Changes.md)
- Collection [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Collection.md)
- Companies [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Companies.md)
- Configuration [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Configuration.md)
- Credits [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Credits.md)
- Discover [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Discover.md)
- Find [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Find.md)
- Genres [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Genres.md)
- Keyords [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Keywords.md)
- Reviews [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Reviews.md)
- Trending [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Trending.md)
- Networks [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Networks.md)
- Movies [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Movies.md)
- Search [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Search.md)
- TV [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/TV.md)
- TV Seasons [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/TVSeasons.md)
- TV Episodes [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/TVEpisodes.md)
- TV Episodes Groups [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/TVEpisodesGroups.md)
- People [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/People.md)
- * ON DEVELOPMENT [Here](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/tutorial/Development.md)

## Award
### Github Actions Hackathon (March 5-31, 2020) [See list winner](https://github.com/amirisback/consumable-code-movie-tmdb-api/blob/master/docs/github_action_hackathon_winners.xlsx)
:star: This four-week hackathon challenges the community to create original GitHub Actions. Actions connect all of the tools in your workflow: You can solve problems, build containers, deploy to any cloud, and more.    
![ScreenShoot Apps](docs/image/ss_github_hackathon1.png?raw=true)
![ScreenShoot Apps](docs/image/ss_github_hackathon3.png?raw=true)
![ScreenShoot Apps](docs/image/ss_github_hackathon2.png?raw=true)

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