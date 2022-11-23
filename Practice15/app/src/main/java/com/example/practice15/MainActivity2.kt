package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textView: TextView = findViewById(R.id.textBreed)
        var animals: Animals = Animals()
        val arguments: Bundle? = intent.extras
        if (arguments != null){
            animals =
                arguments.getParcelable<Animals>(animals.javaClass.simpleName) as Animals
            textView.text = "Порода: ${animals.getBreed()}  \nДата: ${animals.getDate()}"
        }
    }
    }
