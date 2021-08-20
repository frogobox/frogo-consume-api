package com.frogobox.appapi.mvvm.pixabay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityPixabayBinding
import com.frogobox.api.pixabay.model.PixabayImage
import com.frogobox.uikit.databinding.FrogoRvGridType1Binding
import com.frogobox.sdk.core.FrogoBaseActivity
import com.frogobox.recycler.core.IFrogoBindingAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class PixabayActivity : FrogoBaseActivity<ActivityPixabayBinding>() {

    private val pixabayViewModel: PixabayViewModel by viewModel()

    override fun setupViewBinding(): ActivityPixabayBinding {
        return ActivityPixabayBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        pixabayViewModel.apply {

            searchImage("Nature")

            eventShowProgress.observe(this@PixabayActivity, {
                setupEventProgressView(binding.progressBar, it)
            })

            eventFailed.observe(this@PixabayActivity, {
                showToast(it)
            })

            listData.observe(this@PixabayActivity, {
                setupRv(it)
            })

        }
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("Pixabay Api")
    }

    private fun setupRv(data: List<PixabayImage>) {

        val adapterCallback = object : IFrogoBindingAdapter<PixabayImage, FrogoRvGridType1Binding> {
            override fun onItemClicked(data: PixabayImage) {}

            override fun onItemLongClicked(data: PixabayImage) {}

            override fun setViewBinding(parent: ViewGroup): FrogoRvGridType1Binding {
                return FrogoRvGridType1Binding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(binding: FrogoRvGridType1Binding, data: PixabayImage) {
                val totalLikes = "${data.likes} likes"
                binding.apply {
                    Glide.with(root.context).load(data.previewURL).into(frogoRvGridType1IvPoster)
                    frogoRvGridType1TvTitle.text = totalLikes
                }
            }
        }

        binding.frogoRv.injectorBinding<PixabayImage, FrogoRvGridType1Binding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()
    }

}