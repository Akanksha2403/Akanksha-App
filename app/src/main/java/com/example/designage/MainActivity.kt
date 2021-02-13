package com.example.designage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view: View) {
        val currentyear = Calendar.getInstance().get(Calendar.YEAR)
        val textView1 = findViewById<TextView>(R.id.tva)
        val textView = findViewById<TextView>(R.id.inputYear)

        textView1.text = "Age:" + (currentyear - textView.text.toString().toInt())
    }
}