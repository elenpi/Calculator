package com.example.calculator

import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var calculator: Calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button0.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
        binding.buttonMultiplication.setOnClickListener(this)
        binding.buttonDivision.setOnClickListener(this)
        binding.buttonAddition.setOnClickListener(this)
        binding.buttonSubstraction.setOnClickListener(this)
        binding.buttonEquals.setOnClickListener(this)
        binding.buttonComma.setOnClickListener(this)
        binding.buttonClear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button0 -> {
                calculator.addDigit('0')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button1 -> {
                calculator.addDigit('1')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button2 -> {
                calculator.addDigit('2')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button3 -> {
                calculator.addDigit('3')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button4 -> {
                calculator.addDigit('4')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button5 -> {
                calculator.addDigit('5')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button6 -> {
                calculator.addDigit('6')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button7 -> {
                calculator.addDigit('7')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button8 -> {
                calculator.addDigit('8')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button9 -> {
                calculator.addDigit('9')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonComma -> {
                calculator.addDigit('.')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonMultiplication -> {
                calculator.addOperation('*')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonDivision -> {
                calculator.addOperation('/')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonAddition -> {
                calculator.addOperation('+')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonSubstraction -> {
                calculator.addOperation('-')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonEquals -> {
                calculator.addOperation('=')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonClear -> {
                calculator.addOperation('c')
                binding.textView.setText(calculator.buffer)
            }
            else -> {
            }
        }
    }
}
