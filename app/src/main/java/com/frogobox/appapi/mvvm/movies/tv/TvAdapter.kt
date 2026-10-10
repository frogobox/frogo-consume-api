package com.frogobox.appapi.mvvm.movies.tv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.coreutil.movie.MovieUrl
import com.frogobox.coreutil.movie.model.TrendingTv

class TvAdapter(
    private val onItemClick: (TrendingTv) -> Unit
) : ListAdapter<TrendingTv, TvAdapter.TvViewHolder>(DIFF_CALLBACK) {

    inner class TvViewHolder(
        private val binding: ContentItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: TrendingTv) {
            binding.apply {
                tvTitle.text = data.name
                tvOverview.text = data.overview
                Glide.with(root.context)
                    .load("${MovieUrl.BASE_URL_IMAGE_ORIGINAL}${data.poster_path}")
                    .into(ivPoster)
                root.setOnClickListener { onItemClick(data) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val binding = ContentItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TvViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TrendingTv>() {
            override fun areItemsTheSame(oldItem: TrendingTv, newItem: TrendingTv): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: TrendingTv, newItem: TrendingTv): Boolean {
                return oldItem == newItem
            }
        }
    }
}
