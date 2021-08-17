package com.example.problemstatementp13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainKeepValue = ""
        var setCalc = 0

        //===============ExtraButton=================
        buttonAC.setOnClickListener {
            tvReflect.text = "0"
            mainKeepValue = ""
        }

        buttonPlus.setOnClickListener {
            setCalc += Integer.parseInt(mainKeepValue)
            mainKeepValue = ""
        }

        buttonEqual.setOnClickListener {
            tvReflect.text = setCalc.toString()
        }
        //===============ExtraButton=================

        //===============NumberButton=================
        btn1.setOnClickListener {
            mainKeepValue += 1
            tvReflect.text = mainKeepValue
        }
        btn2.setOnClickListener {
            mainKeepValue += 2
            tvReflect.text = mainKeepValue
        }
        btn3.setOnClickListener {
            mainKeepValue += 3
            tvReflect.text = mainKeepValue
        }
        btn4.setOnClickListener {
            mainKeepValue += 4
            tvReflect.text = mainKeepValue
        }
        btn5.setOnClickListener {
            mainKeepValue += 5
            tvReflect.text = mainKeepValue
        }
        btn6.setOnClickListener {
            mainKeepValue += 6
            tvReflect.text = mainKeepValue
        }
        btn7.setOnClickListener {
            mainKeepValue += 7
            tvReflect.text = mainKeepValue
        }
        btn8.setOnClickListener {
            mainKeepValue += 8
            tvReflect.text = mainKeepValue
        }
        btn9.setOnClickListener {
            mainKeepValue += 9
            tvReflect.text = mainKeepValue
        }
        btn0.setOnClickListener {
            if (mainKeepValue != "") {
                mainKeepValue += 0
                tvReflect.text = mainKeepValue
            }

        }
        //===============NumberButton=================


    }
}