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
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.startActivityExt
import com.frogobox.sdk.ext.toJson
import com.frogobox.sdk.view.FrogoBindActivity

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

        val adapterCallback = object : IFrogoBindingAdapter<MainModel, ItemMainBinding> {
            override fun onItemClicked(
                binding: ItemMainBinding,
                data: MainModel,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<MainModel>,
            ) {
                setupIntentActivity(data.code, data)
            }

            override fun areItemsTheSame(oldItem: MainModel, newItem: MainModel): Boolean {
                return oldItem.code == newItem.code
            }

            override fun areContentsTheSame(oldItem: MainModel, newItem: MainModel): Boolean {
                return oldItem == newItem
            }

            override fun setViewBinding(parent: ViewGroup): ItemMainBinding {
                return ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            }

            override fun setupInitComponent(
                binding: ItemMainBinding,
                data: MainModel,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<MainModel>,
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