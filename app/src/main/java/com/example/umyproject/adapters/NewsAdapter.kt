package com.example.umyproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.umyproject.model.News
import com.example.umyproject.R.layout
import com.example.umyproject.adapters.NewsAdapter.ViewHolder
import kotlinx.android.synthetic.main.content_news.view.btn_umy_update
import kotlinx.android.synthetic.main.content_other_event.view.tv_title

class NewsAdapter(
    private val newsList: List<News>,
    private val clickListener: (Int) -> Unit) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(layout.content_news, parent, false)
        )
    }

    override fun getItemCount() = newsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(news: News) {
            val v = itemView

            v.tv_title.text = news.title

            v.btn_umy_update.setOnClickListener {
                clickListener(adapterPosition)
            }
        }
    }
}