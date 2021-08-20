package com.frogobox.appapi.mvvm.sport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivitySportBinding
import com.frogobox.api.sport.model.Team
import com.frogobox.uikit.databinding.FrogoRvGridType3Binding
import com.frogobox.sdk.core.FrogoBaseActivity
import com.frogobox.recycler.core.IFrogoBindingAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class SportActivity : FrogoBaseActivity<ActivitySportBinding>() {

    private val sportViewModel: SportViewModel by viewModel()

    override fun setupViewBinding(): ActivitySportBinding {
        return ActivitySportBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        sportViewModel.apply {

            searchAllTeam()

            eventShowProgress.observe(this@SportActivity, {
                setupEventProgressView(binding.progressView, it)
            })

            eventFailed.observe(this@SportActivity, {
                showToast(it)
            })

            listData.observe(this@SportActivity, {
                setupRv(it)
            })

        }
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("Sport Api")
    }

    private fun setupRv(data: List<Team>) {

        val adapterCallback = object : IFrogoBindingAdapter<Team, FrogoRvGridType3Binding> {
            override fun onItemClicked(data: Team) {}

            override fun onItemLongClicked(data: Team) {}

            override fun setViewBinding(parent: ViewGroup): FrogoRvGridType3Binding {
                return FrogoRvGridType3Binding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(binding: FrogoRvGridType3Binding, data: Team) {
                binding.apply {
                    frogoRvGridType3TvTitle.text = data.strTeam
                    frogoRvGridType3TvSubtitle.text = data.strAlternate
                    frogoRvGridType3TvDesc.text = data.strDescriptionEN
                    Glide.with(root.context).load(data.strTeamBadge).into(frogoRvGridType3IvPoster)
                }
            }
        }

        binding.frogorecyclerview.injectorBinding<Team, FrogoRvGridType3Binding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()

    }

}