package com.example.practice16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menu?.add(
            0, //Группа
            1, //Id
            1, //Порядок
            "Главная"
        ) //Заголовок
        menu?.add(0, 2, 1, "О программе")

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent: Intent = Intent(this,
            MainActivity::class.java)

        when (item.itemId) {
            1 -> {
                intent
                startActivity(intent)
            }


        }
        return super.onOptionsItemSelected(item)
    }
}