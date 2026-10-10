package com.frogobox.appapi.mvvm.main

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.frogobox.appapi.databinding.ActivityMainBinding
import com.frogobox.appapi.mvvm.meal.MealActivity
import com.frogobox.appapi.mvvm.movies.MoviesActivity
import com.frogobox.appapi.mvvm.news.NewsActivity
import com.frogobox.appapi.mvvm.pixabay.PixabayActivity
import com.frogobox.appapi.mvvm.sport.SportActivity
import com.frogobox.appapi.util.Constant
import com.frogobox.appapi.util.Helper
import com.frogobox.sdk.ext.startActivityExt
import com.frogobox.sdk.ext.toJson
import com.frogobox.sdk.view.FrogoBindActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FrogoBindActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupRV()
    }

    private fun listData(): MutableList<MainModel> {
        return Helper.listJsonFromAssets(this, "library.json")
    }

    private fun setupRV() {
        val adapter = MainAdapter { data ->
            setupIntentActivity(data.code, data)
        }
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = adapter
        adapter.submitList(listData())
    }

    private fun setupIntentActivity(codeActivity: Int, data: MainModel) {
        when (codeActivity) {
            0 -> {
                startActivityExt<NewsActivity> { intent ->
                    intent.putExtra(Constant.EXTRA_MAIN, data.toJson())
                }
            }

            1 -> {
                startActivityExt<MoviesActivity> { intent ->
                    intent.putExtra(Constant.EXTRA_MAIN, data.toJson())
                }
            }

            2 -> {
                startActivityExt<SportActivity> { intent ->
                    intent.putExtra(Constant.EXTRA_MAIN, data.toJson())
                }
            }

            3 -> {
                startActivityExt<MealActivity> { intent ->
                    intent.putExtra(Constant.EXTRA_MAIN, data.toJson())
                }
            }

            4 -> {
                startActivityExt<PixabayActivity> { intent ->
                    intent.putExtra(Constant.EXTRA_MAIN, data.toJson())
                }
            }
        }

    }

}