package com.frogobox.appapi.mvvm.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.appapi.databinding.ContentArticleHorizontalBinding
import com.frogobox.coreutil.news.model.Article
import com.frogobox.sdk.ext.setImageExt

class NewsArticleHorizontalAdapter(
    private val onItemClick: (Article) -> Unit,
    private val onItemLongClick: (Article) -> Unit
) : ListAdapter<Article, NewsArticleHorizontalAdapter.ArticleViewHolder>(DIFF_CALLBACK) {

    inner class ArticleViewHolder(
        private val binding: ContentArticleHorizontalBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Article) {
            binding.apply {
                tvTitle.text = data.title
                tvPublished.text = data.publishedAt
                tvDescription.text = data.description
                ivUrl.setImageExt(data.urlToImage)
                root.setOnClickListener { onItemClick(data) }
                root.setOnLongClickListener {
                    onItemLongClick(data)
                    true
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ContentArticleHorizontalBinding.inflate(
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
