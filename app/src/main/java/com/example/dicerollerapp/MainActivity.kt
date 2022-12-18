package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.dicerollerapp.R.id.dice_img
import com.example.dicerollerapp.R.id.roll_btn
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var rollBtn:Button
    private lateinit var diceImg:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImg= findViewById(R.id.dice_img)

        rollBtn = findViewById(R.id.roll_btn)

        rollBtn.setOnClickListener(){
            rollDice()
        }

    }

    private fun rollDice() {
        var randomInt:Int = Random.nextInt(until = 6)+1

        val drawableImg = when(randomInt){
            1-> R.drawable.one
            2-> R.drawable.two
            3-> R.drawable.three
            4-> R.drawable.four
            5-> R.drawable.five
            else-> R.drawable.six
        }
        diceImg.setImageResource(drawableImg)
        Toast.makeText(this,"DiceRolled!",Toast.LENGTH_SHORT).show()
    }
}

