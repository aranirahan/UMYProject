package com.example.umyproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.umyproject.model.OtherEvent
import com.example.umyproject.R.layout
import com.example.umyproject.adapters.OtherEventAdapter.ViewHolder
import kotlinx.android.synthetic.main.content_other_event.view.iv_thumb
import kotlinx.android.synthetic.main.content_other_event.view.tv_team
import kotlinx.android.synthetic.main.content_other_event.view.tv_title

class OtherEventAdapter(
    private val otherEventList: List<OtherEvent>,
    private val clickListener: (Int) -> Unit) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(layout.content_other_event, parent, false)
        )
    }

    override fun getItemCount() = otherEventList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(otherEventList[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(otherEvent: OtherEvent) {
            val v = itemView

            v.tv_team.text = otherEvent.team
            v.tv_title.text = otherEvent.title

            v.iv_thumb.setOnClickListener {
                clickListener(adapterPosition)
            }
        }
    }
}