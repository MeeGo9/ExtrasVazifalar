package com.appus.extrasvazifalar.fourthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appus.extrasvazifalar.R
import kotlinx.android.synthetic.main.activity_new_detail.*

class NewDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_detail)

        val text = intent.getStringExtra("text")
        val dateD = intent.getStringExtra("date")
        val imgId = intent.getIntExtra("img", 0)

        imageViewDetail.setImageResource(imgId)
        textBig.text = text
        dateDetail.text = dateD
    }
}