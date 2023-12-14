package com.example.ez_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val e1: EditText = findViewById(R.id.e1)
        val e2: EditText = findViewById(R.id.e2)
        val re: TextView = findViewById(R.id.re)
        val nn: TextView = findViewById(R.id.nn)
        val pl: Button = findViewById(R.id.pl)
        val min: Button = findViewById(R.id.min)
        val mu: Button = findViewById(R.id.mu)
        val di: Button = findViewById(R.id.di)
        val mo: Button = findViewById(R.id.mo)
        val cl: Button = findViewById(R.id.cl)


        cl.setOnClickListener {
            e1.setText(" ")
            e2.setText(" ")
            re.setText(" ")
            nn.setText(" ")
        }
        pl.setOnClickListener {
            var num1 = e1.text.toString()
            var num2 = e2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() + num2.toInt()
                re.text = re.toString()
                nn.setText("+")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }
        min.setOnClickListener {
            var num1 = e1.text.toString()
            var num2 = e2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                re.text = result.toString()
                nn.setText("-")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }
        mu.setOnClickListener {
            var num1 = e1.text.toString()
            var num2 = e2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() * num2.toInt()
                re.text = result.toString()
                nn.setText("X")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }
        di.setOnClickListener {
            var num1 = e1.text.toString()
            var num2 = e2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() / num2.toInt()
                re.text = result.toString()
                nn.setText("/")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }
        mo.setOnClickListener {
            var num1 = e1.text.toString()
            var num2 = e2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() % num2.toInt()
                re.text = result.toString()
                nn.setText("%")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

