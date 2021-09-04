package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val butthird = findViewById<Button>(R.id.butthird)
        butthird.setOnClickListener (this)



    }

    override fun onClick(v: View?) {
        val name = findViewById<EditText>(R.id.name).text.toString()
        val Age = findViewById<EditText>(R.id.Age).text.toString()
        val color = findViewById<EditText>(R.id.color).text.toString()
        val food = findViewById<EditText>(R.id.food).text.toString()
        val education = findViewById<EditText>(R.id.education).text.toString()
        val love = findViewById<EditText>(R.id.love).text.toString()
        val flower = findViewById<EditText>(R.id.flower).text.toString()
        val sport = findViewById<EditText>(R.id.sport).text.toString()

        when(v?.id){
            R.id.butthird ->{
                val bundle=Bundle()
                bundle.putString("name",name)
                bundle.putString("Age",Age)
                bundle.putString("color",color)
                bundle.putString("food",food)
                bundle.putString("education",education)
                bundle.putString("love",love)
                bundle.putString("flower",flower)
                bundle.putString("sport",sport)

                val intent = Intent(this,fourthActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }


    }
}