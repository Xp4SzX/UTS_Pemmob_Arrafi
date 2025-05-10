package com.example.ujian

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class NewsAdapter(private val context: Context, private val data: List<NewsItem>)
    : ArrayAdapter<NewsItem>(context, R.layout.item_news, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_news, parent, false)

        val item = data[position]
        val imageView = view.findViewById<ImageView>(R.id.imageNews)
        val textView = view.findViewById<TextView>(R.id.textNews)

        imageView.setImageResource(item.imageResId)
        textView.text= item.title

        return view
    }
}
