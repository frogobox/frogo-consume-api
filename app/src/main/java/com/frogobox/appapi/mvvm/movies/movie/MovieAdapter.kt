package com.frogobox.appapi.mvvm.movies.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.coreutil.movie.MovieUrl
import com.frogobox.coreutil.movie.model.TrendingMovie

class MovieAdapter(
    private val onItemClick: (TrendingMovie) -> Unit
) : ListAdapter<TrendingMovie, MovieAdapter.MovieViewHolder>(DIFF_CALLBACK) {

    inner class MovieViewHolder(
        private val binding: ContentItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: TrendingMovie) {
            binding.apply {
                tvTitle.text = data.title
                tvOverview.text = data.overview
                Glide.with(root.context)
                    .load("${MovieUrl.BASE_URL_IMAGE_ORIGINAL}${data.poster_path}")
                    .into(ivPoster)
                root.setOnClickListener { onItemClick(data) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ContentItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TrendingMovie>() {
            override fun areItemsTheSame(oldItem: TrendingMovie, newItem: TrendingMovie): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: TrendingMovie, newItem: TrendingMovie): Boolean {
                return oldItem == newItem
            }
        }
    }
}
