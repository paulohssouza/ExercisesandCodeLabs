package com.paulohenrique.exercisesancodelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice()
        val diceRoll = myFirstDice.roll()

        println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")

        myFirstDice.sides = 20

        println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
    }

}