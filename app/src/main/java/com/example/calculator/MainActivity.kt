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
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('0')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button1 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('1')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button2 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('2')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button3 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('3')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button4 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('4')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button5 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('5')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button6 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('6')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button7 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('7')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button8 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('8')
                binding.textView.setText(calculator.buffer)
            }
            R.id.button9 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addDigit('9')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonComma -> {
                calculator.addDigit('.')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonMultiplication -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                v.setSelected(true)
                calculator.addOperation('*')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonDivision -> {
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                v.setSelected(true)
                calculator.addOperation('/')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonAddition -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                v.setSelected(true)
                calculator.addOperation('+')
                binding.textView.setText(calculator.buffer)

            }
            R.id.buttonSubstraction -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                v.setSelected(true)
                calculator.addOperation('-')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonEquals -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                calculator.addOperation('=')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonClear -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)
                binding.textView.setText(null)
                calculator.calculatorClear()
            }
            else -> {
            }
        }
    }
}
