package com.example.calculator

import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var calculator: Calculator = Calculator()
    val arrayList = ArrayList<String>()

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
                binding.textViewWhole.setText("0")
                binding.textView.setText(calculator.buffer)
            }
            R.id.button1 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('1')
                binding.textViewWhole.setText("1")
                arrayList.add("1")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button2 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('2')
                binding.textViewWhole.setText("2")
                arrayList.add("2")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button3 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('3')
                binding.textViewWhole.setText("3")
                arrayList.add("3")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button4 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('4')
                arrayList.add("4")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button5 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('5')
                binding.textViewWhole.setText("5")
                arrayList.add("5")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button6 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('6')
                binding.textViewWhole.setText("6")
                arrayList.add("6")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button7 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('7')
                binding.textViewWhole.setText("7")
                arrayList.add("7")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button8 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('8')
                binding.textViewWhole.setText("8")
                arrayList.add("8")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.button9 -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addDigit('9')
                binding.textView.setText(calculator.buffer)
                arrayList.add("9")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textViewWhole.setText("9")
            }
            R.id.buttonComma -> {
                calculator.addDigit('.')
                arrayList.add(".")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonMultiplication -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                v.setSelected(true)
                calculator.addOperation('*')
                arrayList.add("*")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonDivision -> {
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                v.setSelected(true)
                calculator.addOperation('/')
                arrayList.add("/")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonAddition -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                v.setSelected(true)
                calculator.addOperation('+')
                arrayList.add("+")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)

            }
            R.id.buttonSubstraction -> {

                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)

                v.setSelected(true)
                arrayList.add("-")
                binding.textViewWhole.setText(arrayList.joinToString(""))
                calculator.addOperation('-')
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonEquals -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                calculator.addOperation('=')
                arrayList.add("=")
                arrayList.add(calculator.buffer)
                binding.textViewWhole.setText(arrayList.joinToString(""))
                binding.textView.setText(calculator.buffer)
            }
            R.id.buttonClear -> {
                binding.buttonDivision.setSelected(false)
                binding.buttonMultiplication.setSelected(false)
                binding.buttonAddition.setSelected(false)
                binding.buttonSubstraction.setSelected(false)

                binding.textViewWhole.setText(arrayList.joinToString(""))
                arrayList.clear()
                binding.textView.setText(calculator.buffer)
                calculator.calculatorClear()
            }
            else -> {
            }
        }
    }
}
