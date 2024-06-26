package com.frogobox.appapi

import com.frogobox.appapi.core.FrogoKoinApplication
import com.frogobox.appapi.di.consumeApiModule
import com.frogobox.appapi.di.repositoryModule
import com.frogobox.appapi.di.viewModelModule
import org.koin.core.KoinApplication

/**
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

class ConsumeApp : FrogoKoinApplication() {

    override fun setupKoinModule(koinApplication: KoinApplication) {
        koinApplication.modules(listOf(repositoryModule, viewModelModule, consumeApiModule))
    }

}