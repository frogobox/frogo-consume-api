package com.frogobox.appapi.mvvm.movies.person

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentItemBinding
import com.frogobox.coreutil.movie.MovieUrl
import com.frogobox.coreutil.movie.model.TrendingPerson

class PersonAdapter(
    private val onItemClick: ((TrendingPerson) -> Unit)? = null,
    private val onItemLongClick: ((TrendingPerson) -> Unit)? = null
) : ListAdapter<TrendingPerson, PersonAdapter.PersonViewHolder>(DIFF_CALLBACK) {

    inner class PersonViewHolder(
        private val binding: ContentItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: TrendingPerson) {
            binding.apply {
                tvTitle.text = data.name
                tvOverview.text = data.known_for_department
                Glide.with(root.context)
                    .load("${MovieUrl.BASE_URL_IMAGE_ORIGINAL}${data.profile_path}")
                    .into(ivPoster)
                onItemClick?.let { callback ->
                    root.setOnClickListener { callback(data) }
                }
                onItemLongClick?.let { callback ->
                    root.setOnLongClickListener {
                        callback(data)
                        true
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val binding = ContentItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PersonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TrendingPerson>() {
            override fun areItemsTheSame(oldItem: TrendingPerson, newItem: TrendingPerson): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: TrendingPerson, newItem: TrendingPerson): Boolean {
                return oldItem == newItem
            }
        }
    }
}
