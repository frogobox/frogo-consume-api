package com.frogobox.appapi.mvvm.meal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ItemGridImageBinding
import com.frogobox.coreutil.meal.model.Meal

class MealAdapter(
    private val onItemClick: (Meal) -> Unit,
    private val onItemLongClick: (Meal) -> Unit
) : ListAdapter<Meal, MealAdapter.MealViewHolder>(DIFF_CALLBACK) {

    inner class MealViewHolder(
        private val binding: ItemGridImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Meal) {
            binding.apply {
                Glide.with(root.context).load(data.strMealThumb).into(ivIcon)
                tvTitle.text = data.strMeal
                tvSub.text = data.strCategory
                root.setOnClickListener { onItemClick(data) }
                root.setOnLongClickListener {
                    onItemLongClick(data)
                    true
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val binding = ItemGridImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MealViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Meal>() {
            override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
                return oldItem.idMeal == newItem.idMeal
            }

            override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
                return oldItem == newItem
            }
        }
    }
}
