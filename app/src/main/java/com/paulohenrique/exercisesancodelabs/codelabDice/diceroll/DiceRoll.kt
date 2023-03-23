package com.paulohenrique.exercisesancodelabs.codelabDice.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
            val resultText: TextView = findViewById(R.id.txt_dice_roll)
            resultText.text = dice.roll().toString()
        }
    }
}