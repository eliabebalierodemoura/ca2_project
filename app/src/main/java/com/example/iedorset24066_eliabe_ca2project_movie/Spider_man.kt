package com.example.iedorset24066_eliabe_ca2project_movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
var count = 0
class Spider_man : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spider_man)







        val headingSpider : TextView = findViewById(R.id.spidertext)
        val imageSpider : ImageView = findViewById(R.id.spider_image)


val bundle : Bundle?= intent.extras

val heading = bundle!!.getString("heading")
val imageId = bundle.getInt("imageId")
val news = bundle.getString("news")

        headingSpider.text = heading
        imageSpider.setImageResource(imageId)


    }

}
