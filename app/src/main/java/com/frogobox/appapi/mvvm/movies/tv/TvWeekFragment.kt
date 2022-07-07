package com.frogobox.appapi.mvvm.movies.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.appapi.databinding.FragmentTrendingChildBinding
import com.frogobox.coreapi.movie.MovieUrl
import com.frogobox.coreapi.movie.model.TrendingTv
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.view.FrogoBindFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


/**
 * A simple [Fragment] subclass.
 */
class TvWeekFragment : FrogoBindFragment<FragmentTrendingChildBinding>() {

    private val tvViewModel: TvViewModel by viewModel()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        tvViewModel.apply {
            getTrendingTvWeek()

            eventShowProgress.observe(viewLifecycleOwner) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(viewLifecycleOwner) {
                showToast(it)
            }

            listDataWeek.observe(viewLifecycleOwner) {
                setupRV(it)
            }
        }
    }

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {

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
