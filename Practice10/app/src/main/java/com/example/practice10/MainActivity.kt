package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.tablelayout)
        //(R.layout.linerlayout)
        //(R.layout.activity_main)
        setTitle ("TableLayout")
        //("LinearLayout")



    }


    fun onclick(view: View) {
        var a: Button = findViewById(R.id.button1)
        var b: Button = findViewById(R.id.button2)
        a.visibility = Button.INVISIBLE
        b.visibility = Button.VISIBLE

    }

    fun onclick1(view: View) {
        var a: Button = findViewById(R.id.button1)
        var b: Button = findViewById(R.id.button2)
        a.visibility = Button.VISIBLE
        b.visibility = Button.INVISIBLE

    }

    fun btnOrient1(view: View) {
        var a: TextView = findViewById(R.id.text1)
        a.text = "Вертикальная"
    }
    fun btnOrient2(view: View) {
        var a: TextView = findViewById(R.id.text1)
        a.text = "Горизонтальная"
    }
    fun btnOrient3(view: View) {
        var a: TextView = findViewById(R.id.text1)
        a.text = "Вертикальная"
    }

    fun btnGravity1(view: View) {
        var a: TextView = findViewById(R.id.text2)
        a.text = "C лева"
    }

    fun btnGravity2(view: View) {
        var a: TextView = findViewById(R.id.text2)
        a.text = "По центру"
    }
    fun btnGravity3(view: View) {
        var a: TextView = findViewById(R.id.text2)
        a.text = "C права"
    }


}