package com.example.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SeasonDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_season_details)

        val seasonNameTextView = findViewById<TextView>(R.id.detailsNameTextView)
        val episodesTextView = findViewById<TextView>(R.id.detailsEpisodesTextView)
        val reviewTextView = findViewById<TextView>(R.id.detailsReviewTextView)
        val seasonsTextView = findViewById<TextView>(R.id.detailsSeasonsTextView)

        val season = intent.getParcelableExtra<Season>("SEASON_DETAILS")
        seasonNameTextView.text = season?.name
        episodesTextView.text = "Total Episodes: ${season?.totalEpisodes}"
        reviewTextView.text = "Review Count: ${season?.reviewCount}"
        seasonsTextView.text = "Number of Seasons: ${season?.numberOfSeasons}"

    }
}