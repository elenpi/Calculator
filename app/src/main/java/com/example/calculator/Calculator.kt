package com.example.calculator

class Calculator {

    var buffer: String = ""
    var operation: Char = ' '
    var result: Int = 0

    fun addDigit(digit: Char) {
        buffer = buffer + digit
    }

    fun addOperation(symbol: Char) {
        if (operation == '+') {
            val temp = buffer.toInt()
            result = result + temp
            buffer = result.toString()
        } else if (operation == '-') {
            val temp = buffer.toInt()
            result = result - temp
            buffer = result.toString()
        }  else if (operation == '*') {
            val temp = buffer.toInt()
            result = result * temp
            buffer = result.toString()
        }  else if (operation == '/') {
            val temp = buffer.toInt()
            result = result / temp
            buffer = result.toString()
        } else {
            operation = symbol
            result = buffer.toInt()
            buffer = ""
        }


    }
}