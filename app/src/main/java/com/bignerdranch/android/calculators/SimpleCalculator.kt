package com.bignerdranch.android.calculators

import java.util.*

class SimpleCalculator {
    var result = 0.0

    fun start() {
        val scanner = Scanner(System.`in`)

        println("Calculator")
        print("number   -> ")
        result = scanner.nextDouble()

        while (true) {
            print("operator -> ")

            val operator = scanner.next()

            if (operator == "=") {
                println("Result = $result")
                break
            }

            print("number   -> ")
            val secondNumber = scanner.nextDouble()
            result = checkSymbol(operator, secondNumber)
        }
    }

    private fun checkSymbol(symbol: String, secondNumber: Double): Double {
        when (symbol) {
            "+" -> return result + secondNumber
            "-" -> return result - secondNumber
            "*" -> return result * secondNumber
            "/" -> return result / secondNumber
            else -> {
                println("you have entered an incorrect operator")
                return result
            }
        }
    }
}