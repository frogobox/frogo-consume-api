package com.frogobox.appapi.mvvm.pixabay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityPixabayBinding
import com.frogobox.coreutil.pixabay.model.PixabayImage
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.view.FrogoBindActivity
import com.frogobox.ui.databinding.FrogoRvGridType1Binding
import org.koin.androidx.viewmodel.ext.android.viewModel

class PixabayActivity : FrogoBindActivity<ActivityPixabayBinding>() {

    private val pixabayViewModel: PixabayViewModel by viewModel()

    override fun setupViewBinding(): ActivityPixabayBinding {
        return ActivityPixabayBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        pixabayViewModel.apply {

            searchImage(this@PixabayActivity, "Nature")

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

    private fun setupRv(data: List<com.frogobox.coreutil.pixabay.model.PixabayImage>) {

        val adapterCallback = object : IFrogoBindingAdapter<com.frogobox.coreutil.pixabay.model.PixabayImage, FrogoRvGridType1Binding> {
            override fun onItemClicked(
                binding: FrogoRvGridType1Binding,
                data: com.frogobox.coreutil.pixabay.model.PixabayImage,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.pixabay.model.PixabayImage>
            ) {
            }

            override fun onItemLongClicked(
                binding: FrogoRvGridType1Binding,
                data: com.frogobox.coreutil.pixabay.model.PixabayImage,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.pixabay.model.PixabayImage>
            ) {
            }

            override fun setViewBinding(parent: ViewGroup): FrogoRvGridType1Binding {
                return FrogoRvGridType1Binding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: FrogoRvGridType1Binding,
                data: com.frogobox.coreutil.pixabay.model.PixabayImage,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.pixabay.model.PixabayImage>
            ) {
                val totalLikes = "${data.likes} likes"
                binding.apply {
                    Glide.with(root.context).load(data.previewURL).into(frogoRvGridType1IvPoster)
                    frogoRvGridType1TvTitle.text = totalLikes
                }
            }
        }

        binding.frogoRv.injectorBinding<com.frogobox.coreutil.pixabay.model.PixabayImage, FrogoRvGridType1Binding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()
    }

}