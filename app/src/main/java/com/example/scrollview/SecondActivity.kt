package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val butSec = findViewById<Button>(R.id.butSec)
        butSec.setOnClickListener {
            val intent= Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}