package com.example.composecalculator

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation(symbol = "+")
    object Subtract: CalculatorOperation(symbol = "-")
    object Multiply: CalculatorOperation(symbol = "X")
    object Divide: CalculatorOperation(symbol = "/")
}