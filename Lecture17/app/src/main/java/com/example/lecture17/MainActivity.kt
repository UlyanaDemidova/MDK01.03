package com.example.lecture17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    setTitle("Вызов другого окна")
    }

    fun onClick(view: View) {
        val intent : Intent = Intent(this@MainActivity, AboutActivity::class.java)
        when (view.id){
            R.id.button -> startActivity(intent)
        }
    }

    fun onClick2(view: View) {
        val intent : Intent = Intent(this@MainActivity, ColorActivity::class.java)
        when (view.id){
            R.id.button2 -> startActivity(intent)
        }
    }

}