package com.example.calculator

import android.util.Log

class Calculator {

    var buffer: String = ""
    var operation: Char = ' '
    var result: Double = 0.0

    fun addDigit(digit: Char) {
        if(buffer == result.toString()) {
            buffer = ""
        }
        buffer = buffer + digit
    }

    fun addOperation(symbol: Char) {

        if (buffer.isEmpty()) {
            buffer= ""
        } else if (operation == '+') {
            operation = symbol
            val temp = buffer.toDouble()
            result = result + temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '-') {
            operation = symbol
            val temp = buffer.toDouble()
            result = result - temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '*') {
            val temp = buffer.toDouble()
            result = result * temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '/') {
            val temp = buffer.toDouble()
            result = result / temp
            operation = symbol
            buffer = result.toString()
        }  else if (operation == '=') {
            val temp = buffer.toDouble()
            result = temp
            operation = symbol
//            if(result.toString().endsWith(".0")){
//                buffer =result.toString().dropLast(2)
//            } else {
//                buffer = result.toString()
//            }
            buffer = result.toString()
        } else {
            operation = symbol
            result = buffer.toDouble()
            buffer = ""
        }

    }

    fun calculatorClear(){
        buffer = ""
        operation = ' '
        result = 0.0
    }

}