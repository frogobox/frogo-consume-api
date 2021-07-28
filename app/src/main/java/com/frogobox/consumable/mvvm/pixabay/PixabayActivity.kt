package com.frogobox.consumable.mvvm.pixabay

import android.os.Bundle
import com.frogobox.consumable.databinding.ActivityPixabayBinding
import com.frogobox.frogosdk.core.FrogoBaseActivity

class PixabayActivity : FrogoBaseActivity<ActivityPixabayBinding>() {

    override fun setupViewBinding(): ActivityPixabayBinding {
        return ActivityPixabayBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {

    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("Pixabay Api")
    }
}