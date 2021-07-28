package com.frogobox.consumable.mvvm.movies

import android.os.Bundle
import com.frogobox.consumable.R
import com.frogobox.consumable.databinding.ActivityMovieBinding
import com.frogobox.consumable.mvvm.movies.core.MovieFragment
import com.frogobox.consumable.mvvm.movies.core.PersonFragment
import com.frogobox.consumable.mvvm.movies.core.TvFragment
import com.frogobox.frogosdk.core.FrogoBaseActivity

class MoviesActivity : FrogoBaseActivity<ActivityMovieBinding>() {

    override fun setupViewBinding(): ActivityMovieBinding {
        return ActivityMovieBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupDetailActivity("Movie Api")
        setupToolbar()
        setupBottomNav(binding.framelayoutMainContainer.id)
        setupFragment(savedInstanceState)
    }

    private fun setupToolbar() {
        supportActionBar?.elevation = 0f
    }

    private fun setupFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            binding.bottomNavMainMenu.selectedItemId = R.id.bottom_menu_tv
        }
    }

    private fun setupBottomNav(frameLayout: Int) {
        binding.bottomNavMainMenu.apply {
            clearAnimation()
            itemIconTintList = null

            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.bottom_menu_movie -> {
                        setupCustomTitleToolbar(R.string.title_movie)
                        setupChildFragment(
                            frameLayout,
                            MovieFragment()
                        )
                    }

                    R.id.bottom_menu_person -> {
                        setupCustomTitleToolbar(R.string.title_person)
                        setupChildFragment(
                            frameLayout,
                            PersonFragment()
                        )
                    }

                    R.id.bottom_menu_tv -> {
                        setupCustomTitleToolbar(R.string.title_tv)
                        setupChildFragment(
                            frameLayout,
                            TvFragment()
                        )
                    }
                }

                true
            }
        }

    }

}