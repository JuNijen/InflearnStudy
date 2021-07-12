package com.example.day0712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initObjects()
    }

    lateinit var tvResult : TextView
    lateinit var etNumber1 : EditText
    lateinit var etNumber2 : EditText
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button

    private fun initObjects()
    {
        tvResult = findViewById(R.id.result_view)
        etNumber1 = findViewById(R.id.editTextNumber1)
        etNumber2 = findViewById(R.id.editTextNumber2)
        btnAdd = findViewById(R.id.buttonAdd)
        btnSub = findViewById(R.id.buttonSub)
        btnMul = findViewById(R.id.buttonMul)
        btnDiv = findViewById(R.id.buttonDiv)


        btnAdd.setOnClickListener {
            clickAdd()
        }
        btnSub.setOnClickListener {
            clickSub()
        }
        btnMul.setOnClickListener {
            clickMul()
        }
        btnDiv.setOnClickListener {
            clickDiv()
        }
    }

    private fun clickAdd()
    {
        var numA : Int = Integer.parseInt(etNumber1.text.toString())
        var numB : Int = Integer.parseInt(etNumber2.text.toString())
        var resultString = String.format("%s%d", getString(R.string.text_result), numA+numB)

        tvResult.text = resultString
    }

    private fun clickSub()
    {
        var numA : Int = Integer.parseInt(etNumber1.text.toString())
        var numB : Int = Integer.parseInt(etNumber2.text.toString())
        var resultString = String.format("%s%d", getString(R.string.text_result), numA-numB)

        tvResult.text = resultString
    }

    private fun clickMul()
    {
        var numA : Int = Integer.parseInt(etNumber1.text.toString())
        var numB : Int = Integer.parseInt(etNumber2.text.toString())
        var resultString = String.format("%s%d", getString(R.string.text_result), numA*numB)

        tvResult.text = resultString
    }

    private fun clickDiv()
    {
        var numA : Int = Integer.parseInt(etNumber1.text.toString())
        var numB : Int = Integer.parseInt(etNumber2.text.toString())
        var resultString = String.format("%s%d", getString(R.string.text_result), numA/numB)

        tvResult.text = resultString
    }
}