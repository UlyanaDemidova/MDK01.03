package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun taetae(view: View) {
        var a: ImageView = findViewById(R.id.imageView2)
        var taetae: Int = R.drawable.taetae
        a.setImageResource(taetae)

    }
}