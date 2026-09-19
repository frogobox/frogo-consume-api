package com.frogobox.appapi.mvvm.movies.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.appapi.databinding.FragmentTrendingChildBinding
import com.frogobox.coreutil.movie.MovieUrl
import com.frogobox.coreutil.movie.model.TrendingMovie
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.openDetailImageUri
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.view.FrogoBindFragment
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass.
 */
@AndroidEntryPoint
class MovieDayFragment : FrogoBindFragment<FragmentTrendingChildBinding>() {

    private val movieViewModel: MovieViewModel by viewModels()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        movieViewModel.apply {
            if (listDataDay.value == null) {
                getTrendingMovieDay()
            }

            eventShowProgressState.observe(viewLifecycleOwner) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(viewLifecycleOwner) {
                requireContext().showToast(it)
            }

            listDataDay.observe(viewLifecycleOwner) {
                setupRV(it)
            }
        }
    }

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {
    }

    private fun setupRV(data: List<com.frogobox.coreutil.movie.model.TrendingMovie>) {

        val adapterCallback = object : IFrogoBindingAdapter<com.frogobox.coreutil.movie.model.TrendingMovie, ContentItemBinding> {
            override fun onItemClicked(
                binding: ContentItemBinding,
                data: com.frogobox.coreutil.movie.model.TrendingMovie,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.movie.model.TrendingMovie>
            ) {
                requireActivity().openDetailImageUri("${MovieUrl.BASE_URL_IMAGE_ORIGINAL}${data.poster_path}")
            }

            override fun areItemsTheSame(oldItem: TrendingMovie, newItem: TrendingMovie): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: TrendingMovie,
                newItem: TrendingMovie
            ): Boolean {
                return oldItem == newItem
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
                data: com.frogobox.coreutil.movie.model.TrendingMovie,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<com.frogobox.coreutil.movie.model.TrendingMovie>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvOverview.text = data.overview
                    Glide.with(root.context)
                        .load("${MovieUrl.BASE_URL_IMAGE_ORIGINAL}${data.poster_path}")
                        .into(ivPoster)
                }
            }
        }

        binding.frogoRecyclerView.injectorBinding<com.frogobox.coreutil.movie.model.TrendingMovie, ContentItemBinding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()

    }

}