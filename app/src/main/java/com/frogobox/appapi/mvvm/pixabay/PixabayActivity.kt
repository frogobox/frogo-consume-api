package com.frogobox.appapi.mvvm.pixabay

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.appapi.databinding.ActivityPixabayBinding
import com.frogobox.coreutil.pixabay.model.PixabayImage
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.view.FrogoBindActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PixabayActivity : FrogoBindActivity<ActivityPixabayBinding>() {

    private val pixabayViewModel: PixabayViewModel by viewModels()

    override fun setupViewBinding(): ActivityPixabayBinding {
        return ActivityPixabayBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        pixabayViewModel.apply {

            if (listData.value == null) {
                searchImage(this@PixabayActivity, "Nature")
            }

            eventShowProgressState.observe(this@PixabayActivity) {
                binding.progressBar.progressViewHandle(it)
            }

            eventFailed.observe(this@PixabayActivity) {
                showToast(it)
            }

            listData.observe(this@PixabayActivity) {
                setupRv(it)
            }

        }
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupDetailActivity("Pixabay Api")
    }

    private fun setupRv(data: List<PixabayImage>) {
        val adapter = PixabayAdapter()
        binding.rvPixabay.layoutManager = GridLayoutManager(this, 2)
        binding.rvPixabay.adapter = adapter
        adapter.submitList(data)
    }

}