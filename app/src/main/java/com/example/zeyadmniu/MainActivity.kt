package com.example.zeyadmniu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View


class MainActivity : AppCompatActivity()

{

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout,menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when (item.itemId) {
            R.id.setting -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
             R.id.log_in-> item.title="log out"
else ->super.onOptionsItemSelected(item)

        }

return true
        }
}
