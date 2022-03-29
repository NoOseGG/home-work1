package com.bignerdranch.android.calculators

import java.util.*

class ParsingCalculator {

    var result = 0.0
    val scanner = Scanner(System.`in`)

    fun start() {
        println("Enter the expression")
        print("-> ")
        val input = scanner.next()
        val line: String = input.trim().replace(" ", "")
        val numbers = line.split('+', '-', '/', '*')
        result = numbers[0].toDouble()
        var count = 1
        line.forEach { c ->
            if (!c.isDigit()) {
                checkSymbol(c, numbers[count].toDouble())
                count++
            }
        }
        println(result)
    }

    private fun checkSymbol(char: Char, num: Double) {
        when (char) {
            '+' -> plus(num)
            '-' -> minus(num)
            '*' -> multi(num)
            '/' -> div(num)
            else -> {}
        }
    }

    private fun plus(num: Double) {
        result += num
    }

    private fun minus(num: Double) {
        result -= num
    }

    private fun multi(num: Double) {
        result *= num
    }

    private fun div(num: Double) {
        result /= num
    }

}