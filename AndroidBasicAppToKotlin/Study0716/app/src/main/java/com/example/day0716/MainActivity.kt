package com.example.day0716

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity()
{
    private val items = arrayOf("Mango juice","Tomato juice","Grape juice")
    lateinit var btnList : Button
    lateinit var btnEnd : Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initObjects()
    }

    private fun initObjects()
    {
        btnEnd = findViewById(R.id.buttonEnd)
        btnEnd.setOnClickListener {
            clickEndButton()
        }

        btnList = findViewById(R.id.buttonList)
        btnList.setOnClickListener {
            clickListButton()
        }
    }

    private fun clickListButton()
    {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle(getString(R.string.button_list))
        builder.setItems(items) { dialogInterface, i ->
            Toast.makeText(
                applicationContext, items[i], Toast.LENGTH_SHORT
            ).show()
        }
        var alertDialog : AlertDialog = builder.create()
        alertDialog.show()
    }

    private fun clickEndButton()
    {
        var builder = AlertDialog.Builder(this)
        builder.setMessage(getString(R.string.message_quit))
        builder.setTitle(getString(R.string.title_announce))
            .setCancelable(false)
            .setPositiveButton(getString(R.string.text_yes)){dialog, id ->
                finish()
            }
            .setNegativeButton(getString(R.string.text_no)){dialog, id ->
                dialog.cancel()
            }
        var alert = builder.create()
        alert.setTitle(getString(R.string.title_announce))
        alert.show()
    }
}