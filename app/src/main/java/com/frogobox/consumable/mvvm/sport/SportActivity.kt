package com.frogobox.consumable.mvvm.sport

import android.os.Bundle
import com.frogobox.consumable.databinding.ActivitySportBinding
import com.frogobox.frogosdk.core.FrogoBaseActivity

class SportActivity : FrogoBaseActivity<ActivitySportBinding>() {

    override fun setupViewBinding(): ActivitySportBinding {
        return ActivitySportBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("Sport Api")
    }

}