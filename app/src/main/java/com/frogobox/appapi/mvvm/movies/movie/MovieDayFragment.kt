package com.frogobox.appapi.mvvm.movies.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.appapi.databinding.FragmentTrendingChildBinding
import com.frogobox.coreapi.movie.MovieUrl
import com.frogobox.coreapi.movie.model.TrendingMovie
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.view.FrogoBindFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class MovieDayFragment : FrogoBindFragment<FragmentTrendingChildBinding>() {

    private val movieViewModel: MovieViewModel by viewModel()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        movieViewModel.apply {
            getTrendingMovieDay()

            eventShowProgress.observe(viewLifecycleOwner) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(viewLifecycleOwner) {
                showToast(it)
            }

            listDataDay.observe(viewLifecycleOwner) {
                setupRV(it)
            }
        }
    }

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {
    }

    private fun setupRV(data: List<TrendingMovie>) {

        val adapterCallback = object : IFrogoBindingAdapter<TrendingMovie, ContentItemBinding> {
            override fun onItemClicked(
                binding: ContentItemBinding,
                data: TrendingMovie,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<TrendingMovie>
            ) {
            }

            override fun onItemLongClicked(
                binding: ContentItemBinding,
                data: TrendingMovie,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<TrendingMovie>
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
                data: TrendingMovie,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<TrendingMovie>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvOverview.text = data.overview
                    Glide.with(root.context)
                        .load("${MovieUrl.BASE_URL_IMAGE_ORIGNAL}${data.poster_path}")
                        .into(ivPoster)
                }
            }
        }

        binding.frogoRecyclerView.injectorBinding<TrendingMovie, ContentItemBinding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()

    }

}