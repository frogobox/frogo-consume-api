package com.frogobox.consumable.mvvm.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.consumable.databinding.ActivityMainBinding
import com.frogobox.consumable.databinding.ItemMainBinding
import com.frogobox.consumable.mvvm.meal.MealActivity
import com.frogobox.consumable.mvvm.movie.MovieActivity
import com.frogobox.consumable.mvvm.news.NewsActivity
import com.frogobox.consumable.mvvm.pixabay.PixabayActivity
import com.frogobox.consumable.mvvm.sport.SportActivity
import com.frogobox.consumable.util.Constant
import com.frogobox.consumable.util.Helper
import com.frogobox.frogosdk.core.FrogoBaseActivity
import com.frogobox.frogosdk.core.FrogoFunc
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : FrogoBaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        setupRV()
    }

    private fun listData(): MutableList<MainModel> {
        return Helper.listJsonFromAssets(this, "library.json")
    }

    private fun setupRV() {

        val adapterCallback = object : IFrogoBindingAdapter<MainModel, ItemMainBinding> {
            override fun onItemClicked(data: MainModel) {
                setupIntentActivity(data.code, data)
            }

            override fun onItemLongClicked(data: MainModel) {}

            override fun setViewBinding(parent: ViewGroup): ItemMainBinding {
                return ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(binding: ItemMainBinding, data: MainModel) {
                binding.apply {
                    Glide.with(root.context).load(data.image).into(ivIcon)
                    tvTitle.text = data.name
                    tvLink.text = data.api
                }
            }
        }

        binding.rvMain.injectorBinding<MainModel, ItemMainBinding>()
            .addData(listData())
            .addCallback(adapterCallback)
            .createLayoutLinearVertical(false)
            .build()

    }

    private fun setupIntentActivity(codeActivity: Int, data: MainModel) {
        when (codeActivity) {
            0 -> {
                baseStartActivity<NewsActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            1 -> {
                baseStartActivity<MovieActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            2 -> {
                baseStartActivity<SportActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            3 -> {
                baseStartActivity<MealActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            4 -> {
                baseStartActivity<PixabayActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
        }

    }

}