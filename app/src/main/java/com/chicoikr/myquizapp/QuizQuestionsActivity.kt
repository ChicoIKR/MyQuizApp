package com.chicoikr.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    var progressbar: ProgressBar? = null
    var tvProgress: TextView? = null
    var tvQuestion: TextView? = null
    var ivImage: ImageView? = null

    var tvOption1: TextView? = null
    var tvOption2: TextView? = null
    var tvOption3: TextView? = null
    var tvOption4: TextView? = null
    var tvclickcheck: Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressbar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)

        tvOption1 = findViewById(R.id.tvOption1)
        tvOption2 = findViewById(R.id.tvOption2)
        tvOption3 = findViewById(R.id.tvOption3)
        tvOption4 = findViewById(R.id.tvOption4)
        tvclickcheck = findViewById(R.id.tvclickcheck)

        val questionsList = Constants.getQuestions()
        Log.i("questionsList size is", "${questionsList.size}")

        for (i in questionsList){
            Log.e("Questions", i.question)
        }
        var currentPosition= 0
        val question: Question= questionsList[currentPosition]
        progressbar?.progress = currentPosition
        tvProgress?.text = "$currentPosition/${progressbar?.max}"
        tvQuestion?.text = question.question
        tvOption1?.text = question.optionOne
        tvOption2?.text = question.optionTwo
        tvOption3?.text = question.optionThree
        tvOption4?.text = question.optionFour

    }
}