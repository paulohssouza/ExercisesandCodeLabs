package com.paulohenrique.exercisesancodelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFristDice = Dice()

        println(myFristDice.sides)

        myFristDice.roll()
    }

}