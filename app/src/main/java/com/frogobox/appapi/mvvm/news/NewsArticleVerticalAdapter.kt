package com.frogobox.appapi.mvvm.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frogobox.appapi.databinding.ContentArticleVerticalBinding
import com.frogobox.coreutil.news.model.Article

class NewsArticleVerticalAdapter(
    private val onItemClick: (Article) -> Unit,
    private val onItemLongClick: (Article) -> Unit
) : ListAdapter<Article, NewsArticleVerticalAdapter.ArticleViewHolder>(DIFF_CALLBACK) {

    inner class ArticleViewHolder(
        private val binding: ContentArticleVerticalBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Article) {
            binding.apply {
                tvTitle.text = data.title
                tvPublished.text = data.publishedAt
                tvDescription.text = data.description
                Glide.with(root.context).load(data.urlToImage).into(ivUrl)
                root.setOnClickListener { onItemClick(data) }
                root.setOnLongClickListener {
                    onItemLongClick(data)
                    true
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ContentArticleVerticalBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }
        }
    }
}
