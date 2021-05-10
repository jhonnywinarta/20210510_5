package com.jhonny.a20210510_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_answer.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        val intent = getIntent()
        val yourans:Int = intent.getIntExtra("answer",0)
        val rightans:Int = intent.getIntExtra("correct",0)

        yourAnswer.text = yourans.toString()
        rightAnswer.text = rightans.toString()

        if(yourans!=rightans){
            textComment.text = "Your answer is wrong!"
        }
        else textComment.text = "Your answer is correct!"

        btnReturn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v:View?){
                finish()
                startActivity(intent)
            }
        })
    }
}