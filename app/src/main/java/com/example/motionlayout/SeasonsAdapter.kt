package com.example.motionlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SeasonsAdapter(
    private val seasonsList: List<Season>,
    private val onClick: (Season) -> Unit
) : RecyclerView.Adapter<SeasonsAdapter.SeasonViewHolder>() {

    class SeasonViewHolder(itemView: View, val onClick: (Season) -> Unit) : RecyclerView.ViewHolder(itemView) {
        private val seasonNameTextView: TextView = itemView.findViewById(R.id.seasonNameTextView)

        fun bind(season: Season) {
            seasonNameTextView.text = season.name
            itemView.setOnClickListener { onClick(season) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeasonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.season_item, parent, false)
        return SeasonViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: SeasonViewHolder, position: Int) {
        val season = seasonsList[position]
        holder.bind(season)

    }

    override fun getItemCount(): Int = seasonsList.size
}