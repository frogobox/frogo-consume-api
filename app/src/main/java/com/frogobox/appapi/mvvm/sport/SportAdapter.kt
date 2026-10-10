package com.frogobox.appapi.mvvm.sport

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.coreutil.sport.model.Team
import com.frogobox.ui.databinding.FrogoRvGridType3Binding

class SportAdapter(
    private val onItemClick: ((Team) -> Unit)? = null
) : ListAdapter<Team, SportAdapter.SportViewHolder>(DIFF_CALLBACK) {

    inner class SportViewHolder(
        private val binding: FrogoRvGridType3Binding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Team) {
            binding.apply {
                frogoRvGridType3TvTitle.text = data.strTeam
                frogoRvGridType3TvSubtitle.text = data.strAlternate
                frogoRvGridType3TvDesc.text = data.strDescriptionEN
                Glide.with(root.context).load(data.strTeamBadge).into(frogoRvGridType3IvPoster)
                onItemClick?.let { callback ->
                    root.setOnClickListener { callback(data) }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportViewHolder {
        val binding = FrogoRvGridType3Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SportViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Team>() {
            override fun areItemsTheSame(oldItem: Team, newItem: Team): Boolean {
                return oldItem.idTeam == newItem.idTeam
            }

            override fun areContentsTheSame(oldItem: Team, newItem: Team): Boolean {
                return oldItem == newItem
            }
        }
    }
}
