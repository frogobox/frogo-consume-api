package com.frogobox.appapi.mvvm.movies.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.frogobox.appapi.R
import com.frogobox.appapi.databinding.FragmentTrendingBinding
import com.frogobox.appapi.mvvm.movies.movie.MovieDayFragment
import com.frogobox.appapi.mvvm.movies.movie.MovieWeekFragment
import com.frogobox.appapi.util.PagerAdapter
import com.frogobox.sdk.core.FrogoBaseFragment

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
