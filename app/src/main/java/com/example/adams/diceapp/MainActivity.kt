package com.example.adams.diceapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var rollButton : Button= findViewById(R.id.roll_button)
        rollButton.text="roll the dice"
        rollButton.setOnClickListener{
          Toast.makeText(this,"button is clicked",Toast.LENGTH_SHORT).show()
            rollDice()

        }
        diceImage = findViewById(R.id.dice_image)

    }

     fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
         val drawableResourse = when(randomInt){
             1 -> R.drawable.dice_1
             2 -> R.drawable.dice_2
             3 -> R.drawable.dice_3
             4 -> R.drawable.dice_4
             5 -> R.drawable.dice_5
             else -> R.drawable.dice_6
         }
        //val diceImage: ImageView= findViewById(R.id.dice_image)
         diceImage.setImageResource(drawableResourse)


    }

}
