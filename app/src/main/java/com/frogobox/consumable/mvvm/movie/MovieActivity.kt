package com.frogobox.consumable.mvvm.movie

import android.os.Bundle
import com.frogobox.consumable.databinding.ActivityMovieBinding
import com.frogobox.frogosdk.core.FrogoBaseActivity

class MovieActivity : FrogoBaseActivity<ActivityMovieBinding>() {

    override fun setupViewBinding(): ActivityMovieBinding {
        return ActivityMovieBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("Movie Api")
    }

}