package com.frogobox.consumable.di

import com.frogobox.consumable.mvvm.meal.MealViewModel
import com.frogobox.consumable.mvvm.news.NewsViewModel
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

}