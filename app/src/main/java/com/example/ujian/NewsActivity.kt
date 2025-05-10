package com.example.ujian

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val listView = findViewById<ListView>(R.id.listViewNews)

        val newsList = listOf(
            NewsItem("Top 5 Parfume For Men", R.mipmap.ic_launcher),
            NewsItem("New parfume has arrived", R.mipmap.ic_launcher),
            NewsItem("Tips and Trick To make a parfume", R.mipmap.ic_launcher)
        )

        val adapter = NewsAdapter(this, newsList)
        listView.adapter = adapter
    }
}
