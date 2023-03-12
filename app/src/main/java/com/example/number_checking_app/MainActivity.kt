package com.example.number_checking_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnleft.setOnClickListener{
            //compare
            //change color
            //reset numbers
            val leftNum = btnLeft.text.toString().toInt()
            val rightNum = btnRight.text.toString().toInt()

            if(leftNum > rightNum) {
                backgroundView.setBackgroundColor(Green)
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
            } else {
                backgrundView.setBackgroundColor(Red)
                Toast.makeText(this, "Incorrect" , Toast.LENGTH_SHORT).show()
            }
        }


    }
}