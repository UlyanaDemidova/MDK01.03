package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendBtn(view: View) {
        val breedText: TextView = findViewById(R.id.editTextTextPersonName)
        val dateText: TextView = findViewById(R.id.editTextDate)
        val breed = breedText.text.toString()
        val date = dateText.text.toString().toInt()
        val animals: Animals = Animals(breed, date)
        val intent: Intent = Intent(this@MainActivity,
            MainActivity2::class.java)
        intent.putExtra(animals.javaClass.simpleName, animals)
        startActivity(intent)
    }
    }
