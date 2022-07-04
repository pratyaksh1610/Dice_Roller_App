package com.example.dicerollerapp

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // sound on click of Roll button
        val mediaPlayer = MediaPlayer.create(this, R.raw.dice)

        btnRoll.setOnClickListener(){
            mediaPlayer.start()

            // creating obj of class
            val obj = FunctionRollDice()

            //calling function of the req. class which returns random value 1..6
            val y = obj.rollDice()
            val z = obj.rollDice()

            tvResult.text = (y + z).toString()

            when (y) {
//                Use setImageResource() to change the image that's displayed in an ImageView
//                Syntax setImageResource and add the path of image
                1 -> ivDice1.setImageResource(R.drawable.dice_1)
                2 -> ivDice1.setImageResource(R.drawable.dice_2)
                3 -> ivDice1.setImageResource(R.drawable.dice_3)
                4 -> ivDice1.setImageResource(R.drawable.dice_4)
                5 -> ivDice1.setImageResource(R.drawable.dice_5)
                6 -> ivDice1.setImageResource(R.drawable.dice_6)
            }

            when (z) {
                1 -> ivDice2.setImageResource(R.drawable.dice_1)
                2 -> ivDice2.setImageResource(R.drawable.dice_2)
                3 -> ivDice2.setImageResource(R.drawable.dice_3)
                4 -> ivDice2.setImageResource(R.drawable.dice_4)
                5 -> ivDice2.setImageResource(R.drawable.dice_5)
                6 -> ivDice2.setImageResource(R.drawable.dice_6)
            }

        }

    }
}

class FunctionRollDice {
    fun rollDice(): Int {
        return (1..6).random()
    }
}


