package com.frogobox.appapi.mvvm.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.appapi.databinding.ContentCategoryBinding

class NewsCategoryAdapter(
    private val onItemClick: (String, ContentCategoryBinding) -> Unit
) : ListAdapter<String, NewsCategoryAdapter.CategoryViewHolder>(DIFF_CALLBACK) {

    inner class CategoryViewHolder(
        val binding: ContentCategoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String) {
            binding.tvCategory.text = data
            binding.root.setOnClickListener {
                onItemClick(data, binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = ContentCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    }
}
