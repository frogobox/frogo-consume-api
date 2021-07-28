package com.frogobox.consumable.mvvm.movies.person

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.consumable.databinding.ContentItemBinding
import com.frogobox.consumable.databinding.FragmentTrendingChildBinding
import com.frogobox.frogoconsumeapi.movie.model.TrendingPerson
import com.frogobox.frogoconsumeapi.movie.util.MovieUrl
import com.frogobox.frogosdk.core.FrogoBaseFragment
import com.frogobox.recycler.core.IFrogoBindingAdapter

import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class PersonDayFragment : FrogoBaseFragment<FragmentTrendingChildBinding>() {

    private val personViewModel : PersonViewModel by viewModel()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        personViewModel.apply {
            getTrendingPersonDay()

            eventShowProgress.observe(viewLifecycleOwner, {
                setupEventProgressView(binding.progressView, it)
            })

            eventFailed.observe(viewLifecycleOwner, {
                showToast(it)
            })

            listDataDay.observe(viewLifecycleOwner, {
                setupRV(it)
            })
        }
    }

    override fun setupUI(savedInstanceState: Bundle?) {
    }

    private fun setupRV(data: List<TrendingPerson>) {

        val adapterCallback = object : IFrogoBindingAdapter<TrendingPerson, ContentItemBinding> {
            override fun onItemClicked(data: TrendingPerson) {}

            override fun onItemLongClicked(data: TrendingPerson) {}

            override fun setViewBinding(parent: ViewGroup): ContentItemBinding {
                return ContentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(binding: ContentItemBinding, data: TrendingPerson) {
                binding.apply {
                    tvTitle.text = data.name
                    tvOverview.text = data.known_for_department
                    Glide.with(root.context)
                        .load("${MovieUrl.BASE_URL_IMAGE_ORIGNAL}${data.profile_path}")
                        .into(ivPoster)
                }
            }
        }

        binding.frogoRecyclerView.injectorBinding<TrendingPerson, ContentItemBinding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()

    }

}