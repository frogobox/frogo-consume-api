package com.frogobox.consumable.mvvm.movies.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frogobox.consumable.R
import com.frogobox.consumable.databinding.FragmentTrendingBinding
import com.frogobox.consumable.mvvm.movies.tv.TvDayFragment
import com.frogobox.consumable.mvvm.movies.tv.TvWeekFragment
import com.frogobox.consumable.util.PagerAdapter
import com.frogobox.frogosdk.core.FrogoBaseFragment

/**
 * A simple [Fragment] subclass.
 */
class TvFragment : FrogoBaseFragment<FragmentTrendingBinding>() {

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
            TvDayFragment(),
            resources.getString(R.string.title_day)
        )
        pagerAdapter.setupPagerFragment(
            TvWeekFragment(),
            resources.getString(R.string.title_week)
        )

        binding.apply {
            viewpager.adapter = pagerAdapter
            tablayout.setupWithViewPager(viewpager)
        }
    }

}
