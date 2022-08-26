package com.chicoikr.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        val etName = findViewById<EditText>(R.id.et_name)
        startButton.setOnClickListener {


            if (etName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Hello ${etName.text}!", Toast.LENGTH_SHORT).show()
                val intent = Intent( this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()}
        }


    }
}