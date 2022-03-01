package com.frogobox.appapi.mvvm.sport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivitySportBinding
import com.frogobox.api.sport.model.Team
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.ui.databinding.FrogoRvGridType3Binding
import com.frogobox.sdk.FrogoActivity
import com.frogobox.recycler.core.IFrogoBindingAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class SportActivity : FrogoActivity<ActivitySportBinding>() {

    private val sportViewModel: SportViewModel by viewModel()

    override fun setupViewBinding(): ActivitySportBinding {
        return ActivitySportBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        sportViewModel.apply {

            searchAllTeam()

            eventShowProgress.observe(this@SportActivity) {
                setupProgressView(binding.progressView, it)
            }

            eventFailed.observe(this@SportActivity) {
                showToast(it)
            }

            listData.observe(this@SportActivity) {
                setupRv(it)
            }

        }
    }

    override fun setupOnCreate(savedInstanceState: Bundle?) {
        setupDetailActivity("Sport Api")
    }

    private fun setupRv(data: List<Team>) {

        val adapterCallback = object : IFrogoBindingAdapter<Team, FrogoRvGridType3Binding> {
            override fun onItemClicked(
                binding: FrogoRvGridType3Binding,
                data: Team,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Team>
            ) {}

            override fun onItemLongClicked(
                binding: FrogoRvGridType3Binding,
                data: Team,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Team>
            ) {}

            override fun setViewBinding(parent: ViewGroup): FrogoRvGridType3Binding {
                return FrogoRvGridType3Binding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(
                binding: FrogoRvGridType3Binding,
                data: Team,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Team>
            ) {
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