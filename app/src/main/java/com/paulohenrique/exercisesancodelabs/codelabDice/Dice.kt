package com.paulohenrique.exercisesancodelabs.codelabDice

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}