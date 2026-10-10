package com.frogobox.appapi.mvvm.sport

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.appapi.databinding.ActivitySportBinding
import com.frogobox.coreutil.sport.model.Team
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.view.FrogoBindActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SportActivity : FrogoBindActivity<ActivitySportBinding>() {

    private val sportViewModel: SportViewModel by viewModels()

    override fun setupViewBinding(): ActivitySportBinding {
        return ActivitySportBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        sportViewModel.apply {

            if (listData.value == null) {
                searchAllTeam(this@SportActivity)
            }

            eventShowProgressState.observe(this@SportActivity) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(this@SportActivity) {
                showToast(it)
            }

            listData.observe(this@SportActivity) {
                setupRv(it)
            }

        }
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupDetailActivity("Sport Api")
    }

    private fun setupRv(data: List<Team>) {
        val adapter = SportAdapter()
        binding.rvSport.layoutManager = GridLayoutManager(this, 2)
        binding.rvSport.adapter = adapter
        adapter.submitList(data)
    }

}