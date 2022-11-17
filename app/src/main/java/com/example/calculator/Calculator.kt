package com.example.calculator

import android.icu.text.DecimalFormat
import java.math.BigDecimal

class Calculator {

    var buffer: String = ""
    var operation: Char = ' '
    var result: Double = 0.0

    fun addDigit(digit: Char) {
        if(buffer == result.toString()){
            buffer = ""
        }
        buffer = buffer + digit
    }

    fun addOperation(symbol: Char) {
        if (buffer.isBlank()) {
            buffer=""
        } else if (operation == '+') {
            operation = symbol
            val temp = buffer.toDouble()
            result = result + temp
            operation = symbol
            buffer = result.toString()
        } else if (operation == '-') {
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