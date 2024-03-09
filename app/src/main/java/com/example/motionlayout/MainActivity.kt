package com.example.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var seasonsAdapter: SeasonsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seasonsList = listOf(
            Season("Winter", 10, 100, 5),
            Season("Spring", 12, 150, 4),
            Season("Summer", 8, 90, 3),
            Season("Fall", 11, 120, 6)
        )
        val seasonsRecyclerView: RecyclerView = findViewById(R.id.seasonsRecyclerView)
        seasonsAdapter = SeasonsAdapter(seasonsList) { season ->
            val intent = Intent(this, SeasonDetailsActivity::class.java).apply {
                putExtra("SEASON_DETAILS", season)
            }
            startActivity(intent)
        }
        seasonsRecyclerView.adapter = seasonsAdapter
        seasonsRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}








