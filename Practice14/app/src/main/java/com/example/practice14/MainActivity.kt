package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mStartForResult: ActivityResultLauncher<Intent?>? =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                result ->
            if (result.resultCode == RESULT_OK) {
                val intent: Intent? = result.data
                val emailResult: String? = intent!!.getStringExtra("email_Key")
                editTextEmail.setText(emailResult)
                val nameResult: String? = intent!!.getStringExtra("name_Key")
                editTextName.setText(nameResult)
                val ageResult: String? = intent!!.getStringExtra("age_Key")
                editTextAge.setText(ageResult)
            }
            else {
                Toast.makeText(this, "Ошибка доступа", Toast.LENGTH_SHORT).show()
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            val email: String = arguments.get("email_Key").toString()
            val name: String = arguments.get("name_Key").toString()
            val age: String = arguments.get("age_Key").toString()
        }

    }

    fun result(view: View) {
        val intent: Intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("email_Key", editTextEmail.text,)
        intent.putExtra("name_Key", editTextName.text)
        intent.putExtra("age_Key", editTextAge.text)
        mStartForResult?.launch(intent)
    }
}