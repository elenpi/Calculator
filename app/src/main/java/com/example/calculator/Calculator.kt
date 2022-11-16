package com.example.calculator

class Calculator {

    var buffer: String = ""
    var operation: Char = ' '
    var result: Int = 0

    fun addDigit(digit: Char) {
        if(buffer == result.toString()){
            buffer = ""
        }
        buffer = buffer + digit
    }

    fun addOperation(symbol: Char) {
        if (operation == '+') {
            val temp = buffer.toInt()
            result = result + temp
            operation = symbol
            buffer = result.toString()
        } else if (operation == '-') {
            val temp = buffer.toInt()
            result = result - temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '*') {
            val temp = buffer.toInt()
            result = result * temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '/') {
            val temp = buffer.toInt()
            result = result / temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '=') {
            val temp = buffer.toInt()
            result = temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == 'c') {
            buffer = ""
            operation = ' '
        } else {
            operation = symbol
            result = buffer.toInt()
            buffer = ""
        }


    }
}