package com.chicoikr.myquizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.widget.TintableCompoundDrawablesView

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    var mCurrentPosition: Int=1
    var mQuestionsList: ArrayList<Question>? = null
    var mSelectedOptionPosition: Int = 0


    var progressbar: ProgressBar? = null
    var tvProgress: TextView? = null
    var tvQuestion: TextView? = null
    var ivImage: ImageView? = null

    var tvOption1: TextView? = null
    var tvOption2: TextView? = null
    var tvOption3: TextView? = null
    var tvOption4: TextView? = null
    var buttonCheck: Button? = null






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
        buttonCheck = findViewById<Button>(R.id.tvclickcheck)

        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)
        buttonCheck?.setOnClickListener(this)


        mQuestionsList = Constants.getQuestions()

        setQuestion()


    }

    private fun setQuestion() {


        mCurrentPosition = 0
        val question: Question = mQuestionsList!![mCurrentPosition]
        ivImage?.setImageResource(question.image)
        progressbar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressbar?.max}"
        tvQuestion?.text = question.question
        tvOption1?.text = question.optionOne
        tvOption2?.text = question.optionTwo
        tvOption3?.text = question.optionThree
        tvOption4?.text = question.optionFour

        if (mCurrentPosition == mQuestionsList!!.size){
            buttonCheck?.text = "Finish"

        }else{
            buttonCheck?.text= "Add Answer"
        }
    }

    fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        tvOption1?.let{
            options.add(0, it)
        }
        tvOption2?.let{
            options.add(1, it)
        }
        tvOption3?.let{
            options.add(2, it)
        }
        tvOption4?.let{
            options.add(3, it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,R.drawable.default_option_border_bg
            )
        }

    }
    fun selectedOptionView (selectedOptionNum: Int, tv:TextView){
        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.default_option_border_bg2
        )

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tvOption1 -> {
                tvOption1?.let{
                    selectedOptionView(1, it)
                }
            }
            R.id.tvOption2 -> {
                tvOption2?.let{
                    selectedOptionView(2, it)
                }
            }
            R.id.tvOption3 -> {
                tvOption3?.let{
                    selectedOptionView(3, it)
                }
            }
            R.id.tvOption4 -> {
                tvOption4?.let{
                    selectedOptionView(4, it)
                }
            }
            R.id.tvclickcheck -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.incorrect_option_border_bg)}

                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                }

            }
        }
    }

     fun answerView(answer: Int, drawableView: Int){

        when (answer){
            1 ->{
                tvOption1?.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                tvOption2?.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                tvOption3?.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                tvOption4?.background = ContextCompat.getDrawable(this, drawableView)
            }

        }


    }
}