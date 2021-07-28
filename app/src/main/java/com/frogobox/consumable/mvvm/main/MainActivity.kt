package com.frogobox.consumable.mvvm.main

import android.os.Bundle
import com.frogobox.consumable.databinding.ActivityMainBinding
import com.frogobox.frogosdk.core.FrogoBaseActivity

class MainActivity : FrogoBaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {

    }

}