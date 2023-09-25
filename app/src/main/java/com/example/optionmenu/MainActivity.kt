package com.example.optionmenu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.showPopMenu)

        val txt = findViewById<RelativeLayout>(R.id.hello)
        btn.setOnClickListener {

            val popupMenu = PopupMenu(this@MainActivity,txt)
            popupMenu.menuInflater.inflate(R.menu.pop_up_menu, popupMenu.menu)
            popupMenu.show()


            popupMenu.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.notification -> {
                        Toast.makeText(this, "notification", Toast.LENGTH_SHORT).show()
                    }

                    R.id.settings -> {
                        Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show()

                    }

                    R.id.logout -> {
                        Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show()

                    }
                }
                true
            }
        }
    }
}
