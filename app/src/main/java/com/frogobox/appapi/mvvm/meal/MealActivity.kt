package com.frogobox.appapi.mvvm.meal

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.appapi.databinding.ActivityMealBinding
import com.frogobox.coresdk.source.Resource
import com.frogobox.coreutil.meal.model.Meal
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
        val mealAdapter = MealAdapter(
            onItemClick = { meal ->
                openDetailImageUri(meal.strMealThumb ?: "")
            },
            onItemLongClick = { meal ->
                meal.strMeal?.let { showToast(it) }
            }
        )
        binding.rvMeal.layoutManager = GridLayoutManager(this, 2)
        binding.rvMeal.adapter = mealAdapter
        mealAdapter.submitList(data)
    }

}