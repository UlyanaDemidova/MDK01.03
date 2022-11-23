package com.example.lecture17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class ColorActivity : AppCompatActivity() {
    private lateinit var conctraintLayout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        setTitle("Установка цвета фона окна")
        conctraintLayout = findViewById(R.id.conctraintLayout)
    }

    fun btnColor3(view: View) {
        conctraintLayout.setBackgroundResource(R.color.blue)
    }
    fun btnColor4(view: View) {
    conctraintLayout.setBackgroundResource(R.color.olive)
    }
    fun btnColor5(view: View) {
        conctraintLayout.setBackgroundResource(R.color.peach)
    }
}