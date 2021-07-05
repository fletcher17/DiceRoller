package com.decadev.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView
    lateinit var rollButton: Button
    lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        resetButton = findViewById(R.id.reset)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        rollButton.setOnClickListener {
            rollDice()
        }

//        countUp.setOnClickListener {
//            CountUpView()
//        }
//
        resetButton.setOnClickListener {
            Reset()
        }

    }

    private fun rollDice() {
        diceImage.setImageResource(getDiceRolled())
        diceImage2.setImageResource(getDiceRolled())

    }

    private fun getDiceRolled(): Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    //    private fun CountUpView() {
//        val textView : TextView = findViewById(R.id.text_view1)
//
//        if(textView.text == getString(R.string.happy_birthday)) {
//            textView.text = "1"
//        } else  {
//            var resultInt = textView.text.toString().toInt()
//            if ( resultInt < 9)
//                resultInt++
//            textView.text = resultInt.toString()
//        }
//
//    }
//
    private fun Reset() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

//    private fun rollDice() {
//        diceImage.setImageResource(getDiceRolled())
//        diceImage2.setImageResource(getDiceRolled())
//
//    }
//
//    private fun getDiceRolled() : Int {
//        val randomInt = (1..6).random()
//
//        return when(randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//    }


}