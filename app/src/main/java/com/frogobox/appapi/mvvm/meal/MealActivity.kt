package com.frogobox.appapi.mvvm.meal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityMealBinding
import com.frogobox.coreapi.meal.model.Meal
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.view.FrogoBindActivity
import com.frogobox.ui.databinding.FrogoRvGridType2Binding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MealActivity : FrogoBindActivity<ActivityMealBinding>() {

    private val mealViewModel: MealViewModel by viewModel()

    override fun setupViewBinding(): ActivityMealBinding {
        return ActivityMealBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        mealViewModel.apply {

            eventShowProgress.observe(this@MealActivity) {
                binding.progressBar.progressViewHandle(it)
            }

            eventFailed.observe(this@MealActivity) {
                showToast(it)
            }

            listData.observe(this@MealActivity) {
                setupRv(it)
            }

        }

    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupDetailActivity("Meal Api")
        mealViewModel.getListMeals("b")
    }

    private fun setupRv(data: List<Meal>) {

        val adapterCallback = object : IFrogoBindingAdapter<Meal, FrogoRvGridType2Binding> {

            override fun setViewBinding(parent: ViewGroup): FrogoRvGridType2Binding {
                return FrogoRvGridType2Binding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: FrogoRvGridType2Binding,
                data: Meal,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Meal>
            ) {
                binding.apply {
                    Glide.with(root.context).load(data.strMealThumb).into(frogoRvGridType2IvPoster)
                    frogoRvGridType2TvTitle.text = data.strMeal
                    frogoRvGridType2TvSubtitle.text = data.strCategory
                }
            }

            override fun onItemClicked(
                binding: FrogoRvGridType2Binding,
                data: Meal,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Meal>
            ) {
                data.strMeal?.let { showToast(it) }
            }

            override fun onItemLongClicked(
                binding: FrogoRvGridType2Binding,
                data: Meal,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Meal>
            ) {
                data.strMeal?.let { showToast(it) }
            }

        }

        binding.frogoRv.injectorBinding<Meal, FrogoRvGridType2Binding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()
    }

}