package com.frogobox.appapi.mvvm.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityMainBinding
import com.frogobox.appapi.databinding.ItemMainBinding
import com.frogobox.appapi.mvvm.meal.MealActivity
import com.frogobox.appapi.mvvm.movies.MoviesActivity
import com.frogobox.appapi.mvvm.news.NewsActivity
import com.frogobox.appapi.mvvm.pixabay.PixabayActivity
import com.frogobox.appapi.mvvm.sport.SportActivity
import com.frogobox.appapi.util.Constant
import com.frogobox.appapi.util.Helper
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.sdk.FrogoActivity
import com.frogobox.recycler.core.IFrogoBindingAdapter

class MainActivity : FrogoActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupOnCreate(savedInstanceState: Bundle?) {
        setupRV()
    }

    private fun listData(): MutableList<MainModel> {
        return Helper.listJsonFromAssets(this, "library.json")
    }

    private fun setupRV() {

        val adapterCallback = object : IFrogoBindingAdapter<MainModel, ItemMainBinding> {
            override fun onItemClicked(
                binding: ItemMainBinding,
                data: MainModel,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<MainModel>
            ) {
                setupIntentActivity(data.code, data)
            }

            override fun onItemLongClicked(
                binding: ItemMainBinding,
                data: MainModel,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<MainModel>
            ) {}

            override fun setViewBinding(parent: ViewGroup): ItemMainBinding {
                return ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(
                binding: ItemMainBinding,
                data: MainModel,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<MainModel>
            ) {
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
                frogoStartActivity<NewsActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            1 -> {
                frogoStartActivity<MoviesActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            2 -> {
                frogoStartActivity<SportActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            3 -> {
                frogoStartActivity<MealActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
            4 -> {
                frogoStartActivity<PixabayActivity, MainModel>(Constant.EXTRA_MAIN, data)
            }
        }

    }

}