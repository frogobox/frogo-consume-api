package com.frogobox.consumable.mvvm.movies.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.frogobox.consumable.R
import com.frogobox.consumable.databinding.FragmentTrendingBinding
import com.frogobox.consumable.mvvm.movies.movie.MovieDayFragment
import com.frogobox.consumable.mvvm.movies.movie.MovieWeekFragment
import com.frogobox.consumable.util.PagerAdapter
import com.frogobox.frogosdk.core.FrogoBaseFragment

class MovieFragment : FrogoBaseFragment<FragmentTrendingBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup
    ): FragmentTrendingBinding {
        return FragmentTrendingBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        val pagerAdapter = PagerAdapter(childFragmentManager)
        pagerAdapter.setupPagerFragment(
            MovieDayFragment(),
            resources.getString(R.string.title_day)
        )
        pagerAdapter.setupPagerFragment(
            MovieWeekFragment(),
            resources.getString(R.string.title_week)
        )

        binding.apply {
            viewpager.adapter = pagerAdapter
            tablayout.setupWithViewPager(viewpager)
        }
    }

}
