package com.bignerdranch.android.calculators

import net.objecthunter.exp4j.ExpressionBuilder
import java.util.*

class Calculator {

    val scanner = Scanner(System.`in`)

    fun start() {
        println("Enter the expression")
        print("-> ")
        val input = scanner.next()

        val ex = ExpressionBuilder(input).build()
        println(ex.evaluate())
    }
}