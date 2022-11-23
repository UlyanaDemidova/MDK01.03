package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun change(view: View) {
        try {

            var editTextKurs = findViewById<EditText>(R.id.editTextKurs)
            var editTextSumm = findViewById<EditText>(R.id.editTextSumm)
            var result = findViewById<TextView>(R.id.textViewResult)
            if(editTextSumm.text.toString().isNotEmpty()){
                if(editTextKurs.text.toString().isNotEmpty())
                    result.text = "${editTextKurs.text.toString().toInt()* editTextSumm.text.toString().toInt()}"
                else throw Exception("Введите курс обмена")
            }
            else throw Exception("Введите сумму для обмена")
        }
        catch (e: Exception){
            Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_SHORT).show()
        }
    }

}
