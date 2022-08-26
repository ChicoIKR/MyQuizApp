package com.chicoikr.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val tvName: TextView = findViewById(R.id.tvName)
        val tvScore :TextView =findViewById(R.id.tvScore)
        val buttonFinish = findViewById<Button>(R.id.buttonFinish)
        var totalQuestions : Int = 0
        var totalGood: Int = 0

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        totalGood = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        tvScore.text = "Your score is $totalGood out of $totalQuestions"

        buttonFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
