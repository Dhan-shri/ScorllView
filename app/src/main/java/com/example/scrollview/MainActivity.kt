package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val butfirst = findViewById<Button>(R.id.butfirst)
        butfirst.setOnClickListener {
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}