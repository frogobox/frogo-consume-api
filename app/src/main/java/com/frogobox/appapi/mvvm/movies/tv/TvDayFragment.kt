package com.frogobox.appapi.mvvm.movies.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.api.movie.model.TrendingTv
import com.frogobox.api.movie.util.MovieUrl
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.appapi.databinding.FragmentTrendingChildBinding
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.FrogoFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class TvDayFragment : FrogoFragment<FragmentTrendingChildBinding>() {

    private val tvViewModel: TvViewModel by viewModel()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        tvViewModel.apply {
            getTrendingTvDay()

            eventShowProgress.observe(viewLifecycleOwner) {
                setupProgressView(binding.progressView, it)
            }

            eventFailed.observe(viewLifecycleOwner) {
                showToast(it)
            }

            listDataDay.observe(viewLifecycleOwner) {
                setupRV(it)
            }
        }
    }

    override fun setupOnViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    private fun setupRV(data: List<TrendingTv>) {

        val adapterCallback = object : IFrogoBindingAdapter<TrendingTv, ContentItemBinding> {
            override fun onItemClicked(
                binding: ContentItemBinding,
                data: TrendingTv,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<TrendingTv>
            ) {
            }

            override fun onItemLongClicked(
                binding: ContentItemBinding,
                data: TrendingTv,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<TrendingTv>
            ) {
            }

            override fun setViewBinding(parent: ViewGroup): ContentItemBinding {
                return ContentItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentItemBinding,
                data: TrendingTv,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<TrendingTv>
            ) {
                binding.apply {
                    tvTitle.text = data.name
                    tvOverview.text = data.overview
                    Glide.with(root.context)
                        .load("${MovieUrl.BASE_URL_IMAGE_ORIGNAL}${data.poster_path}")
                        .into(ivPoster)
                }
            }
        }

        binding.frogoRecyclerView.injectorBinding<TrendingTv, ContentItemBinding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()

    }

}