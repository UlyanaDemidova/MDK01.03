package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun RadioButton1(view: View) {
        var a = findViewById<ImageView>(R.id.imageView2)
        a.setImageResource(R.drawable.bangchan)
    }
    fun RadioButton2(view: View) {
       var a = findViewById<ImageView>(R.id.imageView2)
       a.setImageResource(R.drawable.changbin)
    }
    fun RadioButton3(view: View) {
        var a = findViewById<ImageView>(R.id.imageView2)
        a.setImageResource(R.drawable.jisung)
    }

    fun Button1(view: View) {
        setContentView(R.layout.part2)
    }

    fun checkBox1(view: View) {
        var a = findViewById<ImageView>(R.id.imageView)
        val bangchan: Int = R.drawable.bangchan
        a.setImageResource(bangchan)
        if (!(view as CheckBox).isChecked)
            a.setImageResource(R.drawable.ic_launcher_foreground)
    }
    fun checkBox2(view: View) {
        var a = findViewById<ImageView>(R.id.imageView3)
        var changbin: Int = R.drawable.changbin
        a.setImageResource(changbin)
        if (!(view as CheckBox).isChecked)
            a.setImageResource(R.drawable.ic_launcher_foreground)
    }
    fun checkBox3(view: View) {
        var a = findViewById<ImageView>(R.id.imageView4)
        var jisung: Int = R.drawable.jisung
        a.setImageResource(jisung)
        if (!(view as CheckBox).isChecked)
            a.setImageResource(R.drawable.ic_launcher_foreground)
    }

    fun Button2(view: View) {
        setContentView(R.layout.activity_main)
    }
}