package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class fourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)


        val Name = findViewById<TextView>(R.id.Name)
        val inf = findViewById<TextView>(R.id.inf)
        val last = findViewById<TextView>(R.id.last)

        val bundle=intent.extras
        val Name1 = bundle?.getString("name")
        val age1 = bundle?.getString("Age")
        val color = bundle?.getString("color")
        val food1= bundle?.getString("food")
        val love1 =  bundle?.getString("love")
        val flower1 =  bundle?.getString("flower")
        val sport1 =  bundle?.getString("sport")



        Name.text = "** WELCOME "+Name1.toString()+" **"

        inf.text = Name1+" ohh so your are sweet"+age1+"\n\nYour favorite color is "+color+" wow nice"+"\n\n Your favorite food is "+food1+" you are so foody \uD83D\uDE0B"+"\n\n You are love to "+love1+" nice"+"\n\nYou like the flower "+flower1+" Amazing"+"\n\n Ohhh so your favorite sport is "+sport1

        last.text= "Hurreeee I know almost about you "+Name1+" \uD83E\uDD29\uD83E\uDD29\uD83E\uDD29"

    }
}