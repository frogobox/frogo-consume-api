package com.frogobox.consumable.mvvm.movies.movie

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.consumable.databinding.ContentItemBinding
import com.frogobox.consumable.databinding.FragmentTrendingChildBinding
import com.frogobox.frogoconsumeapi.movie.model.TrendingMovie
import com.frogobox.frogoconsumeapi.movie.util.MovieUrl
import com.frogobox.frogosdk.core.FrogoBaseFragment
import com.frogobox.recycler.core.IFrogoBindingAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class MovieWeekFragment : FrogoBaseFragment<FragmentTrendingChildBinding>() {


    private val movieViewModel : MovieViewModel by viewModel()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        movieViewModel.apply {
            getTrendingMovieWeek()

            eventShowProgress.observe(viewLifecycleOwner, {
                setupEventProgressView(binding.progressView, it)
            })

            eventFailed.observe(viewLifecycleOwner, {
                showToast(it)
            })

            listDataWeek.observe(viewLifecycleOwner, {
                setupRV(it)
            })
        }
    }

    override fun setupUI(savedInstanceState: Bundle?) {
    }

    private fun setupRV(data: List<TrendingMovie>) {

        val adapterCallback = object : IFrogoBindingAdapter<TrendingMovie, ContentItemBinding> {
            override fun onItemClicked(data: TrendingMovie) {}

            override fun onItemLongClicked(data: TrendingMovie) {}

            override fun setViewBinding(parent: ViewGroup): ContentItemBinding {
                return ContentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(binding: ContentItemBinding, data: TrendingMovie) {
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