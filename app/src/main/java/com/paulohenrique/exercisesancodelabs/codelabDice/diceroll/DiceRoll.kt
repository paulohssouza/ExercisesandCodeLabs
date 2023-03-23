package com.paulohenrique.exercisesancodelabs.codelabDice.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.paulohenrique.exercisesancodelabs.R
import com.paulohenrique.exercisesancodelabs.codelabDice.Dice

class DiceRoll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roll)
        val rollBtn: Button = findViewById(R.id.btn_dice_roll)
        val dice = Dice(6)
        rollBtn.setOnClickListener {
            val diceImage: ImageView = findViewById(R.id.image_dice_roll)
            when (dice.roll()) {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}