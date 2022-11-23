package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val arguments: Bundle? = intent.extras
        if (arguments != null){
            val email: String = arguments.get("email_Key").toString()
            val name: String = arguments.get("name_Key").toString()
            val age: String = arguments.get("age_Key").toString()
            editTextEmail2.setText(email)
            editTextName2.setText(name)
            editTextAge2.setText(age)
    }



    }

    fun sendResult(view: View) {
        var data: Intent = Intent()
        data.putExtra("email_Key", editTextEmail2.text.toString())
        data.putExtra("name_Key", editTextName2.text.toString())
        data.putExtra("age_Key", editTextAge2.text.toString())
        setResult(RESULT_OK, data)
        finish()
    }
}