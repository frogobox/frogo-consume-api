package com.frogobox.appapi.mvvm.meal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ActivityMealBinding
import com.frogobox.appapi.databinding.ItemGridImageBinding
import com.frogobox.coresdk.source.Resource
import com.frogobox.coreutil.meal.model.Meal
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.sdk.ext.openDetailImageUri
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.view.FrogoBindActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MealActivity : FrogoBindActivity<ActivityMealBinding>() {

    private val mealViewModel: MealViewModel by viewModels()

    override fun setupViewBinding(): ActivityMealBinding {
        return ActivityMealBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mealViewModel.mealsState.collect { resource ->
                    when (resource) {
                        is Resource.Loading -> {
                            binding.progressBar.progressViewHandle(true)
                        }
                        is Resource.Success -> {
                            binding.progressBar.progressViewHandle(false)
                            resource.result?.meals?.let { setupRv(it) }
                        }
                        is Resource.Error -> {
                            binding.progressBar.progressViewHandle(false)
                            showToast(resource.message ?: "Failed to load meals")
                        }
                    }
                }
            }
        }
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        setupDetailActivity("Meal Api")
        if (mealViewModel.listData.value == null) {
            mealViewModel.getListMealsFlow(this, "b")
        }
    }

    private fun setupRv(data: List<Meal>) {

        val adapterCallback = object : IFrogoBindingAdapter<Meal, ItemGridImageBinding> {
            override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
                return oldItem.idMeal == newItem.idMeal
            }

            override fun setViewBinding(parent: ViewGroup): ItemGridImageBinding {
                return ItemGridImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ItemGridImageBinding,
                data: Meal,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Meal>
            ) {
                binding.apply {
                    Glide.with(root.context).load(data.strMealThumb).into(ivIcon)
                    tvTitle.text = data.strMeal
                    tvSub.text = data.strCategory
                }
            }

            override fun onItemClicked(
                binding: ItemGridImageBinding,
                data: Meal,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Meal>
            ) {
                openDetailImageUri(data.strMealThumb ?: "")
            }

            override fun onItemLongClicked(
                binding: ItemGridImageBinding,
                data: Meal,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Meal>
            ) {
                data.strMeal?.let { showToast(it) }
            }

        }

        binding.frogoRv.injectorBinding<Meal, ItemGridImageBinding>()
            .addData(data)
            .addCallback(adapterCallback)
            .createLayoutGrid(2)
            .build()
    }

}