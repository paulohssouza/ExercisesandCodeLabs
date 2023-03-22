package com.paulohenrique.exercisesancodelabs.codelabDice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulohenrique.exercisesancodelabs.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice(6)
        println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

        val mySecondDice = Dice(20)
        println("Your ${mySecondDice.numSides} sided dice rolled  ${mySecondDice.roll()}!")

    }

}