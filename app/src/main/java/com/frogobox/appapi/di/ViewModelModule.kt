package com.frogobox.appapi.di

import com.frogobox.appapi.mvvm.meal.MealViewModel
import com.frogobox.appapi.mvvm.movies.movie.MovieViewModel
import com.frogobox.appapi.mvvm.movies.person.PersonViewModel
import com.frogobox.appapi.mvvm.movies.tv.TvViewModel
import com.frogobox.appapi.mvvm.news.NewsViewModel
import com.frogobox.appapi.mvvm.pixabay.PixabayViewModel
import com.frogobox.appapi.mvvm.sport.SportViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/*
 * Created by faisalamir on 28/07/21
 * Consumable
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */

val viewModelModule = module {

    viewModel {
        NewsViewModel(androidApplication())
    }

    viewModel {
        MealViewModel(androidApplication())
    }

    viewModel {
        PixabayViewModel(androidApplication())
    }

    viewModel {
        SportViewModel(androidApplication())
    }

    viewModel {
        MovieViewModel(androidApplication())
    }

    viewModel {
        TvViewModel(androidApplication())
    }

    viewModel {
        PersonViewModel(androidApplication())
    }

}