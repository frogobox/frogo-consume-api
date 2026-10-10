package com.frogobox.appapi.mvvm.pixabay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ItemGridImageBinding
import com.frogobox.coreutil.pixabay.model.PixabayImage

class PixabayAdapter(
    private val onItemClick: ((PixabayImage) -> Unit)? = null
) : ListAdapter<PixabayImage, PixabayAdapter.PixabayViewHolder>(DIFF_CALLBACK) {

    inner class PixabayViewHolder(
        private val binding: ItemGridImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: PixabayImage) {
            val totalLikes = "${data.likes} likes"
            binding.apply {
                Glide.with(root.context).load(data.previewURL).into(ivIcon)
                tvTitle.text = totalLikes
                tvSub.text = data.user
                onItemClick?.let { callback ->
                    root.setOnClickListener { callback(data) }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixabayViewHolder {
        val binding = ItemGridImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PixabayViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PixabayViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<PixabayImage>() {
            override fun areItemsTheSame(oldItem: PixabayImage, newItem: PixabayImage): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: PixabayImage, newItem: PixabayImage): Boolean {
                return oldItem == newItem
            }
        }
    }
}
