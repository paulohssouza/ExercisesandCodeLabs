package com.paulohenrique.exercisesancodelabs

class Dice {
    var sides = 6

    fun roll(): Int {
        return (1..sides).random()
    }
}