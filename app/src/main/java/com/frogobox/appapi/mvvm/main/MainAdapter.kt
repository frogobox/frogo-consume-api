package com.frogobox.appapi.mvvm.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ItemMainBinding

class MainAdapter(
    private val onItemClick: (MainModel) -> Unit
) : ListAdapter<MainModel, MainAdapter.MainViewHolder>(DIFF_CALLBACK) {

    inner class MainViewHolder(
        private val binding: ItemMainBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: MainModel) {
            binding.apply {
                Glide.with(root.context).load(data.image).into(ivIcon)
                tvTitle.text = data.name
                tvLink.text = data.api
                root.setOnClickListener { onItemClick(data) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MainModel>() {
            override fun areItemsTheSame(oldItem: MainModel, newItem: MainModel): Boolean {
                return oldItem.code == newItem.code
            }

            override fun areContentsTheSame(oldItem: MainModel, newItem: MainModel): Boolean {
                return oldItem == newItem
            }
        }
    }
}
